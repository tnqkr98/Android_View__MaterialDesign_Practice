package com.example.bottomnavigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomNavigationDrawerFragment botNavDrawerFragment = new BottomNavigationDrawerFragment();
                botNavDrawerFragment.show(getSupportFragmentManager(),botNavDrawerFragment.getTag());
            }
        });
    }
}