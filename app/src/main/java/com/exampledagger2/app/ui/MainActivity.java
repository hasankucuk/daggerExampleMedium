package com.exampledagger2.app.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.exampledagger2.app.R;
import com.exampledagger2.app.model.SoftwareCompany;
import com.exampledagger2.app.di.DaggerAppComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SoftwareCompany company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAppComponent.builder()
                .build().inject(this);


        company.createApp();
    }
}
