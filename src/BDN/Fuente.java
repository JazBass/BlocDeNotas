/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDN;

import java.awt.Font;

/**
 *
 * @author JazBass
 */
public class Fuente {
    String letra;
    int tipo;
    int tamaño;

    public Fuente() {
    }
    

    public Fuente(String letra, int tipo, int tamaño) {
        this.letra = letra;
        this.tipo = tipo;
        this.tamaño = tamaño;
    }
    

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public Font cambiarFuente(){
        Font fuente;
        fuente = new Font(this.getLetra(), this.getTipo(), this.getTamaño());
        return fuente;
    }
}
