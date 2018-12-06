package tba;

import java.util.ArrayList;

public class InputKata {
    ArrayList<String> subjek = new ArrayList<>();
    ArrayList<String> kata = new ArrayList<>();
    ArrayList<String> obyek = new ArrayList<>();
    ArrayList<String> predikat = new ArrayList<>();
    ArrayList<String> keterangan = new ArrayList<>();
    
    public void addSubjek(){
        obyek.add("saya");
        obyek.add("dia");
        obyek.add("mereka");
        obyek.add("ferguso");
        obyek.add("lisa");
    }
    
    public void addPredikat(){
        predikat.add("memakan");
        predikat.add("meminum");
        predikat.add("memotong");
        predikat.add("mengejar");
        predikat.add("menangkap");
    }
    
    public void addObjek(){
        subjek.add("anggur");
        subjek.add("kopi");
        subjek.add("rambut");
        subjek.add("anjing");
        subjek.add("burung");
    }
    
    public void addKeterangan(){
        keterangan.add("dimeja");
        keterangan.add("didapur");
        keterangan.add("dikamar");
        keterangan.add("kemarin");
        keterangan.add("lusa");
    }
}
