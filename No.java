  public class No
  {
    Atleta at;
    No proximo;

  public No(Atleta a){
    this.at = a;

  }
  
  public String toString(){
    if (proximo!=null)
      return this.hashCode()+" -> Atleta: "+at.toString() + "| Proximo: "+proximo.hashCode();
    else
      return this.hashCode()+" -> Atleta: "+at.toString() + "| Proximo: Vazio";
      
  }
  

}
