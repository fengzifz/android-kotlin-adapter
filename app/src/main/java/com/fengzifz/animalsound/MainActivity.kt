package com.fengzifz.animalsound

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_content.setText(R.string.app_name)

        goToAnimalList.setOnClickListener {
            val intent = Intent(this@MainActivity, AnimalsListActivity::class.java)
            startActivity(intent)
        }

    }

}
