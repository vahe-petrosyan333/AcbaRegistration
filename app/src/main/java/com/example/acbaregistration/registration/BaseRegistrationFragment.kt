package com.example.acbaregistration.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.acbaregistration.databinding.FragmentBaseRegistrationBinding
import com.example.acbaregistration.registration.adapter.RegisterPagerAdapter


abstract class BaseRegistrationFragment : Fragment() {

    private lateinit var viewPager: ViewPager2
    private lateinit var fragmentStateAdapter: FragmentStateAdapter

    private lateinit var binding: FragmentBaseRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaseRegistrationBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
private fun setViewPagerAdapter(){
viewPager = RegisterPagerAdapter(childFragmentManager, fragments(),lifecycle)
}
    abstract fun toolBarTitle(): String
    abstract fun toolBarResId(): Int
    abstract fun fragmentCount(): Int
    abstract fun <T> fragments(): List<T>
}