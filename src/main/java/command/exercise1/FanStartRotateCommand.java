package command.exercise1;

public class FanStartRotateCommand implements Command {
    private final Fan fan;

    public FanStartRotateCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.startRotate();
    }
}
