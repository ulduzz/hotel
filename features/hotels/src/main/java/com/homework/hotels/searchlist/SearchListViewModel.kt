package com.homework.hotels.searchlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.homework.data.repository.HotelsRepositoryInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchListViewModel @Inject constructor(val repositoryInterface: HotelsRepositoryInterface) : ViewModel() {

    fun getHotels(){
        viewModelScope.launch {
            repositoryInterface.getHotels()
        }
    }
}