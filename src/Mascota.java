public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;

    public Mascota(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }


    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                '}';
    }

    //CUMPLIR AÑOS
    public int cumplirAnos(int nuevaEdad){
        this.edad = nuevaEdad;
        return nuevaEdad;
    }

    //ENGORDAR
    public double engordar(double cantidad){
        this.peso += cantidad;
        return cantidad;
    }

    //ADELGAZAR
    public double adelgazar(double cantidad){
        this.peso -= cantidad;
        return cantidad;
    }

    //ENFERMAR
    public void enfermar (){
        saludable = false;
    }

    public void recuperarSalud (){
        saludable = true;
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
