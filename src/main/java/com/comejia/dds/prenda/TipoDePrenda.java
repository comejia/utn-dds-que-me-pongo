package com.comejia.dds.prenda;

public enum TipoDePrenda {

    ZAPATOS {
        @Override
        public Categoria categoria() {
            return Categoria.CALZADO;
        }
    },
    CAMINSA_MANGA_CORTA {
        @Override
        public Categoria categoria() {
            return Categoria.PARTE_SUPERIOR;
        }
    },
    PANTALON {
        @Override
        public Categoria categoria() {
            return Categoria.PARTE_INFERIOR;
        }
    };

    public abstract Categoria categoria();
}
