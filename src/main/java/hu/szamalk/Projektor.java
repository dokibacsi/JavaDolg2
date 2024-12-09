package hu.szamalk;

import java.util.Arrays;

public class Projektor {
    private String nev;
    char[] betuTomb;

    public Projektor() {
        this.nev = "KatonaValentin";
        betuTomb = new char[this.nev.length()];

        run();


    }

    private void run(){
        nevBetuiVesszovel();
    }

    private void nevBetuiVesszovel(){
        System.out.println(betuTomb.length);
        for (int i = 0; i < betuTomb.length; i++) {
            if(!(this.nev.charAt(i) == ' ')){
                betuTomb[i] = this.nev.charAt(i);
            }
        }
        int index = 0;
        while(this.nev.charAt(index) != betuTomb.length){
            index++;
            System.out.println(betuTomb[index]+ ", ");
        }
    }
}
