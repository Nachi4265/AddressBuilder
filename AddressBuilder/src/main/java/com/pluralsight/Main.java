package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     //This will help add each input into billing address as it's typed
     StringBuilder completeBillingAddress = new StringBuilder();

     //User inputs Full name
     //User inputs Billing Street
     //User inputs Billing City
     //User inputs Billing State
     //User inputs Billing ZipCode (will need Integer.parse)

        // User inputs Shipping Street
        //User inputs Shipping City
        //User inputs Shipping State
        //User inputs Shipping ZipCode (will need Integer.parse)

        //As the user adds the data it needs to be added together into one string.

        //Ask User for needed Information (Billing and Shipping)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Enter Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Enter Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip Code: ");
        String billingZipCode = scanner.nextLine();


        //(Shipping information)
        System.out.print("Enter Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Enter Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Enter Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Enter Shipping Zip Code: ");
        String shippingZipCode = scanner.nextLine();

        //Adding everything together using

        completeBillingAddress.append(fullName);
        completeBillingAddress.append(billingStreet);
        completeBillingAddress.append(billingCity);
        completeBillingAddress.append(billingState);
        completeBillingAddress.append(billingZipCode);

        completeBillingAddress.append(shippingStreet);
        completeBillingAddress.append(shippingCity);
        completeBillingAddress.append(shippingState);
        completeBillingAddress.append(shippingZipCode);

        //Next the complete Address Needs to be formatted.(might be easier if the string is split?)
        //Split the data into Billing portion and then Shipping portion


//        String[] billingAndShippingSplit = completeBillingAddress.split("");
//        String billingInfo = billingAndShippingSplit[0];
//        String shippingInfo = billingAndShippingSplit[1];


        System.out.println(completeBillingAddress);

    }
}