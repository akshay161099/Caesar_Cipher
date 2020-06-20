
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;

public class CaesarCipher {
    public String encrypt(String input, int key)
    {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shifted = alpha.substring(key) + alpha.substring(0,key);
        int id;
        StringBuilder sr = new StringBuilder(input);
        
        for(int i = 0;i<sr.length();i++)
        {   
         
            if(Character.isUpperCase(sr.charAt(i)))
            {
               if(alpha.indexOf(sr.charAt(i)) !=-1)
            {
                id = alpha.indexOf(sr.charAt(i));
                sr.setCharAt(i,Character.toUpperCase(shifted.charAt(id)));
            }
        }
            else if(Character.isLowerCase(sr.charAt(i)))
            {   
                Character.toUpperCase(sr.charAt(i));
                if(alpha.indexOf(Character.toUpperCase(sr.charAt(i))) != -1)
                {
                    id = alpha.indexOf(Character.toUpperCase(sr.charAt(i)));
                    sr.setCharAt(i,Character.toLowerCase(shifted.charAt(id)));
                }
            }
            
            
        }
        return sr.toString();
    }
    
    public void testCaesar()
    {
        //FileResource fr = new FileResource();
        //String message = fr.asString();
        String message = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
        int key = 15;
        String encrypted = encrypt(message, key);
        System.out.println("Key is : "+ key + "\n" + "encrypted : "+ encrypted);
        
        
    }

}
