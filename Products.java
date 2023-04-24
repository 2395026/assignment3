import java.util.ArrayList;

class Product {
    protected String brand;
    protected String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class TV extends Product{
    public int size;

    public TV(int size, String brand, boolean smart) {

        this.size = size;
        this.brand = brand;
        this.smart = smart;
    }

    public int getSize() {
        return size;
    }

    public String brand;
    public    String getBrand() {
        return brand;
    }

    public boolean smart;
    public boolean isSmart(){
        return smart;
    }

}


    class Phone extends Product {

        public String color;
        public float pixel;


        public Phone(String brand, String color, double pixel) {
            this.brand = brand;
            this.color = color;
            this.pixel = (float) pixel;

        }

        public String getColor() {
            return color;
        }

        public double getPixel() {
            return pixel;
        }
    }

    class Laptop extends Product {
        public String CPU;

        public Laptop(String CPU, int RAM, int HD, String brand) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.HD = HD;
            this.brand = brand;
        }
        public String brand;
        public    String getBrand() {
            return brand;
        }
        public String getCPU() {
            return CPU;
        }

        public int RAM;

        public int getRAM() {
            return RAM;
        }

        public int HD;

        public int getHD() {
            return HD;
        }
    }

        public class Products {

            static ArrayList<TV> soldTVs = new ArrayList<TV>();
            static ArrayList<Phone> soldPhones = new ArrayList<Phone>();
            static ArrayList<Laptop> soldLaptops = new ArrayList<Laptop>();

            static public void printProducts() {
                for (TV tv : soldTVs) {
                    System.out.println("TV brand is: " + tv.getBrand() + " and size is: " + tv.getSize() + "and smartness is: " + tv.isSmart());
                }
                System.out.println();
                for (Phone phone : soldPhones) {
                    System.out.println("Phone brand is: " + phone.getBrand() + " and color is: " + phone.getColor() + " and camera pixel is: " + phone.getPixel());
                }
                System.out.println();
                for (Laptop laptop : soldLaptops) {
                    System.out.println("Laptop brand is: " + laptop.getBrand() + " and CPU is: " + laptop.getCPU() + " and HD is: " + laptop.getHD()
                            + " and RAM is: " + laptop.getRAM());
                }
            }

            public static void main(String[] args) {

                int choice = 1;
                do {
                    if (choice == -1)
                        break;
                    else {
                        switch (choice) {
                            case 1:
                                String brand = "Sony";
                                int size = 65;
                                boolean smart = true;
                                TV tv = new TV(size, brand, smart);
                                soldTVs.add(tv);
                                break;
                            case 4:
                                brand = "Samsung";
                                size = 55;
                                smart = false;
                                tv = new TV(size, brand, smart);
                                soldTVs.add(tv);
                                break;

                            case 2:
                                String color = "red";
                                double pixel = 15.0;
                                brand = "Nokia";
                                Phone phone = new Phone(brand, color, pixel);
                                soldPhones.add(phone);
                                break;
                            case 5:
                                color = "blue";
                                pixel = 20.0;
                                brand = "Sony Ericsson";
                                phone = new Phone(brand, color, pixel);
                                soldPhones.add(phone);
                                break;
                            case 3:
                                String CPU = "Intel";
                                int RAM = 64;
                                int HD = 20;
                                brand = "Asus";
                                Laptop laptop = new Laptop(CPU, RAM, HD, brand);
                                soldLaptops.add(laptop);
                                break;
                            case 6:
                                CPU = "AMD";
                                RAM = 128;
                                HD = 50;
                                brand = "Acer";
                                laptop = new Laptop(CPU, RAM, HD, brand);
                                soldLaptops.add(laptop);
                                break;
                        }
                    }
                    choice++;
                } while (choice < 7);

                printProducts();
            }

        }
