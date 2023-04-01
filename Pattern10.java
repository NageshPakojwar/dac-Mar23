  /* E
    D E
   C D E
  B C D E
 A B C D E
 */
class Pattern10{
public static void main(String args[]){
  for(char i=69;i>=65;i--)
		 {   
	         for(char j=65 ; j<=i ;j++){
				 System.out.print(" ");
			 }
             for(char k=i;k<=69;k++)
			 {
				 System.out.print(k+ " ");
				  
			 }
     System.out.println();
		 }
}
}