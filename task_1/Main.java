public class Main{
    public static void main(String[] args){
    HashTable<String, String> example_table = new HashTable<>();

    example_table.put("Петр", "Менеджер");
    example_table.put("Сергей","Водитель");
    example_table.put("Анна","Бухгалтер");

    System.out.println("Петр является " + example_table.get("Петр"));

    example_table.put("Петр", "Генеральный директор");
    System.out.println("Петр стал " + example_table.get("Петр")); 

    System.out.println("Таблица пустая? " + example_table.isEmpty());

    System.out.println("Размер таблицы: " + example_table.size());
    

    System.out.println("Удалить Сергея, у которого была должность " + example_table.remove("Сергей"));
}
}