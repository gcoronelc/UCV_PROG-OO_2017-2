
package CreadorConcreto;

import Creador.FactoryPelotas;
import ProductoConcreto.baloncestoPelota;
import Producto.Pelota;

    public class FactoryBaloncestoPelotas implements FactoryPelotas{
        public  Pelota create(){
            return new baloncestoPelota();
        }
    }

