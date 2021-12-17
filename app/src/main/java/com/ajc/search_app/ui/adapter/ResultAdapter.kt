package com.ajc.search_app.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajc.search_app.R
import com.ajc.search_app.models.remote.Address
import kotlinx.android.synthetic.main.item_layout.view.*


class ResultAdapter(
    private val context: Context,
    private val resultList: MutableList<Address>
) : RecyclerView.Adapter<ResultAdapter.ResultsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultsViewHolder {
        val inflater = LayoutInflater.from(context)

        val view1: View = inflater.inflate(R.layout.item_layout, parent, false)
        return ResultsViewHolder(view1)
    }

    override fun onBindViewHolder(holder: ResultsViewHolder, position: Int) {
        val address = resultList[position]
        holder.setData(address)
    }

    override fun getItemCount(): Int {
        return resultList.size
    }


    class ResultsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(address: Address) {
            itemView.apply {
                address12.setText(address.addressString)
                city.setText(address.city)
            }
        }
    }
}