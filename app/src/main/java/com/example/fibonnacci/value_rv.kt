package com.example.fibonnacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class valuesRVAdapter(var fibonacciList:List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_rv,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        val currentValue = fibonacciList.get(position)
        holder.tvName.text=currentValue.toString()

    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
}

class NumbersViewHolder(itemView: View):ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)


}