/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package testing;

/**
 *
 * @author Oginni
 */
public class Pi {
    public static void main(String[] args) {
        double pi=3.14159;
        double ans=0.0;
        System.out.println("pi "+pi);
        double i=1.0;
        int j=0;
        while(ans!=pi){
         ++j;   
       if(j%2==1){
       ans=ans+(4/i);
       }else{
       ans=ans-(4/i);
       }
        ans=(Math.round(ans*100000))/100000.0; 
            System.out.println("4/"+(int)i);
              System.out.println("      "+ans+"  count=  "+j);
               i=i+2;
         }
//        j=0;
//       ans=0.0;
//        for (double k = i; k < (5971*2); k+=2) {
//         ++j;
//          if(j%2==1){
//       ans=ans+(4/k);
//       }else{
//       ans=ans-(4/k);
//       }
//         ans=(Math.round(ans*100000))/100000.0; 
//            System.out.println("4/"+(int)k);
//              System.out.println("      "+ans+"  count=  "+j);
//               k=k+2;  
//          
//         
//        }
  
    }
}
