package com.missclick.gamelogic.di

import android.content.Context
import androidx.room.Room
import com.missclick.gamelogic.db.ProgressDB
import com.missclick.gamelogic.db.ProgressDS
import com.missclick.gamelogic.db.ProgressDao
import com.missclick.gamelogic.gameRepository.GameRepository
import com.missclick.gamelogic.gameRepository.IGameRepository
import dagger.Module
import dagger.Provides

@Module
class GameRepositoryMode {

    @Provides
    fun provideLocalDataSource(appContext: Context) : ProgressDS{
        val c = Room.databaseBuilder(appContext, ProgressDB::class.java, "database")
            .fallbackToDestructiveMigration()
            .build()
        return ProgressDS(db = c)
    }

    @Provides
    fun provideIGameRepository(a : ProgressDS) : IGameRepository {
        return GameRepository(a)
    }

}