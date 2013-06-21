package upb.puzzle;

import android.app.Activity;
import android.os.Bundle;

public class Achievements extends Activity{
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.achievements);
	        Bundle b = new Bundle();
	        b = getIntent().getExtras();
	    }

}
