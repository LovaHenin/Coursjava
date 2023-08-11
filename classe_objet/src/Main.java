// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//click droit src classjava Voiture


        //instancier un objet=> alloue un espace mémoire
        // l'affectation réference elle l'emplacement de l'objet instancié, ou par pointeur de l'objet
        Voiture voiture=new Voiture();
        voiture.nbPortes=5;
        voiture.couleur="rouge";
        voiture.modele="peugeot 12008";

        voiture.klaxoner();


        //transtypage

        VehiculeAMoteur maVoiture=new Voiture();//seule les propriétés de vehiculeAmoteur pour l'instant
        Voiture maVoiturePourRobotPeinture=(Voiture)maVoiture;
        maVoiturePourRobotPeinture.couleur="rouge";

        Port vieuxPort = new Port(100);
        Bateau yacht = new Bateau();
        yacht.masse=50;
        vieuxPort.accueillirEngin(yacht);
        vieuxPort.accueillirEngin(yacht);
        vieuxPort.accueillirEngin(yacht);

// ici l'interface Amarable nous permet simplement de mettre en lumière le fait que la seule chose qui intéresse notre port
        // est que l'engin soit amarable ainsi que le fait de savoir combien de cordes et d'emplacement, il aura besoin
        // sans cette interface chaques engin aurait du implémenter la méthode accueillir engin
        //une interface peut hériter elle meme d'un nombre illimityé d'interface.
        // Drapeau=>pour but de signaler une fonction de la classe qui l'implemente ou bien de l'interface qui en Hérite
        //une interface peut contenir des propriété mais leur valeur devra affectée à la déclaration

        //********************************************************************
        // type enums


        //maVoiturePourRobotPeinture.boite=Voiture.auto;

        maVoiturePourRobotPeinture.boiteVitesse=TypeBoiteVitesse.MANUELLE;
        System.out.println(maVoiturePourRobotPeinture.boiteVitesse);
        System.out.println(maVoiturePourRobotPeinture.boiteVitesse.nomTypeBoite);

    }
}