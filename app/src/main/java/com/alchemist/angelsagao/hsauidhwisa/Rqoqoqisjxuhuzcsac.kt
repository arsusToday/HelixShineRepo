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
import com.mvffg.btwolib.decrypt
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class Rqoqoqisjxuhuzcsac : Fragment() {
    private lateinit var hbzxbhczbhchbshbbaysg: Context
    val aiojsdji = "AES/CBC/PKCS5Padding"
    lateinit var aoksakoskookxjizcji: String

    val bcxvuh = SecretKeySpec("QfTjWnZr4u7x!A%D*G-JaNdRgUkXp2s5".toByteArray(), "AES")
    val wkspal = IvParameterSpec(ByteArray(16))

    val sijijsdijsdji by activityViewModel<Uqoqoisjxuhcsgy>(named("MainModel"))
    lateinit var hxhzhbchbjns: String
    val jxkxmkcisijjiscji: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var tsd: String






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.ixijijiixicuhs, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hbzxbhczbhchbshbbaysg = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sijijsdijsdji.epllpqplqpls.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                jxkxmkcisijjiscji.edit().putString("mainId", main).apply()
            }
        }


        sijijsdijsdji.xucuxhz.observe(viewLifecycleOwner) {

            if (it != null) {
                hxhzhbchbjns = it.helix_sh_giiisaudh
                aoksakoskookxjizcji = it.helix_sh_adosdkfdij
                tsd = it.helix_sh_vysatfdwt
                val jxzncn = decrypt(aiojsdji, hxhzhbchbjns, bcxvuh, wkspal)
                val woksokaodk = decrypt(aiojsdji, tsd, bcxvuh, wkspal)

                jxkxmkcisijjiscji.edit().putString("countryDev", jxzncn).apply()
                jxkxmkcisijjiscji.edit().putString("apps", aoksakoskookxjizcji).apply()
                jxkxmkcisijjiscji.edit().putString("wv", woksokaodk).apply()

                findNavController().navigate(R.id.ooddijsjihuuhzhuxc)
            }
        }

    }
}