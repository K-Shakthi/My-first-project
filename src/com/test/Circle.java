package com.test;

public class Circle{
 
		private double radius;//instance variable
		private double pi=3.14159;
		
		//default constructor 
		
		public Circle()
		{
		//radius=0.0;
		}  
		
		//parameterized constructor
		
		public Circle(double radius)//local variable
		{
		this.radius=radius;	
			
		} 
		
        

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public double getArea()
        { 
        	return  this.pi *this.radius*this.radius;
        }
        public double getCircumference()
        {
        	return 2*pi*radius;
        }
          
	@Override
		public String toString() {
			return "Circle [radius=" + radius + "]";
		}

	public static void main(String[] args)
	{
		
		Circle circle1 = new Circle(); 
		circle1.setRadius(1.0);
		Circle circle2=new Circle(2.5);
		System.out.println("Area of a Circle for circle1 is"+ " "+ circle1.getArea());
		System.out.println("Area of a circle for circle2 is"+ " "+ circle2.getArea());
		System.out.println("Circumference of a circle for circle1 is"+ " "+ circle1.getCircumference());
		System.out.println("Circumference of a cirle for circle2 is"+ " "+ circle2.getCircumference());
	    System.out.println(circle1);
	    System.out.println(circle2);
		}

	}
	






