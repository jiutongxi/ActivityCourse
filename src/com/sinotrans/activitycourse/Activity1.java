package com.sinotrans.activitycourse;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Activity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_activity1);
		//修改组件属性
		Button _button = (Button) this.findViewById(R.id.button1);
		_button.setText("Text changed!");
		//动态添加组件
		Button _newButton = new Button(this);
		_newButton.setText("new Button");
		
		_newButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent2 = new Intent();
				_intent2.setAction(Intent.ACTION_CALL);
				_intent2.setData(Uri.parse("tel:113416470194"));
				startActivity(_intent2);
			}
			
		});
		
		
		LinearLayout _ll = (LinearLayout) findViewById(R.id.linearlayout1);
		_ll.addView(_newButton,LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		
		_button.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View arg0){
				//TOTDO Auto-generated method stub
				Log.i("MLog", "Button1 clicked");
				//Toast.makeText(Activity1.this, "Button Clicked",3000).show();
				Intent _intent = new Intent();
				//查找有这个action的Activity，条件筛选
				_intent.setAction("com.sinotrans.activitycourse.WATCH_MOVIE");
				_intent.setData(Uri.parse("000://www.mobidever.com"));
				_intent.putExtra("com.sinotrans.activitycourse.MKEY","你好" );
				//startActivity(_intent);
				
				startActivityForResult(_intent, 1234);
				
			}
			
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(resultCode == 4321)
		{
			String _resultValue = data.getExtras().getString("com.sinotrans.activitycourse.MKEY");
			Toast.makeText(this, _resultValue, Toast.LENGTH_LONG).show();
		}
				
				
				
	}
	
	

}
