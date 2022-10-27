package pwo.utils;

import java.math.BigDecimal;

/**
 * Interfejs dowolnego generatora liczbowego
 * o wyrazach zdefiniowanych w zakresie od 0
 * 
 * @author  Rafał
 * @version 1.0.0
 */
public interface SequenceGenerator {
    /**
     * Powoduje, że metoda {@link #nextTerm()}
     * rozpoczyna od 0.
     * Nie wpływa na działanie metody {@link #getTerm(int)}
     */
    public void reset();

    /**
     * Zwraca kolejny wyraz ciągu
     * 
     * @return Wartość ciągu wyrazu
     * @see #getTerm(int)
     */
    BigDecimal nextTerm();

    /**
     * Zwraca wyraz ciągu o podanym indeksie
     * @param i Nr wyrazu ciągu dla którego jest 
     * uzyskiwana warotść
     * @return Wartośc liczbowa dla danego terminu
     * @exception IllegalArgumentException jeżeli i mniejsze od 0
     * @see #nextTerm()
     */
    BigDecimal getTerm(int i);
}
