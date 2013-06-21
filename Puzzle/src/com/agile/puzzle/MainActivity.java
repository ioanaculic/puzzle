package com.agile.puzzle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        Bundle b = new Bundle();
        b= getIntent().getExtras();
        return true;
    }
    
    public void randomPlay(View v){
    	Button butonRandomPlay= (Button) findViewById(R.id.randomPlay);
    	Intent i = new Intent(MainActivity.this, RandomPlay.class);
    	startActivity(i);    	
    }
    
    public void playFriends (View v){
    	Button butonPlayFriends= (Button) findViewById(R.id.playFriends);
    	Intent i2 = new Intent(this, PlayFriends.class);
    	startActivity(i2);	
    }
    
    public void leaderB (View v){
    	Button butonLeaderBoard= (Button) findViewById(R.id.leaderboard);
    	Intent i3 = new Intent(this, LeaderBoard.class);
    	startActivity(i3);
    }
    
    public void achievements (View v){
    	Button butonAchievements=(Button) findViewById(R.id.achievements);
    	Intent i4 = new Intent(this, Achievements.class);
    	startActivity(i4);
    }
    
   
    
    
}
