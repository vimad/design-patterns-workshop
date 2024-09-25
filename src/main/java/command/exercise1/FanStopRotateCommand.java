package command.exercise1;

public class FanStopRotateCommand implements Command {
    private final Fan fan;

    public FanStopRotateCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stopRotate();
    }
}
