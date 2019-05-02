package com.exampledagger2.softwarecompany;

import com.exampledagger2.MyLog;
import com.exampledagger2.softwarecompany.AndroidStudio;
import com.exampledagger2.softwarecompany.Computer;
import com.exampledagger2.softwarecompany.IDeveloper;

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
