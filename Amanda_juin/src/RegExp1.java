import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Author : amandatishler
* Date : Jun. 16, 2021
* Description : Introduction sur les expressions régulières
* 				étapes / structure
*/

public class RegExp1 {

	public static void main(String[] args) 
	{
		Scanner crayon = new Scanner(System.in);
		
		// input est le texte dans lequel l'expression sera recherchée
		System.out.println("Inscrire le texte pour la recherche");
		String input = crayon.nextLine();
		// Expression à rechercher
		System.out.println("Inscrire le texte recherché");
		String regEx = crayon.nextLine();
		
		// Étape 1: Utiliser Pattern
		Pattern pattern = Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);
		
		//Étape 2: Allouer un objet Matcher opur l'entrée spécifié
		Matcher matcher = pattern.matcher(input);
		
		// Étape 3: Vérifier la concordance et afficher le résultat
		
		//=======================================================
		
		// on peut utiliser find()
/*		while (matcher.find()) 
		{
			System.out.println("Le(s) mot(s) \"" + matcher.group()
				+ "\" débute à l'indice " + matcher.start()
				+ " et finit à l'incide " + matcher.end());				
		}
*/		
		//=======================================================
		
		// utiliser matches() ; Doit correspondre entièrement à tout le texte
		
/*		if (matcher.matches())
		{
			System.out.println("Les deyx textes sont les mêmes");
		}
		else
		{
			System.out.println("Les deux textes sont différents");
		}
*/		
		//=======================================================
		
		// Utiliser lookingAt()
		
		if (matcher.lookingAt()) 
		{
			System.out.println("On a trouvé \"" +
			matcher.group()+"\" commençant à l'indice " + matcher.start() +
			" et finit à l'indice " + matcher.end());
		}
		else
		{
			System.out.println("Le texte ne se trouver pas au début");
		}
		
		crayon.close();
	} 

}
