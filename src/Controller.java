import Model.Model;
import processing.core.PApplet;

public class Controller extends PApplet {
	Model model = new Model();
	View view = new View();
  
	private int width = 800;
	private int height = 600;
	
	public void settings() {
		size(width, height);
	}
	
	public void setup() {
		view.setup(this, width / 2, height / 2);
	}
  
	public void draw() {
		view.draw(model);
	}
	
	public void keyPressed(processing.event.KeyEvent event) {
//		println("keyPressed", event.getKeyCode());
		switch (event.getKeyCode()) {
		// Turn the rocket:
		case UP:
			model.rocket.angle = 0;
			break;
		case DOWN:
			model.rocket.angle = 180;
			break;
		case LEFT:
			model.rocket.angle = 270;
			break;
		case RIGHT:
			model.rocket.angle = 90;
			break;
		case ENTER:
			model.rocket.speed += 100;
			break;
		
		// TODO: Handle any other events to control the model...
		}
	}
}
