package com.sampson.cvapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView

class HardSkillsFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hard_skills, container, false)
        val txtTitle = view.findViewById<TextView>(R.id.txtHardSkillTitle)
        val txtLabel = view.findViewById<TextView>(R.id.txtHardSkillLabel)
        val txt1Star = view.findViewById<TextView>(R.id.txtHardSkill1Star)
        val txt2Star = view.findViewById<TextView>(R.id.txtHardSkill2Star)
        val txt3Star = view.findViewById<TextView>(R.id.txtHardSkill3Star)
        val txt4Star = view.findViewById<TextView>(R.id.txtHardSkill4Star)
        val txt5Star = view.findViewById<TextView>(R.id.txtHardSkill5Star)
        val btnEn = view.findViewById<ImageButton>(R.id.btnHardSkillsFragmentEn)
        val btnPt = view.findViewById<ImageButton>(R.id.btnHardSkillsFragmentPt)

        btnEn.setOnClickListener(View.OnClickListener {
            txtTitle.text = resources.getText(R.string.txt_title_skills_en)
            txtLabel.text = resources.getText(R.string.label)
            txt1Star.text = resources.getText(R.string.hardskills_label_1_stars_en)
            txt2Star.text = resources.getText(R.string.hardskills_label_2_stars_en)
            txt3Star.text = resources.getText(R.string.hardskills_label_3_stars_en)
            txt4Star.text = resources.getText(R.string.hardskills_label_4_stars_en)
            txt5Star.text = resources.getText(R.string.hardskills_label_5_stars_en)
        })

        btnPt.setOnClickListener(View.OnClickListener {
            txtTitle.text = resources.getText(R.string.txt_title_skills_pt)
            txtLabel.text = resources.getText(R.string.label_pt)
            txt1Star.text = resources.getText(R.string.hardskills_label_1_stars_pt)
            txt2Star.text = resources.getText(R.string.hardskills_label_2_stars_pt)
            txt3Star.text = resources.getText(R.string.hardskills_label_3_stars_pt)
            txt4Star.text = resources.getText(R.string.hardskills_label_4_stars_pt)
            txt5Star.text = resources.getText(R.string.hardskills_label_5_stars_pt)
        })


        return view
    }
}
