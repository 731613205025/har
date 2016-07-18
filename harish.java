/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aswin;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class harish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
          Scanner s=new Scanner (System.in);
        String a=s.nextLine();
         char b=a.charAt(b=0);
        
        
        // TODO code application logic here
        if(b=='a'||b=='i'||b=='o'||b=='u'||b=='e')
            System.out.println("vowel");
        else
            System.out.println("consonant");
    }
}
