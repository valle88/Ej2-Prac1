public class Main {
    public static void main(String[] args) {
        Mascotas PUA = new Mascotas("PUA", 4, Mascotas.GENERO.FEMENINO,2);
        Serpiente LUPE = new Serpiente("lupe",0, Mascotas.GENERO.FEMENINO, 40);
        Pantera PIPOL = new Pantera("PIPOL",4, Mascotas.GENERO.MASCULINO,32);

        System.out.println(PUA);
        System.out.println(LUPE);
        System.out.println(PIPOL);
    }
}