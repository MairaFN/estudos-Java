package aula0204;

import java.util.Scanner;

public class Contato {
    private String telefoneResid;
    private String celular;
    private String email;

    public Contato(){

    }
    public void contatar(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Telefone Residencial: ");
       this.telefoneResid = sc.nextLine();
       System.out.println("Celular: ");
       this.celular = sc.nextLine();
       System.out.println("Email: ");
       this.email = sc.nextLine();
   }

    @Override
    public String toString() {
        return "Telefone Residencial: " + telefoneResid + '\n'+
                "Celular: " + celular + '\n'+
                "Email: " + email.toLowerCase();
    }
}
