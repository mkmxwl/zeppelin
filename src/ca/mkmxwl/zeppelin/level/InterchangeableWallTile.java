package ca.mkmxwl.zeppelin.level;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class InterchangeableWallTile extends Tile {

	private BufferedImage image;
	
	public InterchangeableWallTile(int x, int y, BufferedImage image) {
		super(x, y);
		this.image = image;
	}

	@Override
	public void init() {
		projectileSolid = true;
		walkSolid = true;
	}

	@Override
	public void update() {
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, x << 5, y << 5, null);
	}

}
