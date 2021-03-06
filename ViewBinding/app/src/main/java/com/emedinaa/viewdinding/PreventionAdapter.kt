package com.emedinaa.viewdinding

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.emedinaa.viewdinding.databinding.RowPreventionBinding

class PreventionAdapter(private var preventionList:List<Prevention>):RecyclerView.Adapter<PreventionAdapter.PreventionViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, att: Int): PreventionViewHolder {
        val itemBinding = RowPreventionBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PreventionViewHolder(itemBinding)
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

    inner class PreventionViewHolder(itemBinding:RowPreventionBinding) : RecyclerView.ViewHolder(itemBinding.root){
        private val textViewTitle:TextView = itemBinding.textViewTitle
        private val textViewDesc:TextView = itemBinding.textViewDesc
        private val imageView:ImageView = itemBinding.imageView

        fun bind(entity:Prevention){
            textViewTitle.text = entity.title
            textViewDesc.text = entity.desc
            imageView.setImageResource(entity.image)
        }
    }
}