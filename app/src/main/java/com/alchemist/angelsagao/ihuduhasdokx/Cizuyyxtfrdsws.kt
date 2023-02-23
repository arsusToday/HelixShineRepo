package com.alchemist.angelsagao.ihuduhasdokx

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alchemist.angelsagao.R
import com.alchemist.angelsagao.eowek.Uqoqoisjxuhcsgy
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Cizuyyxtfrdsws : Fragment() {
    val kxkkcnxuhx: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var sokoxkookxc: String
    private lateinit var uhzxhucijxjisji: Context
    val eokoskokdo by activityViewModel<Uqoqoisjxuhcsgy>(named("MainModel"))




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jusytgdts, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        uhzxhucijxjisji = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eokoskokdo.sokkozkoxo.observe(viewLifecycleOwner) {
            if (it!=null) {
                sokoxkookxc = it.cou
                kxkkcnxuhx.edit().putString("country", sokoxkookxc).apply()
                findNavController().navigate(R.id.bxbzjjixchhsuhua)
            }
        }

    }
}