package org.promise.fixaslab.UI


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import org.promise.fixaslab.R
import org.promise.fixaslab.databinding.FragmentMainBinding
import org.promise.fixaslab.Retrofit.RetrofitBuilder

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)

        val retrofit = RetrofitBuilder()

        Log.i("PRINT", retrofit.getResponse().toString())

        return binding.root
    }


}
