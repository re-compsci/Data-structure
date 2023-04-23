
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riina
 */
public class ciruclyLinked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("please insert values to the linked list : 'String value' " );
      Scanner in = new Scanner(System.in);
      String a=in.nextLine();
      Dublicated a1 = new Dublicated(new node(a));
      // creat a menu for the circular linked list 
        System.out.println("you have a list of opreations to insert and remove and to see if dublicated item exit: ");
        System.out.println("**************************************************");
        System.out.println("1- to add node at the first in the linked list : ");
        System.out.println("2- to print the linked list ");
        System.out.println("3- to get the size of the linked list : ");
        System.out.println("4- to check if 2 nodes are duplicated ");
        System.out.println("5- to exit ");
        
        System.out.println("**************************************");
        
        System.out.println("press 1 to enter the loop ");
        int i=in.nextInt();
        while(i!=15){// i give the user 15 tries to enter the menu user can enter whatever number of optiaon when enter 5 will exit
        System.out.println("choose the opreation you look for");
        System.out.println("**************************************************");
        System.out.println("1- to add node at the first in the linked list : ");
        System.out.println("2- to print in the linked list ");
        System.out.println("3- to get the size of the linked list : ");
        System.out.println("4- to check if 2 nodes are duplicated ");
        System.out.println("5- to exit ");
        int num = in.nextInt();
        if(num==1){
            System.out.println("1- to add node at the first in the linked list :");
            System.out.println("insert your elemantes");
            //give them String values 
            String name1=in.nextLine();
            String name2=in.nextLine();
            String name3=in.nextLine();
            String name4=in.nextLine();
            String name5=in.nextLine();
            a1.addfirst(name1);
            a1.addfirst(name2);
            a1.addfirst(name3);
            a1.addfirst(name4);
            a1.addfirst(name5);
        } 
        else if(num==2){
        // here in this operation will print the elements of the linked list    
        System.out.println("2- to print the linked list ");   
        a1.print();
       
        }
        else if(num==3){
        // return the size of the linked list    
        System.out.println("3- to get the size of the linked list : ");    
            System.out.println("the size of the linked list : "+ a1.size());
        }
        else if(num==4){
        // check if there are dublicates    
        System.out.println("4- to check if 2 nodes are duplicated ");
            System.out.println(a1.checkduplicate(a1.head));
        }
        else if(num==5){
            // exit from the loop
            System.out.println("you exit");
            break;
        }
       i++; 
    }
    
}
}
