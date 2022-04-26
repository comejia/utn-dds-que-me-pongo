package com.comejia.dds.bonus;

import com.comejia.dds.prenda.*;

public class ColegioSanJuanFactory implements EstablecimientoAbstractFactory {

    @Override
    public Prenda crearParteSuperior() {
        PrendaBuilder builder = new PrendaBuilder(TipoDePrenda.CHOMBA);
        builder.indicarColorPrincipal(new Color());
        builder.indicarMaterial(Material.PIQUE);
        return builder.build();
    }

    @Override
    public Prenda crearParteInferior() {
        PrendaBuilder builder = new PrendaBuilder(TipoDePrenda.PANTALON);
        builder.indicarColorPrincipal(new Color());
        builder.indicarMaterial(Material.ACETATO);
        return builder.build();
    }

    @Override
    public Prenda crearCalzado() {
        PrendaBuilder builder = new PrendaBuilder(TipoDePrenda.ZAPATILLAS);
        builder.indicarColorPrincipal(new Color());
        builder.indicarMaterial(Material.ALGODON);
        return builder.build();
    }
}
