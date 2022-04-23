package com.comejia.dds.prenda;

import com.comejia.dds.negocio.PrendaInvalidaException;

public class Prenda {

    private final TipoDePrenda tipoDePrenda;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;

    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Color colorSecundario) {
        if (tipoDePrenda == null) {
            throw new PrendaInvalidaException("Tipo de prenda no valido");
        }
        if (material == null) {
            throw new PrendaInvalidaException("Material no valido");
        }
        if (colorPrincipal == null) {
            throw new PrendaInvalidaException("Color no valido");
        }
        this.tipoDePrenda = tipoDePrenda;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

    public Categoria categoria() {
        return tipoDePrenda.categoria();
    }

}
