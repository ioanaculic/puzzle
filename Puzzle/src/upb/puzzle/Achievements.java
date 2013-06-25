package upb.puzzle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Achievements extends Activity{
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.achievements);
	        Bundle b = new Bundle();
	        b = getIntent().getExtras();
	    }
	  
	  public void onBackPressed() {
			Intent m = new Intent(Achievements.this, MainActivity.class);
		    startActivity(m);
			return;
		  }

}
