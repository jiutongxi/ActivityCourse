package com.sinotrans.activitycourse;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LifeCycleActivity extends Activity {
	private EditText mEditText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.layout_lifecycle);
		
		
		mEditText = (EditText) findViewById(R.id.editTextLC);
		if(savedInstanceState != null){
			mEditText.setText(savedInstanceState.getString("Mkey2"));
		}
		Button _button = (Button) findViewById(R.id.buttonLC);
		_button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent (LifeCycleActivity.this, RoseActivity.class);
				startActivity(_intent);
			}
			
		});
		Log.i("Log M","onCreate");
		Log.i("Log M","LifeCycleActivity Task Id=" + getTaskId());
		
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
		Log.i("Log M","onConfigurationChanged");
		//要在真机上才能是实现
		if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
			Log.i("Log M","onConfigurationChanged to Landscape");
		}else{
			Log.i("Log M","onConfigurationChanged to Portrait");
		}
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		//super.onSaveInstanceState(outState);
		outState.putString("Mkey2", "M"+ mEditText.getText().toString());
		Log.i("Log M","onSaveInstanceState");

	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
		Log.i("Log M","onRestoreInstanceState");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("Log M","onRestart");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("Log M","onStart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("Log M","onResume");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("Log M","onPause");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("Log M","onDestroy");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("Log M","onStop");
	}
	
}
