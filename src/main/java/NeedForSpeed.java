class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int meter;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        new NeedForSpeed(speed, batteryDrain);
    }

    public boolean batteryDrained() {
        throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
    }

    public int distanceDriven() {
        return this.meter;
    }

    public void drive() {
        this.meter = this.speed;
        // this.batteryDrain -= 1;
    }

    public static NeedForSpeed nitro() {
        throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    }

}

class RaceTrack {
    private int distance = 800;

    RaceTrack(int distance) {
        this.distance = distance;
        new RaceTrack(distance);
    }

    public boolean canFinishRace(NeedForSpeed car) {
        throw new UnsupportedOperationException("Please implement the RaceTrack.canFinishRace() method");
    }
}