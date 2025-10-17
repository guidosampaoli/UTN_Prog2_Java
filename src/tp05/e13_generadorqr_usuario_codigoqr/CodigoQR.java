package tp05.e13_generadorqr_usuario_codigoqr;

public class CodigoQR {

    private String valor;
    private Usuario usuario; // Asociación unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void mostrarDatos() {
        System.out.println("----- Datos del Código QR -----");
        System.out.println("Valor: " + valor);
        System.out.println("Usuario: " + usuario.getNombre() + " | Email: " + usuario.getEmail());
        System.out.println("-------------------------------");
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario.getNombre() + '}';
    }
}
