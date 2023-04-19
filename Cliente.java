public class Cliente extends Persona {

    private int credito;

    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "La persona tiene " + this.getEdad() + ", se llama " + this.getNombre() + ", y su numero de telefono es " + this.getTelefono() + " y tiene un credito por " + credito + " pesos";
    }
     
    
}
