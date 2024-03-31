package com.example.wotakuy

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val kabesha : ImageView = findViewById(R.id.kabesha)
        val fullname: TextView = findViewById(R.id.nama_lengkap)
        val birthday: TextView = findViewById(R.id.ttanggallahir)
        val bloodtype: TextView = findViewById(R.id.tgolongandarah)
        val horoscope: TextView = findViewById(R.id.thoroskop)
        val jiko : TextView = findViewById(R.id.jiko)
        val show: TextView = findViewById(R.id.tjlmshow)
        val debut: TextView = findViewById(R.id.tdebutgen)
        val promotion: TextView = findViewById(R.id.ttomemberaktif)
        val gennum: TextView = findViewById(R.id.tgen)
        val status: TextView = findViewById(R.id.tstatus)
        val nickname: TextView = findViewById(R.id.tnama_panggilan)
        val fanbase: TextView = findViewById(R.id.tnamafanbase)
        val btnInstagram: ImageButton = findViewById(R.id.instagram)
        val btnX: ImageButton = findViewById(R.id.twitter)
        val btnTiktok: ImageButton = findViewById(R.id.tiktok)
        val btnShowroom: ImageButton = findViewById(R.id.showroom)
        val btnIDNLive: ImageButton = findViewById(R.id.idnlive)
        val btnxfanbase: Button = findViewById(R.id.followfb)

        val bundle : Bundle?= intent.extras
        val d_kabesha = bundle?.getInt("kabesha")
        val d_fullname = bundle!!.getString("fullname")
        val d_birthday = bundle.getString("birthday")
        val d_bloodtype = bundle.getString("bloodtype")
        val d_horoscope = bundle.getString("horoscope")
        val d_jiko = bundle.getString("jiko")
        val d_show = bundle.getInt("show")
        val d_debut = bundle.getString("debut")
        val d_promotion = bundle.getString("promotion")
        val d_gennum = bundle.getInt("gennum")
        val d_status = bundle.getString("status")
        val d_nickname = bundle.getString("nickname")
        val d_fanbase = bundle.getString("fanbase")
        val d_instagram = bundle.getString("instagram")
        val d_x = bundle.getString("twitter")
        val d_tiktok = bundle.getString("tiktok")
        val d_showroom = bundle.getString("showroom")
        val d_idnlive = bundle.getString("idnlive")
        val d_xfanbase = bundle.getString("xfanbase")

        kabesha.setImageResource(d_kabesha!!)
        fullname.text = d_fullname
        birthday.text = d_birthday
        bloodtype.text = d_bloodtype
        horoscope.text = d_horoscope
        jiko.text = d_jiko
        show.text = d_show.toString()
        debut.text = d_debut
        promotion.text = d_promotion
        gennum.text = d_gennum.toString()
        status.text = d_status
        nickname.text = d_nickname
        fanbase.text = d_fanbase

        btnInstagram.setOnClickListener{
            val intentInstagram = Intent(Intent.ACTION_VIEW)
            intentInstagram.setData(Uri.parse(d_instagram))
            startActivity(intentInstagram)

        }

        btnX.setOnClickListener{
            val intentX = Intent(Intent.ACTION_VIEW)
            intentX.setData(Uri.parse(d_x))
            startActivity(intentX)
        }

        btnTiktok.setOnClickListener {
            val intentTiktok = Intent(Intent.ACTION_VIEW)
            intentTiktok.setData(Uri.parse(d_tiktok))
            startActivity(intentTiktok)
        }

        btnShowroom.setOnClickListener {
            val intentShowroom = Intent(Intent.ACTION_VIEW)
            intentShowroom.setData(Uri.parse(d_showroom))
            startActivity(intentShowroom)
        }

        btnIDNLive.setOnClickListener {
            val intentIDNLIve = Intent(Intent.ACTION_VIEW)
            intentIDNLIve.setData(Uri.parse(d_idnlive))
            startActivity(intentIDNLIve)
        }

        btnxfanbase.setOnClickListener{
            val intentXFB = Intent(Intent.ACTION_VIEW)
            intentXFB.setData(Uri.parse(d_xfanbase))
            startActivity(intentXFB)
        }

    }


}