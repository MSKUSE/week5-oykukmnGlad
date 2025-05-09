public class Main {
    public static void main(String[] args) {

        String s1 = new String("Ali");
        System.out.println(s1);

        Point p1 = new Point();
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);

        Point p2 = new Point(3,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Point tLeft = new Point(3,4);
        // Rectangle r2 = new Rectangle(new Point(3,4),3,4);
        Rectangle r1 = new Rectangle(tLeft,3,4);
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft());
        System.out.println(r1.getTopLeft().xCoord);
        System.out.println(r1.getTopLeft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Point Center = new Point(3,4);
        Circle c1 = new Circle(Center,5);
        System.out.println(c1.getRadius());
        c1.setRadius(-21);
        System.out.println(c1.getRadius());

    }
}