import com.sun.jdi.PathSearchingVirtualMachine;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;


public class Questao2 {

    public static void main(String[] args) throws FileNotFoundException {

        int pilha1, pilha2, pilha3;

             Queue<String> pq = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);

        Stack pilha = new Stack();

        Scanner scan1 = new Scanner(new File("./pilha/pilha1.txt"));
        Scanner scan2 = new Scanner(new File("./pilha/pilha2.txt"));
        Scanner scan3 = new Scanner(new File("./pilha/pilha3.txt"));

        while (scanner.hasNextLine()) {
            pilha.push(scanner.nextLine());
        }

       System.out.println("Empilhando pratos");
             Iterator iterator = pq.iterator();

        System.out.println(pilha);

        while (!pilha.empty()) {
            System.out.println(pilha.pop());
        }
    }
}