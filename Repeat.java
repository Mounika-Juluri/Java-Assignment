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
 * Class accepts 2 inputs,a string and an integer,num from the user and repeats
 * the last num characters of the string num number of times
 * @version 11.0.1 2018-10-16
 * @author Mounika Juluri
 */


public class Repeat{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the word");
        String word=input.nextLine();
        System.out.println("enter the number");
        String repeat="";
        int num=input.nextInt();
        int length=word.length();
        for (int i=length-num;i<length;i++){
            repeat=repeat+word.charAt(i);
        }
        for (int i=0;i<num;i++){
            word=word+repeat;
        }
        System.out.println(word);
    }
}
