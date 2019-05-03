package com.exampledagger2.app.di;

import com.exampledagger2.app.interfaces.IDesigner;
import com.exampledagger2.app.interfaces.IDeveloper;
import com.exampledagger2.app.model.SoftwareCompany;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class SoftwareCompanyModule {
    @Provides
   static SoftwareCompany provideSoftwareCompany(IDesigner designer, IDeveloper developer) {
        return new SoftwareCompany(designer, developer);
    }

}
