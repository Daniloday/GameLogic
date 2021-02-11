package com.missclick.gamelogic.ui.engine.two

import androidx.lifecycle.ViewModel
import com.missclick.gamelogic.App
import com.missclick.gamelogic.gameRepository.IGameRepository
import javax.inject.Inject

class TwoViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    @Inject
    lateinit var rep: IGameRepository

    init {
        App.appComponent.inject(this)
    }
}