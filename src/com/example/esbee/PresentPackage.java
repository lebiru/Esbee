package com.example.esbee;

import android.media.MediaPlayer;
import android.view.View;

public class PresentPackage 
{

	/**
	 * @param args
	 * Present Packages hold information about the 4 sounds that should be loaded. This 
	 * includes the package title, button labels, and the name of the mp3 files.
	 */

	//This is the title of the whole package. ie "Drum Set" if the package contains drum sounds.
	String packageTitle = "packageTitle";

	// The button labels for the buttons. 
	// one -> upper left, two -> upper right
	// three -> lower left, four -> lower right
	String buttonOneLabel = "one";
	String buttonTwoLabel = "two";
	String buttonThreeLabel = "three";
	String buttonFourLabel = "four";

	// The mediaPlayer objects that are used to play the mp3 files
	MediaPlayer soundOne, soundTwo, soundThree, soundFour; 
	
	public PresentPackage(View v)
	{
		
		// The R id for the mp3 files. Default values
		soundOne = MediaPlayer.create(v.getContext(),  R.raw.one);
		soundTwo = MediaPlayer.create(v.getContext(),  R.raw.two);
		soundThree = MediaPlayer.create(v.getContext(),  R.raw.three);
		soundFour = MediaPlayer.create(v.getContext(),  R.raw.four);
	}

	





	public static void main(String[] args) 
	{


	}

}
