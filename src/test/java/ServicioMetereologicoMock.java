import com.comejia.dds.clima.CondicionClimatica;
import com.comejia.dds.clima.ServicioMetereologico;

public class ServicioMetereologicoMock implements ServicioMetereologico {
  @Override
  public CondicionClimatica obtenerCondicionClimatica(String ciudad) {
    return new CondicionClimatica(10, 30);
  }

}
