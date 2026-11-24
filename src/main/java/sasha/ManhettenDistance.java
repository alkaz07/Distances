package sasha;

import static java.lang.Math.abs;

public class ManhettenDistance implements ICellDistanceCalc{
    @Override
    public double distance (Cell c1, Cell c2){
        return abs(c1.x-c2.x) + abs(c1.y-c2.y);
    }
}
