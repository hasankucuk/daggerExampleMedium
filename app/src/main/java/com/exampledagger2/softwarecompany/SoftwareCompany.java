package com.exampledagger2.softwarecompany;


import com.exampledagger2.softwarecompany.dagger.PerActivity;

import javax.inject.Inject;

public class SoftwareCompany {

    private IDesigner designer;
    private IDeveloper developer;

    @Inject
    public SoftwareCompany(IDesigner designer, IDeveloper developer) {
        this.designer = designer;
        this.developer = developer;
    }

    public void createApp() {
        designer.designIt();
        developer.developIt();
    }
}
