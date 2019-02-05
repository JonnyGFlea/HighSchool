public class GameInfo
{
	private String info;   //either animal or question
	private String q_or_a; //indicator for which type of data stored
	                       //in info
	
// more code here  a constructor, a couple of accessor methods
//                 toString
  public GameInfo(String i, String q_a)
  { 
      info = i; 
      q_or_a = q_a;
  }
  public String getInfo() 
  { 
      return info;
  }
  public String getQuestionOrAnswer() 
  { 
      return q_or_a;
  }
  public void setInfo(String theNewInfo) 
  {
      info = theNewInfo;
  }
  
  public void setQuestionOrAnswer(String theNewQAndA)
  {
      q_or_a = theNewQAndA;
  }
  
  public String toString()
  {
      return info;
  }
}