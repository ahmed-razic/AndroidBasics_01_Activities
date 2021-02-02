package com.example.android.androidbasics_01_activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class ExampleActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        Intent receivedIntent = getIntent();
        TextView textView = findViewById(R.id.text_view);

        textView.setText(receivedIntent.getStringExtra(Intent.EXTRA_TEXT));

    }
}
