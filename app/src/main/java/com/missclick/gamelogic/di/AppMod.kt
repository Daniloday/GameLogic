package com.missclick.gamelogic.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [GameRepositoryMode::class])
class AppMod(context: Context) {

    private var appContext : Context = context

    @Provides
    @Singleton
    fun provideContext() : Context {
        return appContext
    }

}