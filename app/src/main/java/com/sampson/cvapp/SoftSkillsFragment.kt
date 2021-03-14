package com.sampson.cvapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView

class SoftSkillsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_soft_skills, container, false)
        val txtTitle = view.findViewById<TextView>(R.id.txtSoftSkillTitle)
        val txtPatience = view.findViewById<TextView>(R.id.txtSoftSkillPatience)
        val txtObjectivity= view.findViewById<TextView>(R.id.txtSoftSkillObjectivity)
        val txtPerseverance = view.findViewById<TextView>(R.id.txtSoftSkillPerseverance)
        val txtCommunication = view.findViewById<TextView>(R.id.txtSoftSkillCommunication)
        val txtCreativity = view.findViewById<TextView>(R.id.txtSoftSkillCreativity)
        val txtHonesty = view.findViewById<TextView>(R.id.txtSoftSkillHonesty)
        val txtGroupWork = view.findViewById<TextView>(R.id.txtSoftSkillGroupWork)
        val txtWilltoLearn = view.findViewById<TextView>(R.id.txtSoftSkillWilltoLearn)
        val txtLeadership = view.findViewById<TextView>(R.id.txtSoftSkillLeadership)
        val txtLabel = view.findViewById<TextView>(R.id.txtSoftSkillLabel)
        val txt1Star = view.findViewById<TextView>(R.id.txtSoftSkill1Star)
        val txt2Star = view.findViewById<TextView>(R.id.txtSoftSkill2Star)
        val txt3Star = view.findViewById<TextView>(R.id.txtSoftSkill3Star)
        val txt4Star = view.findViewById<TextView>(R.id.txtSoftSkill4Star)
        val txt5Star = view.findViewById<TextView>(R.id.txtSoftSkill5Star)
        val btnEn = view.findViewById<ImageButton>(R.id.btnSoftSkillsFragmentEn)
        val btnPt = view.findViewById<ImageButton>(R.id.btnSoftSkillsFragmentPt)

        btnEn.setOnClickListener(View.OnClickListener {
            txtTitle.text = resources.getString(R.string.txt_title_skills_en)
            txtPatience.text = resources.getString(R.string.patience)
            txtObjectivity.text = resources.getString(R.string.objectivity)
            txtPerseverance.text = resources.getString(R.string.perseverance)
            txtCommunication.text = resources.getString(R.string.communication)
            txtCreativity.text = resources.getString(R.string.creativity)
            txtHonesty.text = resources.getString(R.string.honesty)
            txtGroupWork.text = resources.getString(R.string.group_work)
            txtWilltoLearn.text = resources.getString(R.string.will_to_learn)
            txtLeadership.text = resources.getString(R.string.leadership)
            txtLabel.text = resources.getString(R.string.label)
            txt1Star.text = resources.getString(R.string.SoftSkills_label_1_stars_en)
            txt2Star.text = resources.getString(R.string.SoftSkills_label_2_stars_en)
            txt3Star.text = resources.getString(R.string.SoftSkills_label_3_stars_en)
            txt4Star.text = resources.getString(R.string.SoftSkills_label_4_stars_en)
            txt5Star.text = resources.getString(R.string.SoftSkills_label_5_stars_en)
        })

        btnPt.setOnClickListener(View.OnClickListener {
            txtTitle.text = resources.getString(R.string.txt_title_skills_pt)
            txtPatience.text = resources.getString(R.string.paciencia)
            txtObjectivity.text = resources.getString(R.string.objevidade)
            txtPerseverance.text = resources.getString(R.string.perseveranca)
            txtCommunication.text = resources.getString(R.string.comunicacao)
            txtCreativity.text = resources.getString(R.string.criatividade)
            txtHonesty.text = resources.getString(R.string.honestidade)
            txtGroupWork.text = resources.getString(R.string.trabalho_em_grupo)
            txtWilltoLearn.text = resources.getString(R.string.vontade_de_aprender)
            txtLeadership.text = resources.getString(R.string.lideranca)
            txtLabel.text = resources.getString(R.string.label_pt)
            txt1Star.text = resources.getString(R.string.SoftSkills_label_1_stars_pt)
            txt2Star.text = resources.getString(R.string.SoftSkills_label_2_stars_pt)
            txt3Star.text = resources.getString(R.string.SoftSkills_label_3_stars_pt)
            txt4Star.text = resources.getString(R.string.SoftSkills_label_4_stars_pt)
            txt5Star.text = resources.getString(R.string.SoftSkills_label_5_stars_pt)
        })


        return view
    }
}
