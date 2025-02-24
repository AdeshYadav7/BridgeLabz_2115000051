import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Greeting {
String sayHello(String name);
}

class GreetingImpl implements Greeting {
public String sayHello(String name) {
return "Hello, " + name;
}
}

class LoggingProxyHandler implements InvocationHandler {
private final Object target;
public LoggingProxyHandler(Object target) {
this.target = target;
}
public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
System.out.println("Method called: " + method.getName());
return method.invoke(target, args);
}
}

class LoggingProxyMain {
public static void main(String[] args) {
Greeting greeting = (Greeting) Proxy.newProxyInstance(
Greeting.class.getClassLoader(),
new Class[]{Greeting.class},
new LoggingProxyHandler(new GreetingImpl())
);
System.out.println(greeting.sayHello("Alice"));
}
}
