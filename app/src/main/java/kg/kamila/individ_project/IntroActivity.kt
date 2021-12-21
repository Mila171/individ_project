package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.individ_project.databinding.ActivityIntroBinding
import kg.kamila.individ_project.databinding.ActivityLoginBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        binding= ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.continuee.setOnClickListener{
            startActivity(Intent(this,Intro2Activity::class.java))
        }
    }
}