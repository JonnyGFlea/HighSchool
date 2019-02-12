import java.util.*;
import cs1.*;

public class HomeworkVotes
{
   public static void main(String[] args){
   
      int item;
      
      //List<Integer> probs = new ArrayList<Integer>(); Has duplicates
      //Set<Integer> probs = new HashSet<Integer>(); Removes duplicates
      //Set<Integer> probs = new TreeSet<Integer>(); Removes duplicates and sorts
      Map<Integer, Integer> probs = new TreeMap<Integer, Integer>();
      do
      {
         System.out.print("Enter prob number: ");
         item = Keyboard.readInt();
         
         if(item != -1)
         {
            //probs.add(item); only works for ArrayList, HashSet, and TreeSet
            Integer freq = probs.get(item);
            if( freq == null) //test if NOT in map
               probs.put(item,1);
            else
               probs.put(item, freq+1);
            
         }
      }
      while(item != -1);
      
      //System.out.println(probs);
      for(Integer num : probs.keySet())
      {
         System.out.println(probs.get(num) + " student(s) requested problem #" + num);
      }   
   }
}