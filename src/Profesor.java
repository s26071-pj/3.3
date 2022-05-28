public class Profesor extends Person{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void printoutProfesor() {
        String template ="""
                ----------------------------------------------
                Imie: %s
                Nazwisko: %s
                Rok urodzenia: %s
                Płeć: %s
                Tytuł/Stopień naukowy: %s
                ----------------------------------------------
                """;
        String result = String.format(
                template,
                getName(),
                getSurname(),
                getBirth_date(),
                getSex(),
                getTitle()
        );
        System.out.println(result);

    }
}
