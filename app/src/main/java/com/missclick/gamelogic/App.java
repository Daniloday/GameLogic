package com.missclick.gamelogic;

import android.app.Application;

import com.missclick.gamelogic.di.AppComponent;
import com.missclick.gamelogic.di.AppMod;
import com.missclick.gamelogic.di.DaggerAppComponent;

public class App extends Application {

    public static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = initializeDagger();
    }

    private AppComponent initializeDagger(){
        return DaggerAppComponent.builder()
                .appMod(new AppMod(this))
                .build();
    }

}
