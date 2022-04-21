package com.android.example.cameraxbasic

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.example.cameraxbasic.databinding.ActivitySettingsBinding
import com.android.example.cameraxbasic.fragments.CameraFragment


class SettingsActivity : AppCompatActivity() {

    private lateinit var activitySettingsBinding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySettingsBinding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(activitySettingsBinding.root)
        setContentView(activitySettingsBinding.root)

        activitySettingsBinding.buttonGuardar.setOnClickListener() {

            if (activitySettingsBinding.inputFotos.getText().toString().isEmpty() or activitySettingsBinding.inputTiempo.getText().toString().isEmpty()) {
                val toast = Toast.makeText(this, "Introduce los datos requeridos", Toast.LENGTH_LONG)
                toast.show()
            } else {
                var cantidadFotos = activitySettingsBinding.inputFotos.getText().toString().toInt()
                var tiempoFotos = activitySettingsBinding.inputTiempo.getText().toString().toInt()

                val intent = Intent(this,MainActivity::class.java)
                intent.putExtra("cantidadFotos", cantidadFotos)
                intent.putExtra("tiempoFotos", tiempoFotos)
                Log.d("CANTIDADFOTOS_Settings", cantidadFotos.toString())
                startActivity(intent)
            }
        }
    }
}