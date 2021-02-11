package com.missclick.gamelogic.db

import androidx.room.*

@Dao
interface ProgressDao {

    @Query("SELECT * FROM progress")
    fun getProgress() : List<ProgressEntity>

    @Query("DELETE FROM progress")
    fun removeAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun appendProgress(entity: ProgressEntity)

    @Query("SELECT * FROM progress WHERE id = :id")
    fun getProgressId(id : Int) : ProgressEntity

}