package com.tanzir.blooddonor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.tanzir.blooddonor.adapters.DonarAdapter
import com.tanzir.blooddonor.databinding.FragmentDonarListBinding
import com.tanzir.blooddonor.viewModels.DonarViewModel


class DonarListFragment : Fragment() {

    private lateinit var binding: FragmentDonarListBinding
    private val viewModel: DonarViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDonarListBinding.inflate(inflater, container, false)
        val donarAdapter = DonarAdapter()
        binding.listRecyclerID.layoutManager = LinearLayoutManager(requireActivity())
        binding.listRecyclerID.adapter = donarAdapter
        viewModel.getAllDonar().observe(viewLifecycleOwner) {it ->
            donarAdapter.submitList(it)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}