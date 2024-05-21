package com.example.quizrebuild

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizrebuild.databinding.ActivityResultBinding

class ResultActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvUserName.text = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        binding.tvScore.text = "Your score is $correctAnswers out of $totalQuestions"
        binding.btnFinish.setOnClickListener {
            startActivity( Intent(this, StartActivity1::class.java) )
            finish()
        }


    }
}