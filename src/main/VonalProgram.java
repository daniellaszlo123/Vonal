
package main;


public class VonalProgram {


    public static void main(String[] args) {
        Vonal v0 = new Vonal(2, "piros", "dupla", 8);
        System.out.println(v0);
        v0.rajzol();
        
        Vonal v1 = new Vonal(5, "zöld", "pont");
        System.out.println(v1);
        v1.rajzol();
        
        Vonal v2 = new Vonal(10);
        System.out.println(v2);
        v2.rajzol();
        
        Vonal v3 = new Vonal();
        System.out.println(v3);
        v3.rajzol();
        
        Vonal v4 = new Vonal(2, "sárga", "szaggatott", 5);
        System.out.println(v4);
        v4.rajzol();
        
        Vonal v5 = new Vonal(5, "kék");
        System.out.println(v5);
        v5.rajzol();
        
//        Vonal[] vonalak = {v0, v1, v2, v3, v4, v5};
//        //System.out.println(v);
//        for (int i = 0; i < vonalak.length; i++) {
//            System.out.println(vonalak[i]);
//        }
        
        System.out.println("Hibas tesztesetek: ");
        Vonal hibas1 = new Vonal(-5);
        System.out.println(hibas1);
        hibas1.rajzol();
        
        Vonal hibas2 = new Vonal(5, "szaggatott", "kék");
        System.out.println(hibas2);
        hibas2.rajzol();
        
        Vonal hibas3 = new Vonal(-5, "Piros", "dupla");
        System.out.println(hibas3);
        hibas3.rajzol();

        Vonal hibas4 = new Vonal(2, "piros", "dupla", -2);
        System.out.println(hibas4);
        hibas4.rajzol();
        
        
    }
    
}
