package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app.databinding.ActivityHomePageBinding
import com.example.app.databinding.ActivityLoginPageBinding

class HomePage : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)

        with(binding){
            txtUsername.text = "Welcome " + username;
            txtEmail.text = "Your " + email + " has been activated";
            txtPhone.text = "Your " + phone + " has been registered";
        }
    }
}