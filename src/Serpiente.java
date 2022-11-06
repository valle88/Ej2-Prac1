public class Serpiente extends Mascotas {
    public Serpiente(String nombre, int numerosPatas, GENERO genero, float peso) {
        super(nombre, numerosPatas, genero, peso);
    }
    @Override
    public String hablar(){
        return "shhhhh";
    }
    @Override
    public String toString() {
        String salida = "Tipo de animal: Serpiente.";
        salida += "\n\t Nombre: "+getNombre();
        salida += "\n\t Peso: " +getPeso();
        salida += "\n\t Genero: " +getGenero();
        salida += "\n\t Numeros de patas: " +getNumerosPatas();
        salida += "\n\t Cuando habla dice: " +hablar();
        return salida;
    }
}
