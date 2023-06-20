package calcula;
import java.util.Scanner;

public class Calculadora {
    double n1;
    double n2;

    Scanner ent = new Scanner(System.in);

    public void soma(){
        System.out.println("Diga o primeiro número: ");
        n1 = ent.nextDouble();
        System.out.println("Diga o segundo número: ");
        n2 = ent.nextDouble();
        System.out.println("=====================================");
        System.out.println(n1 + n2);
    }

    public void sub(){
        System.out.println("Diga o primeiro número: ");
        n1 = ent.nextDouble();
        System.out.println("Diga o segundo número: ");
        n2 = ent.nextDouble();
        System.out.println("=====================================");
        System.out.println(n1 - n2);
    }

    public void mult(){
        System.out.println("Diga o primeiro número: ");
        n1 = ent.nextDouble();
        System.out.println("Diga o segundo número: ");
        n2 = ent.nextDouble();
        System.out.println("=====================================");
        System.out.println(n1 * n2);
    }

    public void div(){
        System.out.println("Diga o primeiro número: ");
        n1 = ent.nextDouble();
        System.out.println("Diga o segundo número: ");
        n2 = ent.nextDouble();
        System.out.println("=====================================");
        System.out.println(n1 / n2);
    }

    public void pot(){
        System.out.println("Diga a base: ");
        n1 = ent.nextDouble();
        System.out.println("Diga o expoente: ");
        n2 = ent.nextDouble();
        System.out.println("=====================================");
        System.out.println(Math.pow(n1, n2));
    }

    public void raiz(){
        System.out.println("Diga o radical: ");
        n1 = ent.nextDouble();
        System.out.println("=====================================");
        System.out.println(Math.sqrt(n1));
    }

    public void menu(){
        System.out.println("Operações disponiveis");
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Multiplicação");
        System.out.println("4.Divisão");
        System.out.println("5.Potência");
        System.out.println("6.Raiz quadrada");
        System.out.println("7.Finalizar programa");
        System.out.println("");
        System.out.println("Escolha uma opção:");
    }
}
