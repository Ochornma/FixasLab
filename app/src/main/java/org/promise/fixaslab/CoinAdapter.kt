package org.promise.fixaslab

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import org.promise.fixaslab.databinding.CoinItemAaBinding

import org.promise.fixaslab.models.CoinResponse

class CoinAdapter(val coinList: List<CoinResponse>): RecyclerView.Adapter<CoinAdapter.CoinViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
       val binding = CoinItemAaBinding.inflate(layoutInflater, parent, false)
        //val binding:ViewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.coin_item_aa,parent, false)

        return CoinViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return coinList.size
    }

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
      val coinResponse = coinList.get(position)
        holder.binding?.coinresponsed = coinResponse
       // holder.binding?.setVariable(BR.coinresponsed, coinResponse)
        holder.binding?.executePendingBindings()
    }

    class CoinViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding = DataBindingUtil.bind<CoinItemAaBinding>(itemView)

    }


}