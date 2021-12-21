package kg.kamila.individ_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kg.kamila.individ_project.databinding.ActivityCardBinding
import kg.kamila.individ_project.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_profile)
        val nav = findViewById<BottomNavigationView>(R.id.nav)

        nav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.home -> {
                    startActivity(Intent(this@ProfileActivity, HomeActivity::class.java))
                }
                R.id.discount -> {
                    startActivity(Intent(this@ProfileActivity, DiscountActivity::class.java))
                }
                R.id.card -> {
                    startActivity(Intent(this@ProfileActivity, CardActivity::class.java))
                }
                R.id.profile -> {
                    startActivity(Intent(this@ProfileActivity, ProfileActivity::class.java))
                }

            }
        }

    }
}