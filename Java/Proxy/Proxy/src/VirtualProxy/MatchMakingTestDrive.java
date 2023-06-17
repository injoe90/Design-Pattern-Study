package VirtualProxy;

import ProtectionProxy.NonOwnerInvocationHandler;
import ProtectionProxy.OwnerInvocationHandler;
import ProtectionProxy.Person;
import ProtectionProxy.PersonImpl;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

public class MatchMakingTestDrive {
    Hashtable<String, Person> datingRepository = new Hashtable<>();
    public static void main(String[] args) {

        /* DatingDB 초기화 */
        MatchMakingTestDrive datingAppTest = new MatchMakingTestDrive();
        datingAppTest.initializeDatingDb();

        /* DatingApp 테스트*/
        datingAppTest.drive();

    }

    public void drive() {
        /* owner 프록시 생성 */
        Person joe = selectDatingDb("Joe Javabeen");
        Person ownerProxyOfJoe = getOwnerProxy(joe);

        /* non-owner 프록시 생성 */
        Person nonOwnerProxyOfJoe = getNonOwnerProxy(joe);

        System.out.println("Name is " + ownerProxyOfJoe.getName());

        ownerProxyOfJoe.setInterests("bowling, Go");

        System.out.println("Interests set from owner proxy");

        try{
            ownerProxyOfJoe.setGeekRating(10);
        }
        catch(Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }

        System.out.println("Rating is " + ownerProxyOfJoe.getGeekRating());

        System.out.println("Name is " + nonOwnerProxyOfJoe.getName());
        try {
            nonOwnerProxyOfJoe.setInterests("bowling, Go");
        }
        catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxyOfJoe.setGeekRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxyOfJoe.getGeekRating());
    }

    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }


    public void initializeDatingDb() {
        Person joe = new PersonImpl();
        Person kelly = new PersonImpl();

        insertDatingDb(joe
        , "Joe Javabeen"
        , "cars, computers, music"
        , 7
        );

        insertDatingDb(kelly
        , "Kelly Klosure"
        , "ebay, movies, music"
        , 6);
    }

    public void insertDatingDb(Person person
                             , String name
                             , String interests
                             , int rating) {
        person.setName(name);
        person.setInterests(interests);
        person.setGeekRating(rating);
        datingRepository.put(person.getName(), person);
    }

    public Person selectDatingDb(String name) { return (Person) datingRepository.get(name); }
}
