/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher;

/**
 *
 * @author Nkazimulo Ntombela
 */
public class CaesarCipher {

 public static String encrypt(String plainText, int shift) //encryption method
   {
     if(shift > 26)
     {
         shift = shift%26; } 
     else if (shift <0)
     {
         shift = (shift%26) + 26; }
     
      String cipherText =" ";
     int length = plainText.length(); //
     for(int i=0; i< length; i++)
     {
     char ch = plainText.charAt(i);
     if(Character.isLetter(ch)) //Checks if character is a letter in the english alphabet
     {
         if(Character.isLowerCase(ch))  //Checks if character is in lower case
         {char c = (char)(ch+shift);
         if(c > 'z')
         {cipherText +=(char)(ch-(26-shift));
                }
         else
         {cipherText+= c;
         }
          }
         
         else if (Character.isUpperCase(ch)) //Checks if character is in upper case
         {
         char c = (char)(ch+shift);
         if(c > 'Z')
         {cipherText +=(char)(ch-(26-shift));
                }
         else
         {cipherText+= c;
         }
     }
     else
     {cipherText += ch;}
     }
     }
     return cipherText;}
    public static String decrypt(String plainText, int shift) //Decryption method
   {
     if(shift > 26)
     {
         shift = shift%26; } 
     else if (shift <0)
     {
         shift = (shift%26) + 26; }
     
      String cipherText =" ";
     int length = plainText.length();
     for(int i=0; i< length; i++)
     {
     char ch = plainText.charAt(i);
     if(Character.isLetter(ch)) ////Checks if character is a letter in the english alphabet
     {
         if(Character.isLowerCase(ch)) //Checks if character is in lower case
         {char c = (char)(ch-shift);
         if(c < 'a')
         {cipherText += (char)(ch+(26-shift));
                }
         else
         {cipherText+= c;
         }
          }
         
         else if (Character.isUpperCase(ch)) // Checks if character is in upper case
         {
         char c = (char)(ch-shift);
         if(c < 'A')
         {cipherText += (char)(ch+(26-shift));
                }
         else
         {cipherText+= c;
         }
     }
     else
     {cipherText += ch;}
     }
     }
     return cipherText;} // returns the cipher text
    
   
    public static void main(String[] args) {
        String text = "pneumonoultramicroscopicsilicovolcanoconiosis"; // String data is stored to be encrypted and decrypted
        String cipher = encrypt(text,10); // Encryption starts with a shift of 10
        System.out.println(cipher); // encrypted text is printed
        
        String decrpyt = decrypt(cipher,10); //Decryption starts with a shift of 10
        System.out.println(decrpyt); //decrypted text is printed
        
        char c=((text).charAt(0));
         //Changing Value to UpperCase for uniformity.

        
            
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            
            
            switch(c) // check for vowel
        {
        case 'A':
        count++;
        break;
        case 'E':
        count++; 
        break;
        case 'I':
        count++; 
        break;
        case 'O':
        count++;
        break;
        case 'U': 
        count++;
        break;

        default:count = count; // returns consonant
        }
            
        }
         
        System.out.println("Vowel count:" + count);
        
    }
    
}
