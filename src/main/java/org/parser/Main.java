package org.parser;

import org.parser.model.Parser;
import org.parser.view.GUI;

/**
 * Entry point of MathParser.
 * @author Lipatov Nikita
 **/
public class Main
{
    /**
     * Main function.
     * @param args It's not used.
     **/
    public static void main(String[] args)
    {
        Parser mathParser = new Parser();
        GUI instance = new GUI();
        instance.setMathParser(mathParser);
    }
}
