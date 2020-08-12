package com.myogardener.recyclerview4.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myogardener.recyclerview4.R
import com.myogardener.recyclerview4.model.Card
import kotlinx.android.synthetic.main.activity_main.view.*

class CardAdapter(var CardArrayList: ArrayList<Card>) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    var clickListerner: ClickListerner? = null

    fun setOnClickListener(clickListerner: ClickListerner) {
        this.clickListerner = clickListerner
    }
    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        lateinit var card: Card
        init {
            itemView.setOnClickListener(this)
        }
        fun bindPerson(card: Card) {
            this.card = card
            itemView.iv1.setImageResource(card.image)
            itemView.txt_rice1.text=card.text1
            itemView.txt_rice2.text=card.text2
            itemView.txt_rice3.text=card.text3

        }
        override fun onClick(p0: View?) {
            clickListerner?.onClick(card)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)

        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return CardArrayList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindPerson(CardArrayList[position])
    }
    interface ClickListerner {
        fun onClick(card: Card)
    }
}
