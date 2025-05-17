public class Vehicle {
    private int maxSpeed;
    private int cargoCapacity;

    public Vehicle(int maxSpeed, int cargoCapacity) {
        this.maxSpeed = maxSpeed;
        this.cargoCapacity = cargoCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void deliver(String destination) {
        System.out.printf("Доставка в пункт %S.\n", destination);
    }
}