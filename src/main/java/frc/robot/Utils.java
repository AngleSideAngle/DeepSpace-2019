package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

import java.util.*;

public class Utils{

    public static double METERS_TO_INCHES = 39.37;

    public static double metersToInches(double meters){
        return meters * METERS_TO_INCHES;
    }
    public static double inchesToMeters(double inches){
        return inches / METERS_TO_INCHES;
    }

    public static double last(ArrayList<Double> arr) {
        return arr.get(arr.size() - 1);
    }

    public static void trimIf(ArrayList<Double> arr, int maxSize) {
        // Trims an array down to a max size, starting from the start
        while (maxSize < arr.size())
            arr.remove(0);
    }

    public static void trimAdd(ArrayList<Double> arr, double val, int maxSize) {
        // Adds a value to the array and then trims it to a max size
        arr.add(val);
        trimIf(arr, maxSize);
    }

    public static double limitOutput(double output, double max){
        if (output > max)
            return max;
        else if (output < - max)
            return -max;
        else
            return output;
    }

    public static void setTalon(TalonSRX talon, double speed){
        talon.set(ControlMode.PercentOutput, speed);
    }

    public static int boolToInt(boolean b){
        if (b) {
            return 1;
        } else {
            return 0;
        }
    }

    public static HashSet<String> arrayListToHashset(ArrayList<String> values){
        HashSet<String> end = new HashSet<String>();
        for (String val : values){
            end.add(val);
        }
        return end;
    }

    public static Hashtable<String,String> hatshtableDataToString(Hashtable<String,Object> hashTable){
        Hashtable<String,String> end = new Hashtable<String,String>();
        for (String key : hashTable.keySet()){
            end.put(key,hashTable.get(key).toString());
        }
        return end;
    }

    public static Value oppositeDoubleSolenoidValue(Value val){
        switch (val) {
            case kForward:
                return Value.kReverse;
            case kReverse:
                return Value.kForward;
        }
        return Value.kOff;
    }

    public static void toggleDoubleSolenoid(DoubleSolenoid doubleSolenoid){
        doubleSolenoid.set(oppositeDoubleSolenoidValue(doubleSolenoid.get()));
    }
}