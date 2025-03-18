package com.kobe.texteditor.Di

import android.app.Application
import com.kobe.texteditor.Data.Manager.LocalUserManagerImpl
import com.kobe.texteditor.Domain.Manager.LocalUserManager
import com.kobe.texteditor.Domain.UseCases.AppEntryUseCases
import com.kobe.texteditor.Domain.UseCases.ReadAppEntry
import com.kobe.texteditor.Domain.UseCases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager),
    )
}