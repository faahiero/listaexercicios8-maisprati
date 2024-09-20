package Polimorfismo;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au Au!");
    }
}
