package remotecontrollertests;

import lightcontrol.Light;
import lightcontrol.RemoteController;
import lightcontrol.commands.LightBrightnessDownCommand;
import lightcontrol.commands.LightBrightnessUpCommand;
import lightcontrol.commands.LightOffCommand;
import lightcontrol.commands.LightOnCommand;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoteControllerBrightnessTest {

    @Test
    public void brightnessTest(){
        Light light = new Light();
        RemoteController remoteController = new RemoteController(
                new LightOnCommand(light),
                new LightOffCommand(light),
                new LightBrightnessUpCommand(light),
                new LightBrightnessDownCommand(light)
        );
        remoteController.clickDown();
        assertThat(light.getBrightness()).isEqualTo(75);
        remoteController.clickUp();
        assertThat(light.getBrightness()).isEqualTo(100);
    }
}
