import java.lang.reflect.Array;
import java.util.Arrays;

public class ModeladoTarjeta {
    private String nombre_propietario;
    private int numero_tarjeta;
    private String cvv;
    private String fecha_vencimiento;
    private int numero_cuenta;
    private int[] numerosArreglo;

    public ModeladoTarjeta(String nombre_propietario, int numero_tarjeta, String cvv, String fecha_vencimiento, int numero_cuenta, int[] numerosArreglo) {
        this.nombre_propietario = nombre_propietario;
        this.numero_tarjeta = numero_tarjeta;
        this.cvv = cvv;
        this.fecha_vencimiento = fecha_vencimiento;
        this.numero_cuenta = numero_cuenta;
        this.numerosArreglo = numerosArreglo;

    }

    public String getNombre_propietario() {
        return nombre_propietario;
    }

    public void setNombre_propietario(String nombre_propietario) {
        this.nombre_propietario = nombre_propietario;
    }

    public int getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(int numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int[] getNumerosArreglo() {
        return numerosArreglo;
    }

    public void setNumerosArreglo(int[] numerosArreglo) {
        this.numerosArreglo = numerosArreglo;
    }
}


