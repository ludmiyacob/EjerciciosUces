package UltimaClase;

public class EstudianteTest {
    public static void main(String[] args) {

        double[] calificacionesJose = {8.8, 7.5, 5.6};
        double[] calificacionesLuis = {9.8, 8.0, 7.6};
        double[] calificacionesEdu = {10.0, 10.2, 0};
        Estudiante[] estudiantes ={
                new Estudiante("Jose", 50, calificacionesJose),
                new Estudiante("Luis",30,calificacionesLuis),
                new Estudiante("Edu",25,calificacionesEdu),

        };

        for(Estudiante estudiante :estudiantes){
            System.out.println("++++++++++++++");
            System.out.println("El estudiante: " + estudiante.getNombre() + " edad : " + estudiante.getEdad() + " tiene un promedio de : " + estudiante.calcularPromedio() );
            System.out.println("++++++++++++++");
        }

    }

}
