package com.example.week5codechallenges.traveljournal;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.week5codechallenges.R;

public class ManageTrip extends AppCompatActivity {

    public static final int GALLERY_REQUEST_CODE = 1;
    public static final int CAMERA_REQUEST_CODE = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_trip);
    }

    public void selectPhotoFromGallery(View view) {
        Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        startActivityForResult(galleryIntent, GALLERY_REQUEST_CODE);
    }

    public void takePicture(View view) {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        if (ContextCompat.checkSelfPermission(ManageTrip.this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(ManageTrip.this, new String[] {Manifest.permission.CAMERA}, CAMERA_REQUEST_CODE);
        }
        startActivityForResult(intent, CAMERA_REQUEST_CODE);
    }
}
