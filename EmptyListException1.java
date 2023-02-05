/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sario
 */
public class EmptyListException1 extends RuntimeException{
    public EmptyListException1() {
        this("List");
        
    }
    
    public EmptyListException1(String name) {
        super(name + " is empty");
    }
    
}
