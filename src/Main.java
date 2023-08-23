import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setDate("1989.2.28 10:30:45");
        System.out.println(human.getDate());
        human.setCity("Beijing");
        human.setCountry("China");
        human.setStreet("UanTan");
        human.setTelNumber("+79998887766");
        human.setName("Kim");
        human.setSoname("Chin");
        human.setHouse(77);
        System.out.println(human.showInfo());
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();
        System.out.println(Human.getCount());
        System.out.println();
        Fraction db1 = new Fraction(1 , 2);
        Fraction db2 = new Fraction(3,7);
        Fraction db3 = new Fraction();
        db3.setNumerator(8);
        db3.setDenominator(9);
        Fraction db4 = db1.multiplay(db1, db2);
        System.out.println(db1.showFract());
        System.out.println(db2.showFract());
        System.out.println(db4.showFract());
        System.out.println(db1.division(db1, db2).showFract());
        System.out.println(db1.summ(db1, db2).showFract());
    }
}