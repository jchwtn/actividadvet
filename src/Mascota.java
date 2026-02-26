public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;
    private int opc;

    public Mascota(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                ", opc=" + opc +
                '}';
    }

    //CUMPLIR AÑOS
    public int cumplirAnos (int edad){

        int edadIn = 0;
        return edadIn + edad;
    }

    //ENGORDAR
    public double engordar (int peso){

        double pesoIn = 0;
        return pesoIn + peso;
    }

    //ADELGAZAR
    public double adelgazar (int peso){

        double pesoIn = 0;
        return pesoIn - peso;
    }

    //ENFERMAR
    public boolean enfermar (){
        saludable = true;
        return true;
    }

    public boolean recuperarSalud (){
        saludable = false;
        return false;
    }

    //Mostar ficha
    public void mostrarFicha(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("¿Saludable?: " + saludable);
    }

}
