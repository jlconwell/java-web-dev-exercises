package technology;

import technology.Computer;

public class Laptop extends Computer {

    private boolean numPad;
    public Laptop(String name, String GPU, int ram, boolean isWindows, boolean numPad) {
        super(name, GPU, ram, isWindows);
        this.numPad = true;
    }

    public boolean isNumPad() {
        return numPad;
    }

    public void changeNumPadToFalse () {
        numPad = false;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "numPad=" + numPad +
                ", name='" + name + '\'' +
                ", GPU='" + GPU + '\'' +
                ", ram=" + ram +
                ", isWindows=" + isWindows +
                '}';
    }
}


