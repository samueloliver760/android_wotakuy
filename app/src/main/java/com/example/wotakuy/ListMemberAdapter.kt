package com.example.wotakuy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListMemberAdapter (private val listMember: ArrayList<MemberJKT48>) : RecyclerView.Adapter<ListMemberAdapter.ListViewHolder>(){
    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_memberjkt48, parent, false)
        return ListViewHolder(view,mListener)
    }

    override fun getItemCount(): Int = listMember.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val test = listMember[position]
        holder.tvFN.text = test.fullName
        holder.tvNN.text = test.nickName
        holder.tvStatus.text = test.statusMember
        holder.tvGen.text = test.genMember
        holder.kabeshamember.setImageResource(test.kabesha)
    }

    class ListViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {

        val tvFN: TextView = itemView.findViewById(R.id.tv_fullname)
        val tvNN: TextView = itemView.findViewById(R.id.tv_nickname)
        val tvStatus: TextView = itemView.findViewById(R.id.tv_status)
        val tvGen: TextView = itemView.findViewById(R.id.tv_gen)
        val kabeshamember : ImageView = itemView.findViewById(R.id.kabesha_member)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
}


