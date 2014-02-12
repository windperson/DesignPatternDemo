package structure.bridge.implementor;

import java.awt.Image;
import java.io.File;

public interface AngryBirdImpl {
	void draw(Image aImage);
	void draw2D(Image aImage);
	void initSoundDevice();
	void playSound(File aFile);
	void stopSound();
}
