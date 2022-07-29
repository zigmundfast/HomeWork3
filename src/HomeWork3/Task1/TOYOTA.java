package HomeWork3.Task1;


public class TOYOTA extends Auto  {
    private static String name;
    public static String getName() {
        return name;
    }
    public String playMusic() {
        return  "включает музыку";
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

    public TOYOTA(String name) {
        this.name =  name;
    }
}
