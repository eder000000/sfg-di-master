
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfgClinic.controllers.SetterInjectionController;
import sfgClinic.services.ConstructorGreetingService;

class SetterInjectionControllerTest {

    SetterInjectionController controller;


    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());;
    }
}