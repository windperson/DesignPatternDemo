package structure.bridge.abstraction;

import java.awt.Image;
import java.io.File;
import java.util.List;

import structure.bridge.implementor.AngryBirdImpl;

public class AngryBirdSeason implements AngryBird {

	AngryBirdImpl impl = null;
	List<Image> map = null;
	
	public AngryBirdSeason(AngryBirdImpl aImpl, List<Image> aMap)
	{
		impl = aImpl;
		map = aMap;
	}
	
	@Override
	public void startGame() {
		System.out.println("Start the AngryBirdSeassion.");
		
		for(Image img :map)
		{
			impl.draw(img);
		}
		
		//other app specific logic

	}

	@Override
	public void stopGame() {
		System.out.println("Stop the AngryBirdSession.");
		impl.stopSound();

	}

	@Override
	public void playSound(File aFile) {
		impl.initSoundDevice();
		impl.playSound(aFile);
	}

	@Override
	public void fire() {
		// do fire.
	}

}
