package com.backend.clinicaodontologica.entity;

import javax.persistence.*;

@Entity
@Table(name = "DOMICILIOS")
public class Domicilio {

    //json -> dto Controlador dto -> servicio dto -> entidad -> repository (dao) -> entidad a BD -> repositoy -> servicio entidad a dto -> controlador -> dto @ResposeBody (dentro de @RestController) -> json
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String calle;

    @Column(length = 8)
    private int numero;
    @Column(length = 50)
    private String localidad;
    @Column(length = 50)
    private String provincia;

    public Domicilio() {
    }

    public Domicilio(String calle, int numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


}
