package Peluqueria;

/**
 *
 * @author Flacman
 */
public class peluqueria {

    public void cortarPelo(perro p) {
        if (p.pelo) {
            p.setPelo(Boolean.FALSE);
        } else {
            System.out.println("nada que cortar");
        }
    }

    public static void main(String[] args) {
        perro perro01 = new perro();
        perro01.setNombre("snoopy");
        perro01.setPelo(Boolean.FALSE);
        peluqueria p = new peluqueria();
        p.cortarPelo(perro01);
        System.out.println(perro01);

    }
}