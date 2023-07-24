package My_absFactory_Pattern;

public class JapanCarFactory implements CarFactory
{

    @Override
    public Engine createEngine() {
        return new JapanEngine();
    }

    @Override
    public Body createBody() {
        return new JapanBody();
    }

}

