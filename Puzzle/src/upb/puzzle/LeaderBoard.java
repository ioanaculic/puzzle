package upb.puzzle;

import android.app.Activity;
import android.os.Bundle;

public class LeaderBoard extends Activity {
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.leaderboard);
	        Bundle b = new Bundle();
	        b= getIntent().getExtras();
	    }

}
