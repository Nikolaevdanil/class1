import java.util.Scanner;
import java.lang.Math;
import java.util.logging.SocketHandler;

import static javafx.scene.input.KeyCode.R;


abstract class   Dish {
    private int a;
    private int h;
    private int S;
    Dish(int a, int h) {
        this.a = a;
        this.h = h;
    }
    abstract void property();
    abstract void means();
    abstract void area();
    int getS()
    {
        S=a*h;
        return S;
    }
}

class Pan extends Dish
{
    Pan(int a,int h)
    {
        super(a,h);
    }
    void property()
    {
        System.out.println("Аллюминий");
    }
    void means()
    {
        System.out.println("Synergetic");
    }
    void area()
    {
        System.out.println("Площадь = "+super.getS());
    }
}
class Plate extends Dish
{
    Plate(int a,int h)
    {
        super(a,h);
    }
    void property()
    {
        System.out.println("Медь");
    }
    void means()
    {
        System.out.println("Fairy");
    }
    void area()
    {
        System.out.println("Площадь = "+super.getS());
    }
}

public class Three {

    public static void main(String[] args) {
        Pan x1=new Pan(5,5);
        Plate x2=new Plate(6,6);
        System.out.print("Cвойство: ");
        x1.property();
        System.out.print("Средство: ");
        x1.means();
        System.out.print("Площадь: ");
        x1.area();
        System.out.print("Cвойство: ");
        x2.property();
        System.out.print("Средство: ");
        x2.means();
        System.out.print("Площадь: ");
        x2.area();
    }
}
