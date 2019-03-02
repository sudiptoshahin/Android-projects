package com.example.menutest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /** adding menu **/
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layoyt, menu);

        return super.onCreateOptionsMenu(menu);
    }
}
