package com.statik_industries.mygdxgame;

import com.badlogic.gdx.Game;
import com.statik_industries.blackpoint.screens.Splash;

public class BlackPoint extends Game {

	public static final String TITLE = "Blackpoint", VERSION = "Alpha";

	@Override
	public void create() {
		setScreen(new Splash());
		
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void render() {
		super.render();

	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);

	}

	@Override
	public void pause() {
		super.pause();

	}

	@Override
	public void resume() {
		super.resume();

	}
}
