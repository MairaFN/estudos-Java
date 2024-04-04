package aula0204;
import java.util.Scanner;

public class Data {
   private int dia;
   private int mes;
   private int ano;

   public Data() {

   }
   public void aniversario() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Dia: ");
      this.dia = sc.nextInt();
      System.out.println("Mes: ");
      this.mes = sc.nextInt();
      System.out.println("Ano: ");
      this.ano = sc.nextInt();
   }

   @Override
   public String toString() {
      return dia +"/"+ mes + "/" + ano;
   }
}