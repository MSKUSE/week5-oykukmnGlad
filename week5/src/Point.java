public class Point {

    public int xCoord, yCoord;

    public Point(){} //hidden constructor

    public Point(int x, int y){
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point(int xy){
        this.xCoord = xy;
        this.yCoord = xy;
    }
}
