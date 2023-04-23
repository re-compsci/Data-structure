/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riina
 */
public class node {
    String value; 
    node next;
    
    
    public node(String value){ // constructor take the parameter 'value' type String
        this.value=value; 
    }

    public String getValue() {// getter method for the value
        return value;
    }

    public void setValue(String value) {// seter method for the value 
        this.value = value;
    }

    public node getNext() { // gtter method for the next
        return next;
    }

    public void setNext(node next) {// setter method for the next
        this.next = next;
    }
    
    }