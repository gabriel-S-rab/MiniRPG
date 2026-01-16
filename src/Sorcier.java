public class Sorcier extends Personnage{

    private int pointDeVie;
    static int pointsDeVieMax = 150;
    private String type = "sorcier";

    public Sorcier(String nom,String type,int pointDeVie){
        super(nom,type,pointDeVie);
        this.pointDeVie = this.pointsDeVieMax;
    }

    public int getPointsDeVieMax(){
        return this.pointsDeVieMax;
    }

    public void setPointsDeVieMax(int pointsDeVieMax){
        this.pointsDeVieMax = pointsDeVieMax;
    }

    public int getPointDeVie(){
        return this.pointDeVie;
    }

    public void setPointDeVie(int pointDeVie){
        this.pointDeVie = pointDeVie;
    }
}
