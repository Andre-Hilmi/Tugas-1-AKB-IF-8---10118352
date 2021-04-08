// 06-04-2021 - 10118352 - Andre Hilmi Pratama - IF8
package com.example.a10118352_myproperty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    private CardView cardback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        cardback = findViewById(R.id.cardback);
        cardback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

    }
}