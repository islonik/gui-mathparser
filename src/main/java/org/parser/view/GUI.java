package org.parser.view;

import org.parser.model.Parser;
import org.parser.model.ParserType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * GUI
 * @author Lipatov Nikita
 */
public class GUI extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 2L;
    private Parser     calc = new Parser();
    private boolean trigger = false;
    private int currentWidth;
    private int currentHeight;
    private int secretHeight;

    public GUI()
    {
        initComponents();
        setIconImage(getImageIcon()); // Icon of window

        currentWidth  = this.getWidth();
        currentHeight = this.TopPanel.getHeight();
        secretHeight = this.BasePanel.getHeight();
        setTitle("MathParser");
        pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLocation(320, 240);
        setSize(currentWidth, currentHeight + 35);

        calculateButton.addActionListener(this);
        moreButton.addActionListener(this);
        saveButton.addActionListener(this);
        helpButton.addActionListener(this);
        backspaceButton.addActionListener(this);
        zeroButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
        divideButton.addActionListener(this);
        multiButton.addActionListener(this);
        indexButton.addActionListener(this);
        modalButton.addActionListener(this);
        pointButton.addActionListener(this);
        openBracket.addActionListener(this);
        closeBracket.addActionListener(this);
        degreeCheckbox.addActionListener(this);
        radianCheckbox.addActionListener(this);
        gradusCheckbox.addActionListener(this);
        clearButton.addActionListener(this);

        /**
         * Handling actions for Enter button
         **/
        inputText.addKeyListener(new KeyAdapter()
        {
                public void keyPressed(KeyEvent e)
                {
            if(e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                calculateButton();
            }
                }
        });
    }

    private Image getImageIcon()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/calculator.png"));
        return icon.getImage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        firstLabel = new javax.swing.JLabel();
        secondLabel = new javax.swing.JLabel();
        inputText = new javax.swing.JTextField();
        outputText = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        moreButton = new javax.swing.JButton();
        BasePanel = new javax.swing.JPanel();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multiButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        backspaceButton = new javax.swing.JButton();
        indexButton = new javax.swing.JButton();
        modalButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        degreeCheckbox = new javax.swing.JRadioButton();
        gradusCheckbox = new javax.swing.JRadioButton();
        radianCheckbox = new javax.swing.JRadioButton();
        text = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        openBracket = new javax.swing.JButton();
        closeBracket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstLabel.setText("Input :");

        secondLabel.setText("Output:");

        calculateButton.setText("Calculate");

        moreButton.setText("More");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(secondLabel)
                    .addComponent(firstLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addComponent(outputText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(moreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculateButton)))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moreButton)
                    .addComponent(outputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondLabel)))
        );

        sevenButton.setText("7");
        sevenButton.setPreferredSize(new java.awt.Dimension(39, 30));

        eightButton.setText("8");
        eightButton.setPreferredSize(new java.awt.Dimension(39, 30));

        nineButton.setText("9");
        nineButton.setPreferredSize(new java.awt.Dimension(39, 30));

        divideButton.setText("/");
        divideButton.setPreferredSize(new java.awt.Dimension(41, 30));

        multiButton.setText("*");
        multiButton.setPreferredSize(new java.awt.Dimension(41, 30));

        sixButton.setText("6");
        sixButton.setPreferredSize(new java.awt.Dimension(39, 30));

        fiveButton.setText("5");
        fiveButton.setPreferredSize(new java.awt.Dimension(39, 30));

        fourButton.setText("4");
        fourButton.setPreferredSize(new java.awt.Dimension(39, 30));

        minusButton.setText("-");
        minusButton.setPreferredSize(new java.awt.Dimension(41, 30));

        threeButton.setText("3");
        threeButton.setPreferredSize(new java.awt.Dimension(39, 30));

        twoButton.setText("2");
        twoButton.setPreferredSize(new java.awt.Dimension(39, 30));

        oneButton.setText("1");
        oneButton.setPreferredSize(new java.awt.Dimension(39, 30));

        plusButton.setText("+");
        plusButton.setPreferredSize(new java.awt.Dimension(41, 30));

        pointButton.setText(".");
        pointButton.setPreferredSize(new java.awt.Dimension(39, 30));

        zeroButton.setText("0");
        zeroButton.setPreferredSize(new java.awt.Dimension(39, 30));

        helpButton.setText("Help");
        helpButton.setPreferredSize(new java.awt.Dimension(41, 30));

        saveButton.setText("Save");
        saveButton.setPreferredSize(new java.awt.Dimension(39, 30));

        backspaceButton.setText("Backspace");
        backspaceButton.setPreferredSize(new java.awt.Dimension(41, 30));

        indexButton.setText("^");
        indexButton.setPreferredSize(new java.awt.Dimension(39, 30));

        modalButton.setText("%");
        modalButton.setPreferredSize(new java.awt.Dimension(39, 30));

        clearButton.setText("Clear");

        degreeCheckbox.setSelected(true);
        degreeCheckbox.setText("degree");

        gradusCheckbox.setText("gradus");

        radianCheckbox.setText("radian");

        jText.setColumns(20);
        jText.setRows(5);
        text.setViewportView(jText);

        openBracket.setText("(");
        openBracket.setPreferredSize(new java.awt.Dimension(39, 30));

        closeBracket.setText(")");
        closeBracket.setPreferredSize(new java.awt.Dimension(39, 30));

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BasePanelLayout.createSequentialGroup()
                        .addComponent(degreeCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radianCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gradusCheckbox))
                    .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasePanelLayout.createSequentialGroup()
                        .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BasePanelLayout.createSequentialGroup()
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(zeroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BasePanelLayout.createSequentialGroup()
                                .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BasePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BasePanelLayout.createSequentialGroup()
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(openBracket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sevenButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(closeBracket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BasePanelLayout.createSequentialGroup()
                                .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(indexButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(backspaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasePanelLayout.createSequentialGroup()
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openBracket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeBracket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradusCheckbox)
                            .addComponent(radianCheckbox)
                            .addComponent(degreeCheckbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BasePanelLayout.createSequentialGroup()
                        .addComponent(backspaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indexButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasePanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasePanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton backspaceButton;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeBracket;
    private javax.swing.JRadioButton degreeCheckbox;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JRadioButton gradusCheckbox;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton indexButton;
    private javax.swing.JTextField inputText;
    private javax.swing.JTextArea jText;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton modalButton;
    private javax.swing.JButton moreButton;
    private javax.swing.JButton multiButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton openBracket;
    private javax.swing.JTextField outputText;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JRadioButton radianCheckbox;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel secondLabel;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JScrollPane text;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables

    /**
     * Handler of buttons
     */
    public void actionPerformed(ActionEvent e)
    {
        /** calculate-button **/
        if(e.getSource() == calculateButton)
        {
            calculateButton();
        }
        /** more-button **/
        else if(e.getSource() == moreButton)
        {
            moreButton();
        }
        /** save-button **/
        else if(e.getSource() == saveButton)
        {
            saveButton();
        }
        /** help-button **/
        else if(e.getSource() == helpButton)
        {
            helpButton();
        }
        /** backspace-button **/
        else if(e.getSource() == backspaceButton)
        {
            backspaceButton();
        }
        else if(e.getSource() == clearButton)
        {
            clearButton();
        }
        /** checkbox case **/
        else if(e.getSource() == degreeCheckbox ||
                e.getSource() == radianCheckbox ||
                e.getSource() == gradusCheckbox)
        {
            checkBox(e.getActionCommand());
        }
        /** other buttons **/
        else
        {
            addOneCharacter(e.getActionCommand());
        }
    }

    private void calculateButton()
    {
        String str = inputText.getText();
        outputText.setText(calc.calculate(str));
    }

    private void moreButton()
    {
        if(trigger)
        {
            setSize(currentWidth, currentHeight + 35);
            trigger = false;
        }
        else
        {
            setSize(currentWidth, currentHeight + secretHeight + 40);
            trigger = true;
        }
    }

    private void saveButton()
    {
        jText.setText(jText.getText() + inputText.getText() + "\n");
    }

    private void helpButton()
    {
        String message =
            "	Top-down parser. Version - 1.00.\n" +
            "	You can use next functions : \n" +
            "Functions with one variable:\n" +
            "	    Abs(x)  - module of number;\n" +
            "	    Acos(x) - arccosine of number;\n" +
            "	    Asin(x) - arcsinus of number;\n" +
            "	    Atan(x) - arctangent of number;\n" +
            "	    Cos(x)  - cosine of number;\n" +
            "	    Log10(x)- logarithm to base 10;\n" +
            "	    Round(x)- round number to integer\n;\n" +
            "	    Sin(x)  - sinus of number;\n" +
            "	    Sqrt(x) - extracting the square of the number;\n" +
            "	    Tan(x)  - tangent of number;\n" +
            "Functions with two variables:\n" +
            "	    Pow(x,y) - involution;\n" +
            "	    Log(x,y) - logarithm to base х;\n" +
            "Functions with many variables:\n" +
            "	    Avg(n1,n2,...nn) - return average number;\n" +
            "	    Max(n1,n2,...nn) - return maximum of number;\n" +
            "	    Min(n1,n2,...nn) - return minimum of number;\n" +
            "	    Sum(n1,n2....nn) - return summary of numbers;\n";
        JOptionPane.showMessageDialog
        (
            null,
            message,
            "Help",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void backspaceButton()
    {
        String str = inputText.getText();
        if(str.length() > 0)
        {
            inputText.setText(str.substring(0, str.length()-1));
        }
    }

    private void checkBox(String str)
    {
        degreeCheckbox.setSelected(false);
        radianCheckbox.setSelected(false);
        gradusCheckbox.setSelected(false);
        if(str.intern() == "degree".intern())
        {
            calc.setTangentUnit(ParserType.DEGREE);
            degreeCheckbox.setSelected(true);
        }
        else if(str.intern() == "gradus".intern())
        {
            calc.setTangentUnit(ParserType.GRADUS);
            gradusCheckbox.setSelected(true);
        }
        else if(str.intern() == "radian".intern())
        {
            calc.setTangentUnit(ParserType.RADIAN);
            radianCheckbox.setSelected(true);
        }
    }

    private void clearButton()
    {
        inputText.setText("");
    }

    private void addOneCharacter(String str)
    {
        inputText.setText(inputText.getText() + str);
    }

}
