package com.karan.interaction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.karan.interaction.databinding.ActivityMainBinding
import com.karan.interaction.databinding.FragmentFragement1Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragement_1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragement_1 : Fragment(), Interface2 {
    lateinit var binding: FragmentFragement1Binding
    var mainActivity: MainActivity? = null

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        mainActivity = activity as MainActivity
        mainActivity?.interface2 = this

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btntext.setOnClickListener {
            mainActivity?.changevalue(binding.ettext.text.toString())
        }
        binding.btninc.setOnClickListener {
            mainActivity?.changevalue("${binding.ettext.text.toString().toInt() + 1}")
            mainActivity?.changeCounter("+1")
        }
        binding.btndec.setOnClickListener {
            mainActivity?.changevalue("${binding.ettext.text.toString().toInt() - 1}")
            mainActivity?.changeCounter("-1")
        }
        binding.btnreset.setOnClickListener {
            mainActivity?.changevalue("0")
            mainActivity?.changeCounter("value is reset")

        }



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFragement1Binding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragement_1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragement_1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    override fun colourChange() {
        binding.LAYOUT1.setBackgroundColor(
            ContextCompat.getColor(requireContext(), R.color.red)
        )


    }

    override fun colourChange2() {
        binding.LAYOUT1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.Green))

    }

    override fun colourChange3() {
        binding.LAYOUT1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.Blue))
    }


}