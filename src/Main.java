public class Main {
    public static void main(String[] args) {
        // Constructor Values
        double sphereRad = 12.25;
        double cylHeight = 14.5;
        double cylRadius = 14.75;

        // Test Sphere
        Sphere s1 = new Sphere(sphereRad);
        System.out.println(s1.toString());

        // Test Cylinder
        Cylinder c1 = new Cylinder(cylHeight, cylRadius);
        System.out.println(c1.toString());
    }
}
