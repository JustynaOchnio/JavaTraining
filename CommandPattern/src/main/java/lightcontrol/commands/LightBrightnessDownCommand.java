package lightcontrol.commands;

import lightcontrol.Light;
import lightcontrol.utilities.IncorrectBrightnessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightBrightnessDownCommand implements Command {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private Light light;

    public LightBrightnessDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        int brightness = light.getBrightness();
        try {
            light.setBrightness(brightness - 25);
            logger.info("Brightness level: {}%", light.getBrightness());
        } catch (IncorrectBrightnessException e) {
            logger.info("Brightness is set on 0% right now | can't change");
        }
    }
}
