public class Main{

    public static void main(String[] args) {
        
        Cliente clienteUno = new Cliente(28, "Roberto", "2356542", 10000);   
        Trabajador trabajadorUno = new Trabajador(31, "Sergio", "65432115", 25000);
        
        System.out.println(clienteUno);
        System.out.println(trabajadorUno);
    }

}