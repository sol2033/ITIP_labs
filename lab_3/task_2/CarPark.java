import java.util.HashMap;

public class CarPark{
    public static void main(String[] args){
        Car car1 = new Car();

        HashMap <String, Car> carMap = new HashMap<>();

        carMap.put("А777АА77",car1);
        carMap.put("С123РУ23",new Car("ВАЗ","2108", 1999));
        carMap.put("В193ВУ73",new Car("АЗЛК","2141", 2002));
        carMap.put("К653УУ13",new Car("ГАЗ","3110", 2005));

        System.out.println("Автомобиль с номером С123РУ23: " + carMap.get("С123РУ23").getBrand());
        System.out.println("Автомобиль с номером С123РУ23: " + carMap.get("С1"));

        carMap.remove("К653УУ13");
        System.out.println("Автомобиль с номером К653УУ13 после remove(): " + carMap.containsKey("К653УУ13"));

        System.out.println("Автопарк до полной очистки хэш таблицы: " + carMap.size());
        carMap.clear();
        System.out.println("Автопарк после полной очистки хэш таблицы: " + carMap.size());
    }
}