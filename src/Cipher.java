/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shmaelalwafi
 */
import java.util.Scanner;
public class Cipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner x = new Scanner(System.in);
        
                int  choise ;
        
          do{
              
        System.out.println("Select the op: \n 1.Encryption \n 2.Decryption \n 3.Exit");
             
        System.out.println("Your choice :");
           choise = x.nextInt() ;
        
           switch(choise){
//***********************************************************************
            
         case 1: 

        System.out.println("Enter a String: "); 
             String sl= x.nextLine();
              String str = x.nextLine();
        System.out.println("Enter number of shift: ");
              int num = x.nextInt();
        
        System.out.println("The cipher text is:"+encoder(str,num));
         break;
         
//***********************************************************************        
       
         case 2:
          
        System.out.println("Enter a String:");
            String sl1= x.nextLine();
            String str1 = x.nextLine();
            
        System.out.println("Enter number of shift: "); 
            int num1 = x.nextInt();
       
        System.out.println("The Plain text is:"+decoder(str1,num1));
         break;
         
//***********************************************************************         
     
         case 3 : 
            break;
            
//***********************************************************************        
        }
          }while( choise != 3) ;
           }
    
//***********************************************************************
/*
    encoder(a , shift)
    initialize word
    length = length(a)
    For i = 0 to length -1 
    SET c = a.chatAt(a)
    if ( c == 'Z'|| c == 'z')
    SET ch = ((c - 26)+shift)
    word = word+ ch
    Else 
    ch = (c + shift)
    word = word + ch
    PRINT word
    */
    
  /*method takes the plaintext and a number from the user , the number represents how many letters the cipher letter is far from original letter 
the method should generate a cipher text for the plaintext by substituting each letter with letter following it by the specified number.  */
    
    public static String encoder(String a , int shift){ 


            String word = " " ;
            
       for (int i = 0; i < a.length(); i++){
    
              char c = a.charAt(i);

       if ( c == 'Z'|| c == 'z') {
               
             char ch = (char)(((int)(c - 26)+shift)); // convert int to char and search for a specific letter 
               
                 word += ch;
    
    }
    else 
        
    {
           char ch = (char)(((int)(c +shift))); // convert int to char and search for a specific letter
             
                word += ch;    
       
       }
    }
       
    return word;  // ruturn string after encrypts
}
//***********************************************************************
  
/*method takes the plaintext and a number from the user , the number represents how many letters the cipher letter is far from original letter 
the method should generate the original plaintext for a given cipher text by substituting each letter with letter preceding it by the specified number.  */    
   public static String decoder(String a , int shift){

            String word = " " ;
            
       for (int i = 0; i < a.length(); i++){
    
            char c = a.charAt(i);

       if ( c == 'Z'|| c == 'z') {
               
           char ch = (char)(((int)(c - 26)+shift)); // convert int to char and search for a specific letter
            
                word += ch;
    
    }
    else 
        
    {
           char ch = (char)(((int)c - shift)); // convert int to char and search for a specific letter
             
               word += ch;
       }
    }
       
    return word;
}
        
        
        
        
        
    
    
}
