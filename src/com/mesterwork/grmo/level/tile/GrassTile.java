package com.mesterwork.grmo.level.tile;

import com.mesterwork.grmo.graphics.Screen;
import com.mesterwork.grmo.graphics.Sprite;

public class GrassTile extends Tile{

	public GrassTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x, y, this);
	}
	
}
