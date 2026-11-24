package sasha;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class MooreDistanceCalc implements ICellDistanceCalc {
    @Override
    public double distance(Cell c1, Cell c2) {
        return max(abs(c1.x - c2.x), abs(c1.y - c2.y));
    }
}
