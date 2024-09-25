package command.exercise1;

public class LightTurnOnCommand implements Command {
    private final Light light;

    public LightTurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
