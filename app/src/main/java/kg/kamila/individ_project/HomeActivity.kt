package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kg.kamila.individ_project.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nav = findViewById<BottomNavigationView>(R.id.nav)

            nav.setOnNavigationItemReselectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        startActivity(Intent(this@HomeActivity, HomeActivity::class.java))
                    }
                    R.id.discount -> {
                        startActivity(Intent(this@HomeActivity, DiscountActivity::class.java))
                    }
                    R.id.card -> {
                        startActivity(Intent(this@HomeActivity, CardActivity::class.java))
                    }
                    R.id.profile -> {
                        startActivity(Intent(this@HomeActivity, ProfileActivity::class.java))
                    }

            }
        }


    }
}