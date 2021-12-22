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
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav)

        val mOnNavigationItemSelectedListener =
            BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.home -> {
                        startActivity(Intent(this, HomeActivity::class.java))
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.discount -> {
                        startActivity(Intent(this, DiscountActivity::class.java))
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.card -> {
                        startActivity(Intent(this, CardActivity::class.java))
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.profile -> {
                        startActivity(Intent(this, ProfileActivity::class.java))
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            }
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}