import java.awt.Point;
import Model.Model;
import Model.Rocket;
import processing.core.PApplet;
import processing.core.PFont;

public class View {
	int fontSize = 16;
	int textColor = 0;
	int bgColor = 255;

	PFont f;
	PApplet applet;
	Point camera = new Point();
	
	public void setup(PApplet theApplet, int cameraX, int cameraY) {
		applet = theApplet;
		camera = new Point(cameraX, cameraY);
		f = applet.createFont("Helvetica", 16, true);
	}
		
	public void draw(Model model) {
//		PApplet.println("rocket:", model.rocket.position, model.rocket.angle);
		applet.background(bgColor);
		drawRocket(model.rocket);
	}
	
	void drawRocket(Rocket rocket) {
		applet.textFont(f, fontSize);
		applet.fill(textColor);
		applet.pushMatrix();
// TODO: Why it doesn't work?
//		applet.rotate(rocket.angle * (float)Math.PI / 180.f);
//		applet.translate(camera.x, camera.y);
		applet.text("↑", camera.x + rocket.position.x, camera.y + rocket.position.y);
		applet.popMatrix(); 
	}
}
