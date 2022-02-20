package task12_1_ElevatorQueue;

public class ElevatorFloor implements Comparable<ElevatorFloor> {
    int floor;

    public ElevatorFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }


    @Override
    public int compareTo(ElevatorFloor sortFloor) {

        return this.floor - sortFloor.floor;

    }

    @Override
    public String toString() {
        return
                " этаж " + floor + " -->";
    }


}
