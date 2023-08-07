package com.android.inputmethod.latin.settings;

import android.os.Bundle;
 import android.preference.Preference;
 
 import com.android.inputmethod.latin.BuildConfig;
 import com.android.inputmethod.latin.R;

public class AboutFragment extends SubScreenFragment {
    @Override
     public void onCreate(final Bundle icicle) {
         super.onCreate(icicle);
         addPreferencesFromResource(R.xml.prefs_screen_about);
         Preference versionPreference = findPreference("pref_key_version");
         versionPreference.setSummary(BuildConfig.VERSION_NAME);
     }
}
