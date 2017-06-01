package net.gloomshroud.rpg;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class TutorialGame extends StateBasedGame {
	
	public static final String gameName = "Tutorial RPG";
	public static final int startMenu = 0;
	public static final int worldMap = 1;
	
	public TutorialGame(String gameName) {
		super(gameName);
		this.addState(new MainMenu(startMenu));
		this.addState(new WorldMap(worldMap));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(startMenu).init(gc, this);
		this.getState(worldMap).init(gc, this);
		this.enterState(startMenu);
	}
	

	public static void main(String[] args) {
		AppGameContainer agc;
		
		try {
			agc = new AppGameContainer(new TutorialGame(gameName));
			agc.setDisplayMode(1024, 768, false);
			agc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
