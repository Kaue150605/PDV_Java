import java.util.Scanner;

public class PDV{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Preço unitário: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        double subtotal = preco* quantidade;

        System.out.println("\n---- RESUMO ----");
        System.out.println("Produto:" + produto);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Subtotal: R$" + subtotal);

        //Lógica do desconto
        double desconto = 0.0;

        if(subtotal >= 100) {
            if (subtotal >= 200) {
                desconto = subtotal * 0.15;
            } else {
                desconto = subtotal * 0.10;
            }
        }else{
            desconto = 0.0;
        }

        double total = subtotal - desconto;

        System.out.println("Desconto: R$" + desconto);
        System.out.println("Total: R$" + total);



        sc.close();
    }
}