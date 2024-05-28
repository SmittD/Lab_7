package com.example.lab_7recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab_7recyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var listOfCountries = arrayListOf<String>()

    private lateinit var adapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        listOfCountries.add(0, "Poland")
        listOfCountries.add(1, "Germany")
        listOfCountries.add(2, "USA")
        listOfCountries.add(3, "Canada")
        listOfCountries.add(4, "Mexico")
        listOfCountries.add(5, "UK")
        listOfCountries.add(6, "France")
        listOfCountries.add(7, "Italy")
        listOfCountries.add(8, "Spain")
        listOfCountries.add(9, "Japan")
        listOfCountries.add(10, "China")
        listOfCountries.add(11, "Ruanda")
        listOfCountries.add(12, "Brazil")
        listOfCountries.add(13, "India")
        listOfCountries.add(14, "South Korea")
        listOfCountries.add(15, "Australia")
        listOfCountries.add(16, "New Zealand")
        listOfCountries.add(17, "Argentina")
        listOfCountries.add(18, "Colombia")
        listOfCountries.add(19, "Peru")
        listOfCountries.add(20, "Venezuela")

        adapter = CountryAdapter(listOfCountries, this@MainActivity)
        binding.recyclerView.adapter = adapter
    }
}