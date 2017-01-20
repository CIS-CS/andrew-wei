
package physicsapp;

import java.io.File;
import java.io.FileNotFoundException;
import physicsapp.Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Andrew
 */
public class PhysicsGUI extends javax.swing.JFrame {
    
    //Solve fields
    private int questionNo = 0;
    private String question = "";
    private String response = "";
    private String answer = "";
    private int scoreCounter = 0;
    private int totalScore = 0;
    private boolean answerShown = false;
    
    //Experiment fields
    private int mass;
    private int friction;
    private int slope;
    private String selectedItem;
        
    
    /**
     * Creates new form PhysicsGUI
     */
    public PhysicsGUI() {
	initComponents();
	
	setTitle("Physics Learning App");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	setSlopeSliderLabels();
	setFrictionSliderLabels();
	setMassSliderLabels();
	
	experimentImage.inputValues(slope, friction, mass);
	
	//Getting answer for first question generated in initComponents()
	try {
	    Scanner input = new Scanner(new File("answers.txt"));	    
	    
	    input.useDelimiter("#");
        
	    for(int x = 0; x < questionNo && input.hasNext() == true; x++) {
		answer = input.next();
	    }
	}
	catch (FileNotFoundException e) {
	    System.err.format("File not found.");
	}
	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resetConfirm = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        resetYes = new javax.swing.JButton();
        resetNo = new javax.swing.JButton();
        showAnsConfirm = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        showAnsYes = new javax.swing.JButton();
        showAnsNo = new javax.swing.JButton();
        modeTab = new javax.swing.JTabbedPane();
        experimentPanel = new javax.swing.JPanel();
        frictionSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        slopeSlider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        experimentOk = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        massSlider = new javax.swing.JSlider();
        experimentImage = new physicsapp.AnimatedJPanel();
        experimentReset = new javax.swing.JButton();
        solvePanel = new javax.swing.JPanel();
        solveImage = new javax.swing.JPanel(){

            int triangleX1 = 111;
            int triangleX2 = 211;
            int triangleX3 = 211;

            int triangleY1 = 271;
            int triangleY2 = 271;
            int triangleY3 = 171;

            // +/-20 is for cosmetic purposes
            int squareX1 = (triangleX3 - 28) - 20;
            int squareX2 = (triangleX3 - 28 - 28) - 20;
            int squareX3 = (triangleX3 - 28) - 20;
            int squareX4 = (triangleX3) - 20;

            int squareY1 = (triangleY3 - 28) + 20;
            int squareY2 = (triangleY3) + 20;
            int squareY3 = (triangleY3 - 28 + 28 + 28) + 20;
            int squareY4 = (triangleY3) + 20;

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Color blue = new Color(30, 144, 255);
                Color green = new Color(50, 205, 50);
                Color brown = new Color(160, 82, 45);

                g.setColor(blue);
                g.fillPolygon(new int[] {squareX1, squareX2, squareX3, squareX4},
                    new int[] {squareY1, squareY2, squareY3, squareY4}, 4);
                g.setColor(Color.BLACK);
                g.drawPolygon(new int[] {squareX1, squareX2, squareX3, squareX4},
                    new int[] {squareY1, squareY2, squareY3, squareY4}, 4);

                g.setColor(green);
                g.fillPolygon(new int[] {triangleX1, triangleX2, triangleX3},
                    new int[] {triangleY1, triangleY2, triangleY3}, 3);
                g.setColor(Color.BLACK);
                g.drawPolygon(new int[] {triangleX1, triangleX2, triangleX3},
                    new int[] {triangleY1, triangleY2, triangleY3}, 3);

                //Draw floor
                g.setColor(brown);
                g.fillRect(0, 271, 325, 18);
                g.setColor(Color.BLACK);
                g.drawLine(0, 271, 325, 271);

            }
        };
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        solveOk = new javax.swing.JButton();
        solveClear = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        solveReset = new javax.swing.JButton();
        showAnswer = new javax.swing.JButton();
        answerLabel = new javax.swing.JLabel();
        questionLabel = new org.jdesktop.swingx.JXLabel();

        resetConfirm.setTitle("Warning");
        resetConfirm.setAlwaysOnTop(true);
        resetConfirm.setLocation(new java.awt.Point(477, 350));
        resetConfirm.setModal(true);
        resetConfirm.setResizable(false);

        jLabel10.setText("Are you sure you want to reset your score?");

        resetYes.setText("Yes");
        resetYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetYesActionPerformed(evt);
            }
        });

        resetNo.setText("No");
        resetNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resetConfirmLayout = new javax.swing.GroupLayout(resetConfirm.getContentPane());
        resetConfirm.getContentPane().setLayout(resetConfirmLayout);
        resetConfirmLayout.setHorizontalGroup(
            resetConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetConfirmLayout.createSequentialGroup()
                .addGroup(resetConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resetConfirmLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(resetYes)
                        .addGap(61, 61, 61)
                        .addComponent(resetNo))
                    .addGroup(resetConfirmLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        resetConfirmLayout.setVerticalGroup(
            resetConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetConfirmLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(resetConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetYes)
                    .addComponent(resetNo))
                .addGap(16, 16, 16))
        );

        showAnsConfirm.setTitle("Warning");
        showAnsConfirm.setAlwaysOnTop(true);
        showAnsConfirm.setLocation(new java.awt.Point(477, 350));
        showAnsConfirm.setModal(true);
        showAnsConfirm.setResizable(false);

        jLabel13.setText("Are you sure you want to show the answer?");

        showAnsYes.setText("Yes");
        showAnsYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAnsYesActionPerformed(evt);
            }
        });

        showAnsNo.setText("No");
        showAnsNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAnsNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showAnsConfirmLayout = new javax.swing.GroupLayout(showAnsConfirm.getContentPane());
        showAnsConfirm.getContentPane().setLayout(showAnsConfirmLayout);
        showAnsConfirmLayout.setHorizontalGroup(
            showAnsConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showAnsConfirmLayout.createSequentialGroup()
                .addGroup(showAnsConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showAnsConfirmLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(showAnsYes)
                        .addGap(61, 61, 61)
                        .addComponent(showAnsNo))
                    .addGroup(showAnsConfirmLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel13)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        showAnsConfirmLayout.setVerticalGroup(
            showAnsConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showAnsConfirmLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(showAnsConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAnsYes)
                    .addComponent(showAnsNo))
                .addGap(16, 16, 16))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 170));
        setResizable(false);

        frictionSlider.setMajorTickSpacing(1);
        frictionSlider.setMaximum(4);
        frictionSlider.setPaintLabels(true);
        frictionSlider.setPaintTicks(true);
        frictionSlider.setSnapToTicks(true);
        frictionSlider.setValue(0);
        frictionSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                frictionSliderStateChanged(evt);
            }
        });

        jLabel1.setText("Mass (kg)");

        slopeSlider.setMajorTickSpacing(1);
        slopeSlider.setMaximum(5);
        slopeSlider.setPaintLabels(true);
        slopeSlider.setPaintTicks(true);
        slopeSlider.setSnapToTicks(true);
        slopeSlider.setValue(3);
        slopeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slopeSliderStateChanged(evt);
            }
        });

        jLabel2.setText("Friction");

        jLabel4.setText("Slope (y/x)");

        experimentOk.setText("Ok");
        experimentOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experimentOkActionPerformed(evt);
            }
        });

        jLabel5.setText("Diagram");

        massSlider.setMajorTickSpacing(1);
        massSlider.setMaximum(10);
        massSlider.setPaintLabels(true);
        massSlider.setPaintTicks(true);
        massSlider.setSnapToTicks(true);
        massSlider.setValue(5);
        massSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                massSliderStateChanged(evt);
            }
        });

        experimentImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        experimentImage.setPreferredSize(new java.awt.Dimension(328, 286));

        javax.swing.GroupLayout experimentImageLayout = new javax.swing.GroupLayout(experimentImage);
        experimentImage.setLayout(experimentImageLayout);
        experimentImageLayout.setHorizontalGroup(
            experimentImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        experimentImageLayout.setVerticalGroup(
            experimentImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        experimentReset.setText("Reset");
        experimentReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experimentResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout experimentPanelLayout = new javax.swing.GroupLayout(experimentPanel);
        experimentPanel.setLayout(experimentPanelLayout);
        experimentPanelLayout.setHorizontalGroup(
            experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(experimentPanelLayout.createSequentialGroup()
                        .addComponent(experimentImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(frictionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(massSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(slopeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(experimentPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(experimentOk)
                                .addGap(60, 60, 60)
                                .addComponent(experimentReset)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        experimentPanelLayout.setVerticalGroup(
            experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(experimentPanelLayout.createSequentialGroup()
                        .addComponent(experimentImage, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(experimentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(massSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frictionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, experimentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slopeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, experimentPanelLayout.createSequentialGroup()
                                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(experimentOk)
                                    .addComponent(experimentReset))
                                .addContainerGap())))))
        );

        modeTab.addTab("Experiment", experimentPanel);

        solveImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        solveImage.setPreferredSize(new java.awt.Dimension(228, 200));

        javax.swing.GroupLayout solveImageLayout = new javax.swing.GroupLayout(solveImage);
        solveImage.setLayout(solveImageLayout);
        solveImageLayout.setHorizontalGroup(
            solveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        solveImageLayout.setVerticalGroup(
            solveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        jLabel6.setText("Diagram");

        jLabel7.setText("Question:");

        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Answer:");

        solveOk.setText("Ok");
        solveOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveOkActionPerformed(evt);
            }
        });

        solveClear.setText("Clear");
        solveClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveClearActionPerformed(evt);
            }
        });

        score.setText("Score: 0/0");

        solveReset.setText("Reset Score");
        solveReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveResetActionPerformed(evt);
            }
        });

        showAnswer.setText("Show Answer");
        showAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAnswerActionPerformed(evt);
            }
        });

        answerLabel.setText("        ");

        try {
            Scanner input = new Scanner(new File("questions.txt"));
            input.useDelimiter("#");

            questionNo = (int)(Math.random() * 10 + 1);

            for(int x = 0; x < questionNo && input.hasNext() == true; x++) {
                question = input.next();
            }
            questionLabel.setLineWrap(true);
            questionLabel.setMaxLineSpan(268);
            questionLabel.setText(question);
        }
        catch (FileNotFoundException e) {
            System.err.format("File not found.");
        }

        javax.swing.GroupLayout solvePanelLayout = new javax.swing.GroupLayout(solvePanel);
        solvePanel.setLayout(solvePanelLayout);
        solvePanelLayout.setHorizontalGroup(
            solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solvePanelLayout.createSequentialGroup()
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, solvePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(solveImage, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(solvePanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(16, 16, 16)
                                .addComponent(answerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(solvePanelLayout.createSequentialGroup()
                                    .addComponent(solveOk, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(solveClear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(showAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, Short.MAX_VALUE))
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(solveReset)
                        .addContainerGap())))
        );
        solvePanelLayout.setVerticalGroup(
            solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solvePanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(answerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solveOk)
                            .addComponent(solveClear)
                            .addComponent(showAnswer))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solvePanelLayout.createSequentialGroup()
                        .addComponent(solveImage, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score)
                    .addComponent(solveReset))
                .addGap(5, 5, 5))
        );

        modeTab.addTab("Solve", solvePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modeTab))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modeTab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void experimentOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experimentOkActionPerformed

	slope = slopeSlider.getValue();
	friction = frictionSlider.getValue();
	mass = massSlider.getValue();
	
	experimentImage.inputValues(slope, friction, mass);
	
	experimentImage.slide();
	
    }//GEN-LAST:event_experimentOkActionPerformed

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed

    }//GEN-LAST:event_answerFieldActionPerformed

    private void solveOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveOkActionPerformed

	if(answerField.getText().equals(answer) && answerShown == false) {
	    answerField.setText("");
	    answerLabel.setText("");
	    
	    scoreCounter++;
	    newQuestion();
	    questionLabel.setText(question);
	}
	else if(answerField.getText().equals(answer)) {
	    answerField.setText("");
	    answerLabel.setText("");
	    
	    newQuestion();
	    questionLabel.setText(question);
	    answerShown = false;
	}
	totalScore++;
	
	score.setText("Score: " + scoreCounter + "/" + totalScore);
    }//GEN-LAST:event_solveOkActionPerformed

    private void solveClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveClearActionPerformed

	answerField.setText("");
	
    }//GEN-LAST:event_solveClearActionPerformed

    private void showAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAnswerActionPerformed

	showAnsConfirm.setSize(new Dimension(325,125));
	showAnsConfirm.setVisible(true);
	
	answerShown = true;
    }//GEN-LAST:event_showAnswerActionPerformed

    private void solveResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveResetActionPerformed

	resetConfirm.setSize(new Dimension(325,125));
	resetConfirm.setVisible(true);
	
    }//GEN-LAST:event_solveResetActionPerformed
 
    private void resetYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetYesActionPerformed

	resetConfirm.setVisible(false);
	
	scoreCounter = 0;
	totalScore = 0;
	
	newQuestion();
	questionLabel.setText(question);
	
	score.setText("Score: " + scoreCounter + "/" + totalScore);
    }//GEN-LAST:event_resetYesActionPerformed

    private void resetNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetNoActionPerformed

	resetConfirm.setVisible(false);
    }//GEN-LAST:event_resetNoActionPerformed

    private void showAnsYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAnsYesActionPerformed

	showAnsConfirm.setVisible(false);

	answerLabel.setText(answer);
    }//GEN-LAST:event_showAnsYesActionPerformed

    private void showAnsNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAnsNoActionPerformed

	showAnsConfirm.setVisible(false);
	
    }//GEN-LAST:event_showAnsNoActionPerformed

    private void experimentResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experimentResetActionPerformed
        
	massSlider.setValue(5);
	frictionSlider.setValue(0);
	slopeSlider.setValue(3);
	
	experimentImage.resetAll();
    }//GEN-LAST:event_experimentResetActionPerformed

    private void slopeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slopeSliderStateChanged
        
	slope = slopeSlider.getValue();
	friction = frictionSlider.getValue();
	
	experimentImage.inputValues(slope, friction, mass);
		
	if(slope == 0) {
	    experimentImage.adjustTriangle0();
	}
	else if(slope == 1) {
	    experimentImage.adjustTriangleHalf();
	}
	else if(slope == 2) {
	    experimentImage.adjustTriangle2over3();
	}
	else if(slope == 3) {
	    experimentImage.adjustTriangle1();
	}
	else if(slope == 4) {
	    experimentImage.adjustTriangle3over2();
	}
	else if(slope == 5) {
	    experimentImage.adjustTriangle2();
	}
    }//GEN-LAST:event_slopeSliderStateChanged

    private void frictionSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_frictionSliderStateChanged
	
	slope = slopeSlider.getValue();
	friction = frictionSlider.getValue();
	
	experimentImage.inputValues(slope, friction, mass);
		
	if(slope == 0) {
	    experimentImage.adjustTriangle0();
	}
	else if(slope == 1) {
	    experimentImage.adjustTriangleHalf();
	}
	else if(slope == 2) {
	    experimentImage.adjustTriangle2over3();
	}
	else if(slope == 3) {
	    experimentImage.adjustTriangle1();
	}
	else if(slope == 4) {
	    experimentImage.adjustTriangle3over2();
	}
	else if(slope == 5) {
	    experimentImage.adjustTriangle2();
	}
	
    }//GEN-LAST:event_frictionSliderStateChanged

    private void massSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_massSliderStateChanged
        
	slope = slopeSlider.getValue();
	friction = frictionSlider.getValue();
	
	experimentImage.inputValues(slope, friction, mass);
		
	if(slope == 0) {
	    experimentImage.adjustTriangle0();
	}
	else if(slope == 1) {
	    experimentImage.adjustTriangleHalf();
	}
	else if(slope == 2) {
	    experimentImage.adjustTriangle2over3();
	}
	else if(slope == 3) {
	    experimentImage.adjustTriangle1();
	}
	else if(slope == 4) {
	    experimentImage.adjustTriangle3over2();
	}
	else if(slope == 5) {
	    experimentImage.adjustTriangle2();
	}
    }//GEN-LAST:event_massSliderStateChanged
    
    public void newQuestion() {
	try {
	    Scanner input = new Scanner(new File("questions.txt"));
	    input.useDelimiter("#");
    
	    questionNo = (int)(Math.random() * 10 + 1);
    
	    for(int x = 0; x < questionNo && input.hasNext() == true; x++) {
		question = input.next();
	    }
	}
	catch (FileNotFoundException e) {
	    System.err.format("File not found.");
	}
	
	try {
	    Scanner input = new Scanner(new File("answers.txt"));	    
	    
	    input.useDelimiter("#");
        
	    for(int x = 0; x < questionNo && input.hasNext() == true; x++) {
		answer = input.next();
	    }
	}
	catch (FileNotFoundException e) {
	    System.err.format("File not found.");
	}
	
    }
    
    public double getSlope() {
	return slope;
    }
    
    public void setSlopeSliderLabels() {
	
	Hashtable slopeLabels = new Hashtable();
	
	slopeLabels.put(0, new JLabel("0"));
	slopeLabels.put(1, new JLabel("0.5"));
	slopeLabels.put(2, new JLabel("0.67"));
	slopeLabels.put(3, new JLabel("1"));
	slopeLabels.put(4, new JLabel("1.5"));
	slopeLabels.put(5, new JLabel("2"));
	
	slopeSlider.setLabelTable(slopeLabels);
    }
    
    public void setFrictionSliderLabels() {
	
	Hashtable frictionLabels = new Hashtable();
	
	frictionLabels.put(0, new JLabel("0"));
	frictionLabels.put(1, new JLabel("0.25"));
	frictionLabels.put(2, new JLabel("0.5"));
	frictionLabels.put(3, new JLabel("0.75"));
	frictionLabels.put(4, new JLabel("1"));

	frictionSlider.setLabelTable(frictionLabels);
    }
    
    public void setMassSliderLabels() {
	
	Hashtable massLabels = new Hashtable();
	
	massLabels.put(0, new JLabel("0"));
	massLabels.put(1, new JLabel("1"));
	massLabels.put(2, new JLabel("2"));
	massLabels.put(3, new JLabel("3"));
	massLabels.put(4, new JLabel("4"));
	massLabels.put(5, new JLabel("5"));
	massLabels.put(6, new JLabel("6"));
	massLabels.put(7, new JLabel("7"));
	massLabels.put(8, new JLabel("8"));
	massLabels.put(9, new JLabel("9"));
	massLabels.put(10, new JLabel("10"));

	massSlider.setLabelTable(massLabels);
    }
    
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	/* Set the System look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If System is not available, stay with the default look and feel.
	 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("System".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(PhysicsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(PhysicsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(PhysicsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(PhysicsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
        //</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new PhysicsGUI().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel answerLabel;
    private physicsapp.AnimatedJPanel experimentImage;
    private javax.swing.JButton experimentOk;
    private javax.swing.JPanel experimentPanel;
    private javax.swing.JButton experimentReset;
    private javax.swing.JSlider frictionSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSlider massSlider;
    private javax.swing.JTabbedPane modeTab;
    private org.jdesktop.swingx.JXLabel questionLabel;
    private javax.swing.JDialog resetConfirm;
    private javax.swing.JButton resetNo;
    private javax.swing.JButton resetYes;
    private javax.swing.JLabel score;
    private javax.swing.JDialog showAnsConfirm;
    private javax.swing.JButton showAnsNo;
    private javax.swing.JButton showAnsYes;
    private javax.swing.JButton showAnswer;
    private javax.swing.JSlider slopeSlider;
    private javax.swing.JButton solveClear;
    private javax.swing.JPanel solveImage;
    private javax.swing.JButton solveOk;
    private javax.swing.JPanel solvePanel;
    private javax.swing.JButton solveReset;
    // End of variables declaration//GEN-END:variables
}