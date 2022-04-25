
package main;


public class Vonal {
    
    private int hossz;
    private String szin;
    private String tipus;
    private int eltolas;

    
    public Vonal() {
        this(1);
    }
    
    public Vonal(int hossz) {
        this(hossz, "fekete");
    }
    
    public Vonal(int hossz, String szin) {
        this(hossz, szin, "szimpla");
    }
    
    public Vonal(int hossz, String szin, String tipus) {
        this(hossz, szin, tipus, 0);
    }
    
    public Vonal(int hossz, String szin, String tipus, int eltolas) {
        setHossz(hossz);
        this.szin = szin;
        this.tipus = tipus;
        setEltolas(eltolas);
    }

    @Override
    public String toString() {
        return "Vonal{" + "hossz=" + hossz + ", szin=" + szin + ", tipus=" + tipus + ", eltolas=" + eltolas + '}';
    }
    
    private void setHossz(int hossz) {
        if (hossz<1) {hossz=1;}
        this.hossz=hossz;
    }
    
    private void setEltolas(int eltolas) {
        if (eltolas<0) {eltolas=0;}
        this.eltolas=eltolas;
    }
    
    public void rajzol(){
        //eltolás kirajzolas
        for (int i = 0; i < eltolas; i++) {
            System.out.print(" ");
        }
        
        //tipus beállítása:
        char jel;
        if (tipus.equals("pont")) {
            jel='.';
        }else if (tipus.equals("szaggatott")) {
            jel='-';
        }else if (tipus.equals("dupla")) {
            jel='=';
        }else{
            jel='_';
        }
        
        final String ALAP = "\u001B[0m";
        String konzolSzin= ALAP;
        
        if (szin.equals("piros")) {
            konzolSzin="\u001B[31m";
        }else if (szin.equals("kék")) {
            konzolSzin="\u001B[34m";
        }else if (szin.equals("zöld")) {
            konzolSzin="\u001B[32m";
        }else if (szin.equals("sárga")) {
            konzolSzin="\u001B[33m";
        }else{
            konzolSzin="\u001B[30m"; //fekete
        }
        
        System.out.print(konzolSzin);
        
        for (int i = 0; i < hossz; i++) {
            System.out.print(jel);
        }
        System.out.print(ALAP);
        System.out.printf("(%d)\n", hossz);
    }
    
}
