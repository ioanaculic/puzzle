package upb.puzzle;


import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class PozaPuzzle extends Activity {
	
	ImageView pozaPuzzle;
    TextView countDown;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_poza_puzzle);
		pozaPuzzle=(ImageView)findViewById(R.id.pozaPuzzle);
        countDown=(TextView)findViewById(R.id.countDown);
        
        
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                countDown.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
            	Intent i = new Intent(PozaPuzzle.this, MainActivity.class);
            	startActivity(i);  
            }
         }.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.poza_puzzle, menu);
		return true;
	}

}
