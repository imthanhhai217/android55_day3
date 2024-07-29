package com.devpro.android55_day3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginFragment loginFragment = LoginFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.container, loginFragment).commit();

        SignUpFragment signUpFragment = SignUpFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.container2, signUpFragment).commit();
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            getSupportFragmentManager().popBackStack();
            return;
        }
        super.onBackPressed();
    }
}