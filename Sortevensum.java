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
 * Class accepts an integer number as input from the user and sorts the
 * number in increasing order of digits and adds them
 * @version 11.0.1 2018-10-16
 * @author Mounika Juluri
 */
public class Sortevensum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int number=input.nextInt();
        int sorted = 0;
        int digits = 10;
        int sum=0;
        int sortedDigits = 1;
        boolean first = true;

        while (number > 0) {
            int digit = number % 10;
            if (digit%2==0){
                sum=sum+digit;
            }

            if (!first) {

                int tmp = sorted;
                int toDivide = 1;
                for (int i = 0; i < sortedDigits; i++) {
                    int tmpDigit = tmp % 10;
                    if (digit >= tmpDigit) {
                        sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                        break;
                    } else if (i == sortedDigits-1) {
                        sorted = digit * digits + sorted;
                    }
                    tmp /= 10;
                    toDivide *= 10;
                }
                digits *= 10;
                sortedDigits += 1;
            } else {
                sorted = digit;
            }
            first = false;
            number = number / 10;
        }
        System.out.println(sorted);
        System.out.println("sum of even numbers="+sum);
        if (sum>15){
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }
}
