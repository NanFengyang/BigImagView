package com.example.bigimagview;

import com.example.bigimagview.view.ImgActivity;
import com.example.bigimagview.view.ImgClick;
import com.example.bigimagview.view.PhotoBrowse;
import com.example.bigimagview.view.ViewPagerActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    public void img(View view) {
        startActivity(new Intent(this, ImgActivity.class));
    }

    public void viewpager(View view) {
        startActivity(new Intent(this, ViewPagerActivity.class));
    }

    public void imgclick(View view) {
        startActivity(new Intent(this, ImgClick.class));
    }

    public void photobrowse(View view) {
        startActivity(new Intent(this, PhotoBrowse.class));
    }
}
