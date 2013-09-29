package com.example.esbee;



public class PresentPackage 
{

	/**
	 * @param args
	 * Present Packages hold information about the 4 sounds that should be loaded. This 
	 * includes the package title, button labels, and the name of the mp3 files.
	 */

	//This is the title of the whole package. ie "Drum Set" if the package contains drum sounds.
	String packageTitle = "Initial Package Title";

	// The button labels for the buttons. 
	// one -> upper left, two -> upper right
	// three -> lower left, four -> lower right
	String buttonOneLabel = "Initial one";
	String buttonTwoLabel = "Initial two";
	String buttonThreeLabel = "Initial three";
	String buttonFourLabel = "Initial four";

	// The mediaPlayer objects that are used to play the mp3 files
	int soundOne, soundTwo, soundThree, soundFour; 
	
	// Constructor method for PresentPackage
	public PresentPackage()
	{
		
		// The R id for the mp3 files. Default values
		this.soundOne = R.raw.five;
		this.soundTwo = R.raw.six;
		this.soundThree = R.raw.seven;
		this.soundFour = R.raw.eight;
		
		this.packageTitle = "Test Package Title";
		
		this.buttonOneLabel = "label 5";
		this.buttonTwoLabel = "label 6";
		this.buttonThreeLabel = "label 7";
		this.buttonFourLabel = "label 8";
	}
	
	public String getPkgTtl()
	{
		return this.packageTitle;
	}
	
	public void setPkgTtl(String newPackageTitle)
	{
		this.packageTitle = newPackageTitle;
	}
	
	public int getBtnSound(int buttonNumber)
	{
		switch (buttonNumber)
		{
			case 1:
			return this.soundOne;
		
			case 2:
			return this.soundTwo;
			
			case 3:
			return this.soundThree;
			
			case 4:
			return this.soundFour;
			
			default:
			System.out.println("Error: buttonNumber out of range (getBtnSound)");
			return R.raw.one; //should probably return an oops sound here
		}
	}
	
	public String setBtnSound(int newSound, int buttonNumber)
	{
		switch (buttonNumber)
		{
			case 1:
			this.soundOne = newSound;
		
			case 2:
			this.soundTwo = newSound;
			
			case 3:
			this.soundThree = newSound;
			
			case 4:
			this.soundFour = newSound;
			
			default:
			System.out.println("Error: buttonNumber out of range: " + buttonNumber + " (setBtnSound)");
			return null; //should probably put an oops sound here
		}
	}
	
	//Argument is the number of the button, and you'll get the package button label.
	public String getBtnLbl(int buttonNumber)
	{
		switch (buttonNumber)
		{
			case 1:
			return this.buttonOneLabel;
		
			case 2:
			return this.buttonTwoLabel;
			
			case 3:
			return this.buttonThreeLabel;
			
			case 4:
			return this.buttonFourLabel;
			
			default:
			System.out.println("Error: buttonNumber out of range: " + buttonNumber + " (getBtnLbl method)");
			return "Error: look at console for information";
		}	
	}
	
	public void setBtnLbl(String newButtonLabel, int buttonNumber)
	{
		switch (buttonNumber)
		{
			case 1:
			this.buttonOneLabel = newButtonLabel;
			break;
		
			case 2:
			this.buttonTwoLabel = newButtonLabel;
			break;
			
			case 3:
			this.buttonThreeLabel = newButtonLabel;
			break;
			
			case 4:
			this.buttonFourLabel = newButtonLabel;
			break;
			
			default:
			System.out.println("Error in setting a new button label: buttonNumber out of range: " + newButtonLabel );
			break;
		}	
	}
	

	
}
