/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo;

/**
 *
 * @author alumno
 */
public class PartidoFutbol implements Accion {

    private Integer categoria;
    private Boolean prorroga;
    private Boolean penaltis;
    private Integer energiaNecesaria;

    public PartidoFutbol(Integer categoria, Boolean prorroga, Boolean penaltis, Integer energiaNecesaria) {
        this.categoria = categoria;
        this.prorroga = prorroga;
        this.penaltis = penaltis;
        this.energiaNecesaria = categoria * 40;
        if (this.prorroga == true) {
            this.energiaNecesaria = this.energiaNecesaria * 15 / 100;
        }
        if (this.penaltis == true) {
            this.energiaNecesaria = this.energiaNecesaria * 5 / 100;

        }
    }

    public Boolean getProrroga() {
        return prorroga;
    }

    public Boolean getPenaltis() {
        return penaltis;
    }

    public void setProrroga(Boolean prorroga) {
        this.prorroga = prorroga;
    }

    public void setPenaltis(Boolean penaltis) {
        this.penaltis = penaltis;
    }

    public PartidoFutbol(Integer categoria) {
        if (this.categoria < 1 || this.categoria > 7) {
            this.categoria = 1;
        } else {
            this.categoria = categoria;
        }
        this.energiaNecesaria = categoria * 40;
        this.penaltis = null;
        this.prorroga = null;
    }

    public void hacer() {
        System.out.println("Jugando partido de categoria" + this.categoria + this.prorroga + this.penaltis);
    }

    @Override
    public Integer getEnergia() {
        return this.energiaNecesaria;
    }
}
