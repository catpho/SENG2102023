import java.util.*;
public class CircleArea {
    
	   
	  public static void main(String[] args) {
		  Scanner scnr= new Scanner(System.in);
	      double circleArea;
	      double circleRadius;
          String userinput;
          
	      System.out.println("Please enter a radius value to calculate the area:");
	      
	      circleRadius = scnr.nextDouble();
	      circleArea = Math.PI * Math.pow( circleRadius, 2 ); 
         
	      
	      System.out.println("The approximate area of our circle is:");
	      
	      System.out.printf("%.2f\n", circleArea, " inches squared");
	      
	      squareArea(circleRadius);
	     
}

	  public static void squareArea(double circleRadius) {
		  System.out.println("We will now calculate the area if the shape was a square:");
		  double radius = circleRadius * 2;
		  double sqArea;
		  sqArea = radius * radius; 
		  
		  System.out.println(sqArea + " squared inches is the area of the new shape." );
	  }
}
