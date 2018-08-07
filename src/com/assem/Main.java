package com.assem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your income: ");
        double income=scanner.nextDouble();

        System.out.println("Enter your status, S(single) or M(married): ");

        String input=scanner.next();


        int status=0;
        if(input.equalsIgnoreCase("s")){
            status=1;
        }
        else  if(input.equalsIgnoreCase("m")){
            status=2;
        }
        else{
            System.out.println("bad input");
        }

        TaxReturn taxReturn=new TaxReturn(income,status);

        System.out.println("The tax is "+taxReturn.getTax());




    }
}
