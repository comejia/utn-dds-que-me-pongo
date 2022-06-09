package com.comejia.dds.atuendos;

import com.comejia.dds.prenda.*;

import java.util.Arrays;
import java.util.List;

public class Guardarropas {

  private final List<Prenda> prendas;

  public Guardarropas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public List<Atuendo> generarAtuendos() {
    return Arrays.asList(
        new Atuendo(generarParteSuperior(), generarParteInferior(), generarCalzado()),
        new Atuendo(generarParteSuperior(), generarParteInferior(), generarCalzado())
    );
  }

  public Prenda generarParteSuperior() {
    return this.prendas.stream()
        .filter(p -> p.categoria().equals(Categoria.PARTE_SUPERIOR))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("No se encontraron prendas de la categoria Parte Superior"));
  }

  public Prenda generarParteInferior() {
    return this.prendas.stream()
        .filter(p -> p.categoria().equals(Categoria.PARTE_INFERIOR))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("No se encontraron prendas de la categoria Parte Inferior"));
  }

  public Prenda generarCalzado() {
    return this.prendas.stream()
        .filter(p -> p.categoria().equals(Categoria.CALZADO))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("No se encontraron prendas de la categoria Calzado"));
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

}
