package com.konkuk.kuitnewprojectsetting.di

import com.konkuk.kuitnewprojectsetting.data.repositoryimpl.HomeRepositoryImpl
import com.konkuk.kuitnewprojectsetting.domain.repository.HomeRepository
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
    abstract fun bindsHomeRepository(homeRepositoryImpl: HomeRepositoryImpl): HomeRepository
}