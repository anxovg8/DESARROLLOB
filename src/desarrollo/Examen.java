/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo;

/**
 *
 * @author alumno
 */
public abstract class Examen implements Accion{
     protected String asignatura;
    protected Integer minutos;
    protected Integer energiaNecesaria;

    public Examen(String asignatura, Integer minutos) {
        this.asignatura = asignatura;
        this.minutos = minutos;
    }
    
    
    @Override
    public abstract void hacer(); 

    public String getAsignatura() {
        return asignatura;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }
    
    public Integer getEnergia(){
        return this.energiaNecesaria;
    } 
}
