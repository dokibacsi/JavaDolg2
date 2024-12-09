package hu.szamalk;
public class Main {
    public static void main(String[] args) {
        Tabla tabla = new Tabla('#');
        System.out.println("4. feladat: Az üres tábla:");
        tabla.Megjelenit();
        System.out.print("\n6. feladat: A feltöltött tábla:\n");
        tabla.Elhelyez(8);
        tabla.Megjelenit();
        System.out.print("A megadott oszlop üres-e? : " + tabla.UresOszlop(2)+"\n");
        System.out.print("A megadott sor üres-e? : " + tabla.UresSor(3));
    }
}