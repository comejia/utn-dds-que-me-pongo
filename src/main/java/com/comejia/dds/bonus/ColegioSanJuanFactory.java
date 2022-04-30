package com.comejia.dds.bonus;

import com.comejia.dds.prenda.*;

public class ColegioSanJuanFactory implements EstablecimientoAbstractFactory {

    @Override
    public Prenda crearParteSuperior() {
        Borrador builder = new Borrador(Trama.LISA);
        return builder.indicarTipoPrenda(TipoDePrenda.CHOMBA)
                .indicarColorPrincipal(new Color())
                .indicarMaterial(Material.PIQUE)
                .build();
    }

    @Override
    public Prenda crearParteInferior() {
        Borrador builder = new Borrador(Trama.LISA);
        return builder.indicarTipoPrenda(TipoDePrenda.PANTALON)
                .indicarColorPrincipal(new Color())
                .indicarMaterial(Material.ACETATO)
                .build();
    }

    @Override
    public Prenda crearCalzado() {
        Borrador builder = new Borrador(Trama.LISA);
        return builder.indicarTipoPrenda(TipoDePrenda.ZAPATILLAS)
                .indicarColorPrincipal(new Color())
                .indicarMaterial(Material.ALGODON)
                .build();
    }
}
