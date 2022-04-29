package _16_encapsulation.C01_car;

public class car {
    private String model;
    private String color;
    private int horsePower;
    private int year;

    public car() {
    }

    public car(String model, String color, int horsePower, int year) {
        this.model = model;
        this.color = color;
        sethorsePower(horsePower);
        setYear(year);

    }

    public car(int horsePower, int year) {
        sethorsePower(horsePower);
        setYear(year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public int gethorsePower() {
        return horsePower;
    }

    public void sethorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            this.year = (-1) * year;
        } else
            this.year = year;
    }

    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", year=" + year +
                '}';
    }
}
