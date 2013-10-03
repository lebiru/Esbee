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
	Bundle libraryBundle = new Bundle();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Set the sounds to the default sound
		soundOne = MediaPlayer.create(this, R.raw.hihat);
		soundTwo = MediaPlayer.create(this,  R.raw.snare);
		soundThree = MediaPlayer.create(this,  R.raw.bass);
		soundFour = MediaPlayer.create(this,  R.raw.bass2);

		
		//link the virtual button with the display button (?) not sure on this
		final Button button1 = (Button) findViewById(R.id.button1);
		final Button button2 = (Button) findViewById(R.id.button2);
		final Button button3 = (Button) findViewById(R.id.button3);
		final Button button4 = (Button) findViewById(R.id.button4);
		final Button stopButton = (Button) findViewById(R.id.stop);
		
		button1.setText("hihat");
		button2.setText("snare");
		button3.setText("bass");
		button4.setText("bass2");
		
		
		//have the virtual button listen for clicks
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		stopButton.setOnClickListener(this);
		
		
		//Reload the new sounds/labels
		Bundle extras = getIntent().getExtras();
		if (extras != null)
		{
			libraryBundle = extras;
			soundOne = MediaPlayer.create(this, extras.getInt("newOnesound"));
			soundTwo = MediaPlayer.create(this, extras.getInt("newTwosound"));
			soundThree = MediaPlayer.create(this, extras.getInt("newThreesound"));
			soundFour = MediaPlayer.create(this, extras.getInt("newFoursound"));
			
			button1.setText(extras.getCharSequence("btnOneLbl"));
			button2.setText(extras.getCharSequence("btnTwoLbl"));
			button3.setText(extras.getCharSequence("btnThreeLbl"));
			button4.setText(extras.getCharSequence("btnFourLbl"));
		}
		
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
			
			case R.id.stop:
			if(soundOne.isPlaying() || soundTwo.isPlaying() || soundThree.isPlaying() || soundFour.isPlaying())
			{
				soundOne.reset();
				soundTwo.reset();
				soundThree.reset();
				soundFour.reset();
				
				//reinitialize the buttons
				soundOne = MediaPlayer.create(this, libraryBundle.getInt("newOnesound"));
				soundTwo = MediaPlayer.create(this, libraryBundle.getInt("newTwosound"));
				soundThree = MediaPlayer.create(this, libraryBundle.getInt("newThreesound"));
				soundFour = MediaPlayer.create(this, libraryBundle.getInt("newFoursound"));
				
				
				
			}
			
			
			break;
			
		}
	}

}
