package pfungos;

import java.io.Serializable;

public class Detectados implements Serializable {
    private static final long serialVersionUID = -8096637882113132900L; // Mismo número que en el archivo serializado

    int numero;
    int codarea;
    int codfungo;
    Double superficie;

    public Detectados() {
    }

    public Detectados(int numero, int codarea, int codfungo, Double superficie) {
        this.numero = numero;
        this.codarea = codarea;
        this.codfungo = codfungo;
        this.superficie = superficie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodarea() {
        return codarea;
    }

    public void setCodarea(int codarea) {
        this.codarea = codarea;
    }

    public int getCodfungo() {
        return codfungo;
    }

    public void setCodfungo(int codfungo) {
        this.codfungo = codfungo;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Detectados{" + "numero=" + numero + ", codarea=" + codarea + ", codfungo=" + codfungo + ", superficie=" + superficie + '}';
    }
    
    
    

}
