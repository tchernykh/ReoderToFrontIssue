package com.test.reodertofrontissue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findViewById(R.id.item_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateTo(new Intent(FirstActivity.this, FirstActivity.class));
            }
        });
        findViewById(R.id.item_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateTo(new Intent(FirstActivity.this, SecondActivity.class));
            }
        });
    }

    public void navigateTo(Intent intent) {
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}
