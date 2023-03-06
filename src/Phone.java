public class Phone extends Product{
    private int cameraQuality;
    private String processor;
    private int ram;
    private int storage;
    private String OS;
    private double screenSize;

    public Phone(String name, String brand, double price, int number, String category, Guarantee guarantee, String color, int cameraQuality, String processor, int ram, int storage, String OS, double screenSize) {
        super(name, brand, price, number, category, guarantee, color);
        this.cameraQuality = cameraQuality;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.OS = OS;
        this.screenSize = screenSize;
        Object o = new Object();
    }

    public int getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(int cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }


    @Override
    public String toString() {
        return super.toString() + " -> " + "Phone{" +
                "cameraQuality=" + cameraQuality +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", OS='" + OS + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
