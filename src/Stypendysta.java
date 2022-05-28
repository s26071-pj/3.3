public class Stypendysta extends Student{

    private int stypendium_salary;

    public int getStypendium_salary() {
        return stypendium_salary;
    }

    public void setStypendium_salary(int stypendium_salary) {
        this.stypendium_salary = stypendium_salary;
    }

    public void printoutStypendysta() {
        String template ="""
                ----------------------------------------------
                Imie: %s
                Nazwisko: %s
                Rok urodzenia: %s
                Płeć: %s
                Numer indeksu: %s
                Wysokość stypendium: %s zł
                ----------------------------------------------
                """;
        String result = String.format(
                template,
                getName(),
                getSurname(),
                getBirth_date(),
                getSex(),
                getIndex_numer(),
                getStypendium_salary()
        );
        System.out.println(result);

    }
}
