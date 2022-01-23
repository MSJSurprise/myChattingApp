package com.example.mychattingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ChatActivity : AppCompatActivity() {

    private lateinit var chatReclyclerView: RecyclerView
    private lateinit var messagebox: EditText
    private lateinit var btnSend: ImageView
//    private lateinit var : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val name = intent.getStringExtra("name")
        val uid = intent.getStringExtra("uid")

        supportActionBar?.title = name

        chatReclyclerView = findViewById(R.id.chat_recyclerview)
        messagebox = findViewById(R.id.message_box)
        btnSend = findViewById(R.id.btn_send)
    }
}