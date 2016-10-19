
package largepalindrome;

import java.util.*;

/**
 *
 * @author mahesh imaduwa
 */
public class LargePalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int m, maxM,t,input;
        String num;
        ArrayList<Integer> n = new ArrayList<>();
          
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
         
        for(int a0 = 0; a0 < t; a0++){
           n.clear();
           input = sc.nextInt();
           int lb = input/(999+101);
            
          for(int i=lb;i<1000;i++){
              for(int j=999;j>i;j--){
                 m=i*j;
                 
                  if(m < input && String.valueOf(m).length()==6){
                     num = String.valueOf(m);
                     if(num.charAt(0)==num.charAt(5)&&
                        num.charAt(1)==num.charAt(4)&&
                        num.charAt(2)==num.charAt(3)
                        ){
                           n.add(m);
                             if(n.size()==2){
                                maxM=Math.max(n.get(0), n.get(1));
                                n.clear();
                                n.add(maxM);
                            }//end-of-3if
                       }// end of-2-if
                  }//end of1-if
              }//end of 2-for
           }//end of 1-for
           System.out.println(n.get(0));
      }
    }
    
}
