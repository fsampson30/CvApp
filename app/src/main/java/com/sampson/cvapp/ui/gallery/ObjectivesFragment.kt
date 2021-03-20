package com.sampson.cvapp.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.sampson.cvapp.R

class ObjectivesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_objectives, container, false)
        val txtFirstObjective = view.findViewById<TextView>(R.id.text_objectives_1)
        val txtSecondObjective = view.findViewById<TextView>(R.id.text_objectives_2)
        val txtThirdObjective = view.findViewById<TextView>(R.id.text_objectives_3)
        val txtFourthObjective = view.findViewById<TextView>(R.id.text_objectives_4)
        val btnEn = view.findViewById<ImageButton>(R.id.btnObjectivesFragmentEn)
        val btnPt = view.findViewById<ImageButton>(R.id.btnObjectivesFragmentPt)

        btnEn.setOnClickListener(View.OnClickListener {
            txtFirstObjective.text = getString(R.string.text_objective_1_en)
            txtSecondObjective.text = getString(R.string.text_objectives_2_en)
            txtThirdObjective.text = getString(R.string.text_objectives_3_en)
            txtFourthObjective.text = getString(R.string.text_objectives_4_en)
        })

        btnPt.setOnClickListener(View.OnClickListener {
            txtFirstObjective.text = getString(R.string.text_objective_1_pt)
            txtSecondObjective.text = getString(R.string.text_objectives_2_pt)
            txtThirdObjective.text = getString(R.string.text_objectives_3_pt)
            txtFourthObjective.text = getString(R.string.text_objectives_4_pt)
        })

        return view
    }
}