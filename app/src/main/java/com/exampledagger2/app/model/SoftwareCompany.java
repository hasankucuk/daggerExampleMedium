package com.exampledagger2.app.model;


import com.exampledagger2.app.interfaces.IDesigner;
import com.exampledagger2.app.interfaces.IDeveloper;

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
