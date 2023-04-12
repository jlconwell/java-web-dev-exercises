package technology;

public abstract class Computer {
    String name;
    String GPU;
    int ram;
    boolean isWindows;

    public Computer(String name, String GPU, int ram, boolean isWindows) {
        this.name = name;
        this.GPU = GPU;
        this.ram = ram;
        this.isWindows = isWindows;
    }

    public void addRam(int newRam) {
        if (this.ram + newRam > 32) {
            System.out.println("Not enough memory slots for RAM");
        } else {
            this.ram = newRam + ram;
        }
    }
}