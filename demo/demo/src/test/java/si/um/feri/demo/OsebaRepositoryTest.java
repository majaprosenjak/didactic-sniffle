package si.um.feri.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import si.um.feri.demo.Model.Oseba;
import si.um.feri.demo.Repozitorij.OsebaRepository;
import si.um.feri.demo.*;


import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OsebaRepositoryTest {
    private OsebaRepository dao;

    Oseba oseba;

    @BeforeEach
    void BeforeEach(){
        //dao.deleteAll();
        //oseba = dao.save(new Oseba("TestnoIme", "TestniPriimek", "TestniEmail"));
        Oseba testnOseba = new Oseba("TestnoIme", "TestniPriimek", "TestniEmail");

    }

    @Test
    void sestevanjeTest(){
        int zacetnoStanje = 15;
        zacetnoStanje = zacetnoStanje + 10;
        assertEquals(25, zacetnoStanje);
    }
}
