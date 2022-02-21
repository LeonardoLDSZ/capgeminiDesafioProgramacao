package TesteUnitario;

import Question03.AnagramaApp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramaTest {

    AnagramaApp anagramaApp = new AnagramaApp();

    String anagramaTeste01 = "aviao";
    String anagramaTeste02 = "aaaaaaaaaaaaaaaaaaaa";
    String anagramaTeste03 = "pindamonhagaba";


    @Test
    public void resultadoAnagramaPositivo1() {
        Integer resultExpected = 2;
        Integer result = anagramaApp.anagramas(anagramaTeste01);
        assertEquals(resultExpected, result);
    }

    @Test
    public void resultadoAnagramaPositivo2() {
        Integer resultExpected = 1330;
        Integer result = anagramaApp.anagramas(anagramaTeste02);
        assertEquals(resultExpected, result);
    }

    @Test
    public void resultadoAnagramaPositivo3() {
        Integer resultExpected = 14;
        Integer result = anagramaApp.anagramas(anagramaTeste03);
        assertEquals(resultExpected, result);
    }
}
