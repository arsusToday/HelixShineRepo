package com.alchemist.angelsagao.hsauidhwisa

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


class Gieiieurhudhuf : Fragment() {
    lateinit var uxzbcuzxhhus: String
    val jisajiduhhuxzcgy by activityViewModel<Uqoqoisjxuhcsgy>(named("MainModel"))
    val wosk: SharedPreferences by inject(named("SharedPreferences"))

    private lateinit var sijdjis: Context


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sjidjsji = wosk.getString("apps", null)
        val gcgxhbv = wosk.getString("appCamp", null)

        if (sjidjsji=="1" && gcgxhbv == null) {
            jisajiduhhuxzcgy.bbcnncxkkvk(sijdjis)
            jisajiduhhuxzcgy.sokakodijs.observe(viewLifecycleOwner) {
                if (it != null) {
                    uxzbcuzxhhus = it.toString()
                    wosk.edit().putString("appCamp", uxzbcuzxhhus).apply()
                    findNavController().navigate(R.id.gifids)
                }
            }
        } else {
            findNavController().navigate(R.id.gifids)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        sijdjis = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.ffifiifucygxtfvds, container, false)
    }

}