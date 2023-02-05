/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sario
 */
public class DoublyLinkedList {
    
    private Node head;
    private Node tail;
    
    public DoublyLinkedList() {
        head = tail = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public String nameSelecting(String info) {
        String name = "";
        String[] names = info.split("\\s");
        for (int i=0; i<names.length-1; i++)
            name += names[i].substring(0,1).toUpperCase() + names[i].substring(1);
        return name;
    }
    
    public String surnameSelecting(String info) {
        String surname = null;
        String[] names = info.split("\\s");
        surname = names[names.length-1].substring(0,1).toUpperCase() + names[names.length-1].substring(1);
        return surname;
    }
    
    public void addBySurname(CustomerInfo newc) {
        Node newNode = new Node(newc);
        if (isEmpty()) {
            head = tail = newNode;
        }
        else if (head == tail) {
            if (surnameSelecting(newNode.data.getName()).compareTo(surnameSelecting(head.data.getName())) < 0) {
                newNode.next = head;
                head = head.previous = newNode;
            }
            else if (surnameSelecting(newNode.data.getName()).compareTo(surnameSelecting(head.data.getName())) == 0) {
                if (nameSelecting(newNode.data.getName()).compareTo(nameSelecting(head.data.getName())) < 0) {
                    newNode.next = head;
                    head = head.previous = newNode;
                }
                else {
                    newNode.previous = tail;
                    tail = tail.next = newNode;
                }
            }
            else {
                newNode.previous = tail;
                tail = tail.next = newNode;
            }
        }
        else {
            if (surnameSelecting(newNode.data.getName()).compareTo(surnameSelecting(head.data.getName())) < 0) {
                newNode.next = head;
                head = head.previous = newNode;
            }    
            else if (surnameSelecting(newNode.data.getName()).compareTo(surnameSelecting(head.data.getName())) == 0){
                if (nameSelecting(newNode.data.getName()).compareTo(nameSelecting(head.data.getName())) < 0) {
                    newNode.next = head;
                    head = head.previous = newNode;
                }
            }
            else {
                Node position = head.next;
                while (position != null && surnameSelecting(newNode.data.getName()).compareTo(surnameSelecting(position.data.getName())) >= 0) {
                    if (surnameSelecting(newNode.data.getName()).compareTo(surnameSelecting(position.data.getName())) == 0) {
                        if (nameSelecting(newNode.data.getName()).compareTo(nameSelecting(position.data.getName())) < 0) {
                            break;
                        }
                        else {
                            position = position.next;
                        }
                    }    
                    else {
                        position = position.next;
                    }    
                }
                if (position == null) {
                    newNode.previous = tail;
                    tail = tail.next = newNode;
                }
                else {
                    position.previous.next = newNode;
                    newNode.previous = position.previous;
                    newNode.next = position;
                    position.previous = newNode;
                }
                
            }
        }
    }
            
    public void find(String name) {
        if (isEmpty())
            throw new EmptyListException1();
        Node position = head;
        while (!(position.data.getName().equals(name))) {
            position = position.next;
        }
        System.out.println(position.data.toString());
    }
    
    public void remove(String name) {
        if (isEmpty())
            throw new EmptyListException1();
        Node position = head;
        while (!(position.data.getName().equals(name))) {
            position = position.next;
        }
        if (position == head && position == tail) {
            head = tail = null;
        }
        if (position == head) {
            position.next.previous = null;
            head = position.next;
        }
        else if (position == tail) {
            position.previous.next = null;
            tail = position.previous;
        }
        else {
            position.previous.next = position.next;
            position.next.previous = position.previous;
        }
    }
    
    public void printAToZ() {
        if (isEmpty()) {
            System.out.printf("List is empty %n");
            return;
        }
        Node position = head;
        while (position != null) {
            System.out.println(position.data.toString());
            position = position.next;
        }
    }
    
    public void printZToA() {
        if (isEmpty()) {
            System.out.printf("List is empty %n");
            return;
        }
        Node position = tail;
        while (position != null) {
            System.out.println(position.data.toString());
            position = position.previous;
        }
    }
}
