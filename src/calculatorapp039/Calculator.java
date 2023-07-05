/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculatorapp039;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Abu Dozana Tahmid
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {

        initComponents();

        // colorClimax();
        on.setEnabled(false);
        //setIconImage();

    }

//    public void setIconImage() {
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calc.ico")));
//    }
    public void defaultColor() {

        //color
        //Color of JFRame         
        Color backg = null;
        Color forg = null;
        Color opCol = null;
        Color numCol = null;

        getContentPane().setBackground(backg);

        jTextField1.setBackground(backg);
        jTextField1.setForeground(forg);

        jTextField2.setBackground(backg);
        jTextField2.setForeground(forg);

        jTextField3.setBackground(backg);
        jTextField3.setForeground(forg);

        jLabel1.setBackground(backg);
        jLabel1.setForeground(forg);

//        jTextField1.setBorder(new EmptyBorder(0, 0, 0, 0));
//        jTextField2.setBorder(new EmptyBorder(0, 0, 0, 0));
//        jTextField3.setBorder(new EmptyBorder(0, 0, 0, 0));
        //operation buttons
        on.setForeground(forg);
        off.setForeground(forg);

        inverse.setBackground(opCol);
        inverse.setForeground(forg);

        percentage.setBackground(opCol);
        percentage.setForeground(forg);

        clearAll.setBackground(opCol);
        clearAll.setForeground(forg);

        backSpace.setBackground(opCol);
        backSpace.setForeground(forg);

        power.setBackground(opCol);
        power.setForeground(forg);

        square.setBackground(opCol);
        square.setForeground(forg);

        sqrt.setBackground(opCol);
        sqrt.setForeground(forg);

        divide.setBackground(opCol);
        divide.setForeground(forg);

        multiply.setBackground(opCol);
        multiply.setForeground(forg);

        subtract.setBackground(opCol);
        subtract.setForeground(forg);

        addition.setBackground(opCol);
        addition.setForeground(forg);

        plusOrMinus.setBackground(numCol);
        plusOrMinus.setForeground(forg);

        //number color
        zero.setBackground(numCol);
        zero.setForeground(forg);

        one.setBackground(numCol);
        one.setForeground(forg);

        two.setBackground(numCol);
        two.setForeground(forg);

        three.setBackground(numCol);
        three.setForeground(forg);

        four.setBackground(numCol);
        four.setForeground(forg);

        five.setBackground(numCol);
        five.setForeground(forg);

        six.setBackground(numCol);
        six.setForeground(forg);

        seven.setBackground(numCol);
        seven.setForeground(forg);

        eight.setBackground(numCol);
        eight.setForeground(forg);

        nine.setBackground(numCol);
        nine.setForeground(forg);

        decimalPoint.setBackground(numCol);
        decimalPoint.setForeground(forg);

    }

    public void colorClimax() {
        //color
        //Color of JFRame         
        Color backg = new Color(32, 32, 32);
        Color forg = new Color(255, 255, 255);
        Color opCol = new Color(10, 10, 10);
        Color numCol = new Color(30, 30, 30);

        getContentPane().setBackground(backg);

        jTextField1.setBackground(backg);
        jTextField1.setForeground(forg);

        jTextField2.setBackground(backg);
        jTextField2.setForeground(forg);

        jTextField3.setBackground(backg);
        jTextField3.setForeground(forg);

        jLabel1.setBackground(backg);
        jLabel1.setForeground(forg);

//        jTextField1.setBorder(new EmptyBorder(0, 0, 0, 0));
//        jTextField2.setBorder(new EmptyBorder(0, 0, 0, 0));
//        jTextField3.setBorder(new EmptyBorder(0, 0, 0, 0));
        //operation buttons
        on.setForeground(forg);
        off.setForeground(forg);

        inverse.setBackground(opCol);
        inverse.setForeground(forg);

        percentage.setBackground(opCol);
        percentage.setForeground(forg);

        clearAll.setBackground(opCol);
        clearAll.setForeground(forg);

        backSpace.setBackground(opCol);
        backSpace.setForeground(forg);

        power.setBackground(opCol);
        power.setForeground(forg);

        square.setBackground(opCol);
        square.setForeground(forg);

        sqrt.setBackground(opCol);
        sqrt.setForeground(forg);

        divide.setBackground(opCol);
        divide.setForeground(forg);

        multiply.setBackground(opCol);
        multiply.setForeground(forg);

        subtract.setBackground(opCol);
        subtract.setForeground(forg);

        addition.setBackground(opCol);
        addition.setForeground(forg);

        plusOrMinus.setBackground(numCol);
        plusOrMinus.setForeground(forg);

        //number color
        zero.setBackground(numCol);
        zero.setForeground(forg);

        one.setBackground(numCol);
        one.setForeground(forg);

        two.setBackground(numCol);
        two.setForeground(forg);

        three.setBackground(numCol);
        three.setForeground(forg);

        four.setBackground(numCol);
        four.setForeground(forg);

        five.setBackground(numCol);
        five.setForeground(forg);

        six.setBackground(numCol);
        six.setForeground(forg);

        seven.setBackground(numCol);
        seven.setForeground(forg);

        eight.setBackground(numCol);
        eight.setForeground(forg);

        nine.setBackground(numCol);
        nine.setForeground(forg);

        decimalPoint.setBackground(numCol);
        decimalPoint.setForeground(forg);

    }

    double num, ans;
    int calculation;

    public void arithmetic_operation() {

        //String operation = jTextField3.getText();
        switch (calculation) {

            case 1: //add
                ans = num + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;

            case 2: //sub
                ans = num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;

            case 3: //mul
                ans = num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;

            case 4: //div

                if (Double.parseDouble(jTextField1.getText()) != 0) {
                    ans = num / Double.parseDouble(jTextField1.getText());
                    jTextField1.setText(Double.toString(ans));
                } else {
                    jTextField1.setText("Cannot divide by zero!");
                    // Set the font size to 24
                    Font font2 = new Font(jTextField1.getFont().getName(), Font.PLAIN, 24);
                    jTextField1.setFont(font2);

                }

                break;

            case 5: //sqrt

                if (num >= 0) {
                    ans = Math.sqrt(num); // Double.parseDouble(jTextField1.getText());
                    jTextField1.setText(Double.toString(ans));
                } else {

                    // Set the text of jTextField1
                    jTextField1.setText("Complex number not supported!");

                    // Set the font size to 18
                    Font font = new Font(jTextField1.getFont().getName(), Font.PLAIN, 18);
                    jTextField1.setFont(font);
                }

                break;

            case 6: //square
                ans = Math.pow(num, 2); //Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;

            case 7: //pow
                ans = Math.pow(num, Double.parseDouble(jTextField1.getText()));
                jTextField1.setText(Double.toString(ans));
                break;

            case 8: // Percentage
                ans = num / 100; // Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;

            case 9: // inverse
                ans = 1 / num; // Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;

            /*case 10: // plus or minus
                    ans =(-1)*num; // Double.parseDouble(jTextField1.getText());
                    jTextField1.setText(Double.toString(ans));                
                break; */
        }

        //jTextField3.setText(operation + jTextField1.getText());
    }

    public void enable() {

        jTextField1.setEnabled(true);

        on.setEnabled(false);
        off.setEnabled(true);

        zero.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);

        decimalPoint.setEnabled(true);
        equal.setEnabled(true);

        addition.setEnabled(true);
        subtract.setEnabled(true);
        multiply.setEnabled(true);
        divide.setEnabled(true);
        percentage.setEnabled(true);
        power.setEnabled(true);
        square.setEnabled(true);
        sqrt.setEnabled(true);
        inverse.setEnabled(true);
        plusOrMinus.setEnabled(true);

        backSpace.setEnabled(true);
        clearAll.setEnabled(true);

    }

    public void disable() {

        on.setEnabled(true);
        off.setEnabled(false);

        jTextField1.setEnabled(false);

        zero.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);

        decimalPoint.setEnabled(false);
        equal.setEnabled(false);

        addition.setEnabled(false);
        subtract.setEnabled(false);
        multiply.setEnabled(false);
        divide.setEnabled(false);
        percentage.setEnabled(false);
        power.setEnabled(false);
        square.setEnabled(false);
        sqrt.setEnabled(false);
        inverse.setEnabled(false);
        plusOrMinus.setEnabled(false);

        backSpace.setEnabled(false);
        clearAll.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        off = new javax.swing.JRadioButton();
        on = new javax.swing.JRadioButton();
        backSpace = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        addition = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        three = new javax.swing.JButton();
        decimalPoint = new javax.swing.JButton();
        six = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();
        square = new javax.swing.JButton();
        five = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        two = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        plusOrMinus = new javax.swing.JButton();
        one = new javax.swing.JButton();
        four = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        power = new javax.swing.JButton();
        inverse = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAlwaysOnTop = new javax.swing.JCheckBoxMenuItem();
        menuDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuShowBorders = new javax.swing.JCheckBoxMenuItem();
        credit = new javax.swing.JMenuItem();
        reportBug = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuFs18 = new javax.swing.JMenuItem();
        menuFs24 = new javax.swing.JMenuItem();
        menuFs36 = new javax.swing.JMenuItem();
        clearAllText = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(32, 32, 32));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(32, 32, 32));
        setIconImages(null);
        setLocation(new java.awt.Point(850, 50));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 535));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setToolTipText("Main Display");
        jTextField1.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jTextField1MouseWheelMoved(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(off);
        off.setText("OFF");
        off.setToolTipText("Turn Calculator OFF to \npreserve your calculation.");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        buttonGroup1.add(on);
        on.setText("ON");
        on.setToolTipText("Turn Calculator ON");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });

        backSpace.setFont(backSpace.getFont().deriveFont(backSpace.getFont().getStyle() | java.awt.Font.BOLD, backSpace.getFont().getSize()+6));
        backSpace.setText("⌫");
        backSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSpaceActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        multiply.setText("x");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        divide.setText("÷");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        subtract.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subtract.setText("-");
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        addition.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addition.setText("+");
        addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(97, 186, 97));
        equal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        decimalPoint.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        decimalPoint.setText(".");
        decimalPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalPointActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        sqrt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sqrt.setText("<html>\n&#8730;x\n</html>"); // NOI18N
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        percentage.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        percentage.setText("%");
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });

        clearAll.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clearAll.setText("CE");
        clearAll.setBorderPainted(false);
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });

        square.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        square.setText("x²"); // NOI18N
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        plusOrMinus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        plusOrMinus.setText("±");
        plusOrMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusOrMinusActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        power.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        power.setText("<html>\nx&#8319;\n</html>");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        inverse.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inverse.setText("1/x");
        inverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setToolTipText("Show operation");
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setToolTipText("Operation Display");
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText(" 20210204039");
        jLabel1.setToolTipText("abu.cse.20210204039@aust.edu");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("File");

        menuAlwaysOnTop.setText("Always on top");
        menuAlwaysOnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlwaysOnTopActionPerformed(evt);
            }
        });
        jMenu1.add(menuAlwaysOnTop);

        menuDarkMode.setText("Dark Mode");
        menuDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDarkModeActionPerformed(evt);
            }
        });
        jMenu1.add(menuDarkMode);

        menuShowBorders.setText("Hide Borders");
        menuShowBorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuShowBordersActionPerformed(evt);
            }
        });
        jMenu1.add(menuShowBorders);

        credit.setText("Credit");
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });
        jMenu1.add(credit);

        reportBug.setText("Report Bug");
        reportBug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBugActionPerformed(evt);
            }
        });
        jMenu1.add(reportBug);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        menuFs18.setText("Font Size 18");
        menuFs18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFs18ActionPerformed(evt);
            }
        });
        jMenu2.add(menuFs18);

        menuFs24.setText("Font Size 24");
        menuFs24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFs24ActionPerformed(evt);
            }
        });
        jMenu2.add(menuFs24);

        menuFs36.setText("Font size 36");
        menuFs36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFs36ActionPerformed(evt);
            }
        });
        jMenu2.add(menuFs36);

        clearAllText.setText("Clear All");
        clearAllText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllTextActionPerformed(evt);
            }
        });
        jMenu2.add(clearAllText);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(on)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(off))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(plusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(decimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addition, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(off)
                    .addComponent(on)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addition, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextField2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        enable();
        jTextField2.setText("ON");

    }//GEN-LAST:event_onActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        //jTextField1.setText(jTextField1.getText() + "x");

        String currentText = jTextField1.getText().trim(); // Trim leading and trailing whitespaces

        if (!currentText.isEmpty()) {
            try {
                num = Double.parseDouble(jTextField1.getText());
                calculation = 3;
                jTextField1.setText("");
                jTextField3.setText(num + "x");
            } catch (NumberFormatException e) {
                jTextField3.setText("Invalid Input");
            }
        } else {
            jTextField3.setText("Provide me a number first!");
        }
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        //jTextField1.setText(jTextField1.getText() + "÷");
        String currentText = jTextField1.getText().trim(); // Trim leading and trailing whitespaces

        if (!currentText.isEmpty()) {
            try {
                num = Double.parseDouble(jTextField1.getText());
                calculation = 4;
                jTextField1.setText("");
                jTextField3.setText(num + "÷");
            } catch (NumberFormatException e) {
                jTextField3.setText("Invalid Input");
            }
        } else {
            jTextField3.setText("You want me to divide you?");
        }

    }//GEN-LAST:event_divideActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        //jTextField1.setText(jTextField1.getText() + "-");

        String currentText = jTextField1.getText().trim(); // Trim leading and trailing whitespaces

        if (!currentText.isEmpty() && !currentText.equals("-")) {
            try {
                num = Double.parseDouble(currentText);
                calculation = 2;
                jTextField1.setText("");
                jTextField3.setText(num + "-");
            } catch (NumberFormatException e) {
                jTextField3.setText("Invalid Input");
            }
        } else if (currentText.isEmpty()) {
            jTextField1.setText(jTextField1.getText() + "-");
        } else if (currentText.equals("-")) {
            jTextField3.setText("");
        }


    }//GEN-LAST:event_subtractActionPerformed

    private void additionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionActionPerformed

        String currentText = jTextField1.getText().trim(); // Trim leading and trailing whitespaces

        if (!currentText.isEmpty() && !currentText.equals("-")) {
            try {
                num = Double.parseDouble(jTextField1.getText());
                calculation = 1;
                arithmetic_operation();
                jTextField1.setText("");
                jTextField3.setText(num + "+");
            } catch (NumberFormatException e) {
                jTextField3.setText("Invalid Input");
            }
        } else if (currentText.isEmpty() || currentText.equals("-")) {
            jTextField1.setText("");
            jTextField3.setText("Insert a number first!");
        }
    }//GEN-LAST:event_additionActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        jTextField2.setText("Answer");
        // /*
        //this works fine untill 6-= is pressed. //6 is sample here.
        jTextField2.setText("Answer");

        String operation = jTextField3.getText();

        if (!jTextField1.getText().isEmpty()) {
            try {
                double currentNum = Double.parseDouble(jTextField1.getText());
                operation += currentNum;
            } catch (NumberFormatException e) {
                jTextField1.setText("Invalid input");
                return;

            }
        }

        if (operation.endsWith("+") || operation.endsWith("-") || operation.endsWith("*") || operation.endsWith("/") || operation.endsWith("÷") || operation.endsWith("x") || operation.endsWith("^")) {
            jTextField1.setText("Invalid input");
            return;
        }
        jTextField3.setText("");
        jTextField3.setText(operation);
        arithmetic_operation();
        //jTextField3.setText(""); //this clears the panel after operation. 
        // */

        /*  
 
       // I wrote this one primarily
 
        if(!jTextField1.getText().isEmpty()){
     
            jTextField2.setText("Answer");
            String operation = jTextField3.getText() + Double.parseDouble(jTextField1.getText());
            jTextField3.setText(operation);
            arithmetic_operation();
        
        }else{
        
            arithmetic_operation();
            //jTextField3.setText("");
        }
         */

    }//GEN-LAST:event_equalActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_threeActionPerformed

    private void decimalPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalPointActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_decimalPointActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_sixActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_nineActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        jTextField2.setText("sqrt(x)");
        String currentText = jTextField1.getText().trim(); // Trim leading and trailing whitespaces

        if (!currentText.isEmpty()) {
            try {
                num = Double.parseDouble(jTextField1.getText());
                calculation = 5;
                jTextField1.setText("");
                jTextField3.setText("sqrt(" + num + ")");
            } catch (NumberFormatException e) {
                jTextField3.setText("Invalid Input");
            }
        } else {
            jTextField3.setText("Insert a number first!");
        }

    }//GEN-LAST:event_sqrtActionPerformed

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed
        //jTextField1.setText(jTextField1.getText() + "%");
        String currentText = jTextField1.getText().trim(); // Trim leading and trailing whitespaces

        if (!currentText.isEmpty()) {
            try {
                num = Double.parseDouble(jTextField1.getText());
                calculation = 8;
                jTextField1.setText("");
                jTextField3.setText(num + "%");
            } catch (NumberFormatException e) {
                jTextField3.setText("Invalid Input");
            }
        } else {
            jTextField3.setText("Insert a number first!");
        }
    }//GEN-LAST:event_percentageActionPerformed

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllActionPerformed
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField2.setText("CLEAR ENTRY");
        ans=0.0;
        
    }//GEN-LAST:event_clearAllActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        jTextField2.setText("x²");

        String currentText = jTextField1.getText().trim(); // Trim leading and trailing whitespaces

        if (!currentText.isEmpty()) {
            try {
                num = Double.parseDouble(jTextField1.getText());
                calculation = 6;
                jTextField1.setText("");
                jTextField3.setText(num + "²");
            } catch (NumberFormatException e) {
                jTextField3.setText("Invalid Input");
            }
        } else {
            jTextField3.setText("Insert a number first!");
        }
    }//GEN-LAST:event_squareActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_fiveActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_eightActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_twoActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void plusOrMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusOrMinusActionPerformed
//        jTextField2.setText("negate(x)");
//        jTextField1.setText("-" + jTextField1.getText());

        jTextField2.setText("negate(x)");
        String text = jTextField1.getText();

        if (!text.isEmpty() && text.charAt(0) == '-') {
            // Remove the "-" sign if it exists at the beginning
            jTextField1.setText(text.substring(1));
        } else {
            // Add the "-" sign if it doesn't exist
            jTextField1.setText("-" + text);
        }

        /*num = Double.parseDouble(jTextField1.getText());
        calculation = 10;
        jTextField1.setText("");
        jTextField3.setText(Double.toString(num));*/
    }//GEN-LAST:event_plusOrMinusActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_oneActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_fourActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_sevenActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        jTextField2.setText("xⁿ=pow(x,n)");

        String currentText = jTextField1.getText().trim(); // Trim leading and trailing whitespaces

        try {
            if (!currentText.isEmpty()) {
                num = Double.parseDouble(currentText);
                calculation = 7;
                jTextField1.setText("");
                jTextField3.setText(num + "^");
            } else {
                jTextField3.setText("Insert a number first!");
            }
        } catch (NumberFormatException e) {
            // Handle the case when the text cannot be parsed as a valid number
            jTextField3.setText("Invalid input");
        }

    }//GEN-LAST:event_powerActionPerformed

    private void inverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseActionPerformed
        jTextField2.setText("inverse(x)");

        String currentText = jTextField1.getText().trim(); // Trim leading and trailing whitespaces

        try {
            if (!currentText.isEmpty()) {
                num = Double.parseDouble(currentText);
                calculation = 9;
                jTextField1.setText("");
                jTextField3.setText("1/" + num);
            } else {
                jTextField3.setText("Insert a number first!");
            }
        } catch (NumberFormatException e) {
            // Handle the case when the text cannot be parsed as a valid number
            jTextField3.setText("Invalid input");
        }

    }//GEN-LAST:event_inverseActionPerformed

    private void backSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSpaceActionPerformed
        jTextField2.setText("Backspace");

        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length() - 1;
        String store;

        if (length > 0) {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField1.setText(store);

        }
    }//GEN-LAST:event_backSpaceActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        jTextField2.setText("OFF");
        disable();
    }//GEN-LAST:event_offActionPerformed

    private void jTextField1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jTextField1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseWheelMoved


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void menuShowBordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuShowBordersActionPerformed
        // TODO add your handling code here:

        if (menuShowBorders.getState()) {
            jTextField1.setBorder(null); // Set border to null to remove it
            jTextField2.setBorder(null);
            jTextField3.setBorder(null);
        } else {
            // Set the desired border for the text fields
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            jTextField3.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }


    }//GEN-LAST:event_menuShowBordersActionPerformed

    private void menuAlwaysOnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlwaysOnTopActionPerformed
        // TODO add your handling code here:
        if (menuAlwaysOnTop.getState() == false) {

            setAlwaysOnTop(false);

        } else if (menuAlwaysOnTop.getState() == true) {

            setAlwaysOnTop(true);

        }

    }//GEN-LAST:event_menuAlwaysOnTopActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void menuDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDarkModeActionPerformed
        if (menuDarkMode.getState() == false) {
            // Disable dark mode
            // Reset colors to default
            defaultColor();

        } else if (menuDarkMode.getState() == true) {
            // Enable dark mode
            colorClimax(); // Call the function to apply dark mode colors
        }
    }//GEN-LAST:event_menuDarkModeActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Created by: \n Abu Dojana\n ID: 20210204039 (AUST)\n First Java Application for Software Development Lab-II \nTotal Spend Time: 55 Hours \n https://github.com/abudojana \n \nNotice Board:\nOnno pora baad diey eita banaisi sudhu matro \nei Assignment er jonno. \nAmar ki r kono pora lekha nai?\n(This is sad. Varsity theke kisu sikhu na. \nShekhar time e to dey na thik moto.)");
    }//GEN-LAST:event_creditActionPerformed

    private void reportBugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBugActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Report Bug here:\nFracebook: facebook.com/AbuDozanaTahmid \nE-mail: \nabu.cse.20210204039@aust.edu\n abudojana2001@gmail.com");
    }//GEN-LAST:event_reportBugActionPerformed

    private void clearAllTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllTextActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        ans=0;
        num=0;
       

        
    }//GEN-LAST:event_clearAllTextActionPerformed

    private void menuFs36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFs36ActionPerformed
        // TODO add your handling code here:
        // Set the font size to 36
        Font font3 = new Font(jTextField1.getFont().getName(), Font.PLAIN, 36);
        jTextField1.setFont(font3);
    }//GEN-LAST:event_menuFs36ActionPerformed

    private void menuFs24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFs24ActionPerformed
        // TODO add your handling code here:
        // Set the font size to 24
        Font font4 = new Font(jTextField1.getFont().getName(), Font.PLAIN, 24);
        jTextField1.setFont(font4);
    }//GEN-LAST:event_menuFs24ActionPerformed

    private void menuFs18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFs18ActionPerformed
        // TODO add your handling code here:
        // Set the font size to 18
        Font font5 = new Font(jTextField1.getFont().getName(), Font.PLAIN, 18);
        jTextField1.setFont(font5);
    }//GEN-LAST:event_menuFs18ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addition;
    private javax.swing.JButton backSpace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearAll;
    private javax.swing.JMenuItem clearAllText;
    private javax.swing.JMenuItem credit;
    private javax.swing.JButton decimalPoint;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton inverse;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JCheckBoxMenuItem menuAlwaysOnTop;
    private javax.swing.JCheckBoxMenuItem menuDarkMode;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuFs18;
    private javax.swing.JMenuItem menuFs24;
    private javax.swing.JMenuItem menuFs36;
    private javax.swing.JCheckBoxMenuItem menuShowBorders;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JButton one;
    private javax.swing.JButton percentage;
    private javax.swing.JButton plusOrMinus;
    private javax.swing.JButton power;
    private javax.swing.JMenuItem reportBug;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton square;
    private javax.swing.JButton subtract;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

}
