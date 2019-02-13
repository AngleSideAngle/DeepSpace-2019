package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class LiftToLevelTwoCommand extends Command {
    public LiftToLevelTwoCommand() {
        requires(Robot.liftSubsystem);
    }

    @Override
    protected void initialize() {
        Robot.liftSubsystem.getLiftPID().reset();
    }

    @Override
    protected void execute() {
        Robot.liftSubsystem.goToPositionTwo();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted() {
        end();
    }
}
