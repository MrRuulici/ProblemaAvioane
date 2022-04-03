public class Main {
    public static void main(String[]args){
        ConcordePlane plane1=new ConcordePlane("#001",180,128);
        AllPlanes plane2=new Boeing("#002",250,330);
        AllPlanes plane3=new MigPlanes("#003",1050);
        AllPlanes plane4=new TomCatPlanes("#004",1250);
        TomCatPlanes p= (TomCatPlanes)plane4;
        ((TomCatPlanes) plane4).refuel();
        plane1.goSuperSonic();
        MigPlanes p2=(MigPlanes)plane3;
        p2.highSpeedGeometry();
        p2.normalGeometry();
        FightingPlane f=(TomCatPlanes)plane4;
        f.launchMissile();
    }
}
