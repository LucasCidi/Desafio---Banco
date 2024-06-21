import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		List<Conta> contas = new ArrayList<>();
		venilton.setNome("Venilton");
		
		Banco b1 = new Banco();
		Conta cc = new ContaCorrente(venilton);
		Conta c2 = new ContaPoupanca(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		

		contas.add(cc);
		contas.add(c2);

		b1.setContas(contas);

		b1.getContas();

	}

}
