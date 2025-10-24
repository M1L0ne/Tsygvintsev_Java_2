package lab2;

public class Names {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Names(String firstName) {
        this.firstName = firstName;
    }

    public Names(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Names(String firstName, String lastName, String patronymic) {
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

        return (firstName + " " + lastName + " " + patronymic).trim();
    }
}