import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Transport[] vehicles = {
            new Car("ВАЗ-1119", 2007, "ВАЗ-21114", 180),
            new Car("ВАЗ-21106", 1998, "OPEL C20XE", 220),
            new SportsCar("ВАЗ-21214 Sport", 2025, "ВАЗ-21179", 150),
            new Truck("КамАЗ-5320", 1990, "КамАЗ-740", 90),
            new Bike("ИЖ Планета Спорт", 1980, "ИЖ", 90)
        };
        for (Transport vehicle : vehicles){
            vehicle.getDescription();
            vehicle.changeEngine();
        }
        System.out.println("Кол-во автомобилей: " + Car.getCarsCount());
    }
}

abstract class Transport{

    private String model;
    private int yearProduction;
    private String engineModel;
    private int maxSpeed;

    public Transport(){
        this.model = "не указано";
        this.yearProduction = 1970;
        this.engineModel = "нет модели двигателя";
        this.maxSpeed = 90;
    } 

    public Transport(String model, int yearProduction, String engineModel, int maxSpeed){
        this.model = model;
        this.yearProduction = yearProduction;
        this.engineModel = engineModel;
        this.maxSpeed = maxSpeed;
    }

    public String getModel(){
        return model;
    }

    public int getYearProduction(){
        return yearProduction;
    }

    public String getEngineModel(){
        return engineModel;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setModel(String model){
        this.model = model;
    }

     public void setYearProduction(int yearProduction){
        this.yearProduction = yearProduction;
    }

     public void setEngineModel(String engineModel){
        this.engineModel = engineModel;
    }

     public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public abstract void getDescription();
    public abstract void changeEngine();
}

    class Car extends Transport{
    private static int carsCount = 0;

    public Car(String model, int yearProduction, String engineModel, int maxSpeed){
       super(model, yearProduction, engineModel, maxSpeed);
       carsCount++;
    }

    @Override
    public void getDescription(){
        System.out.println("Автомобиль " + getModel() + " года выпуска " + getYearProduction()
        + " с двигателем " + getEngineModel() + " едет с макс. скоростью " + getMaxSpeed());
    }

    @Override
    public void changeEngine(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите модель нового двигателя: ");
        setEngineModel(in.nextLine());
        System.out.println("У автомобиля " + getModel() + " новый двигатель " + getEngineModel());
    }
    public static int getCarsCount(){
        return carsCount;
    }
}

     class SportsCar extends Car{
    public SportsCar(String model, int yearProduction, String engineModel, int maxSpeed){
       super(model, yearProduction, engineModel, maxSpeed);
    }

    @Override
    public void getDescription(){
        System.out.println("Спортивный авто " + getModel() + " года выпуска " + getYearProduction()
        + " с двигателем " + getEngineModel() + " едет с макс. скоростью " + getMaxSpeed());
    }

    @Override
    public void changeEngine(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите модель нового двигателя: ");
        setEngineModel(in.nextLine());
        System.out.println("У спортивного автомобиля " + getModel() + " новый двигатель " + getEngineModel());
    }
}

     class Truck extends Transport{
    public Truck(String model, int yearProduction, String engineModel, int maxSpeed){
       super(model, yearProduction, engineModel, maxSpeed);
    }

    @Override
    public void getDescription(){
        System.out.println("Грузовик " + getModel() + " года выпуска " + getYearProduction()
        + " с двигателем " + getEngineModel() + " едет с макс. скоростью " + getMaxSpeed());
    }

    @Override
    public void changeEngine(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите модель нового двигателя: ");
        setEngineModel(in.nextLine());
        System.out.println("У грузовика " + getModel() + " новый двигатель " + getEngineModel());
    }
}

     class Bike extends Transport{
    public Bike(String model, int yearProduction, String engineModel, int maxSpeed){
       super(model, yearProduction, engineModel, maxSpeed);
    }

    @Override
    public void getDescription(){
        System.out.println("Мотоцикл " + getModel() + " года выпуска " + getYearProduction()
        + " с двигателем " + getEngineModel() + " едет с макс. скоростью " + getMaxSpeed());
    }

    @Override
    public void changeEngine(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите модель нового двигателя: ");
        setEngineModel(in.nextLine());
        System.out.println("У мотоцикла " + getModel() + " новый двигатель " + getEngineModel());
    }
}
