import java.sql.SQLOutput;
import java.util.ArrayList;

public class seven {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Германия");
        list.add("Франция");
        list.add("Великобритания");
        list.add("Испания");
        list.add("Англия");
        list.add("Бану Гания");
        list.add("Россия");
        list.add("США");
        list.add("Индия");
        list.add("Швеция");
        System.out.println(list);
        System.out.println("Добавляем элемент в список: Италия");   list.add(8, "Италия");
        System.out.println("Проверить наличия элемента: "+list.contains("Германия"));
        System.out.println("Вернуть элемент по индексу: "+list.get(3));
        System.out.println("Удаляем элемент: "+list.remove(4));
        System.out.println(list);
        System.out.println("Узнать количество элементов: "+list.size());
        System.out.println("Установить элемент по индексу: "+list.set(1,"Германия"));
        System.out.println(list);
        System.out.println("Удаляем список!"); list.clear();
        System.out.println(list);
        System.out.println("Проверяем список: "+list.isEmpty());
    }
}
