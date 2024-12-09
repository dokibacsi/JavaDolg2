package hu.szamalk;

import java.util.Random;

public class Tabla {
    private char[][] T;
    private char uresCella;

    public Tabla(char uresCella) {
        T = new char[8][8];
        this.uresCella = uresCella;

        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = this.uresCella;
            }
        }
    }

    public void Elhelyez(int N){
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            int ri = rnd.nextInt(T[i].length);
            int rj = rnd.nextInt(T[i].length);
            for (int j = 0; j < T[i].length; j++) {
                if(T[ri][rj] == this.uresCella){
                    T[ri][rj] = 'K';
                }
            }
        }
    }

    public void Megjelenit(){
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j]);
            }
            System.out.print("\n");
        }
    }
}
