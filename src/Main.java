import java.time.LocalDate;

public class Main{

    public static void main(String[] args){
        Person person = new Person();
        Student student = new Student();
        Profesor profesor = new Profesor();
        Stypendysta stypendysta = new Stypendysta();

        person.setName("Tomek");
        person.setSurname("Chik");
        person.setBirth_date(LocalDate.parse("2000-12-01"));
        person.setSex("Mężczyzna");

        student.setName("Henryk");
        student.setSurname("Mudlaff");
        student.setBirth_date(LocalDate.parse("2000-08-12"));
        student.setSex("Mężczyzna");
        student.setIndex_numer("s26071");

        profesor.setName("Maciej");
        profesor.setSurname("Zawadko");
        profesor.setBirth_date(LocalDate.parse("1980-01-24"));
        profesor.setSex("Mężczyzna");
        profesor.setTitle("Doktor fizyki kwantowej");

        stypendysta.setName("Małgorzata");
        stypendysta.setSurname("Kujawska");
        stypendysta.setBirth_date(LocalDate.parse("1998-10-21"));
        stypendysta.setSex("Kobieta");
        stypendysta.setIndex_numer("s24098");
        stypendysta.setStypendium_salary(500);

        person.printoutPerson();
        student.printoutStudent();
        profesor.printoutProfesor();
        stypendysta.printoutStypendysta();
    }
}
