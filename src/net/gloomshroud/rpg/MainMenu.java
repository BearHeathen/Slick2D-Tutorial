package net.gloomshroud.rpg;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class MainMenu extends BasicGameState {

	public MainMenu(int startmenu) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Play", 500, 400);
		g.drawString("Exit", 500, 500);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		
		System.out.println("X: " + posX + " Y: " + posY);
		
		// Play Button
		if ((posX > 500 && posX < 541) && (posY > 350 && posY < 360)) {
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(1);
			}
		}
		
		// Exit Button
		if ((posX > 500 && posX < 541) && (posY > 250 && posY < 270)) {
			if (Mouse.isButtonDown(0)) {
				System.exit(0);
			}
		}
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
