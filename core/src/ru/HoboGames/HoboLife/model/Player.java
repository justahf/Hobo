package ru.HoboGames.HoboLife.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Player {

  //���������
  public enum State {
    NONE, WALKING, DEAD
  }

 
  //�������� ��������
  public static final float SPEED = 2f;
  //������	
  public static final float SIZE = 0.7f; 
	
  //������� � ����
  Vector2 position = new Vector2();
  //������������ ��� ���������� ��������
  Vector2 velocity = new Vector2();
  Vector2 velocityFrame = new Vector2();
  //�������������, � ������� ������ �����
  //����� �������������� � ������� ��� ���������� �������� (������������ �� ������� � �.�.
  Rectangle 	bounds = new Rectangle();
  //������� ���������
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

  //���������� ��������
  public void update(float delta) {
		velocityFrame.set(velocity);
	    position.add(velocityFrame); 
	  }
}
	  //���������� ��������
	  

