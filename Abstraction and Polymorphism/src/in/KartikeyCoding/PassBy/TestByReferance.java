package in.KartikeyCoding.PassBy;

import java.awt.*;
import java.lang.classfile.constantpool.PoolEntry;

public class TestByReferance {
    static void main(String[] args) {
        Point first = new Point(10,20);
        System.out.println("First: "+first);
        move(first);
        System.out.println("First: "+first);
    }
    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);

    }

    public static class point{
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }


}
