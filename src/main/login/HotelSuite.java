package login;

public class HotelSuite {
    private int roomNumber;
    private boolean isAccessibleFriendly;
    private boolean isAlleySide;
    private boolean isDeluxeSuite;


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAccessibleFriendly() {
        return isAccessibleFriendly;
    }

    public void setAccessibleFriendly(boolean accessibleFriendly) {
        this.isAccessibleFriendly = accessibleFriendly;
    }

    public boolean isAlleySide() {
        return isAlleySide;
    }

    public void setAlleySide(boolean alleySide) {
        this.isAlleySide = alleySide;
    }

    public boolean isDeluxeSuite() {
        return isDeluxeSuite;
    }

    public void setDeluxeSuite(boolean deluxeSuite) {
        this.isDeluxeSuite = deluxeSuite;
    }


}
