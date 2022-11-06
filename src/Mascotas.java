public class Mascotas {
    private final String SONIDO = "Grrr";
    protected enum GENERO {
        MASCULINO,
        FEMENINO
    }

    private String nombre;
    private int numerosPatas;
    private GENERO genero;
    private float peso;

    public Mascotas(String nombre, int numerosPatas, GENERO genero, float peso) {
        this.nombre = nombre;
        this.numerosPatas = numerosPatas;
        this.genero = genero;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerosPatas() {
        return numerosPatas;
    }

    public void setNumerosPatas(int numerosPatas) {
        this.numerosPatas = numerosPatas;
    }

    public String getGenero() {
        if (genero == GENERO.FEMENINO){
            return "femenino";
        }
            return "Masculino";
    }

    public void setGenero(GENERO genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String hablar(){
        return SONIDO;
    }
}
