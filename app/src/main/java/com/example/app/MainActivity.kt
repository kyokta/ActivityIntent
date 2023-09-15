package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;

    companion object {
        const val EXTRA_USERNAME = "extra_username";
        const val EXTRA_EMAIL = "extra_email";
        const val EXTRA_PHONE = "extra_phone";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnRegister.isEnabled = false;

            checkbox.setOnCheckedChangeListener { _, isChecked ->
                btnRegister.isEnabled = isChecked
            }

            btnRegister.setOnClickListener {
                val intent = Intent(this@MainActivity, HomePage::class.java)
                intent.putExtra(EXTRA_USERNAME, username.text.toString());
                intent.putExtra(EXTRA_EMAIL, email.text.toString());
                intent.putExtra(EXTRA_PHONE, phone.text.toString());
                startActivity(intent);
            }

            txtLogin.setOnClickListener{
                val intent = Intent(this@MainActivity, LoginPage::class.java)
                startActivity(intent)
            }
        }
    }
}