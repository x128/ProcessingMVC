package Model;

import java.awt.Point;

public class Rocket {
	public Point position = new Point(0, 0);
	public float angle;
	public float speed;
	
	public void updatePosition(int timeElapsedMs) {
		float timeElapsed = (float)timeElapsedMs / 1000.f;

		position.x += timeElapsed * speed * Math.sin(angle * Math.PI / 180.);
		position.y -= timeElapsed * speed * Math.cos(angle * Math.PI / 180.);
	}
}
