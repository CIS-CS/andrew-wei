package physicsapp;

import java.awt.Dimension;

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
    
    
    /**
     * Creates new form PhysicsGUI
     */
    public PhysicsGUI() {
	initComponents();
	
	//JFrame.setName("Physics App");
	resetConfirm.setName("Warning");

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
        modeTab = new javax.swing.JTabbedPane();
        experimentPanel = new javax.swing.JPanel();
        experimentImage = new javax.swing.JPanel();
        frictionSlider = new javax.swing.JSlider();
        velocitySlider = new javax.swing.JSlider();
        slopeSlider = new javax.swing.JSlider();
        massSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        experimentOk = new javax.swing.JButton();
        experimentReset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        massField = new javax.swing.JTextField();
        frictionField = new javax.swing.JTextField();
        velocityField = new javax.swing.JTextField();
        slopeField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        variableSelector = new javax.swing.JComboBox();
        solvePanel = new javax.swing.JPanel();
        solveImage = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        solveOk = new javax.swing.JButton();
        solveClear = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        solveReset = new javax.swing.JButton();
        showAnswer = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        experimentImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout experimentImageLayout = new javax.swing.GroupLayout(experimentImage);
        experimentImage.setLayout(experimentImageLayout);
        experimentImageLayout.setHorizontalGroup(
            experimentImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );
        experimentImageLayout.setVerticalGroup(
            experimentImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

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

        massField.setText("5.541");
        massField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massFieldActionPerformed(evt);
            }
        });

        frictionField.setText("0.4");
        frictionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frictionFieldActionPerformed(evt);
            }
        });

        velocityField.setText("1.55");
        velocityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velocityFieldActionPerformed(evt);
            }
        });

        slopeField.setText("3.2");
        slopeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slopeFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("Select a variable:");

        variableSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mass", "Friction", "Velocity", "Slope" }));
        variableSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variableSelectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout experimentPanelLayout = new javax.swing.GroupLayout(experimentPanel);
        experimentPanel.setLayout(experimentPanelLayout);
        experimentPanelLayout.setHorizontalGroup(
            experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(experimentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(variableSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(experimentOk)
                        .addGap(18, 18, 18)
                        .addComponent(experimentReset)
                        .addGap(64, 64, 64))
                    .addGroup(experimentPanelLayout.createSequentialGroup()
                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(experimentImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(experimentPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(experimentPanelLayout.createSequentialGroup()
                                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(experimentPanelLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, experimentPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(frictionSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(massSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(velocitySlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slopeSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(frictionField)
                                    .addComponent(velocityField)
                                    .addComponent(massField)
                                    .addComponent(slopeField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))))
        );
        experimentPanelLayout.setVerticalGroup(
            experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(experimentPanelLayout.createSequentialGroup()
                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(massField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(massSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(frictionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frictionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(velocitySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velocityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slopeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slopeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(experimentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(experimentImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(experimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experimentOk)
                    .addComponent(experimentReset)
                    .addComponent(jLabel12)
                    .addComponent(variableSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        modeTab.addTab("Experiment", experimentPanel);

        solveImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout solveImageLayout = new javax.swing.GroupLayout(solveImage);
        solveImage.setLayout(solveImageLayout);
        solveImageLayout.setHorizontalGroup(
            solveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );
        solveImageLayout.setVerticalGroup(
            solveImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
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

        score.setText("Score: 4/12");

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

        jLabel11.setText("(Will be written in multiple lines)");

        javax.swing.GroupLayout solvePanelLayout = new javax.swing.GroupLayout(solvePanel);
        solvePanel.setLayout(solvePanelLayout);
        solvePanelLayout.setHorizontalGroup(
            solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solvePanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addComponent(score)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(solveReset)
                        .addContainerGap())
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(solveImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(solvePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(solvePanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(solveOk, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(solveClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))))
        );
        solvePanelLayout.setVerticalGroup(
            solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solvePanelLayout.createSequentialGroup()
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solveReset)
                            .addComponent(score)))
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(solveImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(solvePanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(solveOk)
                                    .addComponent(solveClear)
                                    .addComponent(showAnswer))))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );

        modeTab.addTab("Solve", solvePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modeTab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modeTab, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void experimentOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experimentOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experimentOkActionPerformed

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldActionPerformed

    private void solveOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solveOkActionPerformed

    private void massFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_massFieldActionPerformed

    private void velocityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velocityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_velocityFieldActionPerformed

    private void solveClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveClearActionPerformed
        // TODO add your handling code here:
	answerField.setText("");
    }//GEN-LAST:event_solveClearActionPerformed

    private void showAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAnswerActionPerformed
        // TODO add your handling code here:
	resetConfirm.setSize(new Dimension(325,125));
	resetConfirm.setVisible(true);
    }//GEN-LAST:event_showAnswerActionPerformed

    private void solveResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveResetActionPerformed
        // TODO add your handling code here:
	scoreCounter = 0;
	totalScore = 0;
	
	score.setText("Score: " + scoreCounter + "/" + totalScore);
    }//GEN-LAST:event_solveResetActionPerformed

    private void experimentResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experimentResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experimentResetActionPerformed

    private void variableSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variableSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_variableSelectorActionPerformed

    private void frictionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frictionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frictionFieldActionPerformed

    private void slopeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slopeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slopeFieldActionPerformed

    private void resetYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetYesActionPerformed

    private void resetNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetNoActionPerformed

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
    private javax.swing.JPanel experimentImage;
    private javax.swing.JButton experimentOk;
    private javax.swing.JPanel experimentPanel;
    private javax.swing.JButton experimentReset;
    private javax.swing.JTextField frictionField;
    private javax.swing.JSlider frictionSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField massField;
    private javax.swing.JSlider massSlider;
    private javax.swing.JTabbedPane modeTab;
    private javax.swing.JDialog resetConfirm;
    private javax.swing.JButton resetNo;
    private javax.swing.JButton resetYes;
    private javax.swing.JLabel score;
    private javax.swing.JButton showAnswer;
    private javax.swing.JTextField slopeField;
    private javax.swing.JSlider slopeSlider;
    private javax.swing.JButton solveClear;
    private javax.swing.JPanel solveImage;
    private javax.swing.JButton solveOk;
    private javax.swing.JPanel solvePanel;
    private javax.swing.JButton solveReset;
    private javax.swing.JComboBox variableSelector;
    private javax.swing.JTextField velocityField;
    private javax.swing.JSlider velocitySlider;
    // End of variables declaration//GEN-END:variables
}