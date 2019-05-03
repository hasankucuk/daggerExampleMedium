package com.exampledagger2.app.model;

import com.exampledagger2.app.interfaces.IDeveloper;
import com.exampledagger2.app.util.MyLog;

import javax.inject.Inject;

public class AndroidDeveloper implements IDeveloper {

    private Computer computer;
    private AndroidStudio studio;

    @Inject
    public AndroidDeveloper(Computer computer, AndroidStudio studio) {
        this.computer = computer;
        this.studio = studio;
    }


    @Override
    public void developIt() {
        computer.start();
        studio.start();
        MyLog.log("Android Developer started to code.");
    }
}
