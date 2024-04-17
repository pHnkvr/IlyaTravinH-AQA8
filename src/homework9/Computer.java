package homework9;

import java.util.Objects;

public class Computer {
private String vendor;
private int price;
private int ram;
private int gpu;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getGpu() {
        return gpu;
    }

    public void setGpu(int gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Создан PC{" +
                "Имя='" + vendor + '\'' +
                ", Цена=" + price +
                ", ОЗУ=" + ram +
                ", Видеокарта=" + gpu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && gpu == computer.gpu && Objects.equals(vendor, computer.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor,  ram, gpu);
    }

    public Computer(String brand, int price, int ram, int gpu){
        this.vendor = brand;
        this.price = price;
        this.ram = ram;
        this.gpu = gpu;
    }
}
