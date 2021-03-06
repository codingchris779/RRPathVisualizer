import com.acmerobotics.roadrunner.geometry.Pose2d
import com.acmerobotics.roadrunner.geometry.Vector2d
import com.acmerobotics.roadrunner.trajectory.Trajectory
import com.acmerobotics.roadrunner.trajectory.TrajectoryBuilder
import com.acmerobotics.roadrunner.trajectory.constraints.DriveConstraints

object TrajectoryGenBlue {
    private val constraints = DriveConstraints(45.0, 35.0, 0.0, 180.0.toRadians, 180.0.toRadians, 0.0)


    fun createTrajectory(): ArrayList<Trajectory> {
        val list = ArrayList<Trajectory>()

        var startPose = Pose2d(-33.0, 63.0, 0.0.toRadians)
//        val startPose = Pose2d(50.0, -35.0, 90.0.toRadians)
//        val startPose = Pose2d(-18.0, -35.0, 180.0.toRadians)
        var builder1 = TrajectoryBuilder(startPose, constraints)

        builder1.reverse()
            .strafeTo(Vector2d(-59.0, 36.0))

        // 1.
        list.add(builder1.build())

        builder1 = TrajectoryBuilder(Pose2d(-59.0, 36.0, 0.0.toRadians), constraints)
        builder1
            .strafeTo(Vector2d(-59.0, 42.0))
            .splineTo(Pose2d(0.0,42.0, 0.0.toRadians))
            .splineTo(Pose2d(49.0,36.0, 0.0.toRadians))

        // 2.
        list.add(builder1.build())

        builder1 = TrajectoryBuilder(Pose2d(49.0, 36.0, 0.0.toRadians), constraints)
        builder1.reverse()
            .splineTo(Pose2d(0.0,39.0, 0.0.toRadians))
            .splineTo(Pose2d(-35.0,36.0, 0.0.toRadians))

        // 3.
        list.add(builder1.build())

        builder1 = TrajectoryBuilder(Pose2d(-35.0, 36.0, 0.0.toRadians), constraints)
        builder1
            .strafeTo(Vector2d(-35.0,42.0))
            .splineTo(Pose2d(0.0,42.0, 0.0.toRadians))
            .splineTo(Pose2d(56.0,36.0, 0.0.toRadians))

        // 4.
        list.add(builder1.build())

        builder1 = TrajectoryBuilder(Pose2d(47.0, 36.0, 0.0.toRadians), constraints)
        builder1
            .reverse()
            .splineTo(Pose2d(8.0,42.0, 0.0.toRadians))
            .lineTo(Vector2d(-18.0,42.0))
            .strafeTo(Vector2d(-18.0,36.0))

        // 5.
        list.add(builder1.build())

        builder1 = TrajectoryBuilder(Pose2d(-18.0, 36.0, 0.0.toRadians), constraints)
        builder1
            .strafeTo(Vector2d(-18.0,42.0))
            .lineTo(Vector2d(0.0,42.0))
            .splineTo(Pose2d(61.0,35.0, 0.0.toRadians))

        // 6.
        list.add(builder1.build())

        builder1 = TrajectoryBuilder(Pose2d(61.0, 36.0, 0.0.toRadians), constraints)
        builder1
            .reverse()
            .splineTo(Pose2d(0.0,39.0, 0.0.toRadians))
            .splineTo(Pose2d(-27.0,36.5, 0.0.toRadians))

        // 7.
        list.add(builder1.build())

        builder1 = TrajectoryBuilder(Pose2d(-27.0, 36.0, 0.0.toRadians), constraints)
        builder1
            .strafeTo(Vector2d(-27.0,41.0))
            .splineTo(Pose2d(0.0,42.0, 0.0.toRadians))
            .splineTo(Pose2d(51.0,34.0, 0.0.toRadians))
            .strafeLeft(5.0)


        // 8.
        list.add(builder1.build())

//        builder1 = TrajectoryBuilder(Pose2d(51.0, 36.0, 0.0.toRadians), constraints)
//        builder1
//            .reverse()
//            .splineTo(Pose2d(0.0,39.0, 0.0.toRadians))
//            .splineTo(Pose2d(-43.0,36.0, 0.0.toRadians))
//
//        list.add(builder1.build())
//
//        builder1 = TrajectoryBuilder(Pose2d(-43.0, 36.0, 0.0.toRadians), constraints)
//        builder1
//            .splineTo(Pose2d(0.0,41.0, 0.0.toRadians))
//            .splineTo(Pose2d(51.0,35.0, 0.0.toRadians))
//
//        list.add(builder1.build())
//
//        builder1 = TrajectoryBuilder(Pose2d(51.0, 36.0, 0.0.toRadians), constraints)
//        builder1
//            .reverse()
//            .splineTo(Pose2d(0.0,39.0, 0.0.toRadians))
//            .splineTo(Pose2d(-51.0,36.0, 0.0.toRadians))
//
//        list.add(builder1.build())
//
//        builder1 = TrajectoryBuilder(Pose2d(-51.0, 36.0, 0.0.toRadians), constraints)
//        builder1
//            .splineTo(Pose2d(0.0,41.0, 0.0.toRadians))
//            .splineTo(Pose2d(51.0,33.0, 0.0.toRadians))
//
//        list.add(builder1.build())

//        builder1 = TrajectoryBuilder(Pose2d(51.0, 32.0, 270.0.toRadians), constraints)
//        builder1
//            .forward(5.0)

//            .splineTo(Pose2d(55.0,-31.0, 90.0.toRadians))
//            .reverse()
//            .splineTo(Pose2d(35.0,-56.0, 0.0.toRadians))
//            .reverse()
//            .splineTo(Pose2d(48.0,-56.0, 0.0.toRadians))
//            .reverse()
//            .splineTo(Pose2d(0.0,-41.0, 0.0.toRadians))

    //        .splineTo(Pose2d(8.0,-42.0, 180.0.toRadians))
    //        .splineTo(Pose2d(-18.0,-36.0, 180.0.toRadians))
//            .reverse()
//            .splineTo(Pose2d(3.0,-44.0, 180.0.toRadians))
//            .splineTo(Pose2d(50.0,-35.0, 180.0.toRadians))


        // 9.
//       list.add(builder1.build())

        val builder2 = TrajectoryBuilder(Pose2d(51.0,31.0, (-90.0).toRadians), constraints)

            builder2
            .forward(5.0)
            .reverse()
            .splineTo(Pose2d(33.0,58.0, 0.0.toRadians))
            .reverse()
                .lineTo(Vector2d(0.0, 41.0))
 //           .splineTo(Pose2d(48.0,56.0, 0.0.toRadians))
 //               .reverse()
  //          .splineTo(Pose2d(0.0,41.0, 0.0.toRadians))


//        val builder2 = TrajectoryBuilder(Pose2d(15.0,63.0, (-90.0).toRadians), constraints)
//
//        builder2
//            .splineTo(Pose2d(50.0,30.0, (-90.0).toRadians))
//            .reverse()
//            .splineTo(Pose2d(35.0,48.0, 0.0.toRadians))
//            .reverse()
//            .splineTo(Pose2d(48.0,48.0, 0.0.toRadians))
//            .reverse()
//            .splineTo(Pose2d(0.0,41.0, 0.0.toRadians))

        // 10.
        list.add(builder2.build())
        return list
    }

    fun drawOffbounds1() {
        GraphicsUtil.fillRect(Vector2d(-12.0, 63.0), 18.0, 18.0, false) // robot against the wall
    }

    fun drawOffbounds2() {
        GraphicsUtil.fillRect(Vector2d(0.0, 24.0), 12.0, 8.0,true) // block against the bridge
    }
}
