package Tests.T2013B;

import java.security.InvalidParameterException;

public class Basketball extends Ball{

    private final double _w;
    private final double _h;
    public Basketball(double x, double y, double width, double height ) {
        super(x, y);
        if (point.x() > width || point.y() > height){
            throw new InvalidParameterException("The ball must be inside the field");
        }
        _w = width;
        _h = height;

    }

    public Basketball(Point p, double width, double height ) {
        super(p);
        if (p.x() > width || p.y() > height){
            throw new InvalidParameterException("The ball must be inside the field");
        }
        _w = width;
        _h = height;
    }

    public Basketball(Basketball basketball){
        super(basketball.point);
        _w = basketball._w;
        _h = basketball._h;
    }

    public void moveLeft(double left){
        if (point.x() - left < 0){ return;}
        super.moveLeft(left);
    }
    public void moveRight(double right){
        if (point.x() + right > _w){ return;}
        super.moveRight(right);
    }
    public void moveForward(double up){
        if (point.y() + up > _h){ return;}
        super.moveForward(up);
    }
    public void moveBack(double down){
        if (point.y() - down < 0){ return;}
        super.moveBack(down);
    }
}
