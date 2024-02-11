package com.homework.hotels.searchlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.homework.common.base.BaseFragment
import com.homework.common.flowstate.Status
import com.homework.hotels.R
import com.homework.hotels.databinding.FragmentSearchListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SearchListFragment: BaseFragment<FragmentSearchListBinding>(FragmentSearchListBinding::inflate) {
   val viewModel : SearchListViewModel by viewModels()


   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)
      handleState(viewModel)
      lifecycleScope.launch {
         viewModel.getHotels()
      }



      viewModel.data.observe(viewLifecycleOwner){
         adapter.setData(it?.hotels ?: listOf())
      }

   }
   private fun initRecyclerAdapter(){
      var adapter = SearchListAdapter()
      binding.recylerView.layoutManager = LinearLayoutManager(context)
      binding.recylerView.adapter = adapter
   }


}