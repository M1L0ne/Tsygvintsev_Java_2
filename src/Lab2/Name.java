package Lab2;

public class Name {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Name(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        if (lastName == null){
            lastName = "";
        }
        if (firstName == null){
            firstName = "";
        }
        if (patronymic == null){
            patronymic = "";
        }

        return (lastName + " " + firstName + " " + patronymic).trim();
    }
}
