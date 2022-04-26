package com.comejia.dds.bonus;

import com.comejia.dds.prenda.Prenda;

public class Uniforme {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;

    private Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
    }

    public static Uniforme crear(EstablecimientoAbstractFactory factory) {
        return new Uniforme(
                factory.crearParteSuperior(),
                factory.crearParteInferior(),
                factory.crearCalzado()
        );
    }
}
