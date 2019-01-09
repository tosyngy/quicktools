/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author Oginni
 */
public class SinRule {

    public static void main(String[] args) {
        int val = 45;
        double cos = Math.cos(val*Math.PI/180);
        // sin=Math.toDegrees(sin);
        cos = Math.round(cos * 1000) / 1000.0;
        double ans = 0.0, newans = 0.0;
        System.out.println("cos  =  " + cos);
        int i = 0;
        int old_even = 0;
        double oda_part=0;
        while (true) {            
        
           // oda_part = ((-1 * i) + 1) * (Math.pow(val, (2 * i) - 1)) / fact((2 * i) - 1);
        //    oda_part = Math.round(oda_part * 1000) / 1000.0;
            if (old_even%2 == 0) {
                ans += ((Math.pow(val, i) / fact(i)));
            } else {
                ans -= ((Math.pow(val, i) / fact(i)));
            }
              newans = Math.round(ans * 1000) / 1000.0;
            System.out.println("(" + val + "^" + i + ")/" + i + "! =" + newans);
            i += 2;
            if (newans == 0.707) {
                 break;
            } 
             ++old_even;  
             
        }
        
//        while (true) {
//            ++old_even;
//           // oda_part = ((-1 * i) + 1) * (Math.pow(val, (2 * i) - 1)) / fact((2 * i) - 1);
//            oda_part = Math.round(oda_part * 1000) / 1000.0;
//            if (old_even == 2) {
//                ans -= ((Math.pow(val, i) / fact(i)) + oda_part);
//                System.out.println("hrere");
//            } else {
//                ans += ((Math.pow(val, i) / fact(i)) + oda_part);
//            }
//            newans = Math.round(ans * 1000) / 1000.0;
//            System.out.println("(" + val + "^" + i + ")/" + i + "! =" + newans);
//            i += 2;
//            if (newans == 0.707) {
//                 break;
//            } else {
//                ans -= oda_part;
//                newans -=oda_part;
//            }
//        }
        System.out.println("cos" + val + "is " + newans);
//        System.out.println(fact(100));   
    }

    static double fact(int a) {
        double ans = 1.0;
        for (int i = 1; i <= a; i++) {
            ans *= i;
        }
        return ans;
    }
}
