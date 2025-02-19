package notesstudents;

import javax.swing.JOptionPane;

public class NotesStudents {

    public static void main(String[] args) {

        Student[] listStudent = new Student[3];

        int opc = 0;
        Student est;
        int i = 0;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Registrar\n2. Listar\n"
                    + "3. Mostrar estudiantes con nota mayor a 3\n"
                    + "4. Salir\nSeleccionar una opción"));
            switch (opc) {
                case 1:
                    if (i >= listStudent.length) {
                        System.out.println("Supera las posiciones del vector");
                    } else {
                        String code = JOptionPane.showInputDialog("Ingrese código: ");
                        String name = JOptionPane.showInputDialog("Ingrese nombre: ");
                        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
                        double note = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota: "));

                        est = new Student(code, name, age, note);

                        listStudent[i] = est;
                        listStudent[i] = est;
                        i++;
                    }
                    break;
                case 2:

                    for (int x = 0; x < i; x++) {
                        System.out.println(listStudent[x].toString());
                    }

                    break;
                case 3:

                    for (int x = 0; x < i; x++) {
                        if (listStudent[x].getNote() >= 3) {
                            System.out.println("Nombre: " + listStudent[x].getName()
                                    + " Nota: " + listStudent[x].getNote());
                        }
                    }

                    break;
                case 4:
                    String searchCode = JOptionPane.showInputDialog("Digite el estudiante que desea buscar");
                    for (int x = 0; x < i; x++) {
                        if (listStudent[x].getCode().equals(searchCode)) {
                            System.out.println(listStudent[x].toString());
                        } else {
                            System.out.println("Estudiante no encontrado");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opc != 4);
    }
}
