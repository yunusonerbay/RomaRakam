package prototip1;
import java.util.*;
public class Prototip1 {

    
    public static void main(String[] args) {
         ilkkatartoplam a = new ilkkatartoplam();
         ikincikatartoplam b = new ikincikatartoplam(); 
         int ilktoplam=a.gettoplam();
         int ikincitoplam=b.gettoplam();
         int geneltoplam=ilktoplam+ikincitoplam;
         
         int abir=0,aon=0,ayuz=0,abin=0;
         String romaSayi="";
       

if(geneltoplam<3000){
    abin=geneltoplam/1000;

    for(int i=0;i<abin;i++){
        romaSayi=romaSayi+"M";
    }
 
    geneltoplam=geneltoplam-(abin*1000);
}

if(geneltoplam<1000){
ayuz=geneltoplam/100;
if(ayuz>=5){
        if(ayuz==5){
            romaSayi=romaSayi+"D";
        }
        else if(ayuz==9){
            romaSayi=romaSayi+"CM";
        }
        else{
            romaSayi=romaSayi+"D";
            for(int i=0;i<ayuz-5;i++){
                romaSayi=romaSayi+"C";
            }
        }
    }
    if(ayuz<=4){
        if(ayuz==4){
            romaSayi=romaSayi+"CD";

        }
        else{

        for(int i=0;i<ayuz;i++){

            romaSayi=romaSayi+"C";
        }
        }
    }

geneltoplam=geneltoplam-(ayuz*100);
}

    if(geneltoplam<100){
        abir=geneltoplam%10;
        aon=geneltoplam/10;

    if(aon>=5){
        if(aon==5){
            romaSayi=romaSayi+"L";
        }
        else if(aon==9){
            romaSayi=romaSayi+"XC";
        }
        else{
            romaSayi=romaSayi+"L";
            for(int i=0;i<aon-5;i++){
                romaSayi=romaSayi+"X";
            }
        }
    }
    if(aon<=4){
        if(aon==4){
            romaSayi=romaSayi+"XL";

        }
        else{

        for(int i=0;i<aon;i++){

            romaSayi=romaSayi+"X";
        }
        }
    }

    if(abir>=5){
        if(abir==5){
            romaSayi=romaSayi+"V";
        }
        else if(abir==9){
            romaSayi=romaSayi+"IX";
        }
        else{
            romaSayi=romaSayi+"V";
            for(int i=0;i<abir-5;i++){
                romaSayi=romaSayi+"I";
            }
        }
    }
    if(abir<=4){
        if(abir==4){
            romaSayi=romaSayi+"IV";

        }
        else{

        for(int i=0;i<abir;i++){

            romaSayi=romaSayi+"I";
        }
        }
    }

    }
    System.out.println("Girdiginiz sayinin Roma rakami karsiligi:\n"+romaSayi);}
    
}
