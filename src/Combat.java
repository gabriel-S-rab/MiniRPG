public class Combat {


    private Personnage personnage1;
    private Personnage personnage2;

    public void realisationCombat() {
        int tour = 1;
        creationPersonnage();
        attaqueChoisie();
        while((personnage1.getPointDeVie() >0 && personnage2.getPointDeVie()>0) /* || tour < 4*/) {
            if (tour % 2 == 0) {
                affichagePersonnageAttaquer(personnage2);
                int choix = attaqueChoisie();
                realisationAttaque(choix,personnage2);
            }
            if (tour % 2 != 0) {
                affichagePersonnageAttaquer(personnage1);
                int choix = attaqueChoisie();
                realisationAttaque(choix,personnage1);
            }
            tour++;
        }
    }

    public void creationPersonnage(){
        boolean choix = false;
        do {
        if (personnage1 == null) {
            IO.println("choisissez votre personnage pour le personnage 1:\n " +
                    "entrez 1 pour un nain.\n" +
                    "entrez 2 pour un homme.\n" +
                    "entrez 3 pour un elfe.\n" +
                    "entrez 4 pour un sorcier.");
            String typeDePersonnage = IO.readln();
            switch (typeDePersonnage) {
                case "1" -> {
                    IO.println("entrez un nom pour votre nain :");
                    this.personnage1 = new Nain(IO.readln(),"nain",Nain.pointsDeVieMax);
                    IO.println("votre personnage a bien était créer !");
                    choix = true;
                }
                case "2" -> {
                    IO.println("entrez un nom pour votre Homme :");
                    this.personnage1 = new Homme(IO.readln(),"homme",Homme.pointsDeVieMax);
                    IO.println("votre personnage a bien était créer !");
                    choix = true;
                }
                case "3" -> {
                    IO.println("entrez un nom pour votre Elfe");
                    this.personnage1 = new Elfe(IO.readln(),"elfe",Elfe.pointsDevieMax);
                    IO.println("votre personnage a bien était créer !");
                    choix = true;
                }
                case "4" -> {
                    IO.println("entrez un nom pour votre sorcier");
                    this.personnage1 = new Sorcier(IO.readln(),"sorcier",Sorcier.pointsDeVieMax);
                    IO.println("votre personnage a bien était créer !");
                    choix = true;
                }
                default -> IO.println(" veuillez entrez les information demandés !");
            }
        }}while(!choix);
        do {
            choix = false;
            if (personnage2 == null) {
                IO.println("choisissez votre personnage pour le personnage 2:\n " +
                        "entrez 1 pour un nain.\n" +
                        "entrez 2 pour un homme.\n" +
                        "entrez 3 pour un elfe.\n" +
                        "entrez 4 pour un sorcier.");
                String typeDePersonnage = IO.readln();
                switch (typeDePersonnage) {
                    case "1" -> {
                        IO.println("entrez un nom pour votre nain :");
                        this.personnage2 = new Nain(IO.readln(),"nain",Nain.pointsDeVieMax);
                        IO.println("votre personnage a bien était créer !");
                        choix = true;
                    }
                    case "2" -> {
                        IO.println("entrez un nom pour votre Homme :");
                        this.personnage2 = new Homme(IO.readln(),"homme",Homme.pointsDeVieMax);
                        IO.println("votre personnage a bien était créer !");
                        choix = true;
                    }
                    case "3" -> {
                        IO.println("entrez un nom pour votre Elfe");
                        this.personnage2 = new Elfe(IO.readln(),"elfe",Elfe.pointsDevieMax);
                        IO.println("votre personnage a bien était créer !");
                        choix = true;
                    }
                    case "4" -> {
                        IO.println("entrez un nom pour votre sorcier");
                        this.personnage2 = new Sorcier(IO.readln(),"sorcier",Sorcier.pointsDeVieMax);
                        IO.println("votre personnage a bien était créer !");
                        choix = true;
                    }
                    default -> IO.println(" veuillez entrez les information demandés !");
                }}}while(!choix);
            if(personnage1 != null && personnage2 != null) {
                IO.println(" les personnages ont bien était creer il s'agit en personnage 1 de : " + personnage1.getNom()+" et " +
                        "en personnage 2 : " + personnage2.getNom());
            }
        }


        public void affichagePersonnageAttaquer(Personnage personnage){
        if(personnage == personnage1){
            IO.println(personnage1.getNom()+" attaque "+personnage2.getNom());
        }
        if(personnage == personnage2){
            IO.println(personnage2.getNom()+" attaque "+personnage1.getNom());
        }
    }



    public String choixAttaque () {
        IO.println(" choisissez une Attaque \n " +
                " 1 pour attaque Super coup de poing \n" +
                " 2 pour attaque super kick");
        String choixAttaque = IO.readln();
        IO.println(choixAttaque);
        return choixAttaque;
    }

    public int attaqueChoisie(){
        String choixAttaque = choixAttaque();
        int choix = 0;
        switch (choixAttaque){
            case "1" -> {
               AttaqueSuperCoupDePoing attaqueSuperCoupDePoing = new AttaqueSuperCoupDePoing();
               IO.println(" vous avez selectionner attaque super coup de poing");
               choix = 1;
            }
            case "2" -> {
               AttaqueSuperKick attaqueSuperKick = new AttaqueSuperKick();
               IO.println(" vous avez selectionner attaque super kick");
               choix = 2;
            }
            default -> IO.println(" le choix sélectionner n'existe pas");
        }
        return choix;
    }

    public void realisationAttaque(int choix, Personnage personnage) {
        switch (choix) {
            case 1 -> {
                AttaqueSuperCoupDePoing attaqueSuperCoupDePoing = new AttaqueSuperCoupDePoing();
                personnage.setPointDeVie(personnage.getPointDeVie() - attaqueSuperCoupDePoing.getPointDattaque());
                IO.println(" personnage a "+personnage.getPointDeVie());
               // a gérer
            }
            case 2 -> {
                AttaqueSuperKick attaqueSuperKick = new AttaqueSuperKick();
                personnage.setPointDeVie(personnage.getPointDeVie() - attaqueSuperKick.getPointDattaque());
                IO.println(" personnage a "+personnage.getPointDeVie());
                // a gérer
            }
        }
    }

    public void setPersonnage1 (Personnage personnage1){
        this.personnage1 = personnage1;
    }

    public Personnage getPersonnage1 () {
        return personnage1;
    }

    public void setPersonnage2 (Personnage personnage2){
        this.personnage2 = personnage2;
    }

    public Personnage getPersonnage2 () {
        return this.personnage2;
    }


    }








