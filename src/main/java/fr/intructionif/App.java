package fr.intructionif;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int salaireSemaine = 400;
        int prime = 250;
        int quota = 10;
        
        System.out.println("entrez le nombre de vente de la semaine : ");
        int nbrvente = clavier.nextInt();
        
        if(nbrvente >= quota){
            salaireSemaine = salaireSemaine + prime;
        }

        System.out.print("votre salaire par semaine est de : " + salaireSemaine);
        
    }
}