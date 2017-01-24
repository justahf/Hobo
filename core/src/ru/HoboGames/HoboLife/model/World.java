package ru.HoboGames.HoboLife.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class World {
  //массив блоков
  Array<Brick> bricks = new Array<Brick>();
  //наш персонаж
  public Player player;
	
  //ширина мира
  public int width;
  //высота мира
  public int height;
	
  //получить массив блоков
  public Array<Brick> getBricks() {
    return bricks;
  }
  //получить игрока
  public Player getPlayer() {
    return player;
  }
	
  public World() {
    width = 8;
    height = 5;
    createWorld();
  }

  //создадим тестовый мир какой-нибудь
  public void createWorld() {
    player = new Player(new Vector2(6,2));
    bricks.add(new Brick(new Vector2(0, 0)));
    bricks.add(new Brick(new Vector2(1, 0)));
    bricks.add(new Brick(new Vector2(2, 0)));
    bricks.add(new Brick(new Vector2(3, 0)));
    bricks.add(new Brick(new Vector2(4, 0)));
    bricks.add(new Brick(new Vector2(5, 0)));
    bricks.add(new Brick(new Vector2(6, 0)));
    bricks.add(new Brick(new Vector2(7, 0)));
  
		
  }
}