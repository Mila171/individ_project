package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.individ_project.databinding.ActivityIntro2Binding
import kg.kamila.individ_project.databinding.ActivityIntro3Binding
import kg.kamila.individ_project.databinding.ActivityIntroBinding

class Intro2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityIntro2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro2)

        binding= ActivityIntro2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.continuee.setOnClickListener{
            startActivity(Intent(this,ActivityIntro3Binding::class.java))
        }
    }
}