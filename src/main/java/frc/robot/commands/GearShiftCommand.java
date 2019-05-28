package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.logging.Logger.CommandStatus;

public class GearShiftCommand extends Command {

    private final String FILENAME = "GearShiftCommand.java";

    public GearShiftCommand(){requires(Robot.gearShiftSubsystem);}

    @Override
    protected void initialize() {
        Robot.logger.logCommandStatus(FILENAME, CommandStatus.Initializing);
        Robot.gearShiftSubsystem.gearShiftSolenoid.set(Robot.gearShiftSubsystem.LOW_GEAR_VALUE);
    }

    @Override
    protected void execute() {
        Robot.logger.logCommandStatus(FILENAME, CommandStatus.Executing);
        Robot.gearShiftSubsystem.autoShift();
    }

    @Override
    protected boolean isFinished(){return false;}

    @Override
    protected void end() {
        Robot.logger.logCommandStatus(FILENAME, CommandStatus.Ending);
        Robot.gearShiftSubsystem.gearShiftSolenoid.set(Robot.gearShiftSubsystem.HIGH_GEAR_VALUE);
    }

    @Override
    protected void interrupted() {
        Robot.logger.logCommandStatus(FILENAME, CommandStatus.Interrupted);
        end();
    }
}
