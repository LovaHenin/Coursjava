public class Port {

    int nbPlace;

    Port(int nbPlace){
        this.nbPlace=nbPlace;
    }

    void accueillirEngin(Amarable engin){


        if( nbPlace>=engin.nbCordes(1.5F,100)){
            nbPlace-=engin.nbCordes(1.5F,100);
            System.out.println("Super on vous attend avec " +engin.nbCordes(1.5F,100)+"cordes");
        }else{
            System.out.println("navré on peut pas vous accueilir");
        }

    }

}
