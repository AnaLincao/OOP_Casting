class Main {
  public static void main(String[] args) {

    Cachorro cachorro = new Cachorro();
    
    //Não pode instanciar classe abstrata.
    //Animal animal = new Animal(); 
    //Canino canino = new Canino();

    cachorro.brincar("Bolinha");
    cachorro.brincar(2);

    //Animal animal1 = new Cachorro();
    //animal1.brincar("Bolinha");
    //animal1.brincar(2);

    Docil docil1 = cachorro;
    CachorroRobo cachorroRobo = new CachorroRobo();
    Docil docil2 = cachorroRobo;

    docil1.serDocil();
    docil2.serDocil();
    cachorro.latir();
    cachorroRobo.latirDigitalmente(); 
  }
}