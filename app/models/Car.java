package models;


public class Car {

    public Integer id;
    public Integer ownerId;
    public String carNr;

    public Car(Integer id, Integer ownerId, String carNr) {
        this.id = id;
        this.ownerId = ownerId;
        this.carNr = carNr;
    }

}
