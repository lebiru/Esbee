package com.example.esbee;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// MediaPlayer library handles playing music
		//R.raw.sound: gets id of sound from the "raw" folder (res/raw)
		MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound);
		mediaPlayer.start();
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
}
