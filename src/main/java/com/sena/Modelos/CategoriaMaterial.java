package com.sena.Modelos;

import java.util.Arrays;
import java.util.List;

public enum CategoriaMaterial {
    MATERIALES_NATURALES(Arrays.asList(TipoMaterial.ROCA, TipoMaterial.MADERA, TipoMaterial.BARRO_ARCILLA)),
    MATERIALES_ARTIFICIALES(Arrays.asList(TipoMaterial.HORMIGON, TipoMaterial.ASFALTO, TipoMaterial.MATERIAL_COMPUESTO)),
    MATERIALES_METALICOS(Arrays.asList(TipoMaterial.ACERO, TipoMaterial.ALUMINIO, TipoMaterial.HIERRO));

    private List<TipoMaterial> tipos;

    CategoriaMaterial(List<TipoMaterial> tipos) {
        this.tipos = tipos;
    }

    public List<TipoMaterial> getTipos() {
        return tipos;
    }
}
