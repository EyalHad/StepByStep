package Tests.T2013B;

public class Ball {

    protected Point point;
    public Ball(double x, double y) {
        point = new Point(x, y);
    }

    public Ball(Point p) {
        this.point = new Point(p);
    }



    public void moveLeft(double left){
        this.point = new Point(point.x() - left, point.y());
    }
    public void moveRight(double right){
        this.point = new Point(point.x() + right, point.y());

    }
    public void moveForward(double up){
        this.point = new Point(point.x(), point.y() + up);

    }
    public void moveBack(double down){
        this.point = new Point(point.x(), point.y() - down);

    }


    @Override
    public String toString() {
        return "Ball{" +
                "point=" + point +
                '}';
    }
}
