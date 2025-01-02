package InnerClasses;

public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reservedRooms(String guestName, int numOfRooom){
        class ReservationValidation{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name can not be empty");
                    return false;
                }
                if(numOfRooom < 0){
                    System.out.println("Number of rooms should be positive");
                    return false;
                }
                if(reservedRooms + numOfRooom > totalRooms){
                    System.out.println("Not enough rooms available");
                    return false;
                }
                return true;
            }
        }

        ReservationValidation validation = new ReservationValidation();
        if(validation.validate()){
            reservedRooms += numOfRooom;
            System.out.println("Reservation confirmed for " + guestName + " for " + numOfRooom + " rooms");
        }else{
            System.out.println("Reservation failed");
        }
    }
}
