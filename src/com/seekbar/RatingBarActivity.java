package com.seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;

public class RatingBarActivity extends Activity{
private RatingBar ratingbar=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ratingbar);
		ratingbar=(RatingBar)findViewById(R.id.ratingBarID);
		ratingbar.setOnRatingBarChangeListener(new RatingBarListener());
	} 
	class RatingBarListener implements RatingBar.OnRatingBarChangeListener{

		@Override
		public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
			// TODO Auto-generated method stub
			System.out.println("rating--->"+arg1);
		}
		
	}

}
