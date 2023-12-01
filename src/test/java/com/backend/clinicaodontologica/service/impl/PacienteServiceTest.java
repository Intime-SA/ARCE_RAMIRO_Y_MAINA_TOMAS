package com.backend.clinicaodontologica.service.impl;

import com.backend.clinicaodontologica.dto.entrada.paciente.DomicilioEntradaDto;
import com.backend.clinicaodontologica.dto.entrada.paciente.PacienteEntradaDto;
import com.backend.clinicaodontologica.dto.salida.paciente.PacienteSalidaDto;
import com.backend.clinicaodontologica.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class PacienteServiceTest {

     @Autowired
    private PacienteService pacienteService;


     @Test
     @Order(1)
    void SiElPacienteSeRegistroOk_DeberiaDevolverNombre(){
         PacienteEntradaDto pacienteEntradaDto = new PacienteEntradaDto("Juan", "Pablo", 39349791, LocalDate.of(2023, 11, 30), new DomicilioEntradaDto("Mendoza", 2070, "Mar del Plata", "Buenos Aires"));

         PacienteSalidaDto pacienteSalidaDto = pacienteService.registrarPaciente(pacienteEntradaDto);
         assertNotNull(pacienteSalidaDto.getId());
         assertEquals("Juan", pacienteSalidaDto.getNombre());
     }

     @Test
     @Order(2)
     void siElPacienteConId1FueEliminado(){
         try {
             pacienteService.eliminarPaciente(1L);
         }
         catch ( Exception e) {
             e.printStackTrace();
         }

         assertThrows(ResourceNotFoundException.class, () -> pacienteService.eliminarPaciente(1L));

     }

     @Test
    @Order(3)
    void deberiaDevolverUnaListaVaciaDePacientes(){
         List<PacienteSalidaDto> pacienteSalidaDtoList = pacienteService.listarPacientes();
         assertTrue(pacienteSalidaDtoList.isEmpty());
     }










}