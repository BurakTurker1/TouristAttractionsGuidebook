package com.burakturker.touristattractionsguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.burakturker.touristattractionsguidebook.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inflating our xml layout in our activity main binding
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        // getting our root layout in our view.
        View view = activityMainBinding.getRoot();

        // below line is to set
        // Content view for our layout.
        setContentView(view);

    }
}