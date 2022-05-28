import java.time.LocalDate;

public class Main{

    public static void main(String[] args){
        Person person = new Person();
        Student student = new Student();
        Profesor profesor = new Profesor();
        Stypendysta stypendysta = new Stypendysta();

        person.setName("Tomek");
        person.setSurname("Chik");
        person.setBirth_date(LocalDate.parse("2000-13-21"));
        person.setSex("Man");

        person.printoutPerson();
    }
}
