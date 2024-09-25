package command.exercise1;

public class LightTurnOffCommand implements Command {
    private final Light light;

    public LightTurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
