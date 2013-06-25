package upb.puzzle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	ImageView butonRandomPlay;
	ImageView butonPlayFriends;
    ImageView butonLeaderBoard;
    ImageView butonAchievements;
    ImageView shuffleThis;
    ImageView stanga_sus,stanga_jos,dreapta_sus,dreapta_jos;
    View fereastra;
    
    public static int razaButon; 
    public static int razaCentru;
    
    public void reset(){
    	setContentView(R.layout.activity_main);
        
        butonRandomPlay= (ImageView) findViewById(R.id.randomPlay);
    	butonPlayFriends= (ImageView) findViewById(R.id.playFriends);
        butonLeaderBoard= (ImageView) findViewById(R.id.leaderboard);
        butonAchievements=(ImageView) findViewById(R.id.achievements);
        shuffleThis = (ImageView)findViewById(R.id.shuffleThis);
        fereastra = findViewById(R.id.fereastra);
<<<<<<< HEAD
        stanga_sus=(ImageView)findViewById(R.id.stanga_sus);
        stanga_jos=(ImageView)findViewById(R.id.stanga_jos);
        dreapta_sus=(ImageView)findViewById(R.id.dreapta_sus);
        dreapta_jos=(ImageView)findViewById(R.id.dreapta_jos);
        
        new Thread(new Runnable() {

        	@Override
        	public void run() {
        	// TODO Auto-generated method stub
        	try {
        	Thread.sleep(5000);
        	} catch (InterruptedException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        	}

        
        	runOnUiThread(new Runnable() {

        	@Override
        	public void run() {
        	// TODO Auto-generated method stub
        	stanga_sus.setVisibility(View.VISIBLE);
        	stanga_jos.setVisibility(View.VISIBLE);
        	dreapta_sus.setVisibility(View.VISIBLE);
        	dreapta_jos.setVisibility(View.VISIBLE);
        	};
        	
        	});
        	}
        	}).start();
=======
        
        Bundle b = new Bundle();
        b= getIntent().getExtras();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);        
        reset();
>>>>>>> 9f54b0bbc1c21e21ba4364fb49897314952e7164
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        Bundle b = new Bundle();
        b= getIntent().getExtras();
        return true;
    }
    
	public void dragButon(float bx, float by, float cx, float cy, float x, float y, ImageView b){
		if (((bx)<=x)&&((bx+razaButon)>=x) && ((by)<=y)&&((by+razaButon)>=y)){
			
			//il plimb dupa deget
    		b.setX(x-razaButon/2);
    		b.setY(y-razaButon/2);
    		
    		//verific daca ma apropii de centru in raza mica
    		if (((cx-shuffleThis.getWidth()/2)<=x)&&((cx+shuffleThis.getWidth()/2)>=x) && ((cy-shuffleThis.getWidth()/2)<=y)&&((cy+shuffleThis.getWidth()/2)>=y)){
				    //System.out.println("am ajuns 1!");
				   	b.setX(cx-razaButon/2);
				   	b.setY(cy-b.getHeight()/2);
				   	
				   	shuffleThis.setVisibility(View.INVISIBLE);
				   	
				   	if (b == butonRandomPlay) {
				   		randomPlay(fereastra);
				   		System.out.println("randomPlay");
				   		}
				   	else if (b == butonPlayFriends){
				   		playFriends(fereastra);
				   		System.out.println("plFr");
				   	}
				   	else if (b == butonLeaderBoard){
				   		leaderB(fereastra);
				   		System.out.println("leaderB");
				   	}
				   	else if (b == butonAchievements){
				   		achievements(fereastra);
				   		System.out.println("ACHIEV");
				   	}
				   	
				   	//randomPlay(fereastra);
    		}
	}
		
	}
    public boolean onTouchEvent(android.view.MotionEvent event) {
    	// TODO Auto-generated method stub
    	razaButon = butonPlayFriends.getWidth();
    	razaCentru= shuffleThis.getWidth();
    	System.out.println(razaButon);
    	
    	//iau coord x pentru fiecare buton
    	float b2x = butonRandomPlay.getX();
    	float b1x = butonPlayFriends.getX();
    	float b3x = butonLeaderBoard.getX();
    	float b4x = butonAchievements.getX();
    	
    	//iau coord y pentru fiecare buton
    	float b1y = butonPlayFriends.getY();
    	float b2y = butonRandomPlay.getY();
    	float b3y = butonLeaderBoard.getY();
    	float b4y = butonAchievements.getY();
    	
    	//coord centrului pt butonul din centru
    	float cx = shuffleThis.getX()+shuffleThis.getWidth()/2;
    	float cy = 	shuffleThis.getY()+shuffleThis.getHeight()/2;
    	
    	//coord eventului
    	float x = event.getX();
    	float y = event.getY();
    	
    	if (event.getAction() == MotionEvent.ACTION_MOVE){
    		dragButon(b2x, b2y, cx, cy, x, y, butonRandomPlay);	    	
	    	dragButon(b1x, b1y, cx, cy, x, y, butonPlayFriends);   	
	    	dragButon(b3x, b3y, cx, cy, x, y, butonLeaderBoard);
	    	dragButon(b4x, b4y, cx, cy, x, y, butonAchievements);	    	
    	}

	    return false;
    	}
    
    public void randomPlay(View v){
    	Intent i = new Intent(MainActivity.this, RandomPlay.class);
    	startActivity(i);    	
    }
    
    public void playFriends (View v){	
    	Intent i2 = new Intent(this, PlayFriends.class);
    	startActivity(i2);		
    }
    
    public void leaderB (View v){ 	
    	Intent i3 = new Intent(this, LeaderBoard.class);
    	startActivity(i3);
    }
    
    public void achievements (View v){	
    	Intent i4 = new Intent(this, Achievements.class);
    	startActivity(i4);
    }
    
    
    
}
