import java.util.Scanner;
public class ExibirMultiplos {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        for(int i=1; i<13; i++){
            int produto = num*i;
            System.out.println(num+"x"+i+" = "+produto);
        }
    }
}
