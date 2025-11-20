class Circle2 {
    double radius;

    Circle2() {
        this(1.0);
    }

    Circle2(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2(5.5);

        System.out.println(c1.radius);
        System.out.println(c2.radius);
    }
}
