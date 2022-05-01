package com.alancontreras.contrerastorres_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow


class Trigonometria : AppCompatActivity() {
    private lateinit var tvResultado: TextView
    private lateinit var cat_Op: EditText
    private lateinit var cat_Ady: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trigonometria)
        tvResultado = findViewById(R.id.tvResultado)
        cat_Op = findViewById(R.id.cat_Op)
        cat_Ady = findViewById(R.id.cat_Ady)
    }
    fun click(view: View) {

        if(!cat_Ady.text.toString().isNullOrEmpty() or !cat_Op.text.toString().isNullOrEmpty()){

            var catetoAdyacente = cat_Ady.text.toString().toDouble()
            var catetoOpuesto = cat_Op.text.toString().toDouble()

            var total = anguloTheta(catetoAdyacente, catetoOpuesto)
            tvResultado.text = "La distancia es igual a: $total"


        }else{
            //Toast.makeText( this, "Por favor ingresa un valor", Toast.LENGTH_SHORT).show()
            cat_Ady.error = "Se requiere un valor"
            cat_Op.error = "Se requiere un valor"

            cat_Ady.requestFocus()
            cat_Op.requestFocus()
        }
    }

    fun anguloTheta(catetoAdyacente: Double, catetoOpuesto: Double ): Double {
        return  kotlin.math.sqrt(((catetoAdyacente.toDouble()).pow(2.0) + (catetoOpuesto.toDouble()).pow(2.0)))
    }
}