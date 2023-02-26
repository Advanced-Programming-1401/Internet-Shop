public class Watch extends Product{
    private String OS;
    private int screenSize;
    private String processor;
    private int storage;
    private boolean doesHaveHeartBeatSensor;

    public Watch(String name, String brand, double price, int number, String category, Guarantee guarantee, String color, String OS, int screenSize, String processor, int storage, boolean doesHaveHeartBeatSensor) {
        super(name, brand, price, number, category, guarantee, color);
        this.OS = OS;
        this.screenSize = screenSize;
        this.processor = processor;
        this.storage = storage;
        this.doesHaveHeartBeatSensor = doesHaveHeartBeatSensor;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isDoesHaveHeartBeatSensor() {
        return doesHaveHeartBeatSensor;
    }

    public void setDoesHaveHeartBeatSensor(boolean doesHaveHeartBeatSensor) {
        this.doesHaveHeartBeatSensor = doesHaveHeartBeatSensor;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Watch{" +
                "OS='" + OS + '\'' +
                ", screenSize=" + screenSize +
                ", processor='" + processor + '\'' +
                ", storage=" + storage +
                ", doesHaveHeartBeatSensor=" + doesHaveHeartBeatSensor +
                '}';
    }
}
