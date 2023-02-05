/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author sario
 */

public class test {
    
    public static void menu() {
        System.out.println("Yapmak istediÄŸiniz iÅŸlem iÃ§in numara giriniz.");
        System.out.printf("Dosyadan okuyarak customer nesnesi eklemek iÃ§in 1\nKlavye girdisi ile customer nesnesi oluÅŸturmak iÃ§in 2\nAdÄ±nÄ± girdiÄŸiniz bir customer nesnesini gÃ¶rÃ¼ntÃ¼lemek iÃ§in 3\nAdÄ±nÄ± girdiÄŸiniz bir customer nesnesini silmek iÃ§in 4\nCustomer listesini A'dan Z'ye yazdÄ±rmak iÃ§in 5\nCustomer listesini Z'den A'ya yazdÄ±rmak iÃ§in 6\nÃ‡Ä±kÄ±ÅŸ yapmak iÃ§in 7");
        System.out.println();
    }
    
    public static CustomerInfo takeCustomerInfo(String info) {
        String[] infos = info.split(",");
        String name = infos[0];
        String address = infos[1];
        ArrayList telNo = new ArrayList();
        for (int i = 2; i < infos.length; i++) {
            telNo.add(infos[i]);
        }    
        CustomerInfo c = new CustomerInfo(name,address,telNo);
        return c;
    }
    
    public static void main(String[] args) {
        
        DoublyLinkedList customerList = new DoublyLinkedList();
        
        menu();
        Scanner keyboard = new Scanner(System.in);
        String number = keyboard.nextLine();
        
        while (!"7".equals(number)) {

            if ("1".equals(number)) {
                String dosya = "customer.txt";
                Scanner fileIn = null;
                try {
                    fileIn = new Scanner(new FileInputStream(dosya));
                } catch (FileNotFoundException e) {
                    System.out.print("Dosya okunamadÄ±.");
                    System.exit(0);
                }
                while (fileIn.hasNext()) {
                    String info = fileIn.nextLine();
                    customerList.addBySurname(takeCustomerInfo(info));
                }
                fileIn.close();
                System.out.println("Yapmak istediÄŸiniz iÅŸlem iÃ§in numara giriniz.");
                number = keyboard.nextLine();
            }
            else if ("2".equals(number)) {
                String info = keyboard.nextLine();
                customerList.addBySurname(takeCustomerInfo(info));
                System.out.println("Yapmak istediÄŸiniz iÅŸlem iÃ§in numara giriniz.");
                number = keyboard.nextLine();
            }
            else if ("3".equals(number)) {
                customerList.find(keyboard.nextLine());
                System.out.println("Yapmak istediÄŸiniz iÅŸlem iÃ§in numara giriniz.");
                number = keyboard.nextLine();
            }
            else if ("4".equals(number)) {
                customerList.remove(keyboard.nextLine());
                System.out.println("Yapmak istediÄŸiniz iÅŸlem iÃ§in numara giriniz.");
                number = keyboard.nextLine();
            }
            else if ("5".equals(number)) {
                customerList.printAToZ();
                System.out.println("Yapmak istediÄŸiniz iÅŸlem iÃ§in numara giriniz.");
                number = keyboard.nextLine();
            }
            else if ("6".equals(number)) {
                customerList.printZToA();
                System.out.println("Yapmak istediÄŸiniz iÅŸlem iÃ§in numara giriniz.");
                number = keyboard.nextLine();
            }

            }
             
        if ("7".equals(number)) {
            System.exit(0);
        }   
    
    }
}
