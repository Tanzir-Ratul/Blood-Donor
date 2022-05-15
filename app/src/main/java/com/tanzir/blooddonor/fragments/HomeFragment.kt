package com.tanzir.blooddonor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tanzir.blooddonor.R
import com.tanzir.blooddonor.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
 private lateinit var binding:FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.bloodDonorBtn.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_donorInformationFragment)
        }
        binding.bloodRecipentBtn.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_donarListFragment)
        }
        return binding.root
    }


}