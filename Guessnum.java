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
 * Class  accepts a number from user as input within a limit and appropriate
 * messages are displayed till the user guesses target number correctly
 * @version 11.0.1 2018-10-16
 * @author Mounika Juluri
 */

public class Guessnum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int target=68;
        System.out.println("Enter the number between 1 to 100");
        int num=input.nextInt();
        while (num!=target){
            if (num>target){
                System.out.println("Number guessed is more than original number");
                System.out.println("guess again:");
                num=input.nextInt();
            } else {
                System.out.println("Number guessed is less than original number");
                System.out.println("guess again:");
                num=input.nextInt();
            }
        }
        System.out.println("Number guessed matches original number");
    }
}
