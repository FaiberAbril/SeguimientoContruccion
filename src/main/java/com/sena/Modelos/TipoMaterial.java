package com.sena.Modelos;

public enum TipoMaterial {
    ROCA("Roca"),
    MADERA("Madera"),
    BARRO_ARCILLA("Barro/Arcilla"),
    HORMIGON("Hormigón"),
    ASFALTO("Asfalto"),
    MATERIAL_COMPUESTO("Material Compuesto"),
    ACERO("Acero"),
    ALUMINIO("Aluminio"),
    HIERRO("Hierro");

    private String nombre;

    TipoMaterial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
