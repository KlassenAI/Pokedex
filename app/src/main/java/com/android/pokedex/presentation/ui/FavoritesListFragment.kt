package com.android.pokedex.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.pokedex.R
import com.android.pokedex.presentation.viewmodel.FavoritesListViewModel

class FavoritesListFragment : Fragment() {

    private lateinit var favoritesListViewModel: FavoritesListViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        favoritesListViewModel =
                ViewModelProvider(this).get(FavoritesListViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_favorites_list, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        favoritesListViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}