package com.agile.puzzle;

import android.app.Activity;
import android.os.Bundle;

public class RandomPlay extends Activity{
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.random_play);
	        Bundle b = new Bundle();
	        b= getIntent().getExtras();
	    }

}
