import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Channel {
	
		//ArrayList<Video> JonnyChannel = new List<Video>();
		private String title;
		private double videoLength;
		private int viewCount;
		private int likeCount;
		private int dislikeCount;
		private String comment;
		
	public Channel(String t, double length, int viewC, int likeC, int dislikeC, String c) {
		title = t;
		videoLength = length;
		viewCount = viewC;
		likeCount = likeC;
		dislikeCount = dislikeC;
		comment = c; 
		}
		
		public String getTitle(String t){
			return t;
			}
		public double getVideoLength(double length){
			return length;
		}
		public int getViewCount(int viewC){
			return viewC;
		}
		public int getLikeCount(int likeC){
			return likeC;
		}
		public int getDislikeCount(int dislikeC){
			return dislikeC;
		}
		public String getComment(String c){
			return c;
		}
		
		public String toString()
		{
			return "\"" + title + "\"" + "\nTime: " + videoLength 
			+ "\nViews: " + viewCount + " \nLikes: " + likeCount 
			+ " \nDislikes:" + dislikeCount + "\n\n\t Comments: \n \t\"" + comment + "\"";
		}
		/*
		public int getChannelRevenue(list<Video>Channel){
			int total = 0;
			//finish the method to get the total revenue of an entire channel
			return total;
		}
		*/
		
	public static void main(String[] args)
   {
   	Video vid = new Video ("Channel Trailer", 1.27, 100, 15, 3, "Subscribed!");
   	//List<video>Channel = new ArrayList<video>Channel;
   	
   }
}
