public class Kremlin {
    private String name; //Название
    private int year; //Год постройки
    private int height; //Высота
    private int amountDome; //Количество куполов

    public Kremlin(String name, int year, int height, int amountDome) {
        this.name = name;
        this.year = 1561;
        this.height = 65;
        this.amountDome = 11;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getHeight() {
        return height;
    }

    public int getAmountDome() {
        return amountDome;
    }

    public void setSoborPokrova() {
        this.name = name;
    }

    public void setYear() {
        this.year = year;
    }

    public void setHeight() {
        this.height = height;
    }

    public void setAmountDome() {
        this.amountDome = amountDome;
    }
}