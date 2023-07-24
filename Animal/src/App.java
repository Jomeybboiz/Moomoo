public class App {
    public static void main(String args[]){
        Duck donald = new Duck();
        donald.clean(new Cow());
        Pekingduck daisy = new Pekingduck();
        daisy.clean(donald);
    }
}
