import Duck.*;
import HomeTheater.*;
import Turkey.*;

public class Main {
    public static void main(String[] args) {
        /*Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        duck.quack();
        duck.fly();

        System.out.println("\n칠면도 어탭터가 말하길");
        turkeyAdapter.quack();
        turkeyAdapter.fly();*/

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Amplifier(), new Tuner(), new StreamingPlayer()
                , new Projector(), new TheaterLights(), new Screen(), new PopcornPopper()
        );

        homeTheater.watchMovie("인디아나 존스:레이더스");
        homeTheater.endMovie();
    }
}