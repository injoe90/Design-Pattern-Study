package ProtectionProxy;

import java.lang.reflect.*;

public class OwnerInvocationHandler implements InvocationHandler{
    Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
    throws IllegalAccessException{
        try{
            if (method.getName().startsWith("get")
            || method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
            else if (method.getName().equals("setGeekRating")) {
                throw new IllegalAccessException();
            }
        }
        catch(InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
