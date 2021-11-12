package com.example.android_05

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_05.databinding.FragmentProfileBinding


class ProfileFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root

        binding.linkedin.setOnClickListener(this)

       /* binding.linkedin.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/hekar-doski-579a601a6/"))
            startActivity(intent)
        }*/
    }

    override fun onClick(p0: View?) {

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/hekar-doski-579a601a6/"))
        startActivity(intent)
    }


}