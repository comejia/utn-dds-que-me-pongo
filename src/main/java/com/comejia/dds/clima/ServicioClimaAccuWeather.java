package com.comejia.dds.clima;

import java.util.HashMap;
import java.util.Map;

public class ServicioClimaAccuWeather implements ServicioClima {

  private final Map<String, CondicionClimatica> consultas;

  private final AccuWeatherAPI apiClima;

  public ServicioClimaAccuWeather(AccuWeatherAPI apiClima) {
    this.apiClima = apiClima;
    this.consultas = new HashMap<>();
  }

  @Override
  public CondicionClimatica obtenerCondicionesClimaticas(String ciudad) {
    if(!this.consultas.containsKey(ciudad)) {
      this.consultas.put(ciudad, consultarAPI(ciudad));
    }

    return this.consultas.get(ciudad);
  }

  private CondicionClimatica consultarAPI(String ciudad) {
    Map<String, Object> consulta = this.apiClima.getWeather(ciudad).get(0);
    int temperatura = getTemperatura(consulta);
    int precipitacion = getPrecipitacion(consulta);
    return new CondicionClimatica(precipitacion, temperatura);
  }

  private int getTemperatura(Map<String, Object> consulta) {
    Map<String, Object> temperatura = (Map<String, Object>) consulta.get("Temperature");
    return (int) temperatura.get("Value");
  }

  private int getPrecipitacion(Map<String, Object> consulta) {
    return  (int) consulta.get("PrecipitationProbability");
  }
}
