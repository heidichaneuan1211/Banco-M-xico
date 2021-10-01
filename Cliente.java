public class Cliente {
    //atributos
    private String Nombre;
    private String Apellido;
    private int Cuenta;
    private double Saldo;

    Cliente(){}

    Cliente(String Nombre,String Apellido,Integer NumCuenta){
        setnombre(Nombre);
        setapellido(Apellido);
        setnumcuenta(NumCuenta);
        this.Saldo=0.0;
    }

    Cliente(String Nombre,String Apellido,Integer Cuenta,double Saldo){
        setnombre(Nombre);
        setapellido(Apellido);
        setnumcuenta(Cuenta);
        setsaldo(Saldo);
    }

    //setter y getter

    //nombre
    public void setnombre(String Nombre){

        this.Nombre=Nombre;
    }

    public String getnombre(){

        return this.Nombre;
    }

    //apellido
    public void setapellido(String Apellido){

        this.Apellido=Apellido;
    }

    public String getapellido(){

        return this.Apellido;
    }

    //Numero de cuenta
    public void setnumcuenta(Integer Cuenta){

        this.Cuenta=Cuenta;
    }

    public int getnumcuenta(){

        return this.Cuenta;
    }

    //Saldo
    public void setsaldo(double Saldo){

        this.Saldo=Saldo;
    }

    public double getsaldo(){

        return this.Saldo;
    }


    //sobrecarga del tostring en el objeto para dar su datos
    @Override
    public String toString() {
    return "Nombre: " + getnombre() + "\n" + "Apellido: "+getapellido()+ "\n" + "Número de cuenta: " + getnumcuenta() + "\n "+"Saldo: "+getsaldo()+ "\n";
    }


    //deposito a cuenta
    public boolean deposito(double x){
        boolean IngresoCorrect = true;

        if (x < 0.0) {

            IngresoCorrect = false;

        } else {

            Saldo += x;
            IngresoCorrect = true;
        }
        return IngresoCorrect;
    }

    //retirar monto de cuenta
    public boolean retiro(double n) {
        boolean RetiroCorrect = true;  

        if (n < 0.0) {

            RetiroCorrect = false;

        } else{

            if (Saldo >= n){

                Saldo -= n;

            }else{

                RetiroCorrect = false;

            }
        }
            
        return RetiroCorrect;
    }

    //metodo de transferencia
    public boolean tranferir(Cliente cliente, double y ){
        boolean Tranferenciacorrecta= true;

        if (y < 0.0) {

            Tranferenciacorrecta = false;

        } else{
            if (cliente.getsaldo() >= y) {

                retiro(y);
                cliente.deposito(y);

            } else {

                Tranferenciacorrecta = false;
            }
        }
        return Tranferenciacorrecta;
    }
    
}
