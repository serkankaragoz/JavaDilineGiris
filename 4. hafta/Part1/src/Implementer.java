public class Implementer implements SubInterface{
    @Override
    public void subMethod() {
        System.out.println("On subMethod()");
    }

    @Override
    public void superMethod() {
        System.out.println("On superMethod()");
    }

    @Override
    public void superMethod2() {
        System.out.println("On superMethod2()");
    }
}
