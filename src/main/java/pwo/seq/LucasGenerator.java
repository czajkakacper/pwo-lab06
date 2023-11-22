/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa generatora ciągu Lucasa, dziedziczy po FibonacciGenerator
 * @author student
 */

public class LucasGenerator extends FibonacciGenerator {

    /**
     *
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }
    /**
     * Metoda reset w ciągu Lucasa
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }
    /**
     * Metoda nastepnego argumentu w ciągu Lucasa
     * @return 
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
