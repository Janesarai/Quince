package com.example.quince

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/* pasos para hacer recyvle view
*
* {x} Crear el item Layaout
*   {X}definir ids
*   {X}agregan constrains
*   {X}cambir altura (HIGTH)de contrain layout(QUE ESTA ARRIBA DEL CARDVIWE) del item layout a wrap content
* {X} crear layaut con recicle view
* { } Asignar el layout manager
* { } Crear el Adapter + el viwHolder
* { } Crear un list (u obtener datos/ tenerlos disponibles)
*
*
*
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}