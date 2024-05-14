public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int soma(int a, int b, int c) {
        return a + b + c;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
            Calculadora calc = new Calculadora();
            System.out.println("Soma de 2 inteiros: " + calc.soma(2, 3));
            System.out.println("Soma de 3 inteiros: " + calc.soma(1, 2, 3));
        System.out.println("Soma de 2 doubles: " + calc.soma(2.5, 3.5));
    }
}
