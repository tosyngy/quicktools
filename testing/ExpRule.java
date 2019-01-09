/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author Oginni
 */
public class ExpRule {
    public static void main(String[] args) {
        int val=20;
       double exp= Math.exp(val);
       exp=Math.round(exp*100000)/100000.0;
        double ans=0.0,newans=0.0;
        System.out.println("exp  +"+ exp);
        int i=0;
       while(newans!=exp){
        ans+=Math.pow(val, i)/fact(i);
        newans=Math.round(ans*100000)/100000.0;
         System.out.println("("+val+"^"+i+")/"+i+"!");
         i++;  
        }
        System.out.println("exp^"+val+"is "+newans); 
//        System.out.println(fact(100));   
    }
    static double fact(int a){
        double ans=1.0;
    for(int i=1;i<=a;i++){
    ans *=i;
    }
     return ans;
    }
}
