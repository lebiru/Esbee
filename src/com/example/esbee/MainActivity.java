package com.example.esbee;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

	//Declare the MediaPlayer for the sound object mp1
	MediaPlayer soundOne, soundTwo, soundThree, soundFour;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Set the sounds to the default sound
		soundOne = MediaPlayer.create(this,  R.raw.one);
		soundTwo = MediaPlayer.create(this,  R.raw.two);
		soundThree = MediaPlayer.create(this,  R.raw.three);
		soundFour = MediaPlayer.create(this,  R.raw.four);
		
		//link the virtual button with the display button (?) not sure on this
		final Button button1 = (Button) findViewById(R.id.button1);
		final Button button2 = (Button) findViewById(R.id.button2);
		final Button button3 = (Button) findViewById(R.id.button3);
		final Button button4 = (Button) findViewById(R.id.button4);
		
		
		//have the virtual button listen for clicks
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**Called when user clicks Sound Library**/
	public void openSoundLibrary(View view)
	{
		//respond to button
		Intent intent = new Intent(this, SoundLibraryActivity.class);
		startActivity(intent);
	}

	public void onClick(View v)
	{
		
		switch(v.getId())
		{
			//If button1 was clicked, play the sound
			case R.id.button1:
			soundOne.start();
			break;
			
			//If button2 was clicked, play the sound
			case R.id.button2:
			soundTwo.start();
			break;
			
			//If button3 was clicked, play the sound
			case R.id.button3:
			soundThree.start();
			break;
			
			//If button4 was clicked, play the sound
			case R.id.button4:
			soundFour.start();
			break;
			
		}
	}

}
