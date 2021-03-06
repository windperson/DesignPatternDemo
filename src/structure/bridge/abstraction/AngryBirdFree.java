package structure.bridge.abstraction;

import java.io.File;
import java.util.List;
import java.awt.Image;

import structure.bridge.implementor.AngryBirdImpl;

public class AngryBirdFree implements AngryBird {
	AngryBirdImpl impl = null;
	List<Image> map = null;
	
	public AngryBirdFree(AngryBirdImpl aImpl, List<Image> aMap)
	{
		impl = aImpl;
		map = aMap;
	}
	
	@Override
	public void startGame() {
		System.out.println("Start the free version of AngryBird.");
		
		for(Image img :map)
		{
			impl.draw(img);
		}
		
		//other app specific logic

	}

	@Override
	public void stopGame() {
		System.out.println("Stop the free version of AngryBird.");
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
		System.out.println("fire! (in " + this.getClass().toString() + " )");
	}

}
