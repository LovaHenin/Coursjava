public class Voiture extends VehiculeAMoteur implements Vidangeable{
int nbPortes;
String couleur;
String modele;
/*static boolean auto=true;
static boolean manuelle=false;
boolean boite;*/
    TypeBoiteVitesse boiteVitesse;
int vitesse=0;

Voiture(){
    // voiture sans moteur
}

Voiture(Moteur moteur){
    super(moteur);
 // ici on construit une voiture avec moteur
}

Voiture(String modele){
     this();// appel du constructeur de voiture
    this.modele=modele;
}
    Voiture(String couleur, int nbPortes){

        this.couleur=couleur;
        this.nbPortes=nbPortes;
    }

    void accelerer(int acceleration){
    vitesse+=acceleration;
        System.out.println("Mon vehicule accelere de" + acceleration + "km/h et se roule avec une vitesse de" + vitesse +"km");
    }
void klaxoner(){
    System.out.println("tut tut !!!!");
}

    @Override
    public void vidanger() {
        System.out.println("vider l'huile");
    }
}

