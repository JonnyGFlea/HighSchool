import cs1.*;
public class GuessGame
{
	EasyReader con = new EasyReader();  

	public TreeNode buildTree()
	{
		EasyReader inFile = new EasyReader("animals.dat");
		TreeNode gametree = buildTreeHelper(inFile);
		inFile.close();
		return gametree;
		
	}
	
	public TreeNode buildTreeHelper(EasyReader inFile)
	{
		// more code here
      
         String qa = inFile.readLine(); 
         String line = inFile.readLine();
         GameInfo total = new GameInfo(line, qa);
         TreeNode node = new TreeNode(total,null,null);
         
          //Otherwise, it will have both a left and a right node.
         if(qa.equals("q")) 
         {
            node.setLeft(buildTreeHelper(inFile));
            node.setRight(buildTreeHelper(inFile));
         }
         
       return node;
           
		
	}

	public void play(TreeNode t)
	{
		playHelper(t);
	}

	public TreeNode playHelper(TreeNode t)
	{
      if(t != null)
      {
         GameInfo n = (GameInfo)t.getValue();
         //Write the (recursive) method to play the game.
      
         if(n.getQuestionOrAnswer().equals("q"))
         {
            System.out.println(n.getInfo());
            String answer = Keyboard.readString();
            if(answer.equals("y"))
            {
               t.setLeft(playHelper(t.getLeft()));
            }
            if(answer.equals("n"))
            {
               t.setRight(playHelper(t.getRight()));
            }
         }
         else
         {
            System.out.println(n.getInfo());
            String response = Keyboard.readString();
            if(response.equals("y"))
            {
               System.out.println("I WIN!!");
            }
            if(response.equals("n"))
            {
               System.out.println("You win!");
               System.out.println("What was your animal?");
               String newAnimal = Keyboard.readString();
               System.out.println("Please enter a question that has a yes answer for a " + newAnimal + " and no anwer for a " + n.getInfo());
               String newClue = Keyboard.readString();
            
            }
	      }  
      }
       return t;
   }


	public void saveTree(TreeNode t)
	{
		EasyWriter outFile = new EasyWriter("animals2.dat");
		saveTreeHelper(t, outFile);
		outFile.close();		
	}

	public void saveTreeHelper(TreeNode t, EasyWriter outFile) 	
   {//Write the (recursive) method that will save the tree.
     		
		if(t != null)
      {
         GameInfo n = (GameInfo)t.getValue();
         if(n.getInfo().equals("a")){ //if the item is an animal
            outFile.println("a");
            outFile.println(n.getInfo());
            saveTreeHelper(t.getLeft(), outFile);
            saveTreeHelper(t.getRight(), outFile);
            }
         else{
            //If the item is a question,
            //it has children that need to be stored (recursively).
            outFile.println("q");
            outFile.println(n.getInfo());
            saveTreeHelper(t.getLeft(), outFile);
            saveTreeHelper(t.getRight(), outFile);   
         }
      }
      
	}

	public static void main(String[] args)
	{
		String ans;
		EasyReader console = new EasyReader();
		GuessGame program = new GuessGame();
		TreeNode gametree = program.buildTree();
      //Tree n = new Tree(gametree);
      //n.PrintTree();
		do
		{
			program.play(gametree);
			System.out.print("Play again? ");
			ans = console.readWord();
		}
		while (!ans.toLowerCase().equals("n")) ;
		program.saveTree(gametree);
	}
}
