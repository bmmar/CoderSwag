package com.example.coderswag.controller

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.coderswag.R
import com.example.coderswag.model.Category
import com.example.coderswag.services.DataService

lateinit var adapter: ArrayAdapter<Category>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            DataService.categories
        )
        val categoryListView = findViewById<ListView>(R.id.categoryListView)
        categoryListView.adapter = adapter
    }
}