package ru.HoboGames.HoboLife;

import com.badlogic.gdx.ApplicationAdapter;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import ru.HoboGames.HoboLife.screens.GameScreen;


public class HoboGame extends Game {
	GameScreen screen;
	@Override
	public void create () {
		setScreen(new GameScreen());
	}

	
}
