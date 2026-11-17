package aumno;

import persona.Persona;

public class Alumno extends Persona {
    private int matricula;
    private float promedio;
    private boolean estatus;

    public Alumno(int matricula, float promedio, boolean estatus) {
        this.matricula = matricula;
        this.promedio = promedio;
        this.estatus = estatus;
    }
   
    public Alumno(){
        super();
        this.matricula = -1;
        this.promedio = -1;
        this.estatus = false;
        
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
    
    
    
}
