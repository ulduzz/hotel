package com.homework.data.di

import com.homework.data.repository.HotelsRepository
import com.homework.data.repository.HotelsRepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

     @Binds
     @Singleton
     abstract fun providerSearchRepository(repository: HotelsRepository) : HotelsRepositoryInterface
}