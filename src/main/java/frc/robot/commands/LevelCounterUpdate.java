package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class LevelCounterUpdate extends InstantCommand {
    public static enum LevelChange {Up, Down}
    private int change;

    public LevelCounterUpdate(LevelChange change) {
        this.change = change == LevelChange.Up ? 1 : -1;
    }

    @Override protected void execute() {
        Robot.liftSubsystem.updateLevelCounter(change);
        Robot.liftSubsystem.updateLevelCounterWidget();
    }
}
