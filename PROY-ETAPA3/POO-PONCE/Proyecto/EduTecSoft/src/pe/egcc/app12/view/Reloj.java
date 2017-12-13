
package pe.egcc.app12.view;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Reloj extends Thread{
   private JLabel lbl;
   
   public Reloj(JLabel lbl){
       this.lbl=lbl;
   }
    public void run(){
        while (true){
            Date hoy=new Date();
            SimpleDateFormat h=new SimpleDateFormat("hh:mm");
            lbl.setText(h.format(hoy));           
       try{sleep(1000);
      }catch(Exception ex){
        }
        
    }
}
}
