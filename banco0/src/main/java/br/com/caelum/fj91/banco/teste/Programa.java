package br.com.caelum.fj91.banco.teste;

import java.math.BigDecimal;

import br.com.caelum.fj91.banco.modelo.Cliente;
import br.com.caelum.fj91.banco.modelo.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta = new Conta(new Cliente(), 100);
		
		// TODO vamos precisar usar o construtor de Conta
		// Conta conta = new Conta(123, Calendar.getInstance());
		
		conta.setLimite(new BigDecimal(100));
		conta.deposita(new BigDecimal(250));
		
		System.out.println("Saldo resultante: R$ " + conta.getSaldo());
		
		conta.saca(new BigDecimal(99));
		
		System.out.println("Saldo resultante: R$ " + conta.getSaldo());
	}
}
