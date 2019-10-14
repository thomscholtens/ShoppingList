package com.example.shoppinglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.product.view.*


class ProductAdapter(private val products: List<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        return holder.bind(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.product, parent, false)
        )
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(product: Product) {
            itemView.tvProduct.text = product.name
            itemView.tvQuantity.text = product.quantity.toString()
        }
    }

}