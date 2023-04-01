/*
    A
    B B
   C C C
  D D D D
 E E E E E
 */
class Pattern13 {
public static void main(String args[]){
  for(char i=65;i<=69;i++)
		 {
             for(char j=69;j>=i;j--)
			 {
				 System.out.print(" "); 
			 }
			 for(char k=65;k<=i;k++)
			 {  
				 System.out.print(i+" ");
			 }
             System.out.println();
		 }
    }
}