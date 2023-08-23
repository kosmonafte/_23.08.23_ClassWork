import javax.swing.plaf.PanelUI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Human {

    {
        count++;
    }
    static int count = 0;
    protected String name;
    protected String soname;

    protected LocalDateTime date;
    protected String telNumber;
    protected String city;
    protected String country;
    protected String street;
    protected int house;

    public Human() {
        //uman.count++;
    }

    public static int getCount() {
        return count;
    }
    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(String str) {
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy.M.d HH:mm:ss");
        this.date = LocalDateTime.now();//parse(str, dateTime);
    }

    public String showInfo() {
        String str = new String();
        str = String.format("Имя: %s\nФамилия: %s\nДата: %s\nНомер: %s\nСтрана: %s\nГород: %s\nУлица: %s\nДом: %d\n",
                this.name, this.soname, this.date, this.telNumber, this.country, this.city, this.street, this.house);
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 20) {
            this.name = name;
        }
    }

    public String getSoname() {
        return soname;
    }

    public void setSoname(String soname) {
        if (name.length() < 20) {
            this.soname = soname;
        }
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        if ((telNumber.length() == 11 && telNumber.charAt(0) == '8') || (telNumber.length() == 12 && telNumber.charAt(0) == '+')) {
            this.telNumber = telNumber;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }
}
