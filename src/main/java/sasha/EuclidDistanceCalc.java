package sasha;

public class EuclidDistanceCalc implements ICellDistanceCalc{
    public double distance (Cell c1, Cell c2){
        return Math.hypot(c1.x-c2.x, c1.y-c2.y);
    }
}
