package com.sampson.cvapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.sampson.cvapp.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val btnPt = view.findViewById<ImageButton>(R.id.btnHomeFragmentPt)
        val btnEn = view.findViewById<ImageButton>(R.id.btnHomeFragmentEn)
        val txtFirst = view.findViewById<TextView>(R.id.text_profile_first)
        val txtSecond = view.findViewById<TextView>(R.id.text_profile_second)
        val txtThird = view.findViewById<TextView>(R.id.text_profile_third)
        val txtFourth = view.findViewById<TextView>(R.id.text_profile_fourth)


        btnPt.setOnClickListener(View.OnClickListener {
            txtFirst.text = resources.getText(R.string.profile_first_text_pt)
            txtSecond.text = resources.getText(R.string.profile_second_text_pt)
            txtThird.text = resources.getText(R.string.profile_third_text_pt)
            txtFourth.text = resources.getText(R.string.profile_fourth_text_pt)
        })

        btnEn.setOnClickListener(View.OnClickListener {
            txtFirst.text = resources.getText(R.string.profile_first_text_en)
            txtSecond.text = resources.getText(R.string.profile_second_text_en)
            txtThird.text = resources.getText(R.string.profile_third_text_en)
            txtFourth.text = resources.getText(R.string.profile_fourth_text_en)
        })

        return view

    }
}
