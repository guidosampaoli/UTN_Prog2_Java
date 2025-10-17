package tp05.e13_generadorqr_usuario_codigoqr;

public class GeneradorQR {

    // Dependencia de creación: se crea el objeto en un método y se usa
    public void generar(String valor, Usuario usuario) {
        
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("\nSe ha generado un nuevo Código QR.\n");
        codigo.mostrarDatos();
    }
}
