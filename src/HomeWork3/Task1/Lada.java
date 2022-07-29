package HomeWork3.Task1;

public class Lada extends Auto {
    private static String name;

    public static String getName() {
        return name;
    }
    public String destroy(){
        return "ломается";
    }
    @Override
    public String startDrive() {
        return super.startDrive();
    }
    @Override
    public String carStop() {
        return super.carStop();
    }
    @Override
    public String lights() {
        return super.lights();
    }
    @Override
    public String toString() {
        return name;
    }
    public Lada(String name) {
        this.name = name;
    }
}
