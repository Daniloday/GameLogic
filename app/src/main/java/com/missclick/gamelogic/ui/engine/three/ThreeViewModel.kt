package com.missclick.gamelogic.ui.engine.three

import androidx.lifecycle.ViewModel
import com.missclick.gamelogic.App
import com.missclick.gamelogic.gameRepository.IGameRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ThreeViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    @Inject
    lateinit var rep: IGameRepository

    init {
        App.appComponent.inject(this)
    }
    fun saveFOP(){
        GlobalScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main){
                rep.getProgressId(1)
            }
        }
        GlobalScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main){
                rep.getProgress()
            }
        }
        GlobalScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main){
                rep.removeAll()
            }
        }
    }


}