/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sario
 */
public class Node {
    
    Node previous;
    Node next;
    CustomerInfo data;

    public Node() {
        previous = null;
        next = null;
        data = null;
    }

    public Node(CustomerInfo data) {
        previous = null;
        next = null;
        this.data = new CustomerInfo(data.getName(),data.getAddress(),data.getPhoneN());
    }
}
