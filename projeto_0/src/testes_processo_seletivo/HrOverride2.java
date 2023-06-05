package testes_processo_seletivo;

class BiCycle {
    String getString() {
        return "a vehicle with pedals.";
    }

}

class MotorCycle extends BiCycle {
    @Override
    String getString() {
        return "a cycle with an engine.";
    }

    void define() {

        System.out.println("Hello I am a motorcycle, I am " + getString());
        String temp = super.getString(); 
        System.out.println("My ancestor is a cycle who is " + temp);
    }

}

public class HrOverride2 {
    public static void main(String[] args) {
        MotorCycle mt = new MotorCycle();

        mt.define();
    }

}
