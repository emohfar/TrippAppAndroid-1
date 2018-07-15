package com.trippapp.android.trippappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class CompleteProfile extends AppCompatActivity {

    ImageView picProfile;
    TextView username;

    private void initView() {
        picProfile = findViewById(R.id.iv_img_complete_profile);
        username = findViewById(R.id.tv_username_complete_profile);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        initView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem item = menu.add("Confirm");
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent(CompleteProfile.this,MainActivity.class));
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
