package com.exampledagger2.softwarecompany;

import com.exampledagger2.MyLog;

import javax.inject.Inject;

public class UiDesigner implements IDesigner {


    private Computer computer;
    private SketchApp sketchApp;

    @Inject
    public UiDesigner(Computer computer, SketchApp sketchApp) {
        this.computer = computer;
        this.sketchApp = sketchApp;
    }


    @Override
    public void designIt() {
        computer.start();
        sketchApp.start();
        MyLog.log("UiDesigner started to design.");
    }
}
