package calcula;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        try (Scanner ent = new Scanner(System.in)){
            Calculadora calc = new Calculadora();
            char repeat = 's';

            while (repeat == 's'){
                calc.menu();
                int op = ent.nextInt();

                if (op == 1){
                    calc.soma();
                    System.out.println("=====================================");
                }

                else if (op == 2){
                    calc.sub();
                    System.out.println("=====================================");
                }

                else if (op == 3){
                    calc.mult();
                    System.out.println("=====================================");
                }

                else if (op == 4){
                    calc.div();
                    System.out.println("=====================================");
                }

                else if (op == 5){
                    calc.pot();
                    System.out.println("=====================================");
                }

                else if (op == 6){
                    calc.raiz();
                    System.out.println("=====================================");
                }

                else if (op == 7){
                    repeat = 'n';
                }

                else{
                    System.out.println("Escolha uma opção válida");
                }
            }
        }
    }
}
