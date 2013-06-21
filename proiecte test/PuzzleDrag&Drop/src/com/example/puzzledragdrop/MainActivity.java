package com.example.puzzledragdrop;

import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Event;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Color;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	ImageView button;
	ImageView button2;
	View fereastra;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        fereastra = findViewById(R.id.fereastra);
        button = (ImageView)findViewById(R.id.imageView1);
        button2 = (ImageView)findViewById(R.id.imageView2);
       
    }
    
    float b1x = button.getX();
    float b2x = button2.getX();
    float b1y = button.getY();
    float b2y = button2.getY();

    @Override
	public boolean onTouchEvent(android.view.MotionEvent event) {
		// TODO Auto-generated method stub
    	
    	if(event.getAction() == MotionEvent.ACTION_DOWN)
    	{
    		float i = button.getX();
    		float j = button.getY();
    		
    	if (((b1x-10)<=i)&&((b1x+10)>=i))
    	{
    			if (((b1y-10)<=j)&&((b1y+10)>=j))
    			{
 
    					if (event.getAction() == MotionEvent.ACTION_MOVE)
    						{
    							button.setX(event.getX());
    							button.setY(event.getY());
    							System.out.println(event.getX()+","+event.getY());
    				
    			}
    			
    		}
    	}
    	
    	if (((b2x-10)<=i)&&((b2x+10)>=i))
    	{	
    		if (((b2y-10)<=j)&&((b2y+10)>=j))
    			
    		{
    			if (event.getAction() == MotionEvent.ACTION_MOVE)
    			{
    				button2.setX(event.getX());
    				button2.setY(event.getY());
    				System.out.println(event.getX()+","+event.getY());
    				
    			}
    			
    		}
    		}
    	}
    	
    	return false;
    		
    	}
    		
		
		
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
}
