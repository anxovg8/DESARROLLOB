/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo;

/**
 *
 * @author alumno
 */
public class ExamenPractico extends Examen {

    public ExamenPractico(String asignatura, Integer minutos) {
        super(asignatura, minutos);
        Integer contador = minutos;
        energiaNecesaria = minutos / 2;
    }

    @Override
    public void hacer() {
        System.out.println("Haciendo examen práctido de la asignatura" + this.asignatura);
    }
}
