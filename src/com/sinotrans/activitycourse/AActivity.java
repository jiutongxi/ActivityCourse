package com.sinotrans.activitycourse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AActivity extends Activity {
	private static int mIndex =1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_task);
		Log.i("M","A" + mIndex + "TaskId=" + getTaskId());
		++mIndex;
		Button _buttonA = (Button) findViewById(R.id.buttonA);
		_buttonA.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent(AActivity.this,AActivity.class);
				startActivity(_intent);
			}
			
		});
		
		Button _buttonB= (Button) findViewById(R.id.buttonB);
		_buttonB.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent(AActivity.this,BActivity.class);
				startActivity(_intent);
				
				
			}
			
		});
	}
	
}
