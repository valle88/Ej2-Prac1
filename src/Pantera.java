public class Pantera extends Mascotas{
    public Pantera(String nombre, int numerosPatas, GENERO genero, float peso) {
        super(nombre, numerosPatas, genero, peso);
    }

    @Override
    public String hablar(){
        return "Roarrr";
    }

    @Override
    public String toString() {
        String salida = "Tipo de animal: Pantera.";
        salida += "\n\t Nombre: "+getNombre();
        salida += "\n\t Peso: " +getPeso();
        salida += "\n\t Genero: " +getGenero();
        salida += "\n\t Numeros de patas: " +getNumerosPatas();
        salida += "\n\t Cuando habla dice: " +hablar();
        return salida;
    }
}
