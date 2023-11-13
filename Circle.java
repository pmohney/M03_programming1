// 11/10/23
// Pierce Mohney
// SDEV 200
// Assignment 1
//This code shows the Circle class extending the GeometricObject class and implementing a comparable interface.
//It then overrides the Equals method and compares circle objects based on their radius. 


public class Circle extends GeometricObject implements Comparable<Circle> {

    private double radius;
//Sets Circle class to extend GeometricObject and enables comparable interface 
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle otherCircle = (Circle) obj;
        return Double.compare(otherCircle.radius, radius) == 0;
    }
//Overrides equals method and uses logic to compare circle objects based on their radius

    @Override
    public int compareTo(Circle otherCircle) {
        return Double.compare(this.radius, otherCircle.radius);
    }
}
//Uses compareTo method to for comparing circle radii
