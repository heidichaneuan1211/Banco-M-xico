import java.util.ArrayList;
import java.util.Scanner;

public class ControlCliente {

    private Scanner lect;
    private ArrayList <Cliente> list;

    Vista vi; //instanciar vista

    //constructor para la arrayList de objetos maestros
    ControlCliente(Vista vi){

        list = new ArrayList<Cliente>();
        this.vi = vi;
    }

    //Publicar menu
    public void Menucliente(){
        Integer op =0;

        while(op != 6){

            switch(vi.Menu()){
                case 1:addcliente();break; //agregar cliente
                
                case 2: Cliente clie;
                        clie=encontrarClie(vi.pedirCuenta());
                        decisionDepo(clie);  //realizar deposito
                        break;
                case 3: Cliente ente;
                        ente=encontrarClie(vi.pedirCuenta());
                        decisionReti(ente);
                        break;//realizar retiro

                case 4:Cliente clie1;
                       clie1 = encontrarClie(vi.pedirCuentaTransfiere());
                       Cliente clie2;
                       clie2= encontrarClie(vi.pedirCuentaRecibe());
                       decisionTrasnf(clie1, clie2);
                       break;//realizar transferencia de cuenta en cuenta

                case 5:vi.imprimirdatosclie(encontrarClie(vi.pedirCuenta()));
                        break;//realizar busqueda por numero de cuenta
                case 6:op=6;break;
            }
        }
    }
    

    //agregar cliente
    public void addcliente(){
    
        list.add(0,new Cliente());
        vi.pedirDatos(list.get(0));
    }

    

    //buscar a dicho cliente
    public Cliente encontrarClie(int num){
        for(int i=0 ; i < list.size(); i++){
  
           if(num == list.get(i).getnumcuenta()){

            return list.get(i);

           }

        }

        return null;
    }



            //metodos para depositar
    //acciones con el cliente en depo
    public void decisionDepo(Cliente clie){

        if(clie != null){

            vi.infoDepo(clie.deposito(vi.montoDeposito(clie)));

        }else{

            vi.montoDeposito(clie);
        }

    }

            //metodos para retirar
    //acciones con el cliente a reti
    public void decisionReti(Cliente ente){

        if(ente != null){

            vi.infoReti(ente.retiro(vi.montoReti(ente)));

        }else{

            vi.montoReti(ente);
        }

    }

        //metodos para la transferencia
    public void decisionTrasnf(Cliente cliente1,Cliente cliente2){

        if(cliente1 == null){

            vi.montoTransfer(cliente1);

        }else{
            if(cliente2 == null){

                vi.montoTransfer(cliente2);

            }else{

                vi.infoTransfe(cliente1.tranferir(cliente2, vi.montoTransfer(cliente1)));
            }
        }
    }
    

}
