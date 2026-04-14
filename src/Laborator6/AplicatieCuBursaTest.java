package Laborator6;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AplicatieCuBursaTest {

    @Test
    void testSorteaza() {
        //Arrange
        AplicatieCuBursa aplicatie = new AplicatieCuBursa();
        List<StudentBursier> listaNesortata = aplicatie.genereaza();

        //Act
        List<StudentBursier> listaSortata = aplicatie.sorteaza(listaNesortata);

        //Assert
        assertEquals(5, listaSortata.size(), "Lista trebuie să aibă 5 elemente");

        assertEquals("ISM141/1", listaSortata.get(0).getformatieDeStudiu(), "Grup greșit pe prima poziție");
        assertEquals("Mihalcea", listaSortata.get(0).getNume(), "Primul student trebuie să fie Mihalcea");

        assertEquals(100.00, listaSortata.get(3).getCuantumBursa(), 0.001, "Departajarea finală: bursa de 100 prima");
        assertEquals(780.80, listaSortata.get(4).getCuantumBursa(), 0.001, "Departajarea finală: bursa de 780.80 a doua");
    }
}
