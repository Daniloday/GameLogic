package com.missclick.gamelogic.db

import android.util.Log
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class ProgressDS(val db : ProgressDB) {


    fun removeAll(){
        GlobalScope.async {
            db.progressDao().removeAll()
        }
    }

    fun appendProgress(entity: ProgressEntity){
        GlobalScope.async {
            db.progressDao().appendProgress(entity = entity)
        }
    }

    fun getProgress() : Deferred<List<ProgressEntity>> {
        return GlobalScope.async {
            db.progressDao().getProgress()
        }
    }

    fun getProgressId(id: Int) : Deferred<ProgressEntity> {
        return GlobalScope.async {
            db.progressDao().getProgressId(id = id)
        }
    }

}