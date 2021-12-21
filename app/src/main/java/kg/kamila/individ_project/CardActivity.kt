package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kg.kamila.individ_project.databinding.ActivityCardBinding
import kg.kamila.individ_project.databinding.ActivityDiscount2Binding

class CardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_card)
        binding.checkout.setOnClickListener{
            startActivity(Intent(this,PaymentActivity::class.java))
        }
        val nav = findViewById<BottomNavigationView>(R.id.nav)

        nav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.home -> {
                    startActivity(Intent(this@CardActivity, HomeActivity::class.java))
                }
                R.id.discount -> {
                    startActivity(Intent(this@CardActivity, DiscountActivity::class.java))
                }
                R.id.card -> {
                    startActivity(Intent(this@CardActivity, CardActivity::class.java))
                }
                R.id.profile -> {
                    startActivity(Intent(this@CardActivity, ProfileActivity::class.java))
                }

            }
        }

    }
}