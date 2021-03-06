import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		//As with setting the width for Brick, use the same methods but with appropriate
		//parameters from the settings
		
		// TODO: Set width to Settings.PADDLE_WIDTH
		// TODO: Set width to Settings.PADDLE_HEIGHT
		setWidth(Settings.PADDLE_WIDTH);
		setHeight(Settings.PADDLE_HEIGHT);
		
		// TODO: Call resetPosition
		//Just call the resetPosition() method!!!!
		resetPosition();
	}
	
	public void resetPosition() {
		// TODO: Set initial position x and y (use INITIAL_PADDLE_X/Y)
		// Note: Check Ball.java for a hint
		x = Settings.INITIAL_PADDLE_X;
		
		//Do now for y
		y = Settings.INITIAL_PADDLE_Y;
	}
	
	public void update() {
		x += xVelocity;
		
		// TODO: Prevent the paddle from moving outside of the screen
		// This can be done using two if statements (one for the left side of the screen and one for the right)
		
		//For left limit
		if(x <= 0) {
			setX(0);
		}
		
		else if (x>= Settings.WINDOW_WIDTH-Settings.PADDLE_WIDTH) {
			setX(Settings.WINDOW_WIDTH-Settings.PADDLE_WIDTH);
			
		}
		
		
		//Now complete for y
		if(y <= 0) {
			setY(0);
		}
		//Hint ???: use geometric calculation. The x coordinate represnts the start of the paddle that is the left part
		else if (y >= Settings.WINDOW_HEIGHT-Settings.PADDLE_HEIGHT) { 
			setY(Settings.WINDOW_HEIGHT-Settings.PADDLE_HEIGHT);
		}
	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		// TODO: Set x velocity
		xVelocity = vel; // what is ?
	}
}
