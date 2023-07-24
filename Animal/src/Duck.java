public class Duck extends Animal {
    public void sound(){
        System.out.println("quack");
    }
    public void fly(){
        System.out.println("flying");
    }
    public void glide(){
        System.out.println("gliding");
    }
    public void clean(Animal animal) { 
        System.out.println(this.toString() + " is cleaning " + animal.toString());
    }
    
}
