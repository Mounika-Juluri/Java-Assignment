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
 * Class reads an unspecified number of integer arguments as input and
 * prints the sum of all the numbers
 * @version 11.0.1 2018-10-16
 * @author Mounika Juluri
 */

public class Unspecifiedsum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sum=0;
        System.out.println("enter numbers");
        while(input.hasNextInt()){
            int num = input.nextInt();                     // accepts integers as input
            sum=sum+num;                                   // adds numbers
        }
        System.out.println("not an integer");
        System.out.println("sum of numbers:"+sum);
    }
}
