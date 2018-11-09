package elpuig.Widgets;

public class MenuWidget {
    WindowTitle windowTitle = new WindowTitle();
    Mensaje mensaje = new Mensaje();
    boolean esValida = true;
    public int opcion = 0;

    public int crearMenu(String titulo, String...opciones) {

        windowTitle.show(titulo);

        for (int i = 0; i < opciones.length ; i++) {
            System.out.println( i+1 +"."+ opciones[i]);
        }
        System.out.println("\n\n\n0-Salir");
        do {
            opcion = new EditText().numero("opcion:");
            if (opcion > opciones.length) {
                mensaje.mostrarError("Error, esa opcion no es correcta.");
            } else {
                esValida = false;
            }
        }while (esValida);


        return opcion;
    }


}
