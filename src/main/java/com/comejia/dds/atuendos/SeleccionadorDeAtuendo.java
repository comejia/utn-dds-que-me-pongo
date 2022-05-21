package com.comejia.dds.atuendos;

import com.comejia.dds.clima.CondicionClimatica;
import com.comejia.dds.clima.ServicioMetereologico;

import java.util.List;

public class SeleccionadorDeAtuendo {

  private final ServicioMetereologico servicioMetereologico;

  public SeleccionadorDeAtuendo(ServicioMetereologico servicioMetereologico) {
    this.servicioMetereologico = servicioMetereologico;
  }

  public Atuendo sugerirAtuendo(Guardarropas guardarropas, String ciudad) {
    List<Atuendo> atuendos = guardarropas.generarAtuendos();
    CondicionClimatica condicionClimatica = this.servicioMetereologico.obtenerCondicionClimatica(ciudad);

    return atuendos.stream()
        .filter(atuendo -> atuendo.esAptoParaTemperatura(condicionClimatica.getTemperatura()))
        .findFirst()
        .get();
  }
}
