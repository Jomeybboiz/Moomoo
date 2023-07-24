abstract class Animal {
    abstract void sound();
    Duck donald = new Duck();
    donald.clean(new Cow());
    Pekingduck daisy = new Pekingduck();
    daisy.clean(donald);
}
