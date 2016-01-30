package ca.mkmxwl.zeppelin.menu;

import java.awt.*;

import ca.mkmxwl.zeppelin.*;
import ca.mkmxwl.zeppelin.gfx.*;

public class MainMenu extends Menu {

	public MainMenu() {
		Sound.lavender.play();
	}

	private String[] options = { "Play", "About", "Exit" };
	private byte selected = 0;

	public void update(Game game, boolean uk, boolean dk, boolean enter) {
		super.update(game, uk, dk, enter);

		if (enter) {
			Zepp.sleep(150);
			Sound.beep.play();
			switch (selected) {
			case 0:
				game.setMenu(null);
				game.newGame();
				break;
			default:
				System.exit(0);
			}
		}
	}

	public void render(Graphics2D g) {
		g.drawImage(SpriteSheet.mainMenu.getSheet(), 0, 0, Zepp.WIDTH, Zepp.HEIGHT, null);
		super.render(g);
	}
}