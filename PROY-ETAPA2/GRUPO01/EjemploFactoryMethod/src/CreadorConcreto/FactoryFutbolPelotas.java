
package CreadorConcreto;

import Creador.FactoryPelotas;
import ProductoConcreto.futbolPelota;
import Producto.Pelota;

    public class FactoryFutbolPelotas implements FactoryPelotas{
        public Pelota create(){
            return new futbolPelota();
        }
    }

