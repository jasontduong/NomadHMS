package login;

public class GuestReservation implements Information, Reservation {
    private String cell;
    private String email;
    private Integer id;
    private String resDate;
    private String suite;
    private Integer suiteNum;

    public GuestReservation(String cell, String email, Integer id, String resDate, String suite, Integer suiteNum) {

    }

    @Override
    public void cellPhone() {
        System.out.println("Guest's cell phone number");

    }

    @Override
    public void emailAddress() {
        System.out.println("Guest's e-mail address");
    }

    @Override
    public void idNumber() {
        System.out.println("Guest's id number");

    }

    @Override
    public void reservationDate() {
        System.out.println("Guest's reservation date");

    }

    @Override
    public void suiteType() {
        System.out.println("Guest's suite type");

    }

    @Override
    public void lengthOfStay() {

    }

    @Override
    public void suiteNumber() {
        System.out.println("Guest suite number");

    }

}
