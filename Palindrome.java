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
 * Class accepts a number as input and check whether the given number
 * is palindrome and if number is not palindrome it adds all even numbers
 * and checks if sum is greater than 25
 * @version 11.0.1 2018-10-16
 * @author Mounika Juluri
 */

public class Palindrome {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        int number;
        int rev=0;
        int pal=0;
        int sum=0;
        number=num;
        while (number>0){
            rev=number%10;
           if (rev%2==0){                               //checks if the digit is even
                sum=sum+rev;                            //adds even digits
           }
            number = number / 10;
            pal=pal*10+rev;
        }
        System.out.println(pal);
       if (num==pal) {
            if (sum > 25) {
                System.out.println(num + "  is a palindrome and sum of even numbers is greater than 25");
            } else {
                System.out.println(num + "  is  palindrome and sum of even numbers is greater than 25");
            }
       } else{
            System.out.println(num + "  is not palindrome");

       }

    }
}
