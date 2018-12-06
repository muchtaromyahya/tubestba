package tba;

public class Cek {
        char[] kata1=null;
        char[] kata2=null;
        char[] kata3=null;
        char[] kata4=null;
        boolean pindah=false;
    
    
    public boolean cekSubyek() {
        if (kata1[0]=='s') {
            if (kata1[1]=='a') {
                if (kata1[2]=='y') {
                    if (kata1[3]=='a') {
                        if (kata1.length==4) {
                            return true;
                        }
                    }
                }
            }
        } else if (kata1[0]=='d') {
            if (kata1[1]=='i') {
                if (kata1[2]=='a') {
                    if (kata1.length==3) {
                        return true;
                    }
                }
            }
        } else if (kata1[0]=='m') {
            if (kata1[1]=='e') {
                if (kata1[2]=='r') {
                    if (kata1[3]=='e') {
                        if (kata1[4]=='k'){
                            if (kata1[5]=='a'){
                                if (kata1.length==6) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        else if (kata1[0]=='f') {
            if (kata1[1]=='e') {
                if (kata1[2]=='r') {
                    if (kata1[3]=='g'){
                        if (kata1[4]=='u'){
                            if(kata1[5]=='s'){
                                if(kata1[6]=='o'){
                                    if (kata1.length==7) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else if (kata1[0]=='l') {
            if (kata1[1]=='i') {
                if (kata1[2]=='s') {
                    if (kata1[3]=='a') {
                        if (kata1.length==4) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean cekPredikat() {
        if (kata2[0]=='m') {
            if (kata2[1]=='e') {
                if (kata2[2]=='m') {
                    if (kata2[3]=='a') {
                        if (kata2[4]=='k') {
                            if (kata2[5]=='a') {
                                if (kata2[6]=='n') {
                                   if (kata2.length==7) { 
                                        return true;
                                    }
                                }
                            }
                        }
                    } 
                }  
           }
        }
        if (kata2[0]=='m') {
            if (kata2[1]=='e') {
                if (kata2[2]=='m') {
                    if (kata2[3]=='i') {
                        if (kata2[4]=='n') {
                            if (kata2[5]=='u') {
                                if (kata2[6]=='m') {
                                   if (kata2.length==7) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } 
                }  
           }
        }
         if (kata2[0]=='m') {
            if (kata2[1]=='e') {
                if (kata2[2]=='m') {
                    if (kata2[3]=='o') {
                        if (kata2[4]=='t') {
                            if (kata2[5]=='o') {
                                if (kata2[6]=='n') {
                                    if (kata2[7]=='g'){
                                        if (kata2.length==8) { 
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    } 
                }  
           }
        }
        if (kata2[0]=='m') {
            if (kata2[1]=='e') {
                if (kata2[2]=='n') {
                    if (kata2[3]=='g') {
                        if (kata2[4]=='e') {
                            if (kata2[5]=='j') {
                                if (kata2[6]=='a') {
                                    if (kata2[7]=='r'){
                                        if (kata2.length==8) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    } 
                }  
           }
        }
         if (kata2[0]=='m') {
            if (kata2[1]=='e') {
                if (kata2[2]=='n') {
                    if (kata2[3]=='a') {
                        if (kata2[4]=='n') {
                            if (kata2[5]=='g') {
                                if (kata2[6]=='k') {
                                    if (kata2[7]=='a'){
                                        if (kata2[8]=='p'){
                                            if (kata2.length==9) { 
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } 
                }  
           }
        }
        return false;
    }
    public boolean cekObjek() {
        //if (kata3 != null){
        if (kata3[0]=='a') {
            if (kata3[1]=='n') {
                if (kata3[2]=='g') {
                    if(kata3[3]=='g') {
                        if(kata3[4]=='u'){
                            if(kata3[5]=='r'){
                               if (kata3.length==6) { 
                                    return true;
                                } 
                            }
                        }
                    }
                }
            }
        } 
        if (kata3[0]=='k') {
            if (kata3[1]=='o') {
                if (kata3[2]=='p') {
                    if (kata3[3]=='i'){
                        if (kata3.length==4){
                            return true;
                        }
                    }
                }
            }
        }
        if (kata3[0]=='k') {
            if (kata3[1]=='u') {
                if (kata3[2]=='c') {
                    if (kata3[3]=='i') {
                        if (kata3[4]=='n') {
                            if (kata3[5]=='g') {
                                if (kata3.length==6) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (kata3[0]=='r') {
            if (kata3[1]=='a') {
                if (kata3[2]=='m') {
                    if (kata3[3]=='b') {
                        if (kata3[4]=='u') {
                            if (kata3[5]=='t') {
                                if (kata3.length==6) { 
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (kata3[0]=='a') {
            if (kata3[1]=='n') {
                if (kata3[2]=='j') {
                    if (kata3[3]=='i') {
                        if (kata3[4]=='n') {
                            if (kata3[5]=='g') {
                                if (kata3.length==6) { 
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (kata3[0]=='b') {
            if (kata3[1]=='u') {
                if (kata3[2]=='r') {
                    if (kata3[3]=='u') {
                        if (kata3[4]=='n') {
                            if (kata3[5]=='g') {
                                if (kata3.length==6) { 
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } 
     //}
     return false; 
    }
    public boolean cekKeterangan() {
        if (kata4 != null) {
            if (kata4[0]=='d') {
                if (kata4[1]=='i') {
                    if (kata4[2]=='m') {
                        if (kata4[3]=='e') {
                            if (kata4[4]=='j') {
                                if(kata4[5]=='a'){
                                       if (kata4.length==6) {
                                            return true;
                                        } 
                                }
                            }
                        }
                    }
                }
            }
            if (kata4[0]=='d') {
                if (kata4[1]=='i') {
                    if (kata4[2]=='d') {
                        if (kata4[3]=='a') {
                            if (kata4[4]=='p') {
                                if(kata4[5]=='u'){
                                    if (kata4[6]=='r'){
                                       if (kata4.length==7) {
                                            return true;
                                        } 
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (kata4[0]=='k') {
                if (kata4[1]=='e') {
                    if (kata4[2]=='m') {
                        if (kata4[3]=='a') {
                            if (kata4[4]=='r') {
                                if(kata4[5]=='i'){
                                    if (kata4[6]=='n'){
                                       if (kata4.length==7) {
                                            return true;
                                        } 
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (kata4[0]=='d') {
                if (kata4[1]=='i') {
                    if (kata4[2]=='k') {
                        if (kata4[3]=='a') {
                            if (kata4[4]=='m') {
                                if(kata4[5]=='a'){
                                    if (kata4[6]=='r'){
                                       if (kata4.length==7) {
                                            return true;
                                        } 
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (kata4[0]=='l') {
                if (kata4[1]=='u') {
                    if (kata4[2]=='s') {
                        if (kata4[3]=='a') {
                            if (kata4.length==4) {
                                return true;
                            }
                        }
                    }
                }
            } 
       
        }else if (kata4 == null){
         if (kata3[0]=='d') {
                if (kata3[0]=='d') {
                if (kata3[1]=='i') {
                    if (kata3[2]=='m') {
                        if (kata3[3]=='e') {
                            if (kata3[4]=='j') {
                                if(kata3[5]=='a'){
                                       if (kata3.length==6) {
                                            return true;
                                        } 
                                }
                            }
                        }
                    }
                }
            }
            if (kata3[0]=='d') {
                if (kata3[1]=='i') {
                    if (kata3[2]=='d') {
                        if (kata3[3]=='a') {
                            if (kata3[4]=='p') {
                                if(kata3[5]=='u'){
                                    if (kata3[6]=='r'){
                                       if (kata3.length==7) {
                                            return true;
                                        } 
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (kata3[0]=='k') {
                if (kata3[1]=='e') {
                    if (kata3[2]=='m') {
                        if (kata3[3]=='a') {
                            if (kata3[4]=='r') {
                                if(kata3[5]=='i'){
                                    if (kata3[6]=='n'){
                                       if (kata3.length==7) {
                                            return true;
                                        } 
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (kata3[0]=='d') {
                if (kata3[1]=='i') {
                    if (kata3[2]=='k') {
                        if (kata3[3]=='a') {
                            if (kata3[4]=='m') {
                                if(kata3[5]=='a'){
                                    if (kata3[6]=='r'){
                                       if (kata3.length==7) {
                                            return true;
                                        } 
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (kata3[0]=='l') {
                if (kata3[1]=='u') {
                    if (kata3[2]=='s') {
                        if (kata3[3]=='a') {
                            if (kata3.length==4) {
                                return true;
                            }
                        }
                    }
                }
                }
                                        
            
            
         }else if (kata3[0]=='k') {
                if (kata3[1]=='e') {
                    if (kata3[2]=='m') {
                        if (kata3[3]=='a') {
                            if (kata3[4]=='r') {
                                if(kata3[5]=='i'){
                                    if (kata3[6]=='n'){
                                       if (kata3.length==7) {
                                            return true;
                                        } 
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (kata3[0]=='l') {
                if (kata3[1]=='u') {
                    if (kata3[2]=='s') {
                        if (kata3[3]=='a') {
                            if (kata3.length==4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }   
     return false;
    }
    public void SplitKata(String Kalimat){
        String[] k= Kalimat.split(" ");
        boolean cSubyek=false;
        if (k.length==2) {
            kata1=k[0].toCharArray();
            kata2=k[1].toCharArray();
            pindah=true;
        }
        else if (k.length==4) {
            kata1=k[0].toCharArray();
            kata2=k[1].toCharArray();
            kata3=k[2].toCharArray();
            kata4=k[3].toCharArray();
            pindah=true;
        } 
        else if (k.length==3) {
            kata1=k[0].toCharArray();
            kata2=k[1].toCharArray();
            kata3=k[2].toCharArray();
            pindah=true;
        }
        else {
            pindah=false;
        }
    }
    public String cekKalimat(String kalimat) {
        boolean ck1=false;
        String i="KALIMAT YANG ANDA MASUKAN SALAH";
        SplitKata(kalimat);
        if (pindah) {
            if (cekSubyek()) {
                i="Subjek -";
                if (cekPredikat()) {
                    i+=" Predikat ";
                    if (kata3!=null) {
                        if (cekObjek()) {
                        i+="- Objek ";
                        if (cekKeterangan()) {
                            i+="- Keterangan";
                        }
                    } else if (cekKeterangan()) {
                        i+="- Keterangan";
                    }
                    }
                } else  {
                    i="KALIMAT YANG ANDA MASUKAN SALAH";
                }
            }
        }
       return i;
    }
}