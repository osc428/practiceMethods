package veckan9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dagb {
    public static void main(String[] args) {
        Person osman = new Person();
        osman.name = "Salih";
        osman.age = 36;
        Person ahmet = new Person();
        ahmet.name = "mehmet";
        ahmet.age = 26;

        System.out.println(osman.name);
        System.out.println(ahmet.name);
        DateTimeFormatter tarih = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        System.out.println(LocalDateTime.now().format(tarih));
    }
}

class Person {
    public String name;
    public int age;
}
