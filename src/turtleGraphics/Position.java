package turtleGraphics;

public class Position {
   private  int row;
   private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
    @Override
    public boolean equals(Object object){
        Position position = new Position(row,column);

        return (row == position.row && column== position.column);
    }
}
