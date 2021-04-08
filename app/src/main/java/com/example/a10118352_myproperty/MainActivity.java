// 06-04-2021 - 10118352 - Andre Hilmi Pratama - IF8
package com.example.a10118352_myproperty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cardProfile,cardLogout,cardDeveloper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardProfile = findViewById(R.id.cardProfile);
        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profile);
            }
        });

        cardLogout = findViewById(R.id.cardlogout);
        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logout = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(logout);
            }
        });

        cardDeveloper = findViewById(R.id.carddeveloper);
        cardDeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent developer = new Intent(MainActivity.this, DeveloperActivity.class);
                startActivity(developer);
            }
        });
    }
}