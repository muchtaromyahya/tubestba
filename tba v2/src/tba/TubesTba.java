package tba;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TubesTba {
    public static void main(String[] args) {
        InputKata V = new InputKata();
        Cek p = new Cek();
        V.addSubjek();
        V.addPredikat();
        V.addObjek();
        V.addKeterangan();
        
        Cek cek = new Cek();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kalimat : ");
        String s = sc.nextLine();
        //p.cekKalimat(s,k);
        //p.SplitKata(s);
        p.SplitKata(s);
        sc.close();
        
    }
}