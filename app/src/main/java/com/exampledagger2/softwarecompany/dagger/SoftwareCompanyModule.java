package com.exampledagger2.softwarecompany.dagger;

import com.exampledagger2.softwarecompany.IDesigner;
import com.exampledagger2.softwarecompany.IDeveloper;
import com.exampledagger2.softwarecompany.SoftwareCompany;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class SoftwareCompanyModule {

    @Provides
   static SoftwareCompany provideSoftwareCompany(IDesigner designer, IDeveloper developer) {
        return new SoftwareCompany(designer, developer);
    }

}
