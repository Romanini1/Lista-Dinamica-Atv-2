import java.util.Scanner;

public class main
{
    
    public static void main(String[] args) {
       
        ListaDinamica lista = new ListaDinamica();

        Scanner teclado= new Scanner(System.in);    //scaner de entradas
        int continuar;                              //controla se o loop continua
        int i=0;                                    //indice pro loop
        
        System.out.println("Digite 1 para inserir elemento, 2 para imprimir lista, ou qualquer outra tecla para encerrar programa");
        continuar = teclado.nextInt();
        String tiraLinha = teclado.nextLine();
            
        while(continuar == 1 || continuar == 2){
            
            
            
            if(continuar==1){
                
                Atleta atleta=new Atleta();
                
                System.out.println("Insira o nome do atleta: ");
                atleta.setNome(teclado.nextLine());              
                
                System.out.println("Insira a modalidade do atleta: ");
                atleta.setEsporte(teclado.nextLine());
                 
                
                System.out.println("Insira os patrocinadores do atleta: ");
                atleta.setPatrocinadores(teclado.nextLine());
                
                System.out.println("Insira a altura do atleta: ");
                atleta.setAltura(teclado.nextFloat());
                
                System.out.println("Insira o peso do atleta: ");
                atleta.setPeso(teclado.nextFloat());
                
                lista.insere(new No(atleta));
                i++;
                
                System.out.println("Digite 1 para inserir elemento, 2 para imprimir lista, ou qualquer outra tecla para encerrar programa");
                continuar = teclado.nextInt();
                tiraLinha = teclado.nextLine();
            }
            
            else if(continuar==2){
                lista.imprime();
                
                System.out.println("Digite 1 para inserir elemento, 2 para imprimir lista, ou qualquer outra tecla para encerrar programa");             
                continuar = teclado.nextInt();
                tiraLinha = teclado.nextLine();
               
            }
            
            else if(i>=10){
                System.out.println("Lista cheia");
            }
            continuar = teclado.nextInt();
            tiraLinha = teclado.nextLine();
            }
            
        }

    }
