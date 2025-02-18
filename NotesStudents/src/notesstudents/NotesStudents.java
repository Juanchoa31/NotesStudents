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
            switch(opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }
            
        }while(opc!=4);
    }
    
}
