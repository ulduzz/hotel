package com.homework.domain.di

import com.homework.data.repository.HotelsRepositoryInterface
import com.homework.domain.mapper.HotelResponseToUIStateMapper
import com.homework.domain.usecases.SearchListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseDomain {
    @Provides
    @Singleton
    fun provideSearchListUseCase(repositoryInterface: HotelsRepositoryInterface, mapper: HotelResponseToUIStateMapper)= SearchListUseCase(repositoryInterface,mapper)
}