public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.87;
        int weight = 98 ;
        System.out.println("Рост: " + height + " м");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Индекс массы тела: " + service.calculate(height, weight));
    }
}