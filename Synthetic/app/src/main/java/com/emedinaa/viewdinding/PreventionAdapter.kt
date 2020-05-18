package com.emedinaa.viewdinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_prevention.view.*

class PreventionAdapter(private var preventionList:List<Prevention>):RecyclerView.Adapter<PreventionAdapter.PreventionViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, att: Int): PreventionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_prevention,parent,false)
        return PreventionViewHolder(view)
    }

    override fun onBindViewHolder(vh: PreventionViewHolder, position: Int) {
        vh.bind(preventionList[position])
    }

    override fun getItemCount(): Int {
        return preventionList.size
    }

    fun update(data:List<Prevention>){
        preventionList= data
        notifyDataSetChanged()
    }

    inner class PreventionViewHolder(private val view:View) : RecyclerView.ViewHolder(view){
        /*private val textViewTitle:TextView = view.textViewTitle
        private val textViewDesc:TextView = view.textViewDesc
        private val imageView:ImageView = view.imageView*/

        fun bind(entity:Prevention){
            view.textViewTitle.text = entity.title
            view.textViewDesc.text = entity.desc
            view.imageView.setImageResource(entity.image)
        }
    }
}