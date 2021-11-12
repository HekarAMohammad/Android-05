package com.example.android_05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_05.databinding.FragmentFirstBinding
import com.example.android_05.databinding.FragmentSecBinding
import kotlin.concurrent.fixedRateTimer


class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFragsecend.setOnClickListener{
            val name = binding.editName.text.toString()
            val bundle = Bundle()
            bundle.putString("data",name)
            val secFragment=SecFragment()
            secFragment.arguments= bundle
            fragmentManager?.beginTransaction()?.replace(R.id.freamelaiout,secFragment)?.commit()
        }





    }

}