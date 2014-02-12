package structure.bridge.implementor;

import java.awt.Image;
import java.io.File;

public class AndroidV2AngryBirdImpl implements AngryBirdImpl {

	@Override
	public void draw(Image aImage) {
		System.out.println("draw() using " + this.getClass().getName());
	}

	@Override
	public void draw2D(Image aImage) {
		System.out.println("draw2D() using " + this.getClass().getName());
	}

	@Override
	public void initSoundDevice() {
		System.out.println("initSoundDevice() using " + this.getClass().getName());
	}

	@Override
	public void playSound(File aFile) {
		System.out.println("playSound() using " + this.getClass().getName());
	}

	@Override
	public void stopSound() {
		System.out.println("stopSound() using " + this.getClass().getName());
	}

}
