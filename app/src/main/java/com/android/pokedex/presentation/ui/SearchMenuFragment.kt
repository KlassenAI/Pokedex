package com.android.pokedex.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.android.pokedex.R
import com.android.pokedex.databinding.FragmentSearchMenuBinding

class SearchMenuFragment : Fragment() {

    private lateinit var binding: FragmentSearchMenuBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchMenuBinding.inflate(inflater, container, false);
        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        initSearchPokemonBtn()
        initRandomPokemonBtn()
    }

    private fun initSearchPokemonBtn() {
        binding.searchMenuSearchPokemonBtn.setOnClickListener {
            navController.navigate(R.id.action_nav_search_menu_to_nav_search_pokemon)
        }
    }

    private fun initRandomPokemonBtn() {
        binding.searchMenuRandomPokemonBtn.setOnClickListener {
            navController.navigate(R.id.action_nav_search_menu_to_nav_search_pokemon)
        }
    }
}