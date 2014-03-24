package org.parser.model;

/**
 * Types of degrees/angles.
 * @author Nikita Lipatov.
 **/
public interface ParserType {

    /**
     * A degree, usually denoted by °, is a measurement of plane angle, representing 1⁄360 of a full rotation.
     **/
    public static final int DEGREE = 1;

    /**
     * The gradian is a unit of plane angle, equivalent to 1⁄400 of a turn.
     **/
    public static final int GRADUS = 2;

    /**
     * The radian is the standard unit of angular measure, used in many areas of mathematics.
     * An angle's measurement in radians is numerically equal to the length of a corresponding arc of a unit circle, so one radian is just under 57.3 degrees.
     **/
    public static final int RADIAN = 3;
}
