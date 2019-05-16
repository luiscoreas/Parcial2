
package clinicanaturista; 

import java.util.Scanner; 

public class ClinicaBotanica {
    /*
    * 
    *autor paola y luis 
    *
    */
    public int Consulta;
    public int PrecioDeConsulta;
    public int plantas ;
    public int ventas ; 
    public int HorariosDeConsulta;

public class Hiervas extends ClinicaBotanica{ 
   public String miel;
    public String Alcafor; 
    public String Limon;
    public String Manzanilla; 
    public String SueldaConSuelda;   
    public String Anis;     
    public String Jengibre;   
    public String Oregano;   
    public String Caraguilo;   
    public String jasmin;   
    public String Caraguillo;   
    public String Canela;  
} 
   public class RecetaMedica extends ClinicaBotanica{ 
       public int jarabe; 
       public int Masaje;  
   } 
    public static void main(String[] args) {
       Metodo optimus = new Metodo ();
        Scanner entrada = new Scanner(System.in);
        int Clinica, resultado = 0, opcion;
        boolean op = true;
        while (op){ 
            System.out.println("Clinica Naturista");
            System.out.println("-----------------------\n");
            System.out.println("Seleccione su opción: ");
            System.out.println("-----------------------\n");
            System.out.println("1. Consulta medica");
            System.out.println("-----------------------\n");
            System.out.println("2. plantas");
            System.out.println("-----------------------\n");
            System.out.println("3. Horarios de consulta");
            System.out.println("-----------------------\n");
            System.out.println("4. ventas");
            System.out.println("-----------------------\n");
            System.out.println("5. Salir");
            System.out.println("-----------------------\n");
            opcion = entrada.nextInt(); 
            
            
            if(opcion == 5){
                System.exit(0);
            }else{
                switch (opcion){
                    /* OFRECIENDO DOS TIPOS DE CONSULTAS, GENERAL Y CHEQUEOS
                    */
                    case 1:
                        System.out.println("Tipos De Cosulta"  
                              +"\nCosulta General = $25" 
                              +"\nChequeos = $15");
                        break;
                     
                     /*AGREGAMOS UN LISTADO VARIADO DE PLANTAS QUE SE OFRECERAN A TODOS NUETROS CLIENTES
                        */
                    case 2:
                        System.out.println("Listado de plantas: "
                                + "\nMiel,"
                                + "\nAlcanfor, "
                                + "\nLimon, "
                                + "\nManzanilla, "
                                + "\nSueldaConSuelda,"
                                + "\nAnis,"
                                + "\nJengibre,"
                                + "\nOregano,"
                                + "\nCaraguillo,"
                                + "\nJasmin, "
                                + "\nComino, "
                                + "\nCanela");
                    
                       break;
                       /* HORARIOS DE SERVICIOS
                       */
                    case 3:
                        System.out.println("Nuestros horarios de consulta:  Lunes a Viernes: 7:00 am a 4:00 pm \"\n" +
                         " y sabados y domingo de 8:00 am a 12:00pm");
                   
                       break;
                       /*PRECIOS
                       */
                        case 4:
                        System.out.println("jarabe $10, masaje $20, ");
                    
                       break;        
                                
                    /*SALIR
                       */            
                    case 5: 
                        System.out.println("finalizo");
                        System.exit(0);
                      break;  
                }
            }
            
        }
        
    }
    
}

    
    
 

