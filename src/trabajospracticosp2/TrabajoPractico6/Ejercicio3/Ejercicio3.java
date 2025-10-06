/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico6.Ejercicio3;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UNLAM");

        // Crear 3 profesores y 5 cursos
        Profesor p1 = new Profesor("P10", "Carlos Gómez", "Redes");
        Profesor p2 = new Profesor("P20", "Laura Méndez", "Ingeniería de Software");
        Profesor p3 = new Profesor("P30", "Ricardo Duarte", "Inteligencia Artificial");

        Curso c1 = new Curso("CURS01", "Sistemas Operativos");
        Curso c2 = new Curso("CURS02", "Análisis de Sistemas");
        Curso c3 = new Curso("CURS03", "Machine Learning");
        Curso c4 = new Curso("CURS04", "Cálculo Avanzado");
        Curso c5 = new Curso("CURS05", "Desarrollo Web");

        // Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores a cursos
        uni.asignarProfesorACurso("CURS01", "P10");
        uni.asignarProfesorACurso("CURS02", "P20");
        uni.asignarProfesorACurso("CURS03", "P30");
        uni.asignarProfesorACurso("CURS04", "P20");
        uni.asignarProfesorACurso("CURS05", "P10");

        // Listar cursos y profesores
        System.out.println("=== Cursos ===");
        uni.listarCursos();

        System.out.println("\n=== Profesores (resumen) ===");
        uni.listarProfesores();

        System.out.println("\n=== Cursos por profesor ===");
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();

        // Cambiar profesor de un curso
        System.out.println("\n=== Cambiar profesor de CURS05 a P30 ===");
        c5.setProfesor(p3);
        uni.listarCursos();
        System.out.println("Cursos de P10: ");
        p1.listarCursos();
        System.out.println("Cursos de P30: ");
        p3.listarCursos();

        // Eliminar un curso y verificar sincronización
        System.out.println("\n=== Eliminar curso CURS02 ===");
        uni.eliminarCurso("CURS02");
        uni.listarCursos();
        System.out.println("Cursos de P20: ");
        p2.listarCursos();

        // Eliminar un profesor y dejar cursos sin profesor
        System.out.println("\n=== Eliminar profesor P10 (sus cursos quedan sin profesor) ===");
        uni.eliminarProfesor("P10");
        uni.listarCursos();

        // Reporte final
        System.out.println("\n=== Reporte ===");
        uni.reporteCursosPorProfesor();
    }
}