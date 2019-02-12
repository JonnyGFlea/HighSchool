public class Channel {
		
		Channel[] jonny = new Channel[4];
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
		
		public String getTitle(){
			return title;
			}
		public double getVideoLength(){
			return videoLength;
		}
		public int getViewCount(){
			return viewCount;
		}
		public int getLikeCount(){
			return likeCount;
		}
		public int getDislikeCount(){
			return dislikeCount;
		}
		public String getComment(){
			return comment;
		}
		
		
		public String toString()
		{
			return "\"" + title + "\"" + "\nTime: " + videoLength 
			+ "\nViews: " + viewCount + " \nLikes: " + likeCount 
			+ " \nDislikes:" + dislikeCount + "\n\n\t Comments: \n \t\"" + comment + "\"";
		}
		
		public double getChannelRevenue(Channel c){
			double r =0.0;
			for(int k = 0; k < 0; k++)
				r = jonny[k].getRevenue(c, 1.0);
			return r;
		}
		
		
	public static void main(String[] args)
   {
		Channel jonny = new Channel("Channel Trailer", 1.27, 15000, 2700, 3, "Subscribed!");
   	
   }
}
