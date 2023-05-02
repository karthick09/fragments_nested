package com.example.fragments_nested

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun selectNestedFragment(view: View) {
        val fr: Fragment = if (view === findViewById<View>(R.id.button1)) {
            NestedFragmentOne()
        }  else{
            NestedFragmentTwo()
        }
        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_section, fr)
        fragmentTransaction.addToBackStack("fragmentStack")
        fragmentTransaction.commit()
    }
    fun selectFragment1(view: View) {
        val fr: Fragment = if (view === findViewById<View>(R.id.button3)) {
            FragmentOne()
        } else if (view === findViewById<View>(R.id.button4)){
            FragmentTwo()
        } else{
            FragmentThree()
        }
        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
        fragmentTransaction.replace(R.id.fragment1_section, fr)
        fragmentTransaction.commit()
    }
    fun selectFragment2(view: View) {
        val fr: Fragment = if (view === findViewById<View>(R.id.button6)) {
            FragmentFour()
        } else if (view === findViewById<View>(R.id.button7)){
            FragmentFive()
        } else{
            FragmentSix()
        }
        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
        fragmentTransaction.replace(R.id.fragment2_section, fr)
        fragmentTransaction.commit()
    }
}