public class Cachorro extends Canino implements Docil {

  public void eat(){}
  
  public void serDocil(){
    System.out.println("cachorro sendo docil");
  }

  public void brincar(String bolinha){
      System.out.println("Cachorro foi buscar Bolinha");
  }
  public void brincar(int petiscos){
    System.out.println("Cachorro comeu um total de " +petiscos+ " pestisco(s)");
  }
  
  public void latir(){
    System.out.println("cachorro latindo");
  }
}