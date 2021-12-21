package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kg.kamila.individ_project.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        binding= ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.payNow.setOnClickListener{
            startActivity(Intent(this,PaymentCheckActivity::class.java))
        }
    }
}