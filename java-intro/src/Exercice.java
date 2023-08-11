import java.util.Scanner;
public class Exercice {

    public static void main(String[]args){
/* //Exo1
        int numeroAnne=0;
        int nombrePlanete=9;
        int anneeChange=2006;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer l'année : ");
        int saisie = scanner.nextInt();



  if(saisie>1600 && saisie<2020) {
      if (saisie <1700 ) {
        nombrePlanete=nombrePlanete-2;


      } else if (saisie<1800) {
          nombrePlanete--;
      }else if (saisie>2006) {
          nombrePlanete--;
      }
      System.out.printf("En %d , les planètes du système solaire étaient au nombre de : %d",saisie,nombrePlanete);
  }else{

      System.out.printf(" Le programme ne peut pas fournir de résultat pour l'année : %d ", saisie);

  }*/
//Exo3
     /*   int siecle=0;
        int annee=2006;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le nombre de planete: ");
        int nbPlanete = scanner.nextInt();

        switch (nbPlanete){

            case 7:
                siecle=16;
                System.out.printf("On sait qu'au %d ème siècle, seules %d planètes avaient été découvertes",siecle,nbPlanete);
                break;
            case 8:
                System.out.printf("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle mais il a également été réduit de 9 à 8 en 2006");
                break;

            case 9:
                System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006,où ce nombre a été réduit à 8");
                break;

            default:
                System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanete);

        }
*/
        //Exo4
        int siecle=0;
        int annee=2006;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le nombre de planete: ");
        int nbPlanete = scanner.nextInt();

        for (;nbPlanete<10;nbPlanete++){
        switch (nbPlanete){

            case 7:
                siecle=16;
                System.out.printf("On sait qu'au %d ème siècle, seules %d planètes avaient été découvertes",siecle,nbPlanete);
                break;
            case 8:
                System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle mais il a également été réduit de 9 à 8 en 2006");
                break;

            case 9:
                System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006,où ce nombre a été réduit à 8");
                break;

            default:
                System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanete);

        }
        }
    }


}
