package entities;

public class Costumers {

    public String name;
    public String email;
    public int roomNumber;

    public Costumers(String name, String email, int roomNumber) {
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public String toString(){
        return  roomNumber + ": " + name + ", " + email;
    }


}
