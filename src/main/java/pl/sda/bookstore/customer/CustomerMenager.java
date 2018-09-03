package pl.sda.bookstore.customer;

import java.util.Scanner;

public class CustomerMenager {

    public static Customer createCustomer(Scanner scaner){
        System.out.println("Wybierz: ");
        System.out.println("1. Użytkownik prywatny");
        System.out.println("2. Firma");

        int options = scaner.nextInt();
        scaner.nextLine();

        if (options ==1){
            System.out.println("Proszę podaj imię: ");
            String name = scaner.nextLine();
            System.out.println("Proszę podaj nazwisko: ");
            String surname = scaner.nextLine();
            System.out.println("Proszę podaj adres: ");
            String address = scaner.nextLine();

            return new User(name, address,surname);

        }
        else if (options ==2){
            System.out.println("Proszę podaj nazwę firmy");
            String companyName = scaner.nextLine();
            System.out.println("Proszę podaj NIP firmy: ");
            String taxCode = scaner.nextLine();
            System.out.println("Proszę podaj adres firmy");
            String address = scaner.nextLine();

            return  new Company(companyName, taxCode, address);
        } else {
            System.out.println("Brak Ci piątej klepki!");
            return null;
        }

    }
}
