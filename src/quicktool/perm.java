package ade;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author tosyngy
 */
public class perm {
Vector<String> chkwords= new Vector<>();


     perm(){
      String scrab=   JOptionPane.showInputDialog("Enter your letter conbinations");
      if(scrab.isEmpty()){
      return;
      }
       String rlen=   JOptionPane.showInputDialog("Enter the length of word expected");
      int len=Integer.parseInt(rlen);
        start(scrab,len);
    }
    
  static void getwords(String word, int rlen) {
    String con =word;
      Vector<String> getwords= new Vector<>();
      Vector<String> newwords= new Vector<>();
      
      getwords=permutationFinder(con);
         if(getwords.elementAt(0).length() == rlen || rlen==0){
            
            System.out.println(" \nthe total possible ways to permutate " + con + "=" + getwords.size());
           for (int i=0;i<getwords.size();i++){
                if(!newwords.contains( getwords.elementAt(i))){
                        newwords.addElement(getwords.elementAt(i) );
                     //   if(getwords.elementAt(i).contains("i")){
                         System.out.println((i+1) +"   "+ getwords.elementAt(i) );
                    //    }
         
      }
         } 
          }
    
  

  }


  public static void main(String[] args) {
        new perm();
        
  }

  public static Vector<String> permutationFinder(String str) {
    Vector<String> perm = new Vector<String>(); //Handling error scenarios
    if (str == null) {
      return null;
    } else if (str.length() == 0) {
      perm.add("");
      return perm;
    }
    char initial = str.charAt(0); // first character
    String rem = str.substring(1); // Full string without first character
    Vector<String> words = permutationFinder(rem);
    for (String strNew : words) {
      for (int i = 0; i <= strNew.length(); i++) {
        perm.add(charInsert(strNew, initial, i));
      }
    }
    return perm;
  }

  public static String charInsert(String str, char c, int j) {
    String begin = str.substring(0, j);
    String end = str.substring(j);
    return begin + c + end;
  }

  
   private StringBuilder output = new StringBuilder();
    private  String inputstring;
    void Combinations( final String str ){
        inputstring = str;
        System.out.println("The input string  is  : " + inputstring);
    }
    
    
    public void start (String con, int rlen)
    {
         Combinations(con);
       combine(rlen);
    }
    
    public void combine(int rlen) { combine( 0,rlen); }
    private void combine(int start,int rlen ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
           if ( i < inputstring.length() ){
             String chk=output.toString(); 
               if(!chkwords.contains(chk)){
                    chkwords.addElement(chk);
            getwords(chk,rlen);
            combine( i + 1,rlen);
            }
             
            }
            output.setLength( output.length() - 1 );
        }
    }
  
}
