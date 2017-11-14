package clock_game;

import javax.swing.JFrame ;
import javax.swing.JPanel ;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;

public class Core extends Canvas {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


static Graphics g1, g2;
int x1, x2, y1, y2;
/*		int x1 = 25;
	int y1 = 25;
	int x2 = 120;
	int y2 = 120;
	*/
	public void paint(Graphics g){
	//	g.drawLine(x1, y1, x2, y2);
		g.drawLine(400,300,100,100);
		g.drawLine(400,300,500,40);
		//g.drawArc(100, 75, 800, 600, 30, 150);
	//	g.drawRect(20, 20, 740, 520);
		g.drawOval(400, 300, 250, 250);
	}
	
public void rotateClock() {
	
}	

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		//frame.getContentPane().add(new Core());
		Core c = new Core();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.add(c);

	}

}
