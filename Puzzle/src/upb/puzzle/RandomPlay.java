package upb.puzzle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RandomPlay extends Activity{
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.random_play);
	        Bundle b = new Bundle();
	        b= getIntent().getExtras();
	    }
	  
	  public void onBackPressed() {
		Intent m = new Intent(RandomPlay.this, MainActivity.class);
	    startActivity(m);
		return;
	  }

}
