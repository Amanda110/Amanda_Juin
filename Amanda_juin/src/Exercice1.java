import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Author : amandatishler
* Date : Jun. 11, 2021
* Description : 
*/

public class Exercice1 {

	
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		BufferedReader entree;
		int a = 0;
		
		entree = new BufferedReader(new FileReader("monFichier.txt"));
		while(entree.ready()) 
		{
			entree.read();
			a+=1;
			
		}
		System.out.print(a);
		entree.close();

	}

}




