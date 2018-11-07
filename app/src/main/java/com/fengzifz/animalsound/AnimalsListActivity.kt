package com.fengzifz.animalsound

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import kotlinx.android.synthetic.main.activity_animals.*
import kotlinx.android.synthetic.main.content_animals.*

class AnimalsListActivity : AppCompatActivity() {

    private var listData = listOf(
        "Dog", "Cat", "Pig", "Hen", "Fish"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animals)
        setSupportActionBar(toolbar)

        animal_list.adapter = AnimalsAdapter(this, listData)

    }

}
