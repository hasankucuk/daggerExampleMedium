package com.exampledagger2.app.di;

import com.exampledagger2.app.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SoftwareCompanyModule.class, AndroidDeveloperModule.class, UiDesignerModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
