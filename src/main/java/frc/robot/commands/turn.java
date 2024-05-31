package frc.robot.commands;

import frc.robot.subsystems.disRobby;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.Command;

import java.util.function.DoubleSupplier;

public class turn extends Command {
    private disRobby leg;
    private  DoubleSupplier joy;    

    public turn(disRobby leg, DoubleSupplier joy) {
        this.leg = leg;
        addRequirements(leg);
        this.joy = joy;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        double currentSpeed = MathUtil.applyDeadband(joy.getAsDouble(), 0.1);

        leg.setMotorOneSpeed(currentSpeed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {

    }
}
