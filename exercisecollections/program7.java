package exercisecollections;

import java.util.LinkedList;

public class program7 {
	public static void main(String[] args){

	    // create a linked list using the LinkedList class
	    LinkedList<String> animals = new LinkedList<>();

	    // Add elements to LinkedList
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Horse");
	    System.out.println("LinkedList: " + animals);
	    System.out.println("----------");
	    System.out.println("Size Of List: " + animals.size());
	    System.out.println("----------");

	    // access middle element
	    String middle = animals.get(animals.size()/2);
	    System.out.println("Middle Element: " + middle);
	    }
	}


