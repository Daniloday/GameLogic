package com.missclick.gamelogic.ui.finall

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.missclick.gamelogic.App
import com.missclick.gamelogic.gameRepository.IGameRepository
import javax.inject.Inject

class FinalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is slideshow Fragment"
    }
    val text: LiveData<String> = _text
    @Inject
    lateinit var rep: IGameRepository

    init {
        App.appComponent.inject(this)
    }
}