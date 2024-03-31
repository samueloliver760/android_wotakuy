package com.example.wotakuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMemberJKT48: RecyclerView
    private val list = ArrayList<MemberJKT48>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMemberJKT48 = findViewById(R.id.rv_member)
        rvMemberJKT48.setHasFixedSize(true)

        list.addAll(getListMember())
        showRecyclerList()

        val memberAdapter = ListMemberAdapter(list)
        rvMemberJKT48.adapter = memberAdapter

        memberAdapter.setOnItemClickListener(object: ListMemberAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("kabesha", list[position].kabesha)
                intent.putExtra("fullname",list[position].fullName)
                intent.putExtra("birthday", list[position].birthday)
                intent.putExtra("bloodtype", list[position].bloodtype)
                intent.putExtra("horoscope",list[position].horoscope)
                intent.putExtra("jiko",list[position].jiko)
                intent.putExtra("show", list[position].show)
                intent.putExtra("debut", list[position].debut)
                intent.putExtra("promotion", list[position].promotion)
                intent.putExtra("gennum", list[position].gennum)
                intent.putExtra("status", list[position].statusMember)
                intent.putExtra("nickname", list[position].nickNameN)
                intent.putExtra("fanbase", list[position].fanbase)
                intent.putExtra("instagram", list[position].instagram)
                intent.putExtra("twitter", list[position].twitter)
                intent.putExtra("tiktok", list[position].tiktok)
                intent.putExtra("showroom", list[position].showroom)
                intent.putExtra("idnlive",list[position].idnlive)
                intent.putExtra("xfanbase", list[position].xFB)

                startActivity(intent)
            }

        })
    }

    private fun getListMember(): ArrayList<MemberJKT48> {
        val dataFN = resources.getStringArray(R.array.data_fullname)
        val dataNN = resources.getStringArray(R.array.data_nickname)
        val dataStatus = resources.getStringArray(R.array.data_status)
        val dataGen = resources.getStringArray(R.array.data_gen)
        val dataKabesha = resources.obtainTypedArray(R.array.data_kabesha)
        val dataBirthday = resources.getStringArray(R.array.data_birthday)
        val dataBloodType = resources.getStringArray(R.array.data_goldarah)
        val dataHoroscope = resources.getStringArray(R.array.data_horoscope)
        val jiko = resources.getStringArray(R.array.data_jiko)
        val show = resources.getIntArray(R.array.data_show)
        val debut = resources.getStringArray(R.array.data_debgen)
        val promotion = resources.getStringArray(R.array.data_tomemakt)
        val gennum = resources.getIntArray(R.array.data_gennum)
        val nicknamen = resources.getStringArray(R.array.data_nicknameclear)
        val fanbase = resources.getStringArray(R.array.data_fanbase)
        val instragram = resources.getStringArray(R.array.data_instagram)
        val twitter = resources.getStringArray(R.array.data_twitter)
        val tiktok = resources.getStringArray(R.array.data_tiktok)
        val showroom = resources.getStringArray(R.array.data_showroom)
        val idnlive = resources.getStringArray(R.array.data_idnlive)
        val xfanbase = resources.getStringArray(R.array.data_twitterfb)

        val listMem = ArrayList<MemberJKT48>()

        for (i in dataFN.indices) {
            val member48 = MemberJKT48(dataFN[i],dataNN[i],dataStatus[i], dataGen[i],dataKabesha.getResourceId(i,-1), dataBirthday[i],dataBloodType[i],dataHoroscope[i], jiko[i], show[i], debut[i], promotion[i], gennum[i], nicknamen[i], fanbase[i], instragram[i], twitter[i], tiktok[i], showroom[i],idnlive[i],xfanbase[i])
            listMem.add(member48)
        }
        return listMem
    }


    private fun showRecyclerList() {
        rvMemberJKT48.layoutManager = LinearLayoutManager(this)
        val listMemberAdapter = ListMemberAdapter(list)
        rvMemberJKT48.adapter = listMemberAdapter
    }

    private fun showSelectedMember(member: MemberJKT48) {
        val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
        startActivity(moveIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profile -> {
                val toProfile = Intent(this@MainActivity, Profile::class.java)
                startActivity(toProfile)
            }
        }

        return super.onOptionsItemSelected(item)
    }
}