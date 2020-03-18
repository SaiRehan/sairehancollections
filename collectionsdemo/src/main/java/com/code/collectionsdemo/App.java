package com.code.collectionsdemo;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	   public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        LinkedList<Integer> linkedlist1 = new LinkedList<Integer>(); 
			Scanner sc=new Scanner(System.in);

			// Adding elements to the linked list 
			linkedlist1.add(2); 
			linkedlist1.add(3); 
			linkedlist1.addLast(10); 
			linkedlist1.addFirst(1); 
			linkedlist1.add(5); 
			linkedlist1.add(6);
			linkedlist1.add(7);
			linkedlist1.add(8);
			linkedlist1.add(9); 
			linkedlist1.add(4, 4); 
			int index;
			while (true) {
				int op;
				System.out.println("choose an option\n1:insert element\n2:remove element\n3:fetch element at an index\n4:display\n5:exit");
				op=sc.nextInt();
				switch(op) {
				
				case 1:		int e;
							System.out.println("eneter element to be added");
							e=sc.nextInt();
							linkedlist1.add(e);
							break;
				case 2:		System.out.println("eneter index of element to be removed");
							index=sc.nextInt();
							if (index>=linkedlist1.size())
								System.out.println("there are "+linkedlist1.size()+" elements in the list");
							else
								linkedlist1.remove(index);
							break;
				case 3:		System.out.println("eneter index of element to be fetched");
							index=sc.nextInt();
							if (index>=linkedlist1.size())
								System.out.println("there are "+linkedlist1.size()+" elements in the list");
							else
								System.out.println("element fetched :"+linkedlist1.get(index));
							break;
				case 4:		System.out.println("Linked List is:"+linkedlist1);
							break;
				case 5:		return;
				default:	System.out.println("incorrect input");
							break;
				
				}
			}}}