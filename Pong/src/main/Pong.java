package main;
import javax.swing.JFrame;

public class Pong extends JFrame 
{
	
	public static Pong pong; 
	
	public Pong()
	{
		//setting the super constructor (title)
		super("Pong");
		
	}
		
	
	public static void main(String[] args)
	{
		pong = new Pong();
		pong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pong.setSize(800,600);
		pong.setVisible(true);
		pong.setResizable(false);
		Paddle paddle = new Paddle();
		//adding paddle (JLabel) to JFrame
		pong.add(paddle);
		
	}
}
