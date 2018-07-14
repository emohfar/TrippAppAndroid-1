package com.trippapp.android.trippappandroid;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.trippapp.android.trippappandroid.fragments.FeedFragment;
import com.trippapp.android.trippappandroid.fragments.PostFragment;
import com.trippapp.android.trippappandroid.fragments.ProfileFragment;
import com.trippapp.android.trippappandroid.fragments.SearchFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_feed:
                    FeedFragment feedFragment =new FeedFragment();
                    fragmentManager.beginTransaction().replace(R.id.main_container,feedFragment).commit();
                    return true;
                case R.id.navigation_Search:
                    SearchFragment searchFragment = new SearchFragment();
                    fragmentManager.beginTransaction().replace(R.id.main_container,searchFragment).commit();

                    return true;
                case R.id.navigation_post:
                    PostFragment postFragment = new PostFragment();
                    fragmentManager.beginTransaction().replace(R.id.main_container,postFragment).commit();

                    return true;
                case R.id.navigation_profile:
                    ProfileFragment profileFragment = new ProfileFragment();
                    fragmentManager.beginTransaction().replace(R.id.main_container,profileFragment).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
