import java.util.*;
import cs1.*;
import java.util.ArrayList;

public class WordLadder{

   private Queue<WordNode>nodeList;
   private ArrayList<WordNode>wordList;
   
  public static void main(String[] args)
  {
    WordLadder prog = new WordLadder();
    //System.out.println(prog.isOneApart("money","monty"));
    WordNode p = prog.makeLadder("stone","money");
    System.out.println(prog.print(p));
    
  }
   public WordLadder(){
   EasyReader inFile = new EasyReader("sgb-words.txt");
   EasyReader console = new EasyReader();
   
      wordList = new ArrayList<WordNode>();
      while(!inFile.eof()) //goes through entire txt file
      {
         String fileCurr = inFile.readWord(); //holds onto each word     
         if(fileCurr != null) //if the txt isnt at the end
         {
            WordNode alpha = new WordNode(fileCurr); //we make a new WordNode with no previous
            wordList.add(alpha); //We then add the new Wordnode to our wordlist
         }
       }
       
  }
  
  public WordNode makeLadder(String start, String end){
  
  Queue<WordNode>nodeList = new LinkedList<WordNode>();
  WordNode temp;
  for(int k = 0 ;k < wordList.size(); k++) //looping through our filled wordlist
     {
     WordNode Curr = wordList.get(k); //holds onto each word
     if(Curr.getWord().equals(start)) //finds the starting Node in the arraylist
       {
       Curr.setPrev(null); //starting node set to null
       nodeList.add(Curr);
       temp = Curr;
       }
     }
     
     while(!nodeList.isEmpty()) 
     {
         WordNode top = nodeList.remove();  //Dequeue a word node.
         for(int k = 0; k < wordList.size(); k++)//You will traverse the list of words
         {
            if(isOneApart(wordList.get(k).getWord(), top.getWord()) && wordList.get(k).getPrev() == wordList.get(k))  
            {
            //put each WordNode object containing a word which differs from the word
            //in the dequeued WordNode object by one letter into the queue.  
            nodeList.add(wordList.get(k));
           
            wordList.get(k).setPrev(top);
            //You will want to mark the prev reference of the WordNode
            //that contains the one off word
            //to the dequeued WordNode object.
            
               if(wordList.get(k).getWord().equals(end))//If any of the one off words match the ending word you are done,
               {
               return wordList.get(k); //and you should return the ending word node from the method.
               }
               //(Be sure you already marked its prev correctly before you return it!)
            }
         }
      //System.out.println(nodeList);
      //EasyReader console = new EasyReader();
      //console.readChar();

      }
     
                     return null;//You need to have some way of printing your word ladder.
             
     }
  public boolean isOneApart(String first, String compareTo)
  {
  int total = 0;
  for(int k = 0; k < first.length();k++)
  {
      String firstLetter = first.substring(k,k+1);
      String compareLetter = compareTo.substring(k,k+1);
      if(!firstLetter.equals(compareLetter))
      {
       total++;
      }
  }
  if(total == 1)
  {
      return true;
  }
  return false;
  }
  
  public String print(WordNode o){
  String total = "";
      while(o != null)
      {
      total += o.getWord() + " ";
      o = o.getPrev();
      }
  return total;
  }
  
  
}