package com.hackathon.tetris.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hackathon.tetris.TetrisGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.fullscreen = TetrisGame.FULLSCREEN;
		config.title = TetrisGame.TITLE;
		config.width = TetrisGame.WIDTH;

		new LwjglApplication(new TetrisGame(), config);
	}
}
