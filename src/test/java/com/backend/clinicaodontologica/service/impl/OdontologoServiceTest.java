package com.backend.clinicaodontologica.service.impl;

import com.backend.clinicaodontologica.dto.entrada.odontologo.OdontologoEntradaDto;
import com.backend.clinicaodontologica.dto.salida.odontologo.OdontologoSalidaDto;
import com.backend.clinicaodontologica.dto.salida.paciente.PacienteSalidaDto;
import com.backend.clinicaodontologica.entity.Odontologo;
import com.backend.clinicaodontologica.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    private OdontologoService odontologoService;

    @Test
    @Order(1)
    void deberiaRegistrarUnOdontologoYRetornarElId() {
        OdontologoEntradaDto odontologoEntradaDto = new OdontologoEntradaDto("DSF4159870", "Tomas", "Maina");

        OdontologoSalidaDto odontologoSalidaDto = odontologoService.registrarOdontologo(odontologoEntradaDto);

        assertNotNull(odontologoSalidaDto.getId());
        assertEquals("Tomas", odontologoSalidaDto.getNombre());

    }
    @Test
    @Order(2)
    void deberiaRegistrarUnOdontologoYRetornarElId2() {
        OdontologoEntradaDto odontologoEntradaDto = new OdontologoEntradaDto("DSF4159870", "asda", "Maina");

        OdontologoSalidaDto odontologoSalidaDto = odontologoService.registrarOdontologo(odontologoEntradaDto);

        assertNotNull(odontologoSalidaDto.getId());
        assertEquals("asda", odontologoSalidaDto.getNombre());

    }

    @Test
    @Order(3)
    void deberiaRetornarUnOdontologoPorId(){
        try {
            OdontologoSalidaDto odontologoSalidaDto = odontologoService.buscarOdontologoPorId(1L);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(1, odontologoService.buscarOdontologoPorId(1L).getId());
    }

    @Test
    @Order(4)
    void deberiaListarLosOdontologos(){

        OdontologoEntradaDto odontologo1 = new OdontologoEntradaDto("DSF4159870", "Tomas", "Maina");
        OdontologoEntradaDto odontologo2 = new OdontologoEntradaDto("DSF4159871", "asda", "Maina");

        odontologoService.registrarOdontologo(odontologo1);
        odontologoService.registrarOdontologo(odontologo2);


        List<OdontologoSalidaDto> odontologoSalidaDto = odontologoService.listarOdontologos();
        assertNotNull(odontologoSalidaDto, "La lista no deberia ser nula");
        assertTrue(odontologoSalidaDto instanceof List, "El resultado deberia ser un objeto de tipo Lista");
        assertEquals(2, odontologoSalidaDto.size(), "Deberia tener 2");
    }
}