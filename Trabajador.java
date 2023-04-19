public class Trabajador extends Persona {

    private int salario;

    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Esta persona se llama " + getNombre() + " , tiene " + getEdad() + " años y su numero de telefono es " + getTelefono() + " , tiene un salario de " + salario + " pesos";
    }

    

}
