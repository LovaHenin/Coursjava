// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //******************************************************************************************
        //                                  Les variables : Les Type
        //******************************************************************************************
        // Les types primitifs: ecrit en minuscule
        // int : entier -+ 2147483648 =>limite de ce que l'on peut encoder sur 32 bits
        // short pour 16 bits,  long pour 64 bits
        // byte=>octet 8 bits -128 à +127
        // char un caractère
        // boolean pour booleen
        // float, décimal pour 32 bits
        // double, décimal sur 64 bits

        int monAge = 46;
        monAge = 60;

        long distanceTerreLune = 10548121177L;//L pour confirmer que c'est long mais non pas un int
        float var1 = 1.5F;// obligatoire pour lui faire comprendre que ce n'est pas un double
        char caractere = 'c';
        char caractere2 = '\uf127';
        //System.out.println(caractere2);
        boolean vrai = true;
        boolean a;// false par defaut
        int b; // 0 par defaut
        char c; // '' par defaut
        // possible depuis Java10 de déclarer n'importe qu'elle variable sans typage en affectant directement une valeur
        var toto = "toto";

        // Type Objet:
        String monPrenom = "Lova"; // double quote obligatoires


        //******************************************************************************************
        //                                  Opérateurs arithmétiques
        //******************************************************************************************

        int result = 5 * 2;
        result = 5 + 2;
        result = 5 % 2;
        result = 5 - 2;
        result = 5 / 2;
        System.out.println(result);
        float test = 5 / 2;
        System.out.println(test);
        test = 5F / 2;
        System.out.println(test);
        ;


        //******************************************************************************************
        //                                    Opérateurs relationnel
        //******************************************************************************************

        boolean vraiFaux = 20 == 30;
        //// System.out.println(vraiFaux);
        vraiFaux = 20 <= 30;
        //      System.out.println(vraiFaux);
        vraiFaux = 20 >= 30;
        //      System.out.println(vraiFaux);
        vraiFaux = 20 < 30;
        //      System.out.println(vraiFaux);
        vraiFaux = 20 > 30;
        //      System.out.println(vraiFaux);
        vraiFaux = 20 != 30;
        // System.out.println(vraiFaux);

        char char1 = 'c';
        char char2 = 'y';

        vraiFaux = char1 < char2;
        //  System.out.println(vraiFaux);

        //******************************************************************************************
        //                                    Opérateurs logique
        //******************************************************************************************


        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = true;

        vraiFaux = bool1 & bool2;
        System.out.println(vraiFaux);
        vraiFaux = bool1 | bool2;
        System.out.println(vraiFaux);
        vraiFaux = bool1 ^ !bool2; //XOR exclusif
       // System.out.println(vraiFaux);
        // pour tester l'inverse ! pour not
        // il existe aussi && et || il evaluera juste une valeur et est receommandé
        // ex boolean var=true||false ici la 1ere partie etant true il n'evalue pas la seconde partie car automatiquement true


        //******************************************************************************************
        //                                    Incrémentation et décrémentation
        //******************************************************************************************

        int valInt=5;
        valInt=valInt+1;
        System.out.println(valInt);

        valInt=5;
        valInt++;
        System.out.println(valInt);
        valInt--;
        System.out.println(valInt);

        int valInt2;
        valInt2=++valInt;
        System.out.println("un:"+valInt2);
        valInt2=--valInt;
        System.out.println("deux"+valInt2);

        valInt2=valInt++; // l'affectation a lieu avant l'incrémentation de valInt
        System.out.println("trois"+valInt2);
        valInt2=valInt--;
        System.out.println("q"+valInt2);

        //******************************************************************************************
        //                       Opérateur de concaténation pour les chaines de caractères
        //******************************************************************************************

        String maString ="Mon ages est:";
        String maString2 =" 45 ans ";
        System.out.println(maString+maString2);

        int age=46;

        System.out.println(maString+age+ "ans");
        System.out.println(maString+age+1+ "ans");// la 1ere variable étant de type string => 1 aussi
        System.out.println(age+1+ "ans");// ()=> calcul avant concaténation
        System.out.println(maString2+ (age+1)+ "ans");

        //******************************************************************************************
        //                      formatage de chaine
        //******************************************************************************************

        /* il est peu recommandé d'enchainer les concaténation avec + car recré une chaine intermédiaire à chaque fois
        avec gauche et à droite du + */

        maString2="ans";
        float f=3.5F;
        System.out.printf("Je concatème une chaine : %s %d %s et ca n'a rien à voir mais j'affiche %f", maString, age,maString2,f);
        System.out.println();
        System.out.printf("Je concatème une chaine : %s %d %s et ca n'a rien à voir mais j'affiche %f \n", maString, age,maString2,f);
        System.out.printf("Je concatème une chaine : %s %d %s et ca n'a rien à voir mais j'affiche %f", maString, age,maString2,f);

        //******************************************************************************************
        //                    Bloc d'instruction
        //******************************************************************************************

        // espace global
        {
            //espace local
            int tonAge=20;

        }

        //System.out.println(tonAge); tonAge n'existe pas à l'extétieur de l'espace local
        //******************************************************************************************
        //                    Structure conditionnelles
        //******************************************************************************************

        int tonAge=32;
        if(tonAge>30)// possible sans {} mais avec plusieurs bloc d'instruction
            System.out.println("tu fais jeune");


        int ageDuCapitaine=29;

        if (tonAge > 30 && ageDuCapitaine < 50) {
            System.out.println();
        }else{
            if(ageDuCapitaine<tonAge){ // ici on parle de compléxité cyclomotique de niveau 2(if dans if) à partir de 5 invisible, 7 à ne pas dépassé

                System.out.println("info1");
            }
            System.out.println("info2");
        }
        //******************************************************************************************
        //                    Structure Ternaire
        //******************************************************************************************

        monAge=30;
        System.out.println((monAge>31 && ageDuCapitaine<50 ? "cap a moins de 50 et moi plus de 31":"cap a plus de 50 et/ou moi ai moins de 31"));
        // condition ?=> if:else
        //switch case

        int mois=2;
        switch (mois){

            case 1:
                System.out.println("janvier");
                break;
            case 2:
                System.out.println("février");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("Avril");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("juin");
                break;
            case 7:
                System.out.println("juillet");
                break;
            case 8:
                System.out.println("Aout");
                break;
            case 9:
                System.out.println("septembre");
                break;
            case 10:
                System.out.println("Octobre");
                break;
            case 11:
                System.out.println("novembre");
                break;
            case 12:
                System.out.println("Decembre");
                break;
            default:
                System.out.printf("Inexistant");
        }
        switch (mois){

            case 1,2,3:
                System.out.println("Hiver");
                break;
            case 4,5,6:
                System.out.println("Printemps");
                break;

            case 7,8,9:
                System.out.println("Eté");
                break;

            case 10,11,12:
                System.out.println("Automne");
                break;

        }

        //******************************************************************************************
        //                    Structure itératives
        //******************************************************************************************
        // boucle FOR
        /* boolean v=true;
        for(;v;){

            System.out.println("vrai");
            v=false;
        }*/
        for(int nb=0;nb<3;nb++){

            System.out.println(nb);

        }

        // boucle while, généralement pour les booleens

        boolean jeBoucle=true;
        while (jeBoucle){

            System.out.println("un tour de plus");
            // bloc puis sortie
            jeBoucle=false;
        }

        // do while

        boolean jeReBoucle=false;

        do{
            System.out.println("un tour de plus");

            //instruction de sortie
            jeReBoucle=true;
            break;
        }while (jeReBoucle);

        // continue
        boolean jeContinu=true;
        int nb=0;
        while(jeContinu){

            System.out.println("tour" + nb);
            nb++;
            if(nb==5){
                continue;
            }
            if(nb>10){
                jeContinu=false;
            }
            System.out.println("je continu");
        }

        //******************************************************************************************
        //                    classe System
        //******************************************************************************************

        // ne peut être instancié sans constructeur
        // possède des méyhodes et propriétés statiques(d'ou le fait que nous n'ayons pas besoin d'instancier d'objet)

        // propriété statique out:

        // CORRESPOND   AUX FLUX D42CRITURE STANDARD par defaaut terminal ou redirigé vers un fichier
        //elle est valorisée au moment du lancement de la machine virtuelle

        // out est une propriété de type PrintStream qui possède multitudes de méthode comme print, println,printf

        // autre flux d'écriture standard : System.in => flux d'entrée standard (saisie au clavier)
        // system.err=> retourné quoi qu'il en soit dans le terminal meme avec un flux redirigé
        // system.exit(0) pour mettre fin à la machine virtuelle avec un code erreur(0) pour tout s'est bien passé sinon quitte l'execution //avec l'affichage du code erreur

        // quelques méthodes:
      //  System.currentTimeMillis(); // retourne un long qui représente le nombre de milliseconde depuis le 01/01/1970
       // System.nanoTime();// pour calculer des intervales de temps

        long start= System.nanoTime();
        System.out.println("hello world");
        long end=System.nanoTime();
        System.out.println(end-start);

        System.out.println(System.getProperty("user.name"));
        //getProperty
        //System.getProperties().list(System.out); => liste les propriété
       // System.out.println(System.getenv("path")); //=> valeur des propriétés d'environement
    // class Scanner => ecoute les flux entrant System.in, elle necessite l'import de java.util.Scan

        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez votre prenom");
        String prenom=scan.nextLine(); // nextLine()=>String
        System.out.println("Bonjour" +prenom);
      /*  System.out.println("Entrez votre choix");
        Boolean bo=scan.nextBoolean(); // true ou false
        System.out.println("Bonjour" +bo);*/

        // Container ou Wrapper
        Float f1=1.5f;
        Double d=1.5d;
        Integer i1=10;
        Long l1=20L;
        String L2 = new String("dzfz");

        f1.floatValue();// renvoie la valeur du type primitif
        Float f2=Float.parseFloat("1.5");// converti la chaine en float
        Float f3 =1.5f; // non valorisé==null
        System.out.println(f2.equals(f3)); // pour comparer les types objets

        System.out.println(f1==f2); //false f1 juste reference de l'emplacement de l'objet type primitif
        System.out.println(f1.floatValue()==f2.floatValue());//=>true
        // Diffrent string

        String s1="t";
        String s2="t"; // meme reference
        System.out.println("chaine");
        System.out.println(s1==s2);
        String s3 = new String("t"); // pas meme reference
        String s4 = new String("t");
        System.out.println(s3==s4);;

        //String.valueof()=>converti une chaine
        //Type.parseType(ce que vous voulez)
        // equals pour comparer des valeurs de type objet
        // Grace un type objet, les variables non valorisées prendront par défaut une valeur null


    }
}