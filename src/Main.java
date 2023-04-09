public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98 ;
        double index = service.calculate(height, weight);
        System.out.println("Рост: " + height + " м");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Индекс массы тела: " + index);
    }
}