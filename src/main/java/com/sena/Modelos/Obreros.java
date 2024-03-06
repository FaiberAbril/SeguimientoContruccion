package com.sena.Modelos;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Obreros")
public class Obreros {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idObrero;

    @Column(length = 50)
    private String Nombre;

    @Column(length = 50)
    private String Apellido;

    @Enumerated(EnumType.STRING)
    @Column(length = 5)
    private TipoDocumento TipoDoc;

    @Column(length = 10)
    private String Documento;

    @Enumerated(EnumType.STRING)
    @Column(length = 3)
    private TipoSangre TipoSan;

    @Column(length = 50)
    private String Telefono;

    @Column(length = 50)
    private String Email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate Fecha_nac;

    @Column(length = 50)
    private String Direccion;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Calificacion calificacion;

    public Obreros() {
    }

    public Obreros(int idObrero, String nombre, String apellido, TipoDocumento tipoDoc, String documento,
            TipoSangre tipoSan, String telefono, String email, LocalDate fecha_nac, String direccion,
            Calificacion calificacion) {
        super();
        this.idObrero = idObrero;
        Nombre = nombre;
        Apellido = apellido;
        TipoDoc = tipoDoc;
        Documento = documento;
        TipoSan = tipoSan;
        Telefono = telefono;
        Email = email;
        Fecha_nac = fecha_nac;
        Direccion = direccion;
        this.calificacion = calificacion;
    }

    public int getIdObrero() {
        return idObrero;
    }

    public void setIdObrero(int idObrero) {
        this.idObrero = idObrero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public TipoDocumento getTipoDoc() {
        return TipoDoc;
    }

    public void setTipoDoc(TipoDocumento tipoDoc) {
        TipoDoc = tipoDoc;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public TipoSangre getTipoSan() {
        return TipoSan;
    }

    public void setTipoSan(TipoSangre tipoSan) {
        TipoSan = tipoSan;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getFecha_nac() {
        return Fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        Fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public enum TipoDocumento {
        DNI("D.N.I"), Pasaporte("P.A"), Cedula("C.C"), Tarjeta_identidad("T.I");

        private String sigla;

        TipoDocumento(String sigla) {
            this.sigla = sigla;
        }

        public String getSigla() {
            return sigla;
        }
    }

    public enum TipoSangre {
        A_POSITIVO("A+"), A_NEGATIVO("A-"), B_POSITIVO("B+"), B_NEGATIVO("B-"), O_POSITIVO("O+"), O_NEGATIVO(
                "O-"), AB_POSITIVO("AB+"), AB_NEGATIVO("AB-");

        private String tipo;

        TipoSangre(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }
    }

    public enum Calificacion {
        bueno, malo, regular
    }

}
