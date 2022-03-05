package com.example.fragmentapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button fragment1, fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1=findViewById(R.id.first);
        fragment2=findViewById(R.id.second);

        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //load our first fragment(HomeFragment)
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout,new HomeFragment());
                ft.commit();
            }
        });
        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout,new AboutFragment());
                ft.commit();
            }
        });
    }
}