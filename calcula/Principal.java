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
                }

                else if (op == 2){
                    calc.sub();
                }

                else if (op == 3){
                    calc.mult();
                }

                else if (op == 4){
                    calc.div();
                }

                else if (op == 5){
                    calc.pot();
                }

                else if (op == 6){
                    calc.raiz();
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
