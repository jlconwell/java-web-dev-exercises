package technology;

public class SmartPhone extends Computer {

    private double screenSize;
    public SmartPhone(String name, String GPU, int ram, boolean isWindows, double screenSize) {
        super(name, GPU, ram, isWindows);
        this.screenSize = screenSize;
    }

    public void changeScreenSize(double newSize) {
        screenSize = newSize;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "screenSize=" + screenSize +
                ", name='" + name + '\'' +
                ", GPU='" + GPU + '\'' +
                ", ram=" + ram +
                ", isWindows=" + isWindows +
                '}';
    }
}

