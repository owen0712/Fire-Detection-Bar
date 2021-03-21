package com.example.firedetectionbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Up extends AppCompatActivity implements View.OnClickListener  {
    private static final int RESULT_LOAD_IMAGE = 1;
    ImageView image_upload;
    Button UPLOAD, CAMERA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up);

        image_upload = (ImageView) findViewById(R.id.image_upload);
        CAMERA = (Button) findViewById(R.id.CAMERA);
        UPLOAD = (Button) findViewById(R.id.UPLOAD);

        image_upload.setOnClickListener(this);
        CAMERA.setOnClickListener(this);
        UPLOAD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.image_upload:

            case R.id.CAMERA:
                Intent cam=new Intent(Up.this, camera.class);
                startActivity(cam);
                break;

            case R.id.UPLOAD:
                Intent chg= new Intent(Up.this,MapsActivity.class);
                startActivity(chg);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data != null)
        {
            Uri selectedImage = data.getData();
            image_upload.setImageURI(selectedImage);
        }
    }
}
