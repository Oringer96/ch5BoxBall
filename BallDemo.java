import java.awt.Color;
import java.util.ArrayList;

/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @Kristen Oringer
 * @version 4.6.15
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private ArrayList<BoxBall>ballList;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo(int numOfBalls)
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
        ballList = new ArrayList<BoxBall>();
        for(int i = 0; i < numOfBalls; i++)
        {
            ballList.add(new BoxBall(0, 0, 600, 500, , myCanvas));
            
        }
    }

    public void boxBounce(){
        ball.draw();
        
           while(true) {
            myCanvas.wait(50);           // small delay
            ball.move();
        }
    }
    
    /**
     * Simulate two bouncing balls
     */
    public void bounce()
    {
        int ground = 400;   // position of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground);

        // crate and show the balls
        BouncingBall ball = new BouncingBall(50, 50, 16, Color.BLUE, ground, myCanvas);
        ball.draw();
        BouncingBall ball2 = new BouncingBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();

        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            ball.move();
            ball2.move();
            // stop once ball has travelled a certain distance on x axis
            if(ball.getXPosition() >= 550 || ball2.getXPosition() >= 550) {
                finished = true;
            }
        }
    }
}
