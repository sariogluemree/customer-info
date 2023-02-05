/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author sario
 */
public class CustomerInfo {
    
    private String name;
    private String address;
    private ArrayList phoneN;

    public CustomerInfo() {
        name = null;
        address = null;
        phoneN = null;
    }

    public CustomerInfo(String name) {
        this.name = name;
    }

    public CustomerInfo(String name, String address, ArrayList phoneN) {
        this.name = name;
        this.address = address;
        this.phoneN = phoneN;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList getPhoneN() {
        return phoneN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdres(String address) {
        this.address = address;
    }

    public void setTelNo(ArrayList phoneN) {
        this.phoneN = phoneN;
    }

    @Override
    public String toString() {
        return "Customer " + "name: " + name + ", address: " + address + ", phoneN: " + phoneN;
    }
}
