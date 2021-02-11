package com.missclick.gamelogic.gameRepository

import com.missclick.gamelogic.db.ProgressDS
import com.missclick.gamelogic.db.ProgressEntity
import com.missclick.gamelogic.moles.Progress

class GameRepository(var local : ProgressDS): IGameRepository {

    override suspend fun removeAll(){
        local.removeAll()
    }

    override suspend fun getProgressId(id : Int) : Progress {
        val c = local.getProgressId(id = id).await()
        return Progress(
            progress = c.progress
        )
    }

    override fun insertResult(pr : Progress) {
        val dr = ProgressEntity(progress = pr.progress, id  = 10)
        local.appendProgress(dr)

    }

    override suspend fun getProgress() : List<Progress> {
        val a =  local.getProgress().await()
        val b = mutableListOf<Progress>()
        for(i in a)
            b.add(
                Progress(
                    progress = i.progress
                ))
        return b
    }



}