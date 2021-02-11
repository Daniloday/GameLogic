package com.missclick.gamelogic.di

import com.missclick.gamelogic.ui.engine.one.OneViewModel
import com.missclick.gamelogic.ui.engine.three.ThreeViewModel
import com.missclick.gamelogic.ui.engine.two.TwoViewModel
import com.missclick.gamelogic.ui.finall.FinalViewModel
import com.missclick.gamelogic.ui.go.GoViewModel
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppMod::class,GameRepositoryMode::class])
@Singleton
interface AppComponent{
    fun inject(a: OneViewModel)
    fun inject(b: TwoViewModel)
    fun inject(c: ThreeViewModel)
    fun inject(d: FinalViewModel)
    fun inject(d: GoViewModel)
}