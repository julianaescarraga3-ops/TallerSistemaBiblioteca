public abstract class Material implements Catalogable {
    private String codigo;
    private String titulo;
    private int anio;
    private boolean disponible;

    public Material(String codigo, String titulo, int anio, boolean disponible) {     //este es el constructor
        this.codigo = codigo;       //la informacion que llegó entra a este objeto, igual con todos
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = disponible;
    }

    @Override          //implementa la interfaz de catalogable
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {    //el gett lee el atributo privado
        return titulo;             //aqui empiezan los llamados
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {   // el is es para boleanos
        return disponible;
    }

    public void setDisponible(boolean disponible) {    //setter porque en el futuro se cambia el estado de disponible a prestado
        this.disponible = disponible;                  //el void recibe la informacion de verdadero y falso, la guarda pero no retorna nada
    }

    public abstract String getTipo();   //metodo abstracto que obliga a la subclse a decir que tipo es

    public void mostrarInfo() {
        System.out.println("[" + getTipo() + "] " + titulo + " (" + anio + ") — "
                + (disponible ? "disponible" : "prestado"));

    }
}
