package com.example.android_05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_05.databinding.FragmentFirstBinding
import com.example.android_05.databinding.FragmentSecBinding
import kotlin.math.pow


class SecFragment : Fragment() {

    lateinit var binding: FragmentSecBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentSecBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = arguments?.getString("data")
        binding.txtData.text=data.toString()
        var res:Float

        binding.btnBmi.setOnClickListener{
            val h = binding.editheight.text.toString().toFloat()
            val w = binding.editweight.text.toString().toFloat()
            res = w/h.pow(2)


            if (res <18)
                binding.txtResulte.setText("Underweight")
            else if (res > 18 && res < 24)
                binding.txtResulte.setText("Healthy weight")
            else if (res > 24 && res < 29)
                binding.txtResulte.setText("Overweight")
            else
                binding.txtResulte.setText("Obesity")

        }





    }

}