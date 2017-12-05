package com.example.pankaj.mypreferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * Created by Pankaj on 05-12-2017.
 */

public class AppPreferenceActivity extends PreferenceActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBuildHeaders(List<Header> target) {
        super.onBuildHeaders(target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {
        return true;
    }
    public static class PrefFragment extends PreferenceFragment{

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            PreferenceManager.setDefaultValues(getActivity(), R.xml.myapppreferences,false);
  //Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.myapppreferences);
        }
    }
}
