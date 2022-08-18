public class ListaDinamica
{
  No inicio;
  No fim;

  public void insere(No n){
    if (inicio == null){
        inicio = n;
        fim = n;
    }
    else{
      fim.proximo = n;
      fim = n;
    }
  }

public void imprime(){
  No aux = inicio;
  while (aux!=null){
    System.out.println(aux.toString());
    aux = aux.proximo;
  }
}
}
