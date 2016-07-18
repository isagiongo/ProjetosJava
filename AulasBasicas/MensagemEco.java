import java.util.Scanner;

class MensagemEco {
	public static void main (String[] args){
	Scanner ler = new Scanner(System.in);
	String msg;
	System.out.printf("Digite sua mensagem: ");
	msg = ler.nextLine();
	
	System.out.println("Sua Mensagem eh " + msg);
	
	
	}

}