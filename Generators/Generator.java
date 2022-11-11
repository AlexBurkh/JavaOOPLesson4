package Generators;

import java.util.Random;

public interface Generator <T> {
    public  Random rnd = new Random();
    public T generate();
}
