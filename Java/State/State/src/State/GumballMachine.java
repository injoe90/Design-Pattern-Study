package State;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) { this.state = this.noQuarterState; }
        else { this.state = this.soldOutState; }
    }

    public void insertQuarter() { this.state.insertQuarter(); }
    public void ejectQuarter() { this.state.ejectQuarter(); }
    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }
    public void setState(State state) { this.state = state; }
    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (this.count > 0) { this.count -= 1; }
    }

    public State getHasQuarterState() { return this.hasQuarterState; }

    public State getNoQuarterState() { return this.noQuarterState; }

    public State getSoldState() { return this.soldState; }

    public State getSoldOutState() { return this.soldOutState; }

    public State getWinnerState() { return this.winnerState; }
    public int getCount() { return this.count; }

    public String toString() {
        StringBuilder currentResult = new StringBuilder();
        currentResult.append("주식회사 왕뽑기");
        currentResult.append("\n자바로 돌아가는 최신형 뽑기 기계");
        currentResult.append("\n남은 개수: " + this.count + "개");
        currentResult.append("\n동전 투입 대기 중");
        return currentResult.toString();
    }
}
