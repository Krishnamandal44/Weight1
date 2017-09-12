package com.example.weight;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final LinearLayout ln1=(LinearLayout)findViewById(R.id.ln);
		final Button bt1=(Button)findViewById(R.id.bt);
		final ImageView iv11=(ImageView)findViewById(R.id.iv1);
		final ImageView iv21=(ImageView)findViewById(R.id.iv2);
		final ImageView iv31=(ImageView)findViewById(R.id.iv3);
		final ImageView iv41=(ImageView)findViewById(R.id.iv4);
		final ImageView iv51=(ImageView)findViewById(R.id.iv5);
		final ImageView iv61=(ImageView)findViewById(R.id.iv6);

		bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ln1.setVisibility(View.VISIBLE);
				//bt1.setVisibility(View.GONE);
				//bt1.setVisibility(View.VISIBLE);
				Toast.makeText(MainActivity.this, "hi", 2000).show();
				// TODO Auto-generated method stub
				
			}
		});
		iv11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "welcome to facebook",2000).show();
				Intent browse=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com"));
				startActivity(browse);
				// TODO Auto-generated method stub
				
			}
		});
		iv21.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "welcome to google",2000).show();
				Intent browse=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
				startActivity(browse);
				// TODO Auto-generated method stub
				
			}
		});
		iv31.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "welcome to flipkart",2000).show();
				Intent browse=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.flipkart.com"));
				startActivity(browse);
				// TODO Auto-generated method stub
				
			}
		});
		iv41.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "welcome to snapdeal",2000).show();
				Intent browse=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.snapdeal.com"));
				startActivity(browse);
				// TODO Auto-generated method stub
				
			}
		});
		iv51.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "welcome to amazon",2000).show();
				Intent browse=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.amazon.in"));
				startActivity(browse);
				// TODO Auto-generated method stub
				
			}
		});
		iv61.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "welcome to gmail",2000).show();
				Intent browse=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.gmail.com"));
				startActivity(browse);
				// TODO Auto-generated method stub
				
			}
		});
	}
}
