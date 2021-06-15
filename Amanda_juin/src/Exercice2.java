import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
* Author : amandatishler
* Date : Jun. 11, 2021
* Description : 
*/

public class Exercice2 {

	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		BufferedReader entree;
		int a;
		int somme = 0;
		
		entree = new BufferedReader(new FileReader("monCalcul.txt"));
		while(entree.ready()) 
		{
			a = Integer.parseInt(entree.readLine());
			somme+=a;	
		}
		entree.close();
		
		String Fichier = "monResultat.txt";
		FileWriter ficAEcrire;
		PrintWriter sortie;
		
		ficAEcrire = new FileWriter(Fichier);
		sortie = new PrintWriter(ficAEcrire);
		sortie.print(somme);
		sortie.close();

	}
}
