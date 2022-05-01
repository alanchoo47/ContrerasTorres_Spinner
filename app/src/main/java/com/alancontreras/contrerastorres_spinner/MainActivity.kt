package com.alancontreras.contrerastorres_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var tvResultado: TextView
    private lateinit var x1: EditText
    private lateinit var x2: EditText
    private lateinit var y1: EditText
    private lateinit var y2: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvResultado = findViewById(R.id.tvResultado)
        x1 = findViewById(R.id.x1)
        x2 = findViewById(R.id.x2)
        y1 = findViewById(R.id.y1)
        y2 = findViewById(R.id.y2)
    }

    fun click(view: View) {

        if(!x2.text.toString().isNullOrEmpty() or  !x1.text.toString().isNullOrEmpty() or !y1.text.toString().isNullOrEmpty() or !y2.text.toString().isNullOrEmpty()){

            var xUno = x1.text.toString().toDouble()
            print(xUno)
            var yUno = y1.text.toString().toDouble()
            print(yUno)
            var xDos = x2.text.toString().toDouble()
            print(xDos)
            var yDos = y2.text.toString().toDouble()
            print(yDos)
            var total = distanciaDosPts(xUno,xDos,yUno,yDos)

            tvResultado.text = "La distancia es igual a: $total"


        }else{
            //Toast.makeText( this, "Por favor ingresa un valor", Toast.LENGTH_SHORT).show()
            x1.error = "Se requiere un valor"
            x2.error = "Se requiere un valor"
            y1.error = "Se requiere un valor"
            y2.error = "Se requiere un valor"


            x1.requestFocus()
            x2.requestFocus()
            y1.requestFocus()
            y2.requestFocus()
        }
    }

    fun distanciaDosPts(x1: Double, x2: Double, y1: Double, y2: Double, ): Double {
        var equis = (x2.toDouble() - x1.toDouble()).pow(2.0)
        print (equis)
        var ye = (y2.toDouble() - y1.toDouble()).pow(2.0)
        print(ye)
        var total = kotlin.math.sqrt((equis + ye))
        print(total)
        return total
    }
}
