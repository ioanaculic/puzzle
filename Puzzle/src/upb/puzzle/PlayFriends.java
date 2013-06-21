package upb.puzzle;

import android.app.Activity;
import android.os.Bundle;

public class PlayFriends extends Activity {
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.play_friends);
	        Bundle b = new Bundle();
	        b= getIntent().getExtras();
	    }

}
