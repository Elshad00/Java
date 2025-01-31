public class Computer {
    private int ram;
    private int storage;
    private int cpuCores;
    private String gpu;

    public Computer(int ram, int storage, int cpuCores, String gpu) {
        this.ram = ram;
        this.storage = storage;
        this.cpuCores = cpuCores;
        this.gpu = gpu;
    }

    public int getRam() { return ram; }
    public int getStorage() { return storage; }
    public int getCpuCores() { return cpuCores; }
    public String getGpu() { return gpu; }

    public void displaySpecs() {
        System.out.println("Computer Specifications:");
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("CPU Cores: " + cpuCores);
        System.out.println("GPU: " + gpu);
    }
}
