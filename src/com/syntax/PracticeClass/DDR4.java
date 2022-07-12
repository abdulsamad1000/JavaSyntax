package com.syntax.PracticeClass;
interface DDR3{
    void reading();
    void speeding();
    void cpacity();
}
public interface DDR4 extends DDR3 {
    void secure();
}
class samsung implements DDR4{

    @Override
    public void reading() {
        System.out.println("reading speed is 4GB");
    }

    @Override
    public void speeding() {
        System.out.println("Speeding  is 5gb");
    }

    @Override
    public void cpacity() {
        System.out.println("capicity is great ");
    }

    @Override
    public void secure() {
        System.out.println("secure more the other memory");
    }
}

