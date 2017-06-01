package net.gloomshroud.rpg;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class WorldMap extends BasicGameState {
	private TiledMap world;
	Animation character, moveUp, moveDown, moveLeft, moveRight;
	
	int[] duration = {200, 200};
	
	float characterPositionX = 0;
	float characterPositionY = 0;
	float shiftX = characterPositionX + 450;
	float shiftY = characterPositionY + 300;
	
	public WorldMap(int worldmap) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		world = new TiledMap("res/map.tmx");
		//Image[] walkUp = {new Image("res/characterBack.png"), new Image("res/characterBack.png")};
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		world.render(0, 0);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		return 1;
	}

}
