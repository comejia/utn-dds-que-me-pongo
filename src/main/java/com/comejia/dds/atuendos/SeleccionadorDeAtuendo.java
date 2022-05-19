package com.comejia.dds.atuendos;

import com.comejia.dds.clima.CondicionClimatica;
import com.comejia.dds.clima.ServicioClima;

import java.util.List;

public class SeleccionadorDeAtuendo {

  private final ServicioClima servicioClima;

  public SeleccionadorDeAtuendo(ServicioClima servicioClima) {
    this.servicioClima = servicioClima;
  }

  public Atuendo sugerirAtuendo(Guardarropas guardarropas, String ciudad) {
    List<Atuendo> sugerencias = guardarropas.generarAtuendos();
    CondicionClimatica condicionClimatica = this.servicioClima.obtenerCondicionesClimaticas(ciudad);

    return sugerencias.stream()
        .filter(atuendo -> atuendo.esAptoParaTemperatura(condicionClimatica.getTemperatura()))
        .findFirst().get();
  }
}
