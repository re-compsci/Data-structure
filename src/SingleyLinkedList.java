/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riina
 */
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Name: Rinad Naser Tkroune.
 * ID: 441009247
 * Group: 6
 */

public class SingleyLinkedList<E> {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in); //an Object for scanner class.
        SingleyLinkedList Sample= new SingleyLinkedList();//an Object for SingleyLinkedList class.
        
        System.out.println("Plase enter a Sentance for a reverse:");
        String words = input.nextLine(); // a varuble words to store user recomanded santance.
        
        for(int u= 0 ; u < words.length() ; u++) //loop to add each word of the user santance.
            Sample.addLast(words.charAt(u)); // insert non-static method AddLast by using a class object.
        
        System.out.println("\nYour reversed sentance:");
        System.out.println(Sample.reverse(Sample.head));// printing a santance in a reversed way, putting (head) as a parameter 
    }
    
    private class node<E> {
        
        node<E> link; // pointer for the next node.
        E data; // adding any type of value.
  
        //constract 1
        node(E D){
            this.data=D;
            this.link= null; 
        }
     
        public void setData(E D){ //opration to add the new data.
            this.data=D; }
        public E getData(){ //opration to storing the new data.
            return data; }   
 
        public void setLink(node L){//opration to add the next node.
            this.link=L; }
        public node getLink(){//opration to store the next node..
            return link; } 
    }
    
    node head, tail; // making a head and tail as a pointer.
    
    public void  addLast(E e){

        node newest = new node( e );// a node object to store the parameter data
        if(head == null)
            head=tail=newest;// making a direaction for head and tail, for the first node in the least.
        else{
            newest.link = null;
            tail.link = newest;
            tail = newest;
       }
    }
    
    String reverse (node yourVariableName){
        
        if(yourVariableName == null) // cheaking if the node reaches the end the list return as follows..
            return "";
        else 
            // connecting all the word togther after spreating them.
            return  reverse (yourVariableName.getLink()) + yourVariableName.data ;
    }
    /*
    pesudocode
        reverse (Node E)
        IF (E == null)
            return ""
        ELSE 
            return reverse (E-->next) + E-->data
        ENDIF
    
    
    
    
    
    */
    
    
    
    
    
}
