package ru.HoboGames.HoboLife.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Player {

  //состояние
  public enum State {
    NONE, WALKING, DEAD
  }

 
  //скорость движения
  public static final float SPEED = 2f;
  //размер	
  public static final float SIZE = 0.7f; 
	
  //позиция в мире
  Vector2 position = new Vector2();
  //используется для вычисления движения
  Vector2 velocity = new Vector2();
  Vector2 velocityFrame = new Vector2();
  //прямоугольник, в который вписан игрок
  //будет использоваться в будущем для нахождения коллизий (столкновение со стенкой и т.д.
  Rectangle 	bounds = new Rectangle();
  //текущее состояние
  State		state = State.NONE;

  public Player(Vector2 position) {		
    this.position = position;
    this.bounds.height = SIZE;
    this.bounds.width = SIZE;
  }

  public Rectangle getBounds() {
    return bounds;
  }

  public Vector2 getVelocity() {
    return velocity;
  }

  public Vector2 getPosition() {
    return position;
  }

  //обновления движения
  public void update(float delta) {
		velocityFrame.set(velocity);
	    position.add(velocityFrame); 
	  }
}
	  //обновления движения
	  

