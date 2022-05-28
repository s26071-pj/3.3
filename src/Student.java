public class Student extends Person{
    protected String index_numer;

    public String getIndex_numer() {
        return index_numer;
    }

    public void setIndex_numer(String index_numer) {
        this.index_numer = index_numer;
    }

    public void printoutStudent() {
        String template ="""
                ----------------------------------------------
                Imie: %s
                Nazwisko: %s
                Rok urodzenia: %s
                Płeć: %s
                Numer indeksu: %S
                ----------------------------------------------
                """;
        String result = String.format(
                template,
                getName(),
                getSurname(),
                getBirth_date(),
                getSex(),
                getIndex_numer()
        );
        System.out.println(result);

    }
}
