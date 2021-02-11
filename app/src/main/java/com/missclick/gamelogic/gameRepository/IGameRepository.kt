package com.missclick.gamelogic.gameRepository

import com.missclick.gamelogic.moles.Progress

interface IGameRepository {

    suspend fun getProgressId(id : Int) : Progress
    suspend fun removeAll()
    suspend fun getProgress() : List<Progress>
    fun insertResult(result : Progress)

}