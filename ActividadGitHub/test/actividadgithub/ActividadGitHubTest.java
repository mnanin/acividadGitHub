
package actividadgithub;

import org.junit.Test;
import static org.junit.Assert.*;

public class ActividadGitHubTest {
    
    public ActividadGitHubTest() {
    }

    // Test para comprobar la función utilizada para calcular la superficie (calculaSuperficie):
    @Test
    public void testCalculaSuperficie() {
        System.out.println("calculaSuperficie");
        int ladoA = 10;
        int ladoB = 20;
        String expResult = "La superficie del rectángulo es de 200 centímetros cuadrados.";
        String result = ActividadGitHub.calculaSuperficie(ladoA, ladoB);
        assertEquals(expResult, result);
    }
}


// TEST SUPERADO 