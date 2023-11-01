import java.util.ArrayList;

public class ShapeArray {
    public static void main(String[] args) {

        // Instantiate an ArrayList to store shape objects.
        ArrayList shapeArray = new ArrayList();

        // Constructor Values
        double sphereRadius = 12.25;
        double cylHeight = 14.5;
        double cylRadius = 14.75;
        double coneHeight = 16.33;
        double coneRadius = 16.55;

        // Instantiate Instances
        Sphere s1 = new Sphere(sphereRadius);
        Cylinder cyl1 = new Cylinder(cylHeight, cylRadius);
        Cone c1 = new Cone(coneHeight,coneRadius);

        // Add each object to the Array.
        shapeArray.add(s1);
        shapeArray.add(cyl1);
        shapeArray.add(c1);

        // Loop through the array, calling toString for each object.
        for (int i = 0; i < shapeArray.size(); i ++) {
            System.out.println(shapeArray.get(i).toString());
        }
    }
}