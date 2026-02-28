import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List <Mascota> lstLista = new ArrayList<>();

        int opc;
        int opcchng;
        int opcpeso;
        int opcsalud;
        //MENUUUUUUUU
        do {
            System.out.println("Elige la opción que deseas: ");
            System.out.println("1: Crear objeto");
            System.out.println("2: Mostrar ficha");
            System.out.println("3: Buscar objeto");
            System.out.println("4: Salir");

            opc = teclado.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("Crear objeto");

                    System.out.println("Ingresa el nombre del animal");
                    String nombre = teclado.next();

                    System.out.println("Ingresa la especie del animal");
                    String especie = teclado.next();

                    System.out.println("Ingresa la edad del animal");
                    int edad = teclado.nextInt();

                    System.out.println("Ingresa el peso del animal");
                    double peso = teclado.nextDouble();

                    System.out.println("Ingresa la salud del animal");
                    boolean saludable = teclado.nextBoolean();

                    Mascota M2 = new Mascota(nombre, especie, edad, peso, saludable);
                    lstLista.add(M2);

                    break;

                case 2:
                    for (Mascota p: lstLista){
                        System.out.println(p);
                    }
                    break;

                case 3:
                    String nombre1;
                    System.out.println("INGRESE EL NOMBRE DEL ANIMAL A BUSCAR");
                    nombre1 = teclado.next();

                    if(lstLista.isEmpty()){
                        System.out.println("LA LISTA NO TIENE ELEMENTOS");
                    }

                    M2 = null;

                    for (Mascota p: lstLista){
                        if(p.getNombre().equalsIgnoreCase(nombre1)) {
                            M2 = p;
                            System.out.println(M2.toString());
                        }
                    }

                    if (M2 == null) {
                        System.out.println("No se encontró al animal");
                        break;
                    }


                    do {
                        System.out.println("Elige que deseas hacer con el animal");
                        System.out.println("1: Cambiar su edad");
                        System.out.println("2: Subir o bajar su peso");
                        System.out.println("3: Enfermar o sanar");
                        System.out.println("4: Salir");
                        opcchng = teclado.nextInt();
                        switch (opcchng){
                            case 1:
                                System.out.println("Escribe la nueva edad");

                                M2.cumplirAnos(teclado.nextInt());
                                break;

                            case 2:
                                System.out.println("Deseas subir o bajar el peso?");
                                System.out.println("1: Subir");
                                System.out.println("2: Bajar");

                                opcpeso = teclado.nextInt();
                                switch (opcpeso) {
                                    case 1:
                                        System.out.println("Escribe el peso que deseas engordar");
                                        M2.engordar(teclado.nextInt());
                                        break;
                                    case 2:
                                        System.out.println("Escribe el peso que deseas adelgazar");
                                        M2.adelgazar(teclado.nextInt());
                                        break;
                                    default:
                                        System.out.println("Opción invalida");
                                        break;
                                }
                                break;

                            case 3:
                                System.out.println("Deseas enfermar o sanar?");
                                System.out.println("1: Enfermar");
                                System.out.println("2: Sanar");

                                opcsalud = teclado.nextInt();
                                switch (opcsalud) {

                                    case 1:
                                        M2.enfermar();
                                        break;

                                    case 2:
                                        M2.recuperarSalud();
                                        break;

                                    default:
                                        System.out.println("Opción invalida");
                                        break;
                                }
                                break;
                            case 4:
                                break;
                        }

                    }while (opcchng != 4);
                    break;


                case 4:
                    System.out.println("Saliendo");
                    break;


                default:
                    System.out.println("Opción invalida");
                    break;
            }
        } while (opc != 4);
        }
    }
