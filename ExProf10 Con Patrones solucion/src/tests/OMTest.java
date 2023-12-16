package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import modelo.Deposito;
import modelo.Repostaje;
import modelo.Surtidor;
import objectMother.OM;

public class OMTest {

	 @Test
	    void testGetSurtidoresNoRandom() {
	        OM tuClase = new OM();
	        System.out.println("om");

	        // Obtener los surtidoress
	        List<Surtidor> surtidores = tuClase.getSurtidores();

	        // Verificar que la lista de surtidores no sea nula
	        assertNotNull(surtidores);

	        // Verificar que haya cinco surtidores
	        assertEquals(4, surtidores.size());

	        // Verificar la validez de cada surtidor
	        for (Surtidor surtidor : surtidores) {
	            // Verificar que el número del surtidor esté dentro del rango esperado
	            assertTrue(surtidor.getNumero() >= 0 && surtidor.getNumero() < 4);

	            // Verificar que el conjunto de depósitos no sea nulo
	            assertNotNull(surtidor.getDepositos());

	            // Verificar que el conjunto de depósitos sea no vacío
	            assertFalse(surtidor.getDepositos().isEmpty());

	            // Verificar que los depósitos estén dentro del rango esperado
	            for (Deposito deposito : surtidor.getDepositos()) {
	                assertTrue(deposito.getCombustible() != null);
	                assertTrue(deposito.getCapacidad() > 0);
	                assertTrue(deposito.getCantidadActual() >= 0 && deposito.getCantidadActual() <= deposito.getCapacidad());
	            }
	        }
	    }
   
    @Test
    public void testGetDepositosOM() {
        OM om = new OM();
        List<Deposito> depositos = om.getDepositos();
        assertNotNull(depositos);
        assertFalse(depositos.isEmpty());
    }

  
    @Test
    public void testGetRandomRepostaje() {
        OM om = new OM();
        List<Surtidor> surtidores = om.getSurtidores();
        Repostaje repostaje = om.getRepostajeRandom(surtidores);

        assertNotNull(repostaje);
        assertNotNull(repostaje.getSurtidor());
        assertNotNull(repostaje.getCombustible());

    }
}
