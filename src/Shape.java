import static java.lang.String.format;

abstract class Shape {
    abstract double surface_area();
    abstract double volume();
}
class Sphere extends Shape {
    double radius = 0;
    @Override
    double surface_area() {
        return (4 * 3.14 * Math.pow(radius, 2));
    }
    @Override
    double volume() {
        return (((double) 4/3) * 3.14 * Math.pow(radius, 3));
    }
    public Sphere(float radius) {
        this.radius = radius;
    }
    void printMethod() {
        String format;
        format = format("The area of the Sphere is: %.2f square inches.\n" +
                        "The volume of the sphere is: %.2f cubic inches.", surface_area(), volume());
        System.out.println(format);
    }
}
