package com.nicholasdoglio.nycschools.di;

import com.nicholasdoglio.nycschools.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Sandeep singh
 */
@Module
public abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = FragmentsModule.class)
    abstract MainActivity contributeMainActivity();
}