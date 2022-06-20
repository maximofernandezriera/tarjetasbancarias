package tarjeta;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {

    int[] numero;
    boolean estado;

    List<Compra> listaCompra = new ArrayList<>();

    private String nombre;
    private String importe;

    public Tarjeta() {
    }

    public Tarjeta(int numero[],  String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public void listarCompras(Integer n) {
        for (int i = 1; i <= n; i++) {
            Compra compra = listaCompra.get(listaCompra.size() - i);
            System.out.println(compra.getEstablecimiento() + " " + compra.getGasto());
        }
    }

    public String retornaOfuscado() {
        String ofuscado;
        ofuscado = "************" + numero[12] + numero[13] + numero[14] + numero[15];
        return ofuscado;
    }

    public void anyadeCompra(String establecimiento, double gasto){
        listaCompra.add(new Compra (establecimiento, gasto));
    }
}
