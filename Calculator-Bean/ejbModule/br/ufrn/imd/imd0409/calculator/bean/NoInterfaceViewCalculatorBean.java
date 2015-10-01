package br.ufrn.imd.imd0409.calculator.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class NoInterfaceViewCalculatorBean
 */
@Stateless
@LocalBean
public class NoInterfaceViewCalculatorBean extends CalculatorBeanBase {
       
    /**
     * @see CalculatorBeanBase#CalculatorBeanBase()
     */
    public NoInterfaceViewCalculatorBean() {
        super();
    }

}
