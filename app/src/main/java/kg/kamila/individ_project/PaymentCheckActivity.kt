package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.individ_project.databinding.ActivityPaymentBinding
import kg.kamila.individ_project.databinding.ActivityPaymentCheckBinding

class PaymentCheckActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPaymentCheckBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_check)

        binding= ActivityPaymentCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}