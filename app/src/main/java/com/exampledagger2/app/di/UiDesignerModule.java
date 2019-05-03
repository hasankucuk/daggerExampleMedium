package com.exampledagger2.app.di;

import com.exampledagger2.app.model.Computer;
import com.exampledagger2.app.interfaces.IDesigner;
import com.exampledagger2.app.model.SketchApp;
import com.exampledagger2.app.model.UiDesigner;

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
