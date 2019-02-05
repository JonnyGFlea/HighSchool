import cs1.*;
import java.util.ArrayList;

public class Madlibs
{
  
   public static void main(String [ ] args)
   {
      
      int beginning = 0;
      int end = 0;
      String sentence = "";
      String newSentence = "";
      String temp = "";
      EasyReader inFile = new EasyReader("madlibs.txt");
      EasyReader console = new EasyReader();
      
        
      while(!inFile.eof())
      {
         String curr = inFile.readWord();
         //System.out.print(curr + " ");
               
         if(curr!=null)
         {
          sentence += curr + " ";  
           
         }
               
      }
      if(sentence.indexOf("<") != -1);
          {
           beginning = sentence.indexOf("<");
           end = sentence.indexOf(">");
           System.out.println("Enter a/an " + sentence.substring(beginning+1, end));
           String word = Keyboard.readString();
           System.out.println(" ");
           newSentence = sentence.substring(0,beginning) + word + sentence.substring(end + 1);
          } 
          
      
      
      
      while (newSentence.indexOf("<") != -1)
      {
           beginning = newSentence.indexOf("<");
           end = newSentence.indexOf(">");
           
           System.out.println("Enter a/an " + newSentence.substring(beginning+1, end));
           String newWord = Keyboard.readString();
           temp = newSentence.substring(0,beginning) + newWord + newSentence.substring(end + 1);
           newSentence = temp;
      }
      
      
      
      System.out.print(newSentence);
      
     
      
   }

}