package structure.bridge.abstraction;

import java.io.File;

public interface AngryBird {
	void startGame();
	void stopGame();
	void playSound(File aFile);
	void fire();
}
