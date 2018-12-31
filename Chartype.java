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
/**
 * Class takes a character from the user as input and determines whether
 * the character entered is a capital letter, a small case letter, a digit
 * or a special symbol and displays appropriately
 * @version 11.0.1 2018-10-16
 * @author Mounika Juluri
 */

public class Chartype {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a character");
        char ch=input.next().charAt(0);
        int ascii=+(int)ch;                                        //checks the ascii values of character
        if (64<ascii & ascii<91){
            System.out.println("Capital Letter");
        }
        if (96<ascii & ascii<123){
            System.out.println("Small Letter");
        }
        if (47<ascii & ascii<58){
            System.out.println("digit");
        }
        if (32<ascii & ascii<48) {
            System.out.println("special character");
        }
    }
}
