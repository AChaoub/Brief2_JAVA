package com.ex1.app;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciation 
		Point p1 = new	Point(10,20);
		Point p2 = new	Point(100,200);
		Point p3 = new Point();
		
		p3.setX(40);
		p3.setY(40);
		
		//affichage points
		
		p1.affichagePoint();
		p2.affichagePoint();
		p3.affichagePoint();
		

	}

}
