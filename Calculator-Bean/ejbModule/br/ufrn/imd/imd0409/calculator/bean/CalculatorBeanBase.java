/**
 * 
 */
package br.ufrn.imd.imd0409.calculator.bean;

/**
 * @author kaduardo
 *
 */
public class CalculatorBeanBase implements CalculatorCommonBusiness {

	/**
	 * 
	 */
	public CalculatorBeanBase() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see br.ufrn.imd.imd0409.calculator.bean.CalculatorCommonBusiness#add(int[])
	 */
	@Override
	public int add(int... arguments) {
		int result = 0;
		
		for (int arg : arguments) {
			result += arg;
		}
		return result;
	}

}
