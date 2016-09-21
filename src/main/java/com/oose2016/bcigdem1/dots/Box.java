package com.oose2016.bcigdem1.dots;

import java.util.ArrayList;

/**
 * Box model to keep track of scoring.
 */
public class Box {
    private final int row;
    private final int col;
    /**
     * Either "RED", "BLUE", or "NONE" to describe the owner of this box.
     */
    private final String owner;

    public Box(int row, int col, String owner) {
        this.row = row;
        this.col = col;
        this.owner = owner;
    }

    public Box(int row, int col) {
        this.row = row;
        this.col = col;
        this.owner = "NONE";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        return (row == box.row && col == box.col && owner.equals(box.owner));
    }

    /**
     * @return Unique hash code generated by "row, col, owner"
     */
    @Override
    public int hashCode() {
        String boxId = Integer.toString(row) + "," + Integer.toString(col) + "," + owner;
        return boxId.hashCode();
    }

    public ArrayList<Line> generateHorizontalLines() {
        Line up = new Line(row, col, true);
        Line down = new Line(row + 1, col, true);
        ArrayList<Line> h = new ArrayList<>();
        h.add(up);
        h.add(down);
        return h;
    }

    public ArrayList<Line> generateVerticalLines() {
        Line left = new Line(row, col, true);
        Line right = new Line(row, col + 1, true);
        ArrayList<Line> h = new ArrayList<>();
        h.add(left);
        h.add(right);
        return h;
    }

}
