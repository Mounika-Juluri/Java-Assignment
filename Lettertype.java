/*
 * %W% %E% Mounika Juluri
 *
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package main.java.Pe1;
import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

/**
 * Class accepts a word as input and checks for each single character
 * letter in the word whether it is a consonant or vowel.
 * @version 11.0.1 2018-10-16
 * @author Mounika Juluri
 */

public class Lettertype {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter word");
        String s=input.nextLine();
        for ( int i=0;i<s.length();i++){

            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') ||
                    (s.charAt(i) == 'i') || (s.charAt(i) == 'o') ||         //checks if letter is vowel
                    (s.charAt(i) == 'u')) {
                System.out.print("vowel ");
            } else if (Character.isDigit(s.charAt(i))){
                System.out.print("not a letter  ");

            } else {
                System.out.print("Consonant ");
            }
        }
    }
}
