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
 * Class accepts an integer number as input from the user and checks if
 * the number is even or odd and exists between 20 and 30 and prints the
 * corresponding messages
 * @version 11.0.1 2018-10-16
 * @author Mounika Juluri
 */

public class Evenodd{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        if (20<num & num<30) {                            //checks if number is inside the limits
           if (num % 2 == 0) {                            //checks if number is even or add
               System.out.println("Tom");
           } else {
               System.out.println("Jerry");
           }

        }

    }
}
