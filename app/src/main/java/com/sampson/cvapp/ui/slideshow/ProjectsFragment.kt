package com.sampson.cvapp.ui.slideshow

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.sampson.cvapp.R
import kotlinx.android.synthetic.main.fragment_projects.*

class ProjectsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_projects, container, false)
        val btnRepository1 = view.findViewById<Button>(R.id.btnRepository1)
        val btnRepository2 = view.findViewById<Button>(R.id.btnRepository2)
        val btnRepository3 = view.findViewById<Button>(R.id.btnRepository3)
        val btnRepository4 = view.findViewById<Button>(R.id.btnRepository4)
        val btnRepository5 = view.findViewById<Button>(R.id.btnRepository5)
        val btnRepository6 = view.findViewById<Button>(R.id.btnRepository6)
        val btnRepository7 = view.findViewById<Button>(R.id.btnRepository7)
        val btnRepository8 = view.findViewById<Button>(R.id.btnRepository8)
        val btnEn = view.findViewById<ImageButton>(R.id.btnProjectsFragmentEn)
        val btnPt = view.findViewById<ImageButton>(R.id.btnProjectsFragmentPt)

        val txtDescRep1 = view.findViewById<TextView>(R.id.txtDescriptionRepository1)
        val txtDescRep2 = view.findViewById<TextView>(R.id.txtDescriptionRepository2)
        val txtDescRep3 = view.findViewById<TextView>(R.id.txtDescriptionRepository3)
        val txtDescRep4 = view.findViewById<TextView>(R.id.txtDescriptionRepository4)
        val txtDescRep5 = view.findViewById<TextView>(R.id.txtDescriptionRepository5)
        val txtDescRep6 = view.findViewById<TextView>(R.id.txtDescriptionRepository6)
        val txtDescRep7 = view.findViewById<TextView>(R.id.txtDescriptionRepository7)
        val txtDescRep8 = view.findViewById<TextView>(R.id.txtDescriptionRepository8)

        btnRepository1.setOnClickListener(View.OnClickListener {
            val url = getString(R.string.url_repository1)
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        btnRepository2.setOnClickListener(View.OnClickListener {
            val url = getString(R.string.url_repository2)
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        btnRepository3.setOnClickListener(View.OnClickListener {
            val url = getString(R.string.url_repository3)
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        btnRepository4.setOnClickListener(View.OnClickListener {
            val url = getString(R.string.url_repository4)
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        btnRepository5.setOnClickListener(View.OnClickListener {
            val url = getString(R.string.url_repository5)
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        btnRepository6.setOnClickListener(View.OnClickListener {
            val url = getString(R.string.url_repository6)
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        btnRepository7.setOnClickListener(View.OnClickListener {
            val url = getString(R.string.url_repository7)
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        btnRepository8.setOnClickListener(View.OnClickListener {
            val url = getString(R.string.url_repository8)
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        btnEn.setOnClickListener(View.OnClickListener {
            txtDescRep1.text = getString(R.string.description_repository1_en)
            txtDescRep2.text = getString(R.string.description_repository2_en)
            txtDescRep3.text = getString(R.string.description_repository3_en)
            txtDescRep4.text = getString(R.string.description_repository4_en)
            txtDescRep5.text = getString(R.string.description_repository5_en)
            txtDescRep6.text = getString(R.string.description_repository6_en)
            txtDescRep7.text = getString(R.string.description_repository7_en)
            txtDescRep8.text = getString(R.string.description_repository8_en)
            btnRepository1.text = getString(R.string.navigate)
            btnRepository2.text = getString(R.string.navigate)
            btnRepository3.text = getString(R.string.navigate)
            btnRepository4.text = getString(R.string.navigate)
            btnRepository5.text = getString(R.string.navigate)
            btnRepository6.text = getString(R.string.navigate)
            btnRepository7.text = getString(R.string.navigate)
            btnRepository8.text = getString(R.string.navigate)

        })

        btnPt.setOnClickListener(View.OnClickListener {
            txtDescRep1.text = getString(R.string.description_repository1_pt)
            txtDescRep2.text = getString(R.string.description_repository2_pt)
            txtDescRep3.text = getString(R.string.description_repository3_pt)
            txtDescRep4.text = getString(R.string.description_repository4_pt)
            txtDescRep5.text = getString(R.string.description_repository5_pt)
            txtDescRep6.text = getString(R.string.description_repository6_pt)
            txtDescRep7.text = getString(R.string.description_repository7_pt)
            txtDescRep8.text = getString(R.string.description_repository8_pt)
            btnRepository1.text = getString(R.string.navigate_pt)
            btnRepository2.text = getString(R.string.navigate_pt)
            btnRepository3.text = getString(R.string.navigate_pt)
            btnRepository4.text = getString(R.string.navigate_pt)
            btnRepository5.text = getString(R.string.navigate_pt)
            btnRepository6.text = getString(R.string.navigate_pt)
            btnRepository7.text = getString(R.string.navigate_pt)
            btnRepository8.text = getString(R.string.navigate_pt)

        })

        return view
    }
}