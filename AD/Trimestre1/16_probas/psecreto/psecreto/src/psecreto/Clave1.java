
package psecreto;

import java.io.Serializable;


public class Clave1 implements Serializable{
private static final long serialVersionUID = -8175153610449226236L; // Mismo número que en el archivo serializado

String   cla1; 
int num1;

    public Clave1() {
    }

    public Clave1(String cla1, int num1) {
        this.cla1 = cla1;
        this.num1 = num1;
    }

    public String getCla1() {
        return cla1;
    }

    public void setCla1(String cla1) {
        this.cla1 = cla1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "Clave1{" + "cla1=" + cla1 + ", num1=" + num1 + '}';
    }
    
    
    
    


}
