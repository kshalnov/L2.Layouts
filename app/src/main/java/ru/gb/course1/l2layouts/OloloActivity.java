package ru.gb.course1.l2layouts;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class OloloActivity extends AppCompatActivity {
    private static final String TAG = "@@@";

    private ImageView androidLogoImageView;
    private ImageView gbLogoImageView;

    private View.OnClickListener onImageClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick() called with: view = [" + view + "]");
            switch (view.getId()) {
                // но делать так не нужно, лучше отдельный слушатель на каждую кнопку
                case R.id.logo_gb_image_view: {
                    break;
                }
                case R.id.logo_android_image_view: {
                    break;
                }
            }
            view.setBackgroundColor(new Random().nextInt());
            Toast.makeText(OloloActivity.this, "OLOLO", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");

        androidLogoImageView = findViewById(R.id.logo_android_image_view);
        gbLogoImageView = findViewById(R.id.logo_gb_image_view);

        androidLogoImageView.setOnClickListener(onImageClickListener);
        gbLogoImageView.setOnClickListener(onImageClickListener);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop() called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called");
        super.onDestroy();
    }
}