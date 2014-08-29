package com.sinotrans.activitycourse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class RoseActivity extends Activity {
	Intent mintent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_rose);
		Log.i("Log M","RoseActivity onCreate");
		Log.i("Log M","RoseActivity Task Id=" + getTaskId());

		
		 mintent = this.getIntent();
//		String _sundyValue;
//		if(mintent != null)
//		{
//			_sundyValue = mintent.getExtras().getString("com.sinotrans.activitycourse.MKEY");
//			
//			Toast.makeText(RoseActivity.this, mintent.getDataString(), Toast.LENGTH_LONG).show();
//			
//		}
//	
//		Button _button = (Button) findViewById(R.id.buttonRose);
//		_button.setOnClickListener(new OnClickListener(){
//			
//			
//			@Override
//			public void onClick(View arg0) {
//				mintent.putExtra("com.sinotrans.activitycourse.MKEY","jacky ÄãºÃ");
//				setResult(4321, mintent);
//				finish();
//			}
//		});
		
	}
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("Log M","RoseActivity onStart");

	}
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("Log M","RoseActivity onRestart");

	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("Log M","RoseActivity onPause");

	}
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("Log M","RoseActivity onStop");

	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("Log M","RoseActivity onDestroy");

	}
	

}
