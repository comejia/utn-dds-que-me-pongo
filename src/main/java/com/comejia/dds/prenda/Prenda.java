package com.comejia.dds.prenda;

import com.comejia.dds.negocio.DomainException;

public class Prenda {

    private final TipoDePrenda tipoDePrenda;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;

    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color color) {
        if (tipoDePrenda == null) {
            throw new DomainException("Tipo de prenda no valido");
        }
        if (material == null) {
            throw new DomainException("Material no valido");
        }
        if (color == null) {
            throw new DomainException("Color no valido");
        }
        this.tipoDePrenda = tipoDePrenda;
        this.material = material;
        this.colorPrincipal = color;
    }

    public Categoria categoria() {
        return tipoDePrenda.categoria();
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

}
