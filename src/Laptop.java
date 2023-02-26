public class Laptop extends Product{
    private String processor;
    private String screenQuality;
    private int ram;
    private String GPU;
    private boolean doesHaveCamera;
    private int storage;
    private String OS;

    public Laptop(String name, String brand, double price, int number, String category, Guarantee guarantee, String color, String processor, String screenQuality, int ram, String GPU, boolean doesHaveCamera, int storage, String OS) {
        super(name, brand, price, number, category, guarantee, color);
        this.processor = processor;
        this.screenQuality = screenQuality;
        this.ram = ram;
        this.GPU = GPU;
        this.doesHaveCamera = doesHaveCamera;
        this.storage = storage;
        this.OS = OS;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getScreenQuality() {
        return screenQuality;
    }

    public void setScreenQuality(String screenQuality) {
        this.screenQuality = screenQuality;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public boolean isDoesHaveCamera() {
        return doesHaveCamera;
    }

    public void setDoesHaveCamera(boolean doesHaveCamera) {
        this.doesHaveCamera = doesHaveCamera;
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

    @Override
    public String toString() {
        return super.toString() + "->" + "Laptop{" +
                "processor='" + processor + '\'' +
                ", screenQuality='" + screenQuality + '\'' +
                ", ram=" + ram +
                ", GPU='" + GPU + '\'' +
                ", doesHaveCamera=" + doesHaveCamera +
                ", storage=" + storage +
                ", OS='" + OS + '\'' +
                '}';
    }
}
