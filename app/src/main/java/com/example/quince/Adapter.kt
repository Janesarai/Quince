package com.example.quince

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quince.databinding.ItemLayoutBinding

/* crear clase adapter generar,
y heredando de recicler view adapter,
generar los metodos on create get item on bind view
crear clase view Holder( heredando recicler view holder y agregar los constructores)
CREAR LISTA, para modificar altiro el get iteam count (el adpater tiene que tener una lista)
se creo el objeto(data clas para la lista)
LUEGO EDIDTA EL ONCREATE( se necesita crear la bindig class, y luego modificar el view holder)


*/

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
    val pokemones= mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    class ViewHolder(binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}