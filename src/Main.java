import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Mascota Mascotax = new Mascota("Lucky", "Gato",  3, 10, true);

        Mascotax.mostrarFicha();

        int opc;
        int opcpeso;
        //MENUUUUUUUU
        System.out.println("Elige el cambio que deseas realizar:" +
                "1: Cambiar edad" +
                "2: Cambiar peso" +
                "3: Cambiar estado de salud");
        return switch (opc) {
            case 1:
                Mascotax.cumplirAnos();
                break;

            case 2:
                System.out.println("Deseas subir o bajar el peso?"+
                        "1: Subir" +
                        "2: Bajar");
                return switch (opcpeso) {
                    case 1:
                        Mascotax.engordar();
                        break;
                    case 2:
                        Mascotax.adelgazar();
                        break;
                    default:
                        System.out.println("Opción invalida");
                        break;
                }

            case 3:
                System.out.println("Deseas enfermar o sanar?"+
                        "1: Enfermar" +
                        "2: Sanar");
                return switch (opcpeso) {
                    case 1:
                        Mascotax.enfermar();
                        break;

                    case 2:
                        Mascotax.recuperarSalud();
                        break;

                    default:
                        System.out.println("Opción invalida");
                        break;
                }

            default:
                System.out.println("Opción invalida");
                break;
                }

        Mascotax.mostrarFicha();
        }

















    }
}