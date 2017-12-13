public class Calc {

    public static void main(String[] args) {

        System.out.println("Введите первое значение");
        double a = Utils.getDouble(3);

        System.out.println("Введите знак");
        String s = Utils.getSighn(3);

        System.out.println("Введите второе значение");
        double b = Utils.getDouble(3);
        double c = 0;

        switch (s) {
            case "+": {
                c = a + b;
                break;
            }
            case "-": {
                c = a - b;
                break;
            }
            case "/": {
                c = a / b;
                break;
            }
            case "*": {
                c = a * b;
                break;
            }
            default: {
                c = 0;
            }
        }


        System.out.printf("%2f",c);

    }
}
