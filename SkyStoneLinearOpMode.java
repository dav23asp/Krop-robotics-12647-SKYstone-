package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.navigation.Orientation;

public abstract class SkyStoneLinearOpMode extends LinearOpMode {

    //DECLARATION

    // DRIVETRAIN
    DcMotor frontLeft, frontRight, backLeft, backRight;
    double flpower, frpower, blpower, brpower;

    double lefty = -gamepad1.left_stick_y;
    double leftx = gamepad1.left_stick_x;
    double rightx = gamepad1.right_stick_x;

    public void initialize() {

        //DEVICE INITIALIZATION

        //Drivetrain
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");

        frontRight.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.REVERSE);
    }
}
