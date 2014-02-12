package structure.bridge.test;

import static org.junit.Assert.*;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

import structure.bridge.abstraction.*;
import structure.bridge.implementor.*;

import org.junit.Test;

public class TestBridge {

	@Test
	public void testAngryBirdFreeOnAndroidV2() {
		AngryBird game = new AngryBirdFree(new AndroidV2AngryBirdImpl(), new ArrayList<Image>());
		
		game.playSound(new File("\\tmp\\mocksound.wav"));
		game.startGame();
		game.stopGame();
		
	}
	
	@Test
	public void testAngryBirdSessionOnAndroidV2(){
		AngryBird game = new AngryBirdSeason(new AndroidV2AngryBirdImpl(), new ArrayList<Image>());
		
		game.playSound(new File("\\tmp\\mocksound.wav"));
		game.startGame();
		game.stopGame();
		
	}

}
