import java.util.*;
import java.util.Scanner;
 
 
 public class MainGame {
        
       public MainGame(){
        }
       
      public static void typeItOut(String sent) throws InterruptedException{
         for(int k = 0; k < sent.length(); k++)
          {
           String sentPiece = sent.substring(k, k+1);
           System.out.print(sentPiece);
           //Thread.sleep(100);
          }
       }
      public static void typeFirstLetUpper(String sent) throws InterruptedException{
         for(int k = 1; k < sent.length(); k++)
           {
             String firstLet = sent.substring(0, 1).toUpperCase();
             String sentPiece = sent.substring(k, k+1);
             firstLet.toUpperCase();
            if(k == 1)
             System.out.print(firstLet);
             System.out.print(sentPiece);
             //Thread.sleep(100);
          }
           
      }
      public static String inputResponseRace(String inputRace)
      {
      Scanner scanner = new Scanner(System.in);
      ArrayList<Race> raceList = new ArrayList<Race>();
          Race dwarf = new Race("Dwarf", "Hardy and bold");
             raceList.add(dwarf);
          Race elf = new Race("Elf", "Lean and magical");
             raceList.add(elf);
            Race halfling = new Race("Halfling", "Small and mischievous");
             raceList.add(halfling);
          Race human = new Race("Human", "Strong and nobel");
             raceList.add(human);
      
      boolean goodRace = false;
          
          while (!goodRace){
           if(inputRace.toLowerCase().equals("help") || inputRace.toLowerCase().equals("h")){
                for(Race r : raceList){
                System.out.println(r +": " + r.getRaceInfo());
               }
            inputRace = scanner.next();
             }
          else{
              for(Race r : raceList){
                 if(inputRace.toLowerCase().equals(r.getRace().toLowerCase())){
                 System.out.println("Wow! A " + inputRace + " what a great choice!");
                 goodRace = true;
                 break;
                 }
              }
                 if(!goodRace){
                 System.out.println("Invalid race");
                 inputRace = scanner.next();
                 }  
           }
           
          }
          return inputRace;
      }
      public static String inputResponseClass(String inputClass)
      {
      Scanner scanner = new Scanner(System.in);
      ArrayList<ClassType> classList = new ArrayList<ClassType>();
        ClassType cleric = new ClassType("Cleric","A priestly champion who wields divine magic in service of a higher power");
          classList.add(cleric);
  		  ClassType fighter = new ClassType("Fighter","A master of martial combat, skilled with a variety of weapons and armor");
  		  	 classList.add(fighter);
     	  ClassType rogue = new ClassType("Rogue","A scoundrel who uses stealth and trickery to overcome obstacles and enemies"); 
     	  	 classList.add(rogue);
     	  ClassType wizard = new ClassType("Wizard","A scholarly magic-user capable of manipulating the structures of reality");
     	  	 classList.add(wizard);

          boolean goodClass = false;
          
          while (!goodClass){
           if(inputClass.toLowerCase().equals("help") || inputClass.toLowerCase().equals("h")){
                for(ClassType c : classList){
                System.out.println(c +": " + c.getClassInfo());
               }
          inputClass = scanner.next();
             }
          else{
              for(ClassType c : classList){
                 if(inputClass.toLowerCase().equals(c.getClassType().toLowerCase())){
                 System.out.println("Nice! A " + inputClass + ", looking good!");
                 goodClass = true;
                 break;
                 }
              }
                 if(!goodClass){
                 System.out.println("Invalid class");
                 inputClass = scanner.next();
                 }
                 
           }
           
          }
         return inputClass;
      }
       public static void main(String args[]) throws InterruptedException {


          ArrayList<String> bp = new ArrayList<String>();
          
          int correct = 0;
          Scanner scanner = new Scanner(System.in);
          Character playerOne = new Character(-1, null, null, null, null, null, -1, -1, bp);
          

             
             	  	 
          String introduction = "Welcome to the D&D character creator by JonnyGFlea!";	
          String question = "What is your first name?";
          String sentenceOne = "Hello, ";
          String sentenceTwo = "! Welcome to the world of your own imagination.";
          String sentenceThree = "Let's begin by creating a character...";
          String sentenceFour = "What's your race?";
          String sentenceFive = " (Type h or help for race list)";
          String sentenceSix = "Now lets decide your class!";
          String sentenceSeven = "Adding items to inventory...";
          String sentenceEight = "";
        
          typeItOut(introduction);
          System.out.println("");
          typeItOut(question);
          System.out.println("");
          String name = scanner.next();
          typeItOut(sentenceOne);
          typeFirstLetUpper(name);
          playerOne.setName(name);
          typeItOut(sentenceTwo);
          System.out.println("");
          typeItOut(sentenceThree);
          System.out.println("");
          typeItOut(sentenceFour);
          System.out.print("");
          typeItOut(sentenceFive);
          System.out.println("");
          
          String inputRace = scanner.next();
          playerOne.setRace(inputResponseRace(inputRace));          
          String choiceRace = playerOne.getRace(); 
          
          typeItOut(sentenceSix);
          System.out.print("");
          typeItOut(sentenceFive);
          System.out.println("");
          
          String inputClass = scanner.next();
          playerOne.setClassType(inputResponseClass(inputClass));
          String choiceClass = playerOne.getClassType();
          
          typeItOut(sentenceSeven);
          System.out.println("");
       }
 }