
package CreadorConcreto;

import Creador.FactoryPelotas;
import ProductoConcreto.tenisPelota;
import Producto.Pelota;

    public class FactoryTenisPelotas implements FactoryPelotas{
        public Pelota create(){
            return new tenisPelota();
        }
    }


