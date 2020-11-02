package com.khusnia.belajarrecyleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*
import com.khusnia.belajarrecyleview.Adapter.Holder as AdapterHolder

class Adapter(private val list:ArrayList<Users>) : RecyclerView.Adapter<AdapterHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterHolder {
       return AdapterHolder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }
    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: AdapterHolder, position: Int) {
        holder.view.lbList.text = list.get(position).name
    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)
    }
