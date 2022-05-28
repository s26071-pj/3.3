import java.time.LocalDate;

public class Person {
    protected String name;
    protected String surname;
    protected LocalDate birth_date;
    protected String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void printoutPerson() {
        String template ="""
                ----------------------------------------------
                Imie: %s
                Nazwisko: %s
                Rok urodzenia: %s
                Płeć: %s
                ----------------------------------------------
                """;
        String result = String.format(
                template,
                getName(),
                getSurname(),
                getBirth_date(),
                getSex()
        );
        System.out.println(result);

    }
}
