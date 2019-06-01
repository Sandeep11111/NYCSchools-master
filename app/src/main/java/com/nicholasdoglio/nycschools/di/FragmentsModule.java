package com.nicholasdoglio.nycschools.di;

import com.nicholasdoglio.nycschools.ui.detail.SchoolDetailFragment;
import com.nicholasdoglio.nycschools.ui.list.SchoolListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Sandeep singh
 */
@Module
public abstract class FragmentsModule {
    @ContributesAndroidInjector
    abstract SchoolListFragment contributeSchoolListFragment();

    @ContributesAndroidInjector
    abstract SchoolDetailFragment contributeSchoolDetailFragment();
}