import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    ContaBanco a1 = new ContaBanco();
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("informe o número da conta");
    a1.setNumConta(scanner.nextInt());  
    
    System.out.println("informe o nome do titular da conta");
    a1.setDono(scanner.next());
    
    System.out.println("informe o tipo da conta (Corrente ou Poupança)");
    a1.abrirConta(scanner.next());
    
    a1.estadoAtual();   
}
}
