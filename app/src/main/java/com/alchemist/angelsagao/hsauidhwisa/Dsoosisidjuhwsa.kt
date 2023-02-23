package com.alchemist.angelsagao.hsauidhwisa
import com.alchemist.angelsagao.R
import com.alchemist.angelsagao.eowek.Uqoqoisjxuhcsgy
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController



class Dsoosisidjuhwsa : Fragment() {

    private lateinit var uysgdjisdji: Context
    val ixjzcjixji by activityViewModel<Uqoqoisjxuhcsgy>(named("MainModel"))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.owiwjsjidhux, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        uysgdjisdji=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ixjzcjixji.eokkowkokodokdoksajijxcijzc(uysgdjisdji)
        findNavController().navigate(R.id.iicooovocijhudsa)

    }
}