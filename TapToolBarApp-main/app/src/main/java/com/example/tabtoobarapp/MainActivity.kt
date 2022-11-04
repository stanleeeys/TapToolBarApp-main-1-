package com.example.tabtoobarapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var vpVistaPager: ViewPager2
    private lateinit var vlVistaTabla: TabLayout
    private val adaptador by lazy {
        vpAdaptador(this)

    }
    //private val adaptador2 = vpAdaptador(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        vpVistaPager = findViewById(R.id.vp_VistaPager)
        vlVistaTabla = findViewById(R.id.tl_VistaTablero)

        vpVistaPager.adapter = adaptador


        val medidorTabla = TabLayoutMediator(vlVistaTabla, vpVistaPager,
            TabLayoutMediator.TabConfigurationStrategy {
                tab, position ->
            when (position) {
                0 -> {
                    tab.text = "opcion 1"
                }
                1 -> {
                    tab.text = "opcion 2"
                }
                2 -> {
                    tab.text = "opcion 2"
                }
            }
        })
        medidorTabla.attach()

    }
}