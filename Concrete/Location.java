package GoodImplementationv1.Concrete;

public class Location {
    private int x_cod;
    private int y_cod;
    public Location(int x,int y){
        this.x_cod=x;
        this.y_cod=y;
    }
    public double CalculetDistance(Location lc)
    {
        double dx=Math.abs(this.x_cod-lc.getX_cod());
        double dy=Math.abs(this.y_cod-lc.getY_cod());
        return Math.sqrt(dx*dx + dy*dy);
    }
    public int getX_cod() {
        return x_cod;
    }
    public void setX_cod(int x_cod) {
        this.x_cod = x_cod;
    }
    public int getY_cod() {
        return y_cod;
    }
    public void setY_cod(int y_cod) {
        this.y_cod = y_cod;
    }
    
}
