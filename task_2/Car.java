public class Car{
    private String model;
    private String brand;
    private int year;

    public Car(){
        this.brand = "Нет марки";
        this.model = "Нет модели";
        this.year = 2000;
    }

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getModel(){
        return this.model;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getYear(){
        return this.year;
    }

    public void CarInfo(){
        System.out.println(this.getBrand() + ' ' + this.getModel() + " выпуска " + this.getYear());
    }
}