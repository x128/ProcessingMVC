package Model;

import java.util.Timer;
import java.util.TimerTask;

public class Model {
	public Rocket rocket = new Rocket();
	private int timerInterval = 50; // ms

    public Model() {
        Timer timer = new Timer();
        timer.schedule(new UpdateTask(), 0, timerInterval);
	}

    class UpdateTask extends TimerTask {
        public void run() {
        	update();
        }
    }
    
	void update() {
		rocket.updatePosition(timerInterval);
	}
}
