package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kg.kamila.individ_project.databinding.ActivityDetailBinding
import kg.kamila.individ_project.databinding.ActivityPaymentCheckBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        binding= ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addToCard.setOnClickListener{
            startActivity(Intent(this,PaymentActivity::class.java))
        }
    }
}