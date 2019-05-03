package com.exampledagger2.app.di;

import com.exampledagger2.app.model.AndroidDeveloper;
import com.exampledagger2.app.model.AndroidStudio;
import com.exampledagger2.app.model.Computer;
import com.exampledagger2.app.interfaces.IDeveloper;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class AndroidDeveloperModule {
    @Binds
    abstract IDeveloper developer(AndroidDeveloper androidDeveloper);

    @Provides
    static Computer provideComputer() {
        return new Computer();
    }

    @Provides
    static AndroidStudio provideAndroidStudio() {
        return new AndroidStudio();
    }

    @Provides
    static AndroidDeveloper provideAndroidDeveloper(Computer computer, AndroidStudio androidStudio) {
        return new AndroidDeveloper(computer, androidStudio);
    }

}
