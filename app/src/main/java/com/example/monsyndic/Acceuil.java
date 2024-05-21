package com.example.monsyndic;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.monsyndic.fragements.ContactsFragment;
import com.example.monsyndic.fragements.HomeFragment;
import com.example.monsyndic.fragements.ProfileFragment;
import com.example.monsyndic.fragements.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Acceuil extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        bottomNavigationView = findViewById(R.id.bottomNavView);
        frameLayout = findViewById(R.id.frameLayout);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();

                if (itemId == R.id.menu_home) {
                    loadFragment(new HomeFragment(), false);
                    return true;
                } else if (itemId == R.id.menu_signout) {
                    loadFragment(new HomeFragment(), false);
                    return true;
                } else if (itemId == R.id.menu_profile) {
                    loadFragment(new ProfileFragment(), false);
                    return true;
                } else if (itemId == R.id.menu_contact) {
                    loadFragment(new ContactsFragment(), false);
                    return true;
                } else {
                    return false;
                }
            }
        });

        // Load the default fragment
        loadFragment(new HomeFragment(), true);
    }

    private void loadFragment(Fragment fragment, boolean isAppInitialized) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (isAppInitialized) {
            fragmentTransaction.add(R.id.frameLayout, fragment);
        } else {
            fragmentTransaction.replace(R.id.frameLayout, fragment);
        }

        fragmentTransaction.commit();
    }
}
