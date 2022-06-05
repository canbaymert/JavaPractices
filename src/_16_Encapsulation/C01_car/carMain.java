package _16_Encapsulation.C01_car;

public class carMain {
    public static void main(String[] args) {
        car audi = new car();
        audi.setYear(-2018);
        audi.sethorsePower(220);
        audi.setColor("Grey");

        car toyota = new car("Avensis", "white", 300, -2020);

        car volvo = new car("s80", "black", 240, 2010);

        car wolkswagen = new car(200, -2008);

        System.out.println("Audi : " + audi);
        System.out.println("Volvo : " + volvo);
        System.out.println("Toyota -> " + " model: " + toyota.getModel() + " color: " + toyota.getColor() +
                " Horse Power: " + toyota.gethorsePower() + " year: " + toyota.getYear());
        System.out.println("Wolkswagen : " + wolkswagen);
    }
}