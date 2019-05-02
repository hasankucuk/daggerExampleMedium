package com.exampledagger2.softwarecompany.dagger;

import com.exampledagger2.softwarecompany.Computer;
import com.exampledagger2.softwarecompany.IDesigner;
import com.exampledagger2.softwarecompany.SketchApp;
import com.exampledagger2.softwarecompany.UiDesigner;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class UiDesignerModule {
    @Binds
    abstract IDesigner bindDesigner(UiDesigner uiDesigner);

    @Provides
    static SketchApp provideSketchApp() {
        return new SketchApp();
    }

    @Provides
    static UiDesigner provideDeveloper(Computer computer, SketchApp sketchApp) {
        return new UiDesigner(computer, sketchApp);
    }
}
