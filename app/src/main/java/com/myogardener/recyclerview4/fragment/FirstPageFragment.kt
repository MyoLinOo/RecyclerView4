package com.myogardener.recyclerview4.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.myogardener.recyclerview4.R
import com.myogardener.recyclerview4.adpter.CardAdapter
import com.myogardener.recyclerview4.model.Card
import kotlinx.android.synthetic.main.fragment_first_page.*

class FirstPageFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

        var cardAdapter= CardAdapter(cardList)

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter =cardAdapter

    }

}