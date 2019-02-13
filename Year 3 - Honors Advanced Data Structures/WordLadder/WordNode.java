public class WordNode{

   private String word;
   private WordNode prev;
   
  public WordNode(String w)
  { 
      word = w; 
      prev = this;
  }
  public String getWord() 
  { 
      return word;
  }
  public WordNode getPrev() 
  { 
      return prev;
  }
  public void setWord(String theNewWord) 
  {
      word = theNewWord;
  }
  
  public void setPrev(WordNode theNewPrev)
  {
      prev = theNewPrev;
  }
  
  public String toString()
  {
      return "  " + word + " ";
  }
}
