package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kg.kamila.individ_project.databinding.ActivityDiscount2Binding
import kg.kamila.individ_project.databinding.ActivityHomeBinding

class DiscountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDiscount2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiscount2Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_discount2)
        val nav = findViewById<BottomNavigationView>(R.id.nav)

        nav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.home -> {
                    startActivity(Intent(this@DiscountActivity, HomeActivity::class.java))
                }
                R.id.discount -> {
                    startActivity(Intent(this@DiscountActivity, DiscountActivity::class.java))
                }
                R.id.card -> {
                    startActivity(Intent(this@DiscountActivity, CardActivity::class.java))
                }
                R.id.profile -> {
                    startActivity(Intent(this@DiscountActivity, ProfileActivity::class.java))
                }

            }
        }


    }
}