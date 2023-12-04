package com.backend.clinicaodontologica.dto.salida.turno;

import com.backend.clinicaodontologica.dto.salida.odontologo.OdontologoSalidaDto;
import com.backend.clinicaodontologica.dto.salida.paciente.PacienteSalidaDto;
import com.backend.clinicaodontologica.entity.Odontologo;
import com.backend.clinicaodontologica.entity.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.Valid;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class TurnoSalidaDto {


<<<<<<< HEAD
    private int id;
=======
    private Long id;
>>>>>>> 92093fc39a9bbcb867172bc39066b8c8b613ec65


    private Paciente paciente;


    private Odontologo odontologo;

    private LocalDateTime fechaYHora;

    public TurnoSalidaDto() {
    }

<<<<<<< HEAD
    public TurnoSalidaDto(int id, Paciente paciente, Odontologo odontologo, LocalDateTime fechaYHora) {
=======
    public TurnoSalidaDto(Long id, Paciente paciente, Odontologo odontologo, LocalDateTime fechaYHora) {
        this.id = id;
>>>>>>> 92093fc39a9bbcb867172bc39066b8c8b613ec65
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechaYHora = fechaYHora;
    }

<<<<<<< HEAD
    public int getId() {
        return id;
    }

    public void setId(int id) {
=======
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
>>>>>>> 92093fc39a9bbcb867172bc39066b8c8b613ec65
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    @Override
    public String toString(){
<<<<<<< HEAD
        return ("\n Turno id :" + this.getId() + " \n Pacientes: " + this.getPaciente() + " \n Odontologo :" + this.getOdontologo() + " \n Fecha y Hora: " + this.getFechaYHora());
=======
        return ("\n Turno id :" + this.getId() + " \n Pacientes: " + this.getPaciente() + " \n Odontologo :" + this.getOdontologo());
>>>>>>> 92093fc39a9bbcb867172bc39066b8c8b613ec65
    }
}


