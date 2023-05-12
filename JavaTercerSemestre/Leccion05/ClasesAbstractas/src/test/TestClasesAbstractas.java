
package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectángulo");
        figura.dibujar();
        
    }
    
}
