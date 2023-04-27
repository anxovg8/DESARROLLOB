/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo;

/**
 *
 * @author alumno
 */
public class ExamenTest extends Examen {

    private Integer numPreguntas;
    private Boolean resta;

    public ExamenTest(Integer numPreguntas, Boolean resta, String asignatura, Integer minutos) {
        super(asignatura, minutos);
        this.numPreguntas = numPreguntas;
        this.resta = resta;
        if (resta == true) {
            energiaNecesaria = numPreguntas / 2;
        } else {
            energiaNecesaria = numPreguntas / 4;
        }

    }

    public Integer getNumPreguntas() {
        return numPreguntas;
    }

    public Boolean getResta() {
        return resta;
    }

    @Override
    public void hacer() {
        Integer contadorPreguntas = 1;
        while (contadorPreguntas <= this.numPreguntas) {
            System.out.println("Haciendo pregunta" + contadorPreguntas + "del examen de la asignatura" + getAsignatura());
        }
    }
}
