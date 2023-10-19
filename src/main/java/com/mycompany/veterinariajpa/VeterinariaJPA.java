package com.mycompany.veterinariajpa;

import com.mycompany.veterinariajpa.igu.PantallaPrincipal;
import com.mycompany.veterinariajpa.igu.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class VeterinariaJPA {

    public static void main(String [] args) {
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

        //Este metodo cierra la pantalla inicial despues de 3 segundos y abre la pantalla principal. Info abajo
        Timer timer = new Timer(2000, (ActionEvent e) -> {
            principal.dispose();
            PantallaPrincipal panta = new PantallaPrincipal();
            panta.setVisible(true);
            panta.setLocationRelativeTo(null);
        });
        timer.setRepeats(false);
        timer.start();
    }
}

/*
La expresión lambda (ActionEvent e) -> { ... } se asigna directamente como un ActionListener al Timer. 
Cuando el Timer alcanza su tiempo especificado y dispara el evento, el Timer llamará automáticamente a 
la función lambda sin que necesites invocarla explícitamente.

La clave aquí es que la interfaz funcional que se espera en el método Timer (en este caso, ActionListener) 
tiene un único método abstracto, que en este caso es actionPerformed. La expresión lambda que proporcionaste 
implementa ese método actionPerformed, y el Timer sabe cómo llamarlo cuando corresponde.

En resumen, aunque una función lambda no tiene un nombre explícito, puedes usarla a través de la asignación
a una variable o directamente como argumento en llamadas a métodos que esperan interfaces funcionales 
compatibles con la firma de la función lambda. El sistema se encargará de llamarla en el momento adecuado.
*/
