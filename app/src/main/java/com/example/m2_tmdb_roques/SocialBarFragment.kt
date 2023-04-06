package com.example.m2_tmdb_roques

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.m2_tmdb_roques.databinding.FragmentSocialBarBinding

class SocialBarFragment : Fragment() {

    companion object {
        fun newInstance() = SocialBarFragment()
    }

    private lateinit var binding : FragmentSocialBarBinding

    private lateinit var viewModel: SocialBarViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSocialBarBinding.inflate(inflater, container, false)
        return binding.root
    //return inflater.inflate(R.layout.fragment_social_bar, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SocialBarViewModel::class.java)
        // TODO: Use the ViewModel
    }

}