package com.java_topics.enums;

public class EnumChoice {
	 Size pizzaSize;
	 PizzaStyle pizzaStyle;	
	 
	 public EnumChoice(Size pizzaSize, PizzaStyle pizzaStyle) {
	   this.pizzaSize = pizzaSize;
	   this.pizzaStyle = pizzaStyle;
	 }
	 
	 public void orderPizza() {
	   switch(pizzaStyle) {
	   case NY:
		   System.out.println("I selected a NY style pizza");
		   break;
	   case SICILLIAN:
		   System.out.println("I selected a Sicillian style pizza.");
		   break;
	   case DT:
		   System.out.println("I selected a Detroit style pizza.");
		   break;
	   case CH:
		   System.out.println("I selected a Chicago style pizza.");
		   break;
	   case CT:
		   System.out.println("I selected a Connecticut style pizza.");
		   break;
	   case NEOPOLITAN:
		   System.out.println("I selected a Neopolitan style pizza.");
		   break;
	   }
	   
	   if(pizzaStyle!=null) {
		   switch(pizzaSize) {
		     case SMALL:
		       System.out.println("I ordered a small personal size of pizza.");
		       break;
		     case MEDIUM:
		       System.out.println("I ordered a medium pie of pizza.");
		       break;
		     case LARGE:
			       System.out.println("I ordered a large pie of pizza.");
			       break;
		     case SLICE:
		    	 System.out.println("I ordered a single slice of pizza");
		    	 break;
		     default:
		       System.out.println("I don't know which one to order.");
		       break;
		   }   
	   }
		 
	   
	 }
}
