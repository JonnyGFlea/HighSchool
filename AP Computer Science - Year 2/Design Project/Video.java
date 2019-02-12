public class Video extends Channel{
	
	private double revenue;
	Channel jonny = new Channel("Channel Trailer", 1.27, 15000, 2700, 3, "Subscribed!");
	
	public Video(String title, double videoLength, int viewCount, int likeCount, int dislikeCount, String comment)
	{
		super(title, videoLength, viewCount, likeCount, dislikeCount, comment);
		
		revenue = getRevenue(jonny, 0.0);
	}
	
	public double getRevenue(Channel c, double r)
	{
		int totalViews = c.getViewCount();
		int totalLikes = c.getLikeCount();
			if(totalViews >= 1000)
				r = (totalViews/1000)*7.60;
			if(totalLikes >= 100)	
				r = (totalLikes/100)*1.20;
		return r;
	}
	
	public String toString()
	{
		return super.toString() + "\n Revenue: " + revenue;
	}

	
	public static void main(String[] args)
	{
		
		Channel jonny = new Channel("Channel Trailer", 1.27, 15000, 2700, 3, "Subscribed!");
		Video intro = new Video ("Channel Trailer", 1.27, 100, 15, 3, "Subscribed!");
		System.out.println(intro);
		System.out.println(jonny.getChannelRevenue(jonny));
		
		
	}
}