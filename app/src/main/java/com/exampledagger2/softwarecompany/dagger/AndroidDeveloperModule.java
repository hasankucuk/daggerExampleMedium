package com.exampledagger2.softwarecompany.dagger;

import com.exampledagger2.softwarecompany.AndroidDeveloper;
import com.exampledagger2.softwarecompany.AndroidStudio;
import com.exampledagger2.softwarecompany.Computer;
import com.exampledagger2.softwarecompany.IDeveloper;

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
