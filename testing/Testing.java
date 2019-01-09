import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
     String all[];   
     String mal[];   
     String ebo[];   
     String typ[];   
     String ane[];
     double ma=0.0,ty=0.0,eb=0.0,an=0.0;
     int ans[];
     Scanner get= new Scanner(System.in);
     all= new String[]{"Fever","Headache","Joint & muscle ache","Chills","Weakness","Nausea & vomiting","Diarrhea","Red eye",
     "Raised rash","Chest Pain and Cough","Stomach Pain","Weight lost","Bleeding","Internal bleeding","Tiredness",
     "Lethorgy(Having little energy)","Feeling Faint","Easily Breathless", "Altered taste","Thumping Heart",
     "Tinmtus (Ringing in The hear)","Sweat","High temperature","Feeling sick","Lost of appetite","Constipution"};
     mal= new String[]{"Fever","Chills","Headache","Sweat","Tiredness","Nausea & vomiting"};
     ane= new String[]{"Tiredness","Lethorgy(Having little energy)","Feeling Faint","Easily Breathless"
             ,"Altered taste","Thumping Heart","Tinmtus (Ringing in The hear)"};
     ebo= new String[]{"Fever","Headache","Joint & muscle ache","Chills","Weakness","Nausea & vomiting","Diarrhea","Red eye",
     "Raised rash","Chest Pain and Cough","Stomach Pain","Weight lost","Bleeding","Internal bleeding",};
     typ= new String[]{"High temperature","Headache","Sweat","Tiredness","Nausea & vomiting","Joint & muscle ache",
     "Stomach Pain","Feeling sick","Lost of appetite","Constipution","Raised rash"};
     ans= new int[all.length]; 
     for(int i=0;i<all.length;i++){
         System.out.println("Are you Experience "+all[i]);
         System.out.println("1. Yes                No. 2");
         char a=get.next().charAt(0);
        if(a=='1'){
        ans[i]=1;
        }else{
        ans[i]=0;
        } 
     }
      for(int i=0;i<ans.length;i++){
        if( ans[i]==1){
            for(int j=0;j<mal.length;j++){
            if(mal[j].equalsIgnoreCase(all[i])){
                    ma+=1.0;
                break;
              }
            }
            for(int j=0;j<typ.length;j++){
            if(typ[j].equalsIgnoreCase(all[i])){
                    ty+=1.0;
                break;
              }
            }
            for(int j=0;j<ebo.length;j++){
            if(ebo[j].equalsIgnoreCase(all[i])){
                    eb+=1.0;
                break;
              }
            }
            for(int j=0;j<ane.length;j++){
            if(ane[j].equalsIgnoreCase(all[i])){
                    an+=1.0;
                break;
              }
            }
        } 
     }
//      ma/=mal.length;
//      ty/=typ.length;
//      an/=ane.length;
//      eb/=ebo.length;
        System.out.println("mal"+ma+"typ"+ty+"ane"+an+"ebo"+eb);
      
      if((ma>=ty)&&(ma>=an)&&(ma>=eb)){
          System.out.println("You are most likely to be suffering from Malaria");
      }
      if((ty>=ma)&&(ty>=an)&&(ty>=eb)){
          System.out.println("You are most likely to be suffering from Typhoid");
      }
      if((an>=ty)&&(an>=ma)&&(an>=eb)){
          System.out.println("You are most likely to be suffering from Anaiemia");
      }
      if((eb>=ty)&&(eb>=an)&&(eb>=ma)){
          System.out.println("You are most likely to be suffering from Ebola");
      }
 
    }
}
