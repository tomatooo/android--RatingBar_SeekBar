package com.seekbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class SeekBarActivity extends Activity {
	private SeekBar seekbar = null;
	private Button ratingbutton = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seek_bar);
		seekbar = (SeekBar) findViewById(R.id.seekbar);
		ratingbutton = (Button) findViewById(R.id.ratingbutton);
		seekbar.setMax(100);
		seekbar.setOnSeekBarChangeListener(new SeekBarListener());
		ratingbutton.setOnClickListener(new RatingButtonListener());
	}

	class SeekBarListener implements SeekBar.OnSeekBarChangeListener {
		// 进度条发生变化时调用该方法
		@Override
		public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
			// TODO Auto-generated method stub
			System.out.println(arg1);
		}

		@Override
		public void onStartTrackingTouch(SeekBar arg0) {
			// TODO Auto-generated method stub
			System.out.println("start--->" + arg0.getProgress());
		}

		// 进度条滑动时调用该方法
		@Override
		public void onStopTrackingTouch(SeekBar arg0) {
			// TODO Auto-generated method stub
			System.out.println("end--->" + arg0.getProgress());
		}
	}

	class RatingButtonListener implements View.OnClickListener {
		// 用户结束时调用该方法
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(SeekBarActivity.this, RatingBarActivity.class);
			startActivity(intent);
		}

	}

}
