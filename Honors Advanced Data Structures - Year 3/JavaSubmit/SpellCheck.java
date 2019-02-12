import cs1.*;
import java.util.ArrayList;

public class SpellCheck
{
      private HashExample dict;
   
   public SpellCheck(int size)
   {
   dict = new HashExample(size);
   EasyReader inFile = new EasyReader("BIGDictionary.txt"); 
      while( !inFile.eof())
      {
      dict.put(inFile.readWord());
      }
   }
   public void Check(String name)
   {
   //reads in string called name
   String item = name;
   //runs each word through another method "checkWord"
      while(item != null)
      {
      checkString(item);
      }

   return;
   
   }
   public void checkString(String word)
   {
   //Construct every string that can be made by deleting one letter from the word. 
   //Construct every string that can be made by inserting any letter of the alphabet at any position in the string. 
   //Construct every string that can be made by swapping two neighboring characters in the string. 
   //Construct every string that can be made by replacing each letter in the word with some letter of the alphabet.
   //then print
   }
   public static void main(String [ ] args)
   {
      SpellCheck ex = new SpellCheck(1000);
      Keyboard.readString();
   }
}