package id.ac.ubaya.informatika.advweek4.view

import android.view.View
import id.ac.ubaya.informatika.advweek4.model.Student

interface ButtonDetailClickListener {
    fun onButtonDetailClick(v: View)
}

interface ButtonNotifClickListener {
    fun onButtonNotifClick(v: View, obj: Student)
}

interface ButtonUpdateClickListener {
    fun onButtonUpdateClick(v: View, obj: Student)
}