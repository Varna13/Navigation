package com.example.navigation_component

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.R
import com.example.navigation_component.HomeFragmentDirections
import com.example.navigation_component.databinding.FragmentHomeBinding

class HomeFragment:Fragment(R.layout.fragment_home) {
    private var _binding: FragmentHomeBinding? = null

    // with the backing property of the kotlin we extract
    // the non null value of the _binding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // inflate the layout and bind to the _binding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.buttonLogin.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            findNavController().navigate(action)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}