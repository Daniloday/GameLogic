package com.missclick.gamelogic.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ProgressEntity::class], version = 7)
abstract class ProgressDB : RoomDatabase(){
    abstract fun progressDao() : ProgressDao
}