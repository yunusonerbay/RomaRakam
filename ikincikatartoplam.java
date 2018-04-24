package prototip1;
import java.util.Scanner;
public class ikincikatartoplam {
    private int toplam2 = 0;
     public ikincikatartoplam(){
        
    Scanner girdi = new Scanner(System.in);
    String ikincikatar ;
    System.out.println("İkinci Roma rakamını giriniz: "); ikincikatar=girdi.next();
            

     String newNumara = ikincikatar.replace("XL", "XXXX"); 
     String newNumara2 = newNumara.replace("XC", "LXXXX");
     String newNumara3 = newNumara2.replace("CD", "CCCC"); 
     String newNumara4 = newNumara3.replace("CM", "DCCCC");
     String newNumara5 = newNumara4.replace("IV", "IIII"); 
     String newNumara6 = newNumara5.replace("IX", "VIIII");

    

     char romanrakami = 0; 
     int length = newNumara6.length();
    for (int n = 0; n< length; n++)

     {
        romanrakami = newNumara6.charAt(n);
      
       if ( romanrakami == 'M'){toplam2+=1000; }
      
       if ( romanrakami == 'D'){toplam2+=500;}
      
       if ( romanrakami == 'C'){toplam2+=100; }

       if ( romanrakami == 'L'){ toplam2+=50; }

       if ( romanrakami == 'X'){toplam2+=10; }

       if ( romanrakami == 'V'){toplam2+=5; }

       if ( romanrakami== 'I'){toplam2+=1; }

     }
 
}
  public Integer gettoplam(){
return toplam2;
}  
}
