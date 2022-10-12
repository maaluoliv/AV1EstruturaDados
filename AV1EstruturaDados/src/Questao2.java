import com.sun.jdi.PathSearchingVirtualMachine;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;


public class Questao2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        Stack pilha1 = new Stack();
        Stack pilha2 = new Stack();
        Stack pilha3 = new Stack();

        Scanner scan1 = new Scanner(new File("./pilha/pilha1.txt"));
        Scanner scan2 = new Scanner(new File("./pilha/pilha2.txt"));
        Scanner scan3 = new Scanner(new File("./pilha/pilha3.txt"));


        while(scan1.hasNextLine() && scan2.hasNextLine() && scan3.hasNextLine()) {
            pilha1.push(scan1.nextLine());
            pilha2.push(scan2.nextLine());
            pilha3.push(scan3.nextLine());
        }

        while(!pilha1.empty() && !pilha2.empty() && !pilha3.empty()) {
            System.out.println("Assistente 1 - prato: "+pilha1.pop());
            System.out.println("Assistente 2 - prato: "+pilha2.pop());
            System.out.println("Assistente 3 - prato: "+pilha3.pop());
        }

        }
    }
