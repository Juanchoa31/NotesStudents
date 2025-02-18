package notesstudents;

import javax.swing.JOptionPane;

public class NotesStudents {

    public static void main(String[] args) {
        
        Student [] listStudent = new Student [3];
        
        int opc = 0;
        Student est;
       
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Registrar\n2. Listar\n"
                    + "3. Mostrar estudiantes con nota mayor a 3\n"
                    + "4. Salir\nSeleccionar una opción"));
        }while(opc!=4);
    }
    
}
