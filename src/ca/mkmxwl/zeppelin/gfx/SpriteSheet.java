package ca.mkmxwl.zeppelin.gfx;

import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class SpriteSheet {

	private BufferedImage sheet;
	private int width, height;
	private int spriteWidth, spriteHeight;

	public static SpriteSheet mainMenu = new SpriteSheet("/mainmenu.png", 0, 0);
	public static SpriteSheet tiles = new SpriteSheet("/tiles.bmp", 32, 32);
	public static SpriteSheet nawibo = new SpriteSheet("/gfx/nawibo.png", 32, 32);

	public SpriteSheet(String file, int spriteWidth, int spriteHeight) {
		this.spriteWidth = spriteWidth;
		this.spriteHeight = spriteHeight;
		try {
			sheet = ImageIO.read(SpriteSheet.class.getResourceAsStream(file));
			width = sheet.getWidth();
			height = sheet.getHeight();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getSpriteWidth() {
		return spriteWidth;
	}

	public int getSpriteHeight() {
		return spriteHeight;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public BufferedImage getSheet() {
		return sheet;
	}
}