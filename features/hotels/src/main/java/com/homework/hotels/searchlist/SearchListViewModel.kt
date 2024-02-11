package com.homework.hotels.searchlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.homework.common.base.BaseViewModel
import com.homework.common.flowstate.Resource
import com.homework.common.flowstate.State
import com.homework.domain.mapper.HotelResponseToUIStateMapper
import com.homework.domain.useCases.SearchListUseCase
import com.homework.entities.uimodel.HotelSearchUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject


@HiltViewModel
class SearchListViewModel @Inject constructor(
    val searchListUseCase: SearchListUseCase,
    private val mapper: HotelResponseToUIStateMapper) :BaseViewModel() {

        val data = MutableLiveData<HotelSearchUIState?>()


    suspend fun getHotels(){
        SearchListUseCase.getList().collectLatest{
            when(it){
                is Resource.Error -> state.emit(State.error(it.message))
                is Resource.Loading -> state.emit(State.loading())
                is Resource.Success -> {
                    state.emit(State.success())
                    it.data?.result?.let {
                        val mappedData = mapper.map(it)
                        data.postValue(mappedData)
                    }
                }
            }
        }
    }


}

