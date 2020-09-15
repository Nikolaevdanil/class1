import java.util.Scanner;
import java.lang.Math;
import java.util.logging.SocketHandler;

import static javafx.scene.input.KeyCode.R;
interface Priceable{

    void getPrice();
    void getSpace();

}

class car implements Priceable{
    private String name;
    private int money;
    car(String name,int money)
    {
        this.name=name;
        this.money=money;
    }
    public void getPrice(){
        System.out.println("Стоимость: "+money);
    }
    public void getSpace()
    {
        System.out.println("Машина: " + name);
    }
}

class plane implements Priceable{
    private String name;
    private int money;
    plane(String name,int money)
    {
        this.name=name;
        this.money=money;
    }
    public void getPrice(){
        System.out.println("Стоимость: "+money);
    }
    public void getSpace()
    {
        System.out.println("Самолет: " + name);
    }
}

public class four {

    public static void main(String[] args) {
        Priceable  priceable=new car("Гелик",500000);
        priceable.getSpace();
        priceable.getPrice();
        priceable=new plane("Сухой Суперджет-100",1000000);
        priceable.getSpace();
        priceable.getPrice();
    }
}
