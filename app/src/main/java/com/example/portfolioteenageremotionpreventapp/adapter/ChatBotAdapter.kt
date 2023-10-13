package com.example.portfolioteenageremotionpreventapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolioteenageremotionpreventapp.R
import com.example.portfolioteenageremotionpreventapp.chatbot.ChatBotDataPair

class ChatBotAdapter(private val chatBotData: List<ChatBotDataPair>) :
    RecyclerView.Adapter<ChatBotAdapter.MessageViewHolder>() {

    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val inputMessageTextView: TextView = itemView.findViewById(R.id.inputMessageTextView)
        val responseMessageTextView: TextView = itemView.findViewById(R.id.responseMessageTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chat, parent, false)
        return MessageViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val messagePair = chatBotData[position]

        holder.inputMessageTextView.text = messagePair.inputMessage
        holder.inputMessageTextView.textSize = 23f

        holder.responseMessageTextView.text = messagePair.responseMessage
        holder.responseMessageTextView.textSize = 23f
    }

    override fun getItemCount(): Int = chatBotData.size
}