public class Nain extends Personnage {

    public int pointDeVie;
    static int pointsDeVieMax = 80;
    private String type = "nain";

    public Nain(String nom,String type,int pointDeVie ){
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
