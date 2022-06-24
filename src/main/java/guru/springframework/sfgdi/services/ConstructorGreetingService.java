package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/26/19.
 */
//geen @Service - geset als bean in GreetingServiceConfig (example of config)
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
