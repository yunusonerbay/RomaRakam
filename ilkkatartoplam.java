package prototip1;
import java.util.Scanner;
public class ilkkatartoplam {
    private int toplam1 = 0;
    public ilkkatartoplam(){
        
    Scanner girdi = new Scanner(System.in);
     String ilkkatar ;
    System.out.println("Birinci Roma rakamını giriniz: "); ilkkatar=girdi.next();
            

     String newNumara = ilkkatar.replace("XL", "XXXX"); 
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
      
       if ( romanrakami == 'M'){toplam1+=1000; }
      
       if ( romanrakami == 'D'){toplam1+=500;}
      
       if ( romanrakami == 'C'){toplam1+=100; }

       if ( romanrakami == 'L'){ toplam1+=50; }

       if ( romanrakami == 'X'){toplam1+=10; }

       if ( romanrakami == 'V'){toplam1+=5; }

       if ( romanrakami== 'I'){toplam1+=1; }

     }
 
}
public Integer gettoplam(){
return toplam1;
}

}
