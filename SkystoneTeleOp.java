package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class SkyStoneTeleOp extends SkyStoneLinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        initialize();

        while(!(isStarted()  || isStopRequested())) {

            idle();

        }

        waitForStart();

        while (opModeIsActive()) {

            // START ROBOT-CENTRIC DRIVETRAIN

            float lefty = -gamepad1.left_stick_y;
            float leftx = gamepad1.left_stick_x;
            float rightx = gamepad1.right_stick_x;

            flpower = lefty + leftx + rightx;
            blpower = lefty - leftx + rightx;
            frpower = lefty - leftx - rightx;
            brpower = lefty + leftx - rightx;

            frontLeft.setPower(flpower);
            backLeft.setPower(blpower);
            frontRight.setPower(frpower);
            backRight.setPower(brpower);

            // END ROBOT-CENTRIC DRIVETRAIN
}
