import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Video extends Channel{
	
	private double revenue;
	
	public Video(String title, double videoLength, int viewCount, int likeCount, int dislikeCount, String comment)
	{
		super(title, videoLength, viewCount, likeCount, dislikeCount, comment);
	}
	
	public double getRevenue(Video vid, double r)
	{
		//r += 7.60*(vid.getViewCount()%10);
		return r+1.1;
	}
	
	public String toString()
	{
		return super.toString() + "\n Revenue: " + revenue;
	}
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Insert Channel Name Here");
        frame.setLocation(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setCursor(Cursor.WAIT_CURSOR);
 		
 		frame.getContentPane().add( new JButton( "Two" ), BorderLayout.SOUTH );
 		frame.getContentPane().add( new JButton( "One" ), BorderLayout.NORTH );
		
		
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(600,600));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 		
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
	
	public static void main(String[] args)
	{
		Video vid = new Video ("Channel Trailer", 1.27, 100, 15, 3, "Subscribed!");
		System.out.println(vid);
		
		/*
		ArrayList<Video> jonnyGFlea =  ArrayList<Video>();
		ArrayList<Video> jonnyGFlea = [vid, vid2, vid3];
		*/ 
		createAndShowGUI();
	}
}
