package com.myogardener.recyclerview4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.myogardener.recyclerview4.adpter.CardAdapter
import com.myogardener.recyclerview4.model.Card
import kotlinx.android.synthetic.main.originactivity.*
import kotlinx.android.synthetic.main.recyclerview.*

class MainActivity : AppCompatActivity(), CardAdapter.ClickListerner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.originactivity)
        var cardList=ArrayList<Card>()

        cardList.add(Card(R.drawable.suger,"Fine Grain Sugar","Price- $20.00","1Kg"))
        cardList.add(Card(R.drawable.peanuts,"Peanuts","Price- $20.00","3kg"))
        cardList.add(Card(R.drawable.rice,"Dawat Rice","Price- $80.00","2kg"))
        cardList.add(Card(R.drawable.suger,"Fine Grain Sugar","Price- $20.00","1Kg"))
        cardList.add(Card(R.drawable.peanuts,"Peanuts","Price- $20.00","3kg"))
        cardList.add(Card(R.drawable.rice,"Dawat Rice","Price- $80.00","2kg"))
        cardList.add(Card(R.drawable.suger,"Fine Grain Sugar","Price- $20.00","1Kg"))
        cardList.add(Card(R.drawable.peanuts,"Peanuts","Price- $20.00","3kg"))
        cardList.add(Card(R.drawable.rice,"Dawat Rice","Price- $80.00","2kg"))
        cardList.add(Card(R.drawable.suger,"Fine Grain Sugar","Price- $20.00","1Kg"))
        cardList.add(Card(R.drawable.peanuts,"Peanuts","Price- $20.00","3kg"))
        cardList.add(Card(R.drawable.rice,"Dawat Rice","Price- $80.00","2kg"))

        var cardAdapter=CardAdapter(cardList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter =cardAdapter

        cardAdapter.setOnClickListener(this)
    }
    override fun onClick(card: Card) {
        Toast.makeText(this, card.text1, Toast.LENGTH_SHORT).show()
    }
}