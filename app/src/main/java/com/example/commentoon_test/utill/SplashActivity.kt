package com.example.commentoon_test.utill

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.commentoon_test.MainActivity
import com.example.commentoon_test.config.BaseActivity
import com.example.commentoon_test.databinding.ActivitySplashBinding


class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2000)
    }
}