package com.example.utsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.utsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener{calculate()}
    }

    private fun calculate() {
        val findSaldo = binding.tvUangku.text.toString()
        val inputSaldo = binding.etInputpengeluaran.text.toString()

        val saldo = findSaldo.toInt()
        val input = inputSaldo.toInt()

        val selectedId = binding.radioGroup.checkedRadioButtonId
        val jenis = when (selectedId) {
            R.id.primer -> {
                "Pengeluaran Primer"
            }
            else -> {
                "Pengeluaran Sekunder"
            }
        }

        var hasil = saldo + input
        binding.tvHasil.text = hasil.toString()
        binding.tvUangku.text = hasil.toString()
        binding.tvJenis.text = jenis.toString()
    }
}