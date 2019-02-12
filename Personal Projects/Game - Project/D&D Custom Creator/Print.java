import java.util.*;
import java.io.*;
import cs1.*;
import java.lang.*;
 
 public class Print {
 
   private String sentence;
    
   public Print(String s){
        
       sentence = s;
    }
    
    public static void main(String args[]) throws InterruptedException {
    String question = "What is your name?";
    for(int k = 0; k < question.length(); k++)
    {
    String pieceQ = question.substring(k, k+1);
    System.out.print(pieceQ);
    Thread.sleep(100);
    }
    System.out.println("");
    
    String sentenceOne = "Hello, ";
    String name = Keyboard.readString();
    String sentenceTwo = "! Welcome to the world of";
    for(int k = 0; k < sentenceOne.length(); k++)
    {
    String piece1 = sentenceOne.substring(k, k+1);
    System.out.print(piece1);
    Thread.sleep(100);
    }   
    
    for(int k = 1; k < name.length(); k++)
    {
    String firstLet = name.substring(0, 1);
    String pieceN = name.substring(k, k+1);
    firstLet.toUpperCase();
    if(k == 1)
    System.out.print(firstLet);
    System.out.print(pieceN);
    Thread.sleep(100);
    }  
    
    for(int k = 0; k < sentenceTwo.length(); k++)
    {
    String piece2 = sentenceTwo.substring(k, k+1);
    System.out.print(piece2);
    Thread.sleep(100);
    }  
    }
}