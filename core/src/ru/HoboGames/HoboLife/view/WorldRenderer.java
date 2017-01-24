package ru.HoboGames.HoboLife.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;

import ru.HoboGames.HoboLife.model.*;


public class WorldRenderer {
  public static float CAMERA_WIDTH = 8f;
  public static  float CAMERA_HEIGHT = 5f;
	
  private World world;
  public OrthographicCamera cam;
  ShapeRenderer renderer = new ShapeRenderer();

	
  public int width;
  public int height;
  public float ppuX;	// пикселей на точку мира по X 
  public float ppuY;	// пикселей на точку мира по Y 
  	
  public void setSize (int w, int h) {
    this.width = w;
    this.height = h;  
    ppuX = (float)width / CAMERA_WIDTH;
    ppuY = (float)height / CAMERA_HEIGHT;
  }
  //установка камеры
  public void SetCamera(float x, float y){
    this.cam.position.set(x, y,0);	
    this.cam.update();
  }
	
  public WorldRenderer(World world) {
		
    this.world = world;
    this.cam = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
    //устанавливаем камеру по центру
    SetCamera(CAMERA_WIDTH / 2f, CAMERA_HEIGHT / 2f);

  }
  
  //основной метод, здесь мы отрисовываем все объекты мира
  public void render() {
    drawBricks();
    drawPlayer() ;
		
  }

  //отрисовка кирпичей
  private void drawBricks() {
    renderer.setProjectionMatrix(cam.combined);
    //тип устанавливаем...а данном случае с заливкой
    renderer.begin(ShapeType.Filled);
    //прогоняем блоки
    for (Brick brick : world.getBricks()) {
      Rectangle rect =  brick.getBounds();
      float x1 =  brick.getPosition().x + rect.x;
      float y1 =  brick.getPosition().y + rect.y;
      renderer.setColor(new Color(0, 0, 0, 1));
      //и рисуем блоки
      renderer.rect(x1, y1, rect.width, rect.height);
    }
		
    renderer.end();
  }

  //отрисовка персонажа по аналогии
  private void drawPlayer() {
    renderer.setProjectionMatrix(cam.combined);
    Player player = world.getPlayer();
    renderer.begin(ShapeType.Filled);
    Rectangle rect = player.getBounds();
    float x1 = player.getPosition().x + rect.x;
    float y1 = player.getPosition().y + rect.y;
    renderer.setColor(new Color(1, 0, 0, 1));
    renderer.rect(x1, y1, rect.width, rect.height);
    renderer.end();
  }
	
}
