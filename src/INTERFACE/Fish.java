package INTERFACE;

public class Fish implements LivingThing {
    @Override
    public boolean canBreathe() {
        boolean canBreatheOrNot = LivingThing.super.canBreathe();

        // do some logic add the logic inside
        return canBreatheOrNot;

    }
}
// we can make default method to private also
