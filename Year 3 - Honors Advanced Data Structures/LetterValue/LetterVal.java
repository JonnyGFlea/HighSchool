import java.util.*;
import cs1.*;

public class LetterVal
{
  private String name;
  private int number;
  
   public LetterVal(String s, int n)
   {
      number=n;
      name=s;
   }
   public int getValue()
   {
      return number;
   }
   public String getLetter()
   {
      return name;
   }
}