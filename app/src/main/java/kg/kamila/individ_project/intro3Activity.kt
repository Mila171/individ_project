package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.individ_project.databinding.ActivityIntro2Binding
import kg.kamila.individ_project.databinding.ActivityIntro3Binding

class intro3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityIntro3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro3)

        binding= ActivityIntro3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.continuee.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}