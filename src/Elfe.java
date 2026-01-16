public class Elfe extends Personnage{

    private int pointDeVie ;
    static int pointsDevieMax = 120;
    private String type = "elfe";

    public Elfe(String nom,String type,int pointDeVie ){
        super(nom,type,pointDeVie);
        this.pointDeVie = this.pointsDevieMax;
    }

    public int getPointsDevieMax(){
        return this.pointsDevieMax;
    }

    public void setPointsDevieMax(int pointsDevieMax){
        this.pointsDevieMax = pointsDevieMax;
    }

    public int getPointDeVie(){
        return this.pointDeVie;
    }

    public void setPointDeVie(int pointDeVie){
        this.pointDeVie = pointDeVie;
    }
}
