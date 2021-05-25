/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123190031_kuis;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, email, phoneNumber, search, menu;
        do{
            
        ContactsManager ContactsManager = new ContactsManager();
        
        name = "Arif";
        phoneNumber = "085232435000";
        email = "arif@gmail.com";
        Contact contact1 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact1);
   
        name = "wiwi"; 
        phoneNumber = "085872270000";
        email = "wiwi@outlook.co.id";
        Contact contact2 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact2);

        name = "annas";
        phoneNumber = "08124867339";
        email = "annas@yahoo.co.id";
        Contact contact3 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact3);
        
        name = "hanan";
        phoneNumber = "08124867339";
        email = "hanan@yahoo.co.id";
        Contact contact4 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact4);
        
        name = "agung";
        phoneNumber = "08124867339";
        email = "agung@yahoo.co.id";
        Contact contact5 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact5);
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Search Name : "); search = input.nextLine();
        System.out.println("Looking for " + search + "'s contact . . .");

        Contact result = ContactsManager.searchContact(search.toLowerCase());
            if(result != null){
                System.out.println("Name        : " + result.getName());
                System.out.println("Phone Number: " + result.getPhoneNumber());
                System.out.println("E-mail      : " + result.getEmail());
            }else{
                System.out.println("Contact not found!");
            } 
            
            System.out.println("Again? (y/n) : ");  menu = input.nextLine();
            if("n".equals(menu)){
                System.exit(0);
            }
        } while (true);
    } 
}
