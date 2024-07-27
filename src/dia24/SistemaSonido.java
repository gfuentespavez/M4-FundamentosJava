package dia24;
import java.util.List;

public class SistemaSonido {
    private int volumenMaximo;
    private int volumenActual;
    private List <String> funciones;
    private String funcionActual;

    public int getVolumenMaximo() {
        return volumenMaximo;
    }

    public void setVolumenMaximo(int volumenMaximo) {
        this.volumenMaximo = volumenMaximo;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public List<String> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<String> funciones) {
        this.funciones = funciones;
    }

    public String getFuncionActual() {
        return funcionActual;
    }

    public void setFuncionActual(String funcionActual) {
        this.funcionActual = funcionActual;
    }
}
