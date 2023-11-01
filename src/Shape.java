import static java.lang.String.format;

abstract class Shape {
    abstract double surface_area();
    abstract double volume();
}
class Sphere extends Shape {
    double spRadius = 0;
    @Override
    double surface_area() {
        return (4 * Math.PI * Math.pow(spRadius, 2));
    }
    @Override
    double volume() {
        return (((double) 4/3) * Math.PI * Math.pow(spRadius, 3));
    }
    public Sphere(double radius) {
        this.spRadius = radius;
    }
    public String toString() {
        String format;
        format = format("The area of the Sphere is: %.2f square inches.\n" +
                        "The volume of the sphere is: %.2f cubic inches.", surface_area(), volume());
        return format;
    }
}
class Cylinder extends Shape {
    double cylHeight = 0;
    double cylRadius = 0;

    @Override
    double surface_area() {
        double cylArea;
        cylArea = (2 * Math.PI * cylRadius * cylHeight) + (2 * Math.PI * Math.pow(cylRadius, 2));
        return cylArea;
    }

    @Override
    double volume() {
        double cylVolume;
        cylVolume = (Math.PI * Math.pow(cylRadius, 2) * cylHeight);
        return cylVolume;
    }
    public Cylinder(double cylHeight, double cylRadius) {
        this.cylHeight = cylHeight;
        this.cylRadius = cylRadius;
    }

    @Override
    public String toString() {
        String format;
        format = format("The area of the cylinder is: %.2f square inches.\n" +
                "The volume of the cylinder is: %.2f cubic inches.", surface_area(), volume());
        return format;
    }
}

class Cone extends Shape {
    double coneHeight;
    double coneRadius;

    @Override
    double surface_area() {
        double coneArea;
        coneArea = Math.PI * coneRadius * (coneRadius + Math.sqrt(Math.pow(coneHeight, 2) + Math.pow(coneRadius, 2)));
        return coneArea;
    }

    @Override
    double volume() {
        double coneVolume;
        coneVolume = Math.PI * Math.pow(coneRadius, 2) * coneHeight/3;
        return coneVolume;
    }
    public Cone(double coneHeight, double coneRadius) {
        this.coneHeight = coneHeight;
        this.coneRadius = coneRadius;
    }

    @Override
    public String toString() {
        String format;
        format = format("The area of the cone is: %.2f square inches.\n" +
                "The volume of the cone is: %.2f cubic inches.", surface_area(), volume());
        return format;
    }
}