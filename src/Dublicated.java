/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raniya
 */

    
public class Dublicated<E> {
    node tail;
    node head;
    int size;
    
    public Dublicated (node tail){
        this.tail=tail;
    }

    public void addfirst(String e){
      // to insert a node at the beginning
       node newnode= new node(e);
       if(head==null){
         head=newnode;
         tail=newnode;
         newnode.next=head;
       }
       
       tail.next = newnode;
       //tail points to the new element   
        tail = newnode;
      // points to head in a linked list   
        tail.next = head;
       
        size++;// increse the size whenever an element is inserts
    }
    
    
public void print(){ // a method to print the value of the list
      node c=head;// creat a node c and let it take the head node c will be the counter
      if(head== null)// first we will see if the list is empty
            {
           //print the empty statement
           System.out.println("linked list is empty");
            }
      do{// use do and while to loop around the value
          String str=c.value; // i liked to creat a new variable with a String and take the value of c
        System.out.println(str);// print the c value 
        c=c.next;// increment the counter
      } while(c!=head);// why  not equal head? because i dont want it too loop again to the head
        
              
}
      
        
      
       public boolean checkduplicate(node head){ 
            boolean exist=false;// initial a varibale named exist gave it the value false

            if(head==null){ // check if the linked list is empty or not
                System.out.println("the linked list is empty ");
            }
            node c=head;// initial a counter
            node j=head.next;
            do{// while the next of the head dont equal head will check
                if(c.value.equals(j.value)){// check the values
                System.out.println("duplicated value exist");// print exit if there is duplicated
                exist=true;// change the value of exist to true
                break;
                }
            c=c.next; // increment the counter
            j=j.next;//increment the counter
            }
            while(c.next!=head);
            // return the last result

            return exist;
        }
        
        
        public int size(){// a method to retun the size of the list
            return size;
        }

    
}   
    

