package com.example.yahtzee;

import java.util.Random;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	String url = "http://api.rottentomatoes.com/api/public/v1.0/lists/dvds/new_releases.json?apikey=3yrvzkmum9s7kg8gpvc2an7u";
	
	Boolean networkAvailable;
	
	Integer diceRoll;
	
	Drawable die;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        
        System.out.println("some random text");
        Log.d("Error",url);
       
	
		
    }


       public void ClickHandler(View v)
        {
    	   System.out.println("Click Succeeded");
    	   Random random = new Random();
    	   diceRoll = random.nextInt(6) +1;
    	   
    	   Resources res = getResources();
    	   Drawable drawable;

    	   
    	   switch(diceRoll) {
    	   case 1: drawable = res.getDrawable(R.drawable.dice_1);
    		   die = drawable;
    		   break;
    	   case 2: drawable = res.getDrawable(R.drawable.dice_2);
			   die = drawable;
			   break;
    	   case 3: drawable = res.getDrawable(R.drawable.dice_3);
			   die = drawable;
			   break;
    	   case 4: drawable = res.getDrawable(R.drawable.dice_4);
			   die = drawable;
			   break;
    	   case 5: drawable = res.getDrawable(R.drawable.dice_5);
			   die = drawable;
			   break;
    	   case 6: drawable = res.getDrawable(R.drawable.dice_6);
			   die = drawable;
			   break;
		   default: drawable = res.getDrawable(R.drawable.dice_1);
    	   }
    	   
    	   Toast.makeText(getApplicationContext(), "You clicked the button and the value is: "+diceRoll, Toast.LENGTH_SHORT).show();
    	   ImageView diceImg = (ImageView)findViewById(R.id.diceImg);
    	   diceImg.setImageDrawable(drawable);
        }
       
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
