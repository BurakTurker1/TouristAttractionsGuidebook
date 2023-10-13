package com.burakturker.touristattractionsguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import com.burakturker.touristattractionsguidebook.databinding.ActivityDetailsBinding;


public class DetailsActivity extends AppCompatActivity {
     ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());

        // getting our root layout in our view.
        View view = binding.getRoot();
        // below line is to set
        // Content view for our layout.
        setContentView(view);

    }
}