package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int rum = item.getItemId();
        switch(rum) {
            case R.id.opcion1:
                Intent i = new Intent(this, Activity_opc1.class);
                startActivity(i);
                return true;
            case R.id.opcion2:
                Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.solutionscenter.com.mx"));
                startActivity(j);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}