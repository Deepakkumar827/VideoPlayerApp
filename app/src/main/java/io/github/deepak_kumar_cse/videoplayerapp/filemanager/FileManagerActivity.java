package io.github.deepak_kumar_cse.videoplayerapp.filemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.github.deepak_kumar_cse.videoplayerapp.R;
import io.github.deepak_kumar_cse.videoplayerapp.databinding.ActivityFileManagerBinding;

public class FileManagerActivity extends AppCompatActivity {
    ActivityFileManagerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFileManagerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}