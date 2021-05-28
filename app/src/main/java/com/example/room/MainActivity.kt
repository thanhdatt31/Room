package com.example.room

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder
import java.text.SimpleDateFormat

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.TemporalAccessor
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dateobj: DateObj = DateObj("12", "5", "2021")
//        val sb = StringBuilder()
//        sb.append(dateobj.day).append(dateobj.month).append(dateobj.year)
        val sb = dateobj.day + " " + dateobj.month + ", " + dateobj.year
        Log.d("datnt", "onCreate: $sb")
        val formatter = DateTimeFormatter.ofPattern("dd M, yyyy", Locale.ENGLISH)
        val date : LocalDate = LocalDate.parse(sb,formatter)
        Log.d("datnt", "onCreate: ${date.month}")
    }
}