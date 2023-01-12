package com.example.lr5navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlin.random.Random

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecActSecretFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecActSecretFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sec_act_secret, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = view.findViewById<TextView>(R.id.textView3)
        val rand = (1..22).random()
        when (rand) {
            1 -> text.setText(getString(R.string.fact1))
            2 -> text.setText(getString(R.string.fact2))
            3 -> text.setText(getString(R.string.fact3))
            4 -> text.setText(getString(R.string.fact4))
            5 -> text.setText(getString(R.string.fact5))
            6 -> text.setText("Each king in a deck of playing cards represents great king from history.\n" +
                    "Spades - King David\n" +
                    "Clubs - Alexander the Great,\n" +
                    "Hearts - Charlemagne\n" +
                    "Diamonds - Julius Caesar.")
            7 -> text.setText(getString(R.string.fact7))
            8 -> text.setText("American Airlines saved $40,000 in 1987 by eliminating one olive from each salad served in first-class.")
            9 -> text.setText(getString(R.string.fact9))
            10 -> text.setText(getString(R.string.fact10))
            11 -> text.setText(getString(R.string.fact11))
            12 -> text.setText(getString(R.string.fact12))
            13 -> text.setText(getString(R.string.fact13))
            14 -> text.setText(getString(R.string.fact14))
            15 -> text.setText(getString(R.string.fact15))
            16 -> text.setText(getString(R.string.fact16))
            17 -> text.setText(getString(R.string.fact17))
            18 -> text.setText(getString(R.string.fact18))
            19 -> text.setText(getString(R.string.fact19))
            20 -> text.setText(getString(R.string.fact20))
            21 -> text.setText(getString(R.string.fact21))
            22 -> text.setText(getString(R.string.fact22))
            23 -> text.setText(getString(R.string.fact23))
            24 -> text.setText(getString(R.string.fact24))
            25 -> text.setText(getString(R.string.fact25))
            26 -> text.setText(getString(R.string.fact26))
            27 -> text.setText(getString(R.string.fact27))
            28 -> text.setText(getString(R.string.fact28))
            29 -> text.setText(getString(R.string.fact29))
            30 -> text.setText(getString(R.string.fact30))

        }
        view.findViewById<Button>(R.id.button4).setOnClickListener {
            findNavController().navigate(R.id.action_secActSecretFragment_to_mainActivity2)
        }
        view.findViewById<Button>(R.id.button6).setOnClickListener {
            findNavController().navigate(R.id.action_secActSecretFragment_self)
        }
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SecActSecretFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SecActSecretFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}