public class Pekingduck extends Duck {
  public void beCrispy() { 
    System.out.println("Grob grob!");
  }
  public void clean(Animal animal) { // overriding
    System.out.println("I cannot clean. I died already.");
  }
}
