package com.comejia.dds.bonus;

import com.comejia.dds.prenda.*;

public class InstitutoJohnsonFactory implements EstablecimientoAbstractFactory {

    @Override
    public Prenda crearParteSuperior() {
        PrendaBuilder builder = new PrendaBuilder(TipoDePrenda.CAMISA_MANGA_CORTA);
        builder.indicarColorPrincipal(new Color());
        builder.indicarMaterial(Material.ALGODON);
        return builder.build();
    }

    @Override
    public Prenda crearParteInferior() {
        PrendaBuilder builder = new PrendaBuilder(TipoDePrenda.PANTALON);
        builder.indicarColorPrincipal(new Color());
        builder.indicarMaterial(Material.SEDA);
        return builder.build();
    }

    @Override
    public Prenda crearCalzado() {
        PrendaBuilder builder = new PrendaBuilder(TipoDePrenda.ZAPATOS);
        builder.indicarColorPrincipal(new Color());
        builder.indicarMaterial(Material.CUERO);
        return builder.build();
    }
}
