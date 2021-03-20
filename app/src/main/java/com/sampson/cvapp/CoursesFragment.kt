package com.sampson.cvapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView

class CoursesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_courses, container, false)
        val txtFirstCourse = view.findViewById<TextView>(R.id.text_first_course)
        val txtSecondCourse = view.findViewById<TextView>(R.id.text_second_course)
        val txtThirdCourse = view.findViewById<TextView>(R.id.text_third_course)
        val txtFourfhCourse = view.findViewById<TextView>(R.id.text_fourfh_course)
        val btnEn = view.findViewById<ImageButton>(R.id.btnCoursesFragmentEn)
        val btnPt = view.findViewById<ImageButton>(R.id.btnCoursesFragmentPt)

        btnEn.setOnClickListener(View.OnClickListener {
            txtFirstCourse.text = resources.getText(R.string.infnet_en)
            txtSecondCourse.text = resources.getText(R.string.caelum_en)
            txtThirdCourse.text = resources.getText(R.string.udemy_en)
            txtFourfhCourse.text = resources.getText(R.string.clc_en)
        })

        btnPt.setOnClickListener(View.OnClickListener {
            txtFirstCourse.text = resources.getText(R.string.infnet_pt)
            txtSecondCourse.text = resources.getText(R.string.caelum_pt)
            txtThirdCourse.text = resources.getText(R.string.udemy_pt)
            txtFourfhCourse.text = resources.getText(R.string.clc_pt)
        })

        return view
    }
}
