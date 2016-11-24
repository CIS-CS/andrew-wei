
package physicsapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import physicsapp.Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Andrew
 */
public class PhysicsGUI extends javax.swing.JFrame {
    
    //Solve fields
    private String question = "";
    private String response = "";
    private String answer = "";
    private int scoreCounter = 0;
    private int totalScore = 0;
    
    //Experiment fields
    private double mass = 0.0;
    private double friction = 0.0;
    private double slope = 0.0;
    private double velocity = 0.0;
    private String selectedItem = "";
    AnimatedJPanel experimentImage = new AnimatedJPanel();
    private Graphics g = experimentImage.getGraphics();
    
    
    /**
     * Creates new form PhysicsGUI
     */
    public PhysicsGUI() {
	initComponents();
	
	setTitle("Physics Learning App");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	experimentImage.setSize(328,286);
	experimentImage.setLocation(15, 62);
	experimentImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	experimentPanel.add(experimentImage);
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
        velocitySlider = new javax.swing.JSlider();
        slopeSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        experimentOk = new javax.swing.JButton();
        experimentReset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        experimentVariableSelector = new javax.swing.JComboBox();
        massSlider = new javax.swing.JSlider();
        solvePanel = new javax.swing.JPanel();
        solveImage = new javax.swing.JPanel(){

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D)g;

                //g2d.rotate(Math.toRadians(-45));
                Color blue = new Color(2003199);
                Color green = new Color(3329330);

                g.setColor(blue);
                g.fillRect(171, 131, 40, 40);
                g.setColor(Color.BLACK);
                g.drawRect(171, 131, 40, 40);

                //g2d.rotate(Math.toRadians(45));
                g.setColor(green);
                g.fillPolygon(new int[] {111, 211, 211}, new int[] {271, 271, 171}, 3);
                g.setColor(Color.BLACK);
                g.drawPolygon(new int[] {111, 211, 211}, new int[] {271, 271, 171}, 3);
            }
        };
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        solveAnswerField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        solveOk = new javax.swing.JButton();
        solveClear = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        solveReset = new javax.swing.JButton();
        showAnswer = new javax.swing.JButton();
        ansLabel = new javax.swing.JLabel();
        questionLabel = new org.jdesktop.swingx.JXLabel();

        resetConfirm.setLocation(new java.awt.Point(477, 350));
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

        showAnsConfirm.setLocation(new java.awt.Point(477, 350));
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
        frictionSlider.setMaximum(2);
        frictionSlider.setPaintLabels(true);
        frictionSlider.setPaintTicks(true);
        frictionSlider.setValue(0);

        velocitySlider.setMajorTickSpacing(1);
        velocitySlider.setMaximum(10);
        velocitySlider.setPaintLabels(true);
        velocitySlider.setPaintTicks(true);
        velocitySlider.setValue(5);

        slopeSlider.setMajorTickSpacing(1);
        slopeSlider.setMaximum(5);
        slopeSlider.setPaintLabels(true);
        slopeSlider.setPaintTicks(true);
        slopeSlider.setValue(1);

        jLabel1.setText("Mass (kg)");

        jLabel2.setText("Friction");

        jLabel3.setText("Velocity (m/s)");

        jLabel4.setText("Slope (y/x)");

        experimentOk.setText("Ok");
        experimentOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experimentOkActionPerformed(evt);
            }
        });

        experimentReset.setText("Reset");
        experimentReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experimentResetActionPerformed(evt);
            }
        });

        jLabel5.setText("Diagram");

        jLabel12.setText("Select a variable to vary:");

        experimentVariableSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mass", "Friction", "Velocity", "Slope" }));
        experimentVariableSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experimentVariableSelectorActionPerformed(evt);
            }
        });

        massSlider.setMajorTickSpacing(1);
        massSlider.setMaximum(10);
        massSlider.setPaintLabels(true);
        massSlider.setPaintTicks(true);
        massSlider.setValue(5);

        javax.swing.GroupLayout experimentPanelLayout = new javax.swing.GroupLayout(experimentPanel);
        experimentPanel.setLayout(experimentPanelLayout);
        experimentPanelLayout.setHorizontalGroup(
            experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(experimentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(experimentVariableSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(experimentOk)
                        .addGap(18, 18, 18)
                        .addComponent(experimentReset)
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addGroup(experimentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(massSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(frictionSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(velocitySlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(slopeSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addContainerGap())))
        );
        experimentPanelLayout.setVerticalGroup(
            experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(massSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frictionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(velocitySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slopeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 34, Short.MAX_VALUE)
                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(experimentVariableSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experimentOk)
                    .addComponent(experimentReset))
                .addGap(8, 8, 8))
        );

        modeTab.addTab("Experiment", experimentPanel);

        solveImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        solveImage.setPreferredSize(new java.awt.Dimension(230, 200));

        javax.swing.GroupLayout solveImageLayout = new javax.swing.GroupLayout(solveImage);
        solveImage.setLayout(solveImageLayout);
        solveImageLayout.setHorizontalGroup(
            solveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        solveImageLayout.setVerticalGroup(
            solveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jLabel6.setText("Diagram");

        jLabel7.setText("Question:");

        solveAnswerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveAnswerFieldActionPerformed(evt);
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

        ansLabel.setText("        ");

        try {
            Scanner input = new Scanner(new File("questions_answers.txt"));

            String question = input.nextLine();
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
                .addGap(39, 39, 39)
                .addComponent(score)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(solveReset)
                .addContainerGap())
            .addGroup(solvePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addComponent(solveImage, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solvePanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(241, 241, 241))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solvePanelLayout.createSequentialGroup()
                                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(solveAnswerField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, solvePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ansLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, solvePanelLayout.createSequentialGroup()
                                        .addComponent(solveOk, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(solveClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(showAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(questionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34))))))
        );
        solvePanelLayout.setVerticalGroup(
            solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solvePanelLayout.createSequentialGroup()
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solveImage, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ansLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solveAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solveOk)
                            .addComponent(solveClear)
                            .addComponent(showAnswer))
                        .addGap(52, 52, 52)))
                .addGap(18, 18, 18)
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
        // TODO add your handling code here:
	Calculator cal = new Calculator(massSlider.getValue(), frictionSlider.getValue(), 
					slopeSlider.getValue(), velocitySlider.getValue(), 
					selectedItem);
	
	switch (cal.getUnknown()) {
	    case "Mass":
		cal.calcNewMass(mass);
		break;
	    case "Friction":
		cal.calcNewFriction(friction);
		break;
	    case "Velocity":
		cal.calcNewVelocity(velocity);
		break;
	    case "Slope":
		cal.calcNewSlope(slope);
		break;
	}
	
    }//GEN-LAST:event_experimentOkActionPerformed

    private void solveAnswerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveAnswerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solveAnswerFieldActionPerformed

    private void solveOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveOkActionPerformed
        // TODO add your handling code here:
	ansLabel.setText("");
    }//GEN-LAST:event_solveOkActionPerformed

    private void solveClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveClearActionPerformed
        // TODO add your handling code here:
	solveAnswerField.setText("");
	
    }//GEN-LAST:event_solveClearActionPerformed

    private void showAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAnswerActionPerformed
        // TODO add your handling code here:
	showAnsConfirm.setSize(new Dimension(325,125));
	showAnsConfirm.setVisible(true);
    }//GEN-LAST:event_showAnswerActionPerformed

    private void solveResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveResetActionPerformed
        // TODO add your handling code here:
	resetConfirm.setSize(new Dimension(325,125));
	resetConfirm.setVisible(true);
	
    }//GEN-LAST:event_solveResetActionPerformed

    private void experimentResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experimentResetActionPerformed
        // TODO add your handling code here:
	massSlider.setValue(5);
	frictionSlider.setValue(0);
	velocitySlider.setValue(5);
	slopeSlider.setValue(1);
	
	experimentImage.clear();
    }//GEN-LAST:event_experimentResetActionPerformed

    private void experimentVariableSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experimentVariableSelectorActionPerformed
        // TODO add your handling code here:
	selectedItem = experimentVariableSelector.getSelectedItem().toString();
    }//GEN-LAST:event_experimentVariableSelectorActionPerformed

    private void resetYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetYesActionPerformed
        // TODO add your handling code here:
	resetConfirm.setVisible(false);
	    
	scoreCounter = 0;
	totalScore = 0;
	
	score.setText("Score: " + scoreCounter + "/" + totalScore);
    }//GEN-LAST:event_resetYesActionPerformed

    private void resetNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetNoActionPerformed
        // TODO add your handling code here:
	resetConfirm.setVisible(false);
    }//GEN-LAST:event_resetNoActionPerformed

    private void showAnsYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAnsYesActionPerformed
        // TODO add your handling code here:
	showAnsConfirm.setVisible(false);
	
	try {
	    Scanner input = new Scanner(new File("questions_answers.txt"));
			
	    String answer = input.nextLine();
	    ansLabel.setText(answer);

	}
	catch (FileNotFoundException e) {
	    System.err.format("File not found.");
	}
	
    }//GEN-LAST:event_showAnsYesActionPerformed

    private void showAnsNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAnsNoActionPerformed
        // TODO add your handling code here:
	showAnsConfirm.setVisible(false);

    }//GEN-LAST:event_showAnsNoActionPerformed

    
    
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
    private javax.swing.JLabel ansLabel;
    private javax.swing.JButton experimentOk;
    private javax.swing.JPanel experimentPanel;
    private javax.swing.JButton experimentReset;
    private javax.swing.JComboBox experimentVariableSelector;
    private javax.swing.JSlider frictionSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField solveAnswerField;
    private javax.swing.JButton solveClear;
    private javax.swing.JPanel solveImage;
    private javax.swing.JButton solveOk;
    private javax.swing.JPanel solvePanel;
    private javax.swing.JButton solveReset;
    private javax.swing.JSlider velocitySlider;
    // End of variables declaration//GEN-END:variables
}
