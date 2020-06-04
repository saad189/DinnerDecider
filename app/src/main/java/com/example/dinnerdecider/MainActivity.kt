package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Burger King", "Hamburger","Pizza","McDonalds","OpTp")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedFoodTxt.text = "Burger King"
        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }
        addFoodBtn.setOnClickListener{
            foodList.add(addFoodTxt.text.toString())
        }
    }
}
