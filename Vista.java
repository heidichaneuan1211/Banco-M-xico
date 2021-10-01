import java.util.Scanner;

public class Vista {

    private Scanner lectura;

    public Integer Menu() {

        lectura = new Scanner(System.in);

        System.out.println("***Menú para cliente del banco mexicano***");
        System.out.println("1- Agregar Cliente");
        System.out.println("2- Realizar deposito");
        System.out.println("3- Realizar Retiro");
        System.out.println("4- Realizar Transferencia");
        System.out.println("5- Busqueda de Cliente x Cuenta");
        System.out.println("6- Salir");
        System.out.println("Opcion: ");

        return lectura.nextInt();

    }
    //pedir nombre
    public void pedirDatos(Cliente es) {
        
       System.out.println("Escriba el nombre del cliente: ");
        es.setnombre(lectura.next());
 
        System.out.println("Escriba el apellido del cliente: ");
        es.setapellido(lectura.next());
 
        System.out.println("Escriba el número de cuenta del cliente: ");
        es.setnumcuenta(lectura.nextInt());
 
        es.setsaldo(0.0);
 
     }


    //pedir cuenta del cliente
    public int pedirCuenta(){
        int cuen;

        System.out.println("Escriba el número de cuenta del cliente: ");
        cuen = lectura.nextInt();

        return cuen;
    }


            //metodos vista para depositar
    //dar a conocer si es posible el deposito
    public double montoDeposito(Cliente nu) {
        double monto;

        if(nu != null){

            System.out.println("Monto que desea depositar: ");
            monto = lectura.nextDouble();

            return monto;

        }else{

            System.out.println("No se encontro al cliente al que desea depositar.");

            return monto = 0.0;

        }

    }

    //si se logro depositar
    public void infoDepo(boolean info){

        if(info == false){
            System.out.println("Deposito incorrecto");

        }else{

            System.out.println("Deposito exitoso");
        }

    }


          //metodos vista para retirar
    //pedir si es posible retirar
    public double montoReti(Cliente ente){
        double mont;

        if(ente != null){

            System.out.println("Monto que desea retirar: ");
            mont = lectura.nextDouble();

            return mont;

        }else{

            System.out.println("No se encontro al cliente al que desea retirar.");

            return mont = 0.0;

        }

    }

    //si se logro retirar
    public void infoReti(boolean info){

        if(info == false){
            System.out.println("Retiro incorrecto");

        }else{

            System.out.println("Retiro exitoso");
        }

    }

        //metodos vista para transferir
    //pedir #cuenta de cliente que transferira
    public int pedirCuentaTransfiere() {

        System.out.println("Escriba el número de cuenta del cliente que transfiere: ");
        return lectura.nextInt();

    }

    //pedir #cuenta del cliente que recibira la transferencia
    public int pedirCuentaRecibe(){

        System.out.println("Escriba el número de cuenta del cliente a quien transfiere: ");
        return lectura.nextInt();

    }

    //pedir si es posible transferir
    public double montoTransfer(Cliente clie){
        double mon;

        if(clie==null){

            System.out.println("No se encontro el número de cuenta para la trasnferencia.");

            return mon= 0.0;

        }else{
            System.out.println("Escriba el monto que desea transferir: ");
            mon = lectura.nextDouble();

            return mon;

        }
    }

    //si se logro trasnferir
    public void infoTransfe(boolean inf){

        if(inf == false){

            System.out.println("Transferencia incorrecta");

        }else{

            System.out.println("Trasnferencia exitosa");
        }

    }


        //metodos vista para dar info del cliente
    //dar info del cliente
    public void imprimirdatosclie(Cliente es){
    
        if(es == null){

            System.out.println("No se encontro el cliente");

        }else{
            
            System.out.println(es.toString());
            
        }

    }

}