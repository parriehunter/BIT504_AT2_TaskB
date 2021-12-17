import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private int initialXPosition, initialYPosition;
	private Color colour;
	
	 public int getxPosition() {
         return xPosition;
     }
	 public void setxPosition(int xPosition) {
         this.xPosition = xPosition;
     }
	 public void setxPosition(int newX, int panelWidth) {
		 if (newX >= 0 && newX < panelWidth - getWidth()) {
		     xPosition = newX;
		 }
		 else if (newX < 0) {
			 xPosition = 0;
		 }
		 else {
			 xPosition = panelWidth - width;
		 }

	 }
	 public int getyPosition() {
         return yPosition;
     }
	 public void setyPosition(int yPosition) {
         this.yPosition = yPosition;
     }
	 public void setyPosition(int newY, int panelHeight) {
		 if (newY >= 0 && newY < panelHeight - getHeight()) {
		     yPosition = newY;
		 }
		 else if (newY < 0) {
			 yPosition = 0;
		 }
		 else {
			 yPosition = panelHeight - height;
		 }

	 }
	 
	 public int getxVelocity() {
         return xVelocity;
     }
	 public void setxVelocity(int xVelocity) {
         this.xVelocity = xVelocity;
     }
	 public int getyVelocity() {
         return yVelocity;
     }
	 public void setyVelocity(int yVelocity) {
         this.yVelocity = yVelocity;
     }
	 
     public int getWidth() {
         return width;
     }
     public void setWidth(int width) {
         this.width = width;
     }
     public int getHeight() {
         return height;
     }
     public void setHeight(int height) {
         this.height = height;
     }

     public Color getColour() {
         return colour;
     }
     public void setColour(Color colour) {
         this.colour = colour;
     }
     
     public void setInitialPosition(int intialX, int intialY) {
    	 initialXPosition = intialX;
    	 initialYPosition = intialY;
     }
     
     public void resetToInitialPosition() {
         setxPosition(initialXPosition);
         setyPosition(initialYPosition);
     }

     public Rectangle getRectangle() {
         return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
     }
     
}
