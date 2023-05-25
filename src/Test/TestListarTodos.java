package Test;

import com.backend.dao.impl.OdontologoDaoH2;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestListarTodos {

    private static Connection connection = null;
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public void deberiaListarTodosOdontologos() {
        List<Odontologo> odontologosTest = odontologoService.listarOdontologos();
        assertFalse(odontologosTest.isEmpty());
        assertTrue(odontologosTest.size() >= 3);
    }

}

