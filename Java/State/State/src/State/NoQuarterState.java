package State;

public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println();
        this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() { System.out.println("동전을 넣어 주세요."); }

    @Override
    public void turnCrank() { System.out.println("동전을 넣어 주세요."); }

    @Override
    public void dispense() { System.out.println("동전을 넣어 주세요."); }

}
