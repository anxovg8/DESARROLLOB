/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo;

import java.util.Stack;

/**
 *
 * @author alumno
 */
public class Persona implements Energetico {

    private String nombre;
    private Double capacidadVejiga;
    private Double estadoVejiga;
    private Integer energiaActual;
    Stack<Accion> tareas;

    public Persona(String nombre, Double capacidadVejiga) {
        this.nombre = nombre;
        this.capacidadVejiga = capacidadVejiga;
        this.estadoVejiga = 0.0;
        this.energiaActual = 100;
    }

    public void addTarea(Accion a) {
        tareas.push(a);
    }

    public Integer hacerTareas() {
        Integer contador = 0;
        Integer energiaGastada = 0;
        while (this.energiaActual >= 0) {
            if (tareas.isEmpty()) {
                return 0;
            }
            if (tareas.peek().getEnergia() >= this.energiaActual) {
                tareas.pop();
                contador++;
                this.energiaActual -= tareas.peek().getEnergia();
            }
        }
        return contador;
    }

    public void vaciarVejiga() {
        this.estadoVejiga = 0.0;
    }

    public Double beber(Bebible a) {
        Double bebida;
        if (a.getLitros() <= capacidadVejiga) {

            bebida = estadoVejiga + a.getLitros();
            this.energiaActual += a.getEnergia();
        } else {
            estadoVejiga = capacidadVejiga;
            bebida = capacidadVejiga - (estadoVejiga + a.getLitros());
            this.energiaActual += a.getEnergia();
        }
        return bebida;
    }

    @Override
    public Integer getEnergia() {
        return this.energiaActual;
    }
}
