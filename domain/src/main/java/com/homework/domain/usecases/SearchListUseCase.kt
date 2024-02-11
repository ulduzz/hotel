package com.homework.domain.useCases

import com.homework.common.flowstate.Resource
import com.homework.data.repository.HotelsRepository
import com.homework.data.repository.HotelsRepositoryInterface
import com.homework.domain.mapper.HotelResponseToUIStateMapper
import com.homework.entities.uimodel.SearchHeaderUiModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SearchListUseCase @Inject constructor(
    private val repository : HotelsRepositoryInterface,
    private val mapper : HotelResponseToUIStateMapper) {
    suspend fun getList() = flow {
        emit(Resource.Loading())
        repository.getHotels()?.let {
            emit(Resource.Success( it))
        } ?: emit(Resource.Error("Empty message error"))
    }.catch { exception->
        emit(Resource.Error(exception.localizedMessage))
    }
}