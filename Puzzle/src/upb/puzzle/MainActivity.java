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
    View fereastra;
    
    public static int razaButon = 150; 
    public final static int razaCentru = 175;
    
    float dx=0, dy=0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        butonRandomPlay= (ImageView) findViewById(R.id.randomPlay);
    	butonPlayFriends= (ImageView) findViewById(R.id.playFriends);
        butonLeaderBoard= (ImageView) findViewById(R.id.leaderboard);
        butonAchievements=(ImageView) findViewById(R.id.achievements);
        shuffleThis = (ImageView)findViewById(R.id.shuffleThis);
        fereastra = findViewById(R.id.fereastra);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        Bundle b = new Bundle();
        b= getIntent().getExtras();
        return true;
    }
    
    public boolean onTouchEvent(android.view.MotionEvent event) {
    	// TODO Auto-generated method stub
    	
    	
    	
    	razaButon = butonPlayFriends.getWidth();
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
    	
    	
    	
    	//coord centru
    	float cx = shuffleThis.getX()+shuffleThis.getWidth()/2;
    	float cy = 	shuffleThis.getY()+shuffleThis.getHeight()/2;
    	
    	//coord eventului
    	float x = event.getX();
    	float y = event.getY();
    	
    	System.out.println(b1x+" "+b1y+" "+x+" "+y);
    	
    	if (event.getAction() == MotionEvent.ACTION_MOVE){
	    	//pentru cazul butonului 1
	    	//verific ca actiunea sa se intample in jurul butonului
	    	if (((b1x)<=x)&&((b1x+razaButon)>=x) && ((b1y)<=y)&&((b1y+razaButon)>=y)){
	    			//il plimb dupa deget
	    			dx = b1x-x;
	    			dy = b1y-y;
		    		butonPlayFriends.setX(x-razaButon/2);
		    		butonPlayFriends.setY(y-razaButon/2);
		    		//System.out.println(x+","+y);
		    		
		    		//verific daca ma apropii de centru in raza mica
		    		//daca da, sare in centru
		    			if (((cx-razaCentru)<=x)&&((cx+razaCentru)>=x)){
		    				if (((cy-razaCentru)<=y)&&((cy+razaCentru)>=y)){
						    	System.out.println("am ajuns 1!");
						    	butonPlayFriends.setX(cx-razaButon/2);
						    	butonPlayFriends.setY(cy-butonPlayFriends.getHeight()/2);
		    				}
		    			}
	    	}
    	}
//    	else
//    	
//    	//pentru cazul butonului 2
//	    	if (((b2x-razaButon)<=x)&&((b2x+razaButon)>=x)){
//	    		if (((b2y-razaButon)<=y)&&((b2y+razaButon)>=y)){
//	    			
//	    			butonRandomPlay.setX(x);
//	    			butonRandomPlay.setY(y);
//	    			//System.out.println(x+","+y);
//	    			if (((cx-razaCentru)<=x)&&((cx+razaCentru)>=x)){
//	    				if (((cy-razaCentru)<=y)&&((cy+razaCentru)>=y)){
//	    					//System.out.println("am ajuns 2!");
//					    	butonRandomPlay.setX(cx);
//					    	butonRandomPlay.setY(cy);
//	    				}
//	    			}	
//	    		}
//	    	}
//	    	else
//	    //pentru cazul butonului 3
//	    	if (((b3x-razaButon)<=x)&&((b3x+razaButon)>=x)){
//	    		if (((b3y-razaButon)<=y)&&((b3y+razaButon)>=y)){	
//	    			butonLeaderBoard.setX(x);
//	    			butonLeaderBoard.setY(y);
//	    			//System.out.println(x+","+y);
//	    			if (((cx-razaCentru)<=x)&&((cx+razaCentru)>=x)){
//	    				if (((cy-razaCentru)<=y)&&((cy+razaCentru)>=y)){
//	    					//System.out.println("am ajuns 3!");
//	    					butonLeaderBoard.setX(cx);
//	    					butonLeaderBoard.setY(cy);
//	    				}
//	    			}
//	    		}
//	    	}
//	    	else
//	    //pentru cazul butonului 4
//	    	if (((b4x-razaButon)<=x)&&((b4x+razaButon)>=x)) {
//	    		if (((b4y-razaButon)<=y)&&((b4y+razaButon)>=y)){
//			    	butonAchievements.setX(x);
//			    	butonAchievements.setY(y);
//			    	//System.out.println(x+","+y);
//			    	if (((cx-razaCentru)<=x)&&((cx+razaCentru)>=x)){
//			    		if (((cy-razaCentru)<=y)&&((cy+razaCentru)>=y)){
//					    	//System.out.println("am ajuns 4!");
//					    	butonAchievements.setX(cx);
//					    	butonAchievements.setY(cy);
//			    		}
//			    	}
//	    		}
//	    	}
    	
	    return false;
    	}
    
    public void randomPlay(View v){
    	Intent i = new Intent(MainActivity.this, RandomPlay.class);
    	startActivity(i);    	
    }
    
    public void playFriends (View v){	
    	//Intent i2 = new Intent(this, PlayFriends.class);
    	//startActivity(i2);	
    }
    
    public void leaderB (View v){ 	
    	//Intent i3 = new Intent(this, LeaderBoard.class);
    	//startActivity(i3);
    }
    
    public void achievements (View v){	
    	//Intent i4 = new Intent(this, Achievements.class);
    	//startActivity(i4);
    }
    
    
    
}
