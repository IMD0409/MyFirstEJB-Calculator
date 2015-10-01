package br.ufrn.imd.imd0409.calculator.view;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.ufrn.imd.imd0409.calculator.bean.NoInterfaceViewCalculatorBean;

@ManagedBean
public class CalculatorManagedBean {
	private int numero1, numero2, resultado;
	
	@EJB
	NoInterfaceViewCalculatorBean calc;

	public CalculatorManagedBean() {
	}
	
	public String calcula() {
		setResultado(calc.add(numero1, numero2));
		return "Soma";
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

}
