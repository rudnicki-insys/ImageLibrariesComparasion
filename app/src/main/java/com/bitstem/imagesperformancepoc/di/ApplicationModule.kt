package com.bitstem.imagesperformancepoc.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.bitstem.imagesperformancepoc.service.IScreenManager
import com.bitstem.imagesperformancepoc.service.ScreenManager

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Singleton
    @Provides
    fun provideSessionManager(
        @ApplicationContext context: Context
    ) : IScreenManager {
        return ScreenManager(context)
    }
}