public class Prova {
  
  private String nome;
  private Materia materia = new Materia();
  private String instituicao;
  private int ano;
  private int visualizoes;


  public String getNome(){
    return this.nome;
  }

  public Materia getMateria(){
    return this.materia;
  }

  public String getInstituicao(){
    return this.instituicao;
  }

  public int getAno(){
    return this.ano;
  }
  public int getVisualizoes(){
    return this.visualizoes;
  };

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setMateria(Materia materia){
     this.materia = materia;
  }

  public void setInstituicao(String instituicao){
    this.instituicao = instituicao;
  }

  public void setAno(int ano){
    this.ano = ano;
  }

  public void incrementVisualizoes(){
    this.visualizoes += 1;
  }

}