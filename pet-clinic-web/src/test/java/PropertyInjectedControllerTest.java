
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfgClinic.controllers.PropertyInjectedController;
import sfgClinic.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void Setup(){
        controller = new PropertyInjectedController();
                controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}