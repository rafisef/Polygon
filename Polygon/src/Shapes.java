/**
 * Created by Rafael on 2/26/2016.
 */

class Polygon
{
    private int [] sideLengths;

    public Polygon(int sides, int ... lengths)
    {
        int index = 0;
        sideLengths = new int [sides];
        for (int length: lengths)
        {
            sideLengths[index] = length;
            index += 1;
        }
    }

    public int side(int number)
    {
        return sideLengths[number];
    }

    public int perimeter()
    {
        int total = 0;
        for (int index = 0; index < sideLengths.length; index += 1)
        {
            total += side(index);
        }
        return total;
    }
}

class Rectangle extends Polygon{
    public Rectangle(int a,int b){
        super(4,Math.abs(a),Math.abs(b),Math.abs(a),Math.abs(b)); // abs to take into account negative values if on xy plane
    }
    public int area() {
        return side(0) * side(1);
    }


    }


class Square extends Rectangle{
    public Square(int a){
        super(Math.abs(a),Math.abs(a));
    }
}

public class Shapes {
    public static void main(String [] args){
        Rectangle wrecked = new Rectangle(3, 5);  //  Make a 3 × 5 rectangle.
        System.out.println(wrecked.area());       //  Print its area, 15.
        System.out.println(wrecked.perimeter());  //  Print its perimeter, 16.

        Square nerd = new Square(7);              //  Make a 7 × 7 square.
        System.out.println(nerd.area());          //  Print its area, 49.
        System.out.println(nerd.perimeter());     //  Print its perimeter, 28.


    }
}
/*
OUTPUT
15
16
49
28

 */