package kata_computers_shop;

public class Computer {
    private String brand;
    private int memoryAmount;
    private String processorFeatures;
    private String operatingSystem;
    private double price;

    public Computer(String brand, int memoryAmount, String processorFeatures, String operatingSystem, double price) {
        this.brand = brand;
        this.memoryAmount = memoryAmount;
        this.processorFeatures = processorFeatures;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(int memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public String getProcessorFeatures() {
        return processorFeatures;
    }

    public void setProcessorFeatures(String processorFeatures) {
        this.processorFeatures = processorFeatures;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Memory: " + memoryAmount + "GB, Processor: " + processorFeatures + 
               ", OS: " + operatingSystem + ", Price: $" + price;
    }
}
