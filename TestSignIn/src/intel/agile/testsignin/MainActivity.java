package intel.agile.testsignin;

import com.google.example.games.basegameutils.BaseGameActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;

public class MainActivity extends BaseGameActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.sign_in_button).setOnClickListener(this);
	    findViewById(R.id.sign_out_button).setOnClickListener(this);  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onSignInFailed() {
		// TODO Auto-generated method stub
		 // Sign in has failed. So show the user the sign-in button.
	    findViewById(R.id.sign_in_button).setVisibility(View.VISIBLE);
	    findViewById(R.id.sign_out_button).setVisibility(View.GONE);
	}

	@Override
	public void onSignInSucceeded() {
		// TODO Auto-generated method stub
		// show sign-out button, hide the sign-in button
	    findViewById(R.id.sign_in_button).setVisibility(View.GONE);
	    findViewById(R.id.sign_out_button).setVisibility(View.VISIBLE);

	    // (your code here: update UI, enable functionality that depends on sign in, etc)
	}
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		if (view.getId() == R.id.sign_in_button) {
	        // start the asynchronous sign in flow
	        beginUserInitiatedSignIn();
	    }
	    else if (view.getId() == R.id.sign_out_button) {
	        // sign out.
	        signOut();

	        // show sign-in button, hide the sign-out button
	        findViewById(R.id.sign_in_button).setVisibility(View.VISIBLE);
	        findViewById(R.id.sign_out_button).setVisibility(View.GONE);
	    }
	}

}
