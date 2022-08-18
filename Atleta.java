public class Atleta
{
    
    private String nome;
    private float altura;
    private float peso;
    private String esporte;
    private String patrocinadores;
    
   
    public Atleta(String n, float a, float pe, String e, String pa){
        this.nome=n;
        this.altura=a;
        this.peso=pe;
        this.esporte=e;
        this.patrocinadores=pa;
    }

    Atleta() {
        this.nome=null;
        this.altura=0;
        this.peso=0;
        this.esporte=null;
        this.patrocinadores=null;
    }
    
    public void setNome(String nome){
    this.nome = nome;
  }

  public void setEsporte(String esporte){
    this.esporte = esporte;
  }

  public void setPatrocinadores(String pa){
    this.patrocinadores = pa;
  }

  public void setAltura(float a){
    this.altura = a;
  }

  public void setPeso(float pe){
    this.peso = pe;
  }
    
    public String toString(){
        return "Nome: "+nome+" | Altura: "+altura+" | Peso: "+peso+" | Esporte: "+esporte+" | Patrocinadores: "+patrocinadores;
    }
    
}
