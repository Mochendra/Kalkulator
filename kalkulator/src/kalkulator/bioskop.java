/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author ACER
 */
public class bioskop extends javax.swing.JFrame {

    /**
     * Creates new form menumakanan
     */
    public bioskop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spiderman = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtjumlah1 = new javax.swing.JTextField();
        superman = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtjumlah2 = new javax.swing.JTextField();
        batman = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtjumlah3 = new javax.swing.JTextField();
        wonderwoman = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtjumlah4 = new javax.swing.JTextField();
        hobbit = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtjumlah5 = new javax.swing.JTextField();
        jurassicpark = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtjumlah6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        popcorn = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        txtjumlah7 = new javax.swing.JTextField();
        fanta = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        txtjumlah8 = new javax.swing.JTextField();
        cocacola = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        txtjumlah9 = new javax.swing.JTextField();
        pepsi = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        txtjumlah10 = new javax.swing.JTextField();
        pesan = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txatotal = new javax.swing.JTextArea();
        txtbangku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROGRAM BIOSKOP");

        jLabel1.setText("DAFTAR FILM");

        jLabel2.setText("Jumlah");

        jLabel3.setText("Harga");

        jLabel5.setText("TOTAL");

        spiderman.setText("Spiderman");
        spiderman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spidermanActionPerformed(evt);
            }
        });

        jLabel6.setText("Rp. 33.000");

        txtjumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah1ActionPerformed(evt);
            }
        });

        superman.setText("Superman");

        jLabel7.setText("Rp. 35.000");

        txtjumlah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah2ActionPerformed(evt);
            }
        });

        batman.setText("Batman");
        batman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batmanActionPerformed(evt);
            }
        });

        jLabel8.setText("Rp. 31.000");

        txtjumlah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah3ActionPerformed(evt);
            }
        });

        wonderwoman.setText("Wonder Woman");
        wonderwoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wonderwomanActionPerformed(evt);
            }
        });

        jLabel9.setText("Rp. 25.000");

        txtjumlah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah4ActionPerformed(evt);
            }
        });

        hobbit.setText("Hobbit");

        jLabel10.setText("Rp. 30.000");

        txtjumlah5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah5ActionPerformed(evt);
            }
        });

        jurassicpark.setText("Jurrasic Park");

        jLabel11.setText("Rp. 32.000");

        txtjumlah6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah6ActionPerformed(evt);
            }
        });

        jLabel12.setText("Menu Snack");

        jLabel13.setText("Harga");

        jLabel14.setText("Jumlah");

        popcorn.setText("Pop Corn");

        jLabel15.setText("Rp. 14.000");

        fanta.setText("Fanta");

        jLabel16.setText("Rp. 4.000");

        cocacola.setText("Coca-Cola");
        cocacola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocacolaActionPerformed(evt);
            }
        });

        jLabel17.setText("Rp. 6.000");

        pepsi.setText("Pepsi");

        jLabel18.setText("Rp. 5.000");

        pesan.setText("Pesan");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        txatotal.setColumns(20);
        txatotal.setRows(5);
        jScrollPane1.setViewportView(txatotal);

        txtbangku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbangkuActionPerformed(evt);
            }
        });

        jLabel4.setText("NOMOR KURSI :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(superman)
                                    .addComponent(spiderman)
                                    .addComponent(batman)
                                    .addComponent(wonderwoman)
                                    .addComponent(hobbit)
                                    .addComponent(jurassicpark)
                                    .addComponent(popcorn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtjumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtjumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtjumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtjumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel14)
                                                .addComponent(txtjumlah6, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                                .addComponent(txtjumlah7)
                                                .addComponent(txtjumlah8)
                                                .addComponent(txtjumlah9))
                                            .addComponent(txtjumlah10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtjumlah5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtbangku, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesan)
                                .addGap(38, 38, 38)
                                .addComponent(reset))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiderman)
                            .addComponent(jLabel6)
                            .addComponent(txtjumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(superman)
                            .addComponent(jLabel7)
                            .addComponent(txtjumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batman)
                            .addComponent(jLabel8)
                            .addComponent(txtjumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wonderwoman)
                            .addComponent(jLabel9)
                            .addComponent(txtjumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hobbit)
                            .addComponent(jLabel10)
                            .addComponent(txtjumlah5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jurassicpark)
                            .addComponent(jLabel11)
                            .addComponent(txtjumlah6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumlah7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(popcorn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumlah8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(fanta))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumlah9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(cocacola)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjumlah10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(pepsi)
                    .addComponent(pesan)
                    .addComponent(reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtbangku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtjumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah1ActionPerformed

    private void txtjumlah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah2ActionPerformed

    private void txtjumlah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah3ActionPerformed

    private void txtjumlah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah4ActionPerformed

    private void txtjumlah5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah5ActionPerformed

    private void txtjumlah6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah6ActionPerformed

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
        // TODO add your handling code here:
        String tampil;
        tampil = "";
        double bayar = 0;
        if(spiderman.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah1.getText());
            int total;
            total=jumlah*33000;
            bayar=bayar+total;
            tampil +=spiderman.getText()+" Rp.33.000 "+" x "+jumlah+" = Rp."+total+"\n";
        }if(superman.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah2.getText());
            int total;
            total=jumlah*35000;
            bayar=bayar+total;
            tampil +=superman.getText()+" Rp.35.000 "+" x "+jumlah+" = Rp."+total+"\n";
        }if(batman.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah3.getText());
            int total;
            total=jumlah*31000;
            bayar=bayar+total;
            tampil +=batman.getText()+" Rp.31.000 "+" x "+jumlah+" = Rp."+total+"\n";
        }if(wonderwoman.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah4.getText());
            int total;
            total=jumlah*25000;
            bayar=bayar+total;
            tampil +=wonderwoman.getText()+" Rp.25.000 "+" x "+jumlah+" = Rp."+total+"\n";
        }if(hobbit.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah5.getText());
            int total;
            total=jumlah*30000;
            bayar=bayar+total;
            tampil +=hobbit.getText()+" Rp.30.000 "+" x "+jumlah+" = Rp."+total+"\n";
        }if(jurassicpark.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah6.getText());
            int total;
            total=jumlah*32000;
            bayar=bayar+total;
            tampil +=jurassicpark.getText()+" Rp.32.000 "+" x "+jumlah+" = Rp."+total+"\n";
        }if(popcorn.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah7.getText());
            int total;
            total=jumlah*14000;
            bayar=bayar+total;
            tampil +=popcorn.getText()+" Rp.14.000 "+" x "+jumlah+" = Rp."+total+"\n";
        }if(fanta.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah8.getText());
            int total;
            total=jumlah*4000;
            bayar=bayar+total;
            tampil +=fanta.getText()+" Rp.4.000 "+" x "+jumlah+" = Rp."+total+"\n";
        }if(cocacola.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah9.getText());
            int total;
            total=jumlah*6000;
            bayar=bayar+total;
            tampil +=cocacola.getText()+" Rp.6.000 "+" x "+jumlah+" = Rp."+total+"\n";
        }if(pepsi.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah10.getText());
            int total;
            total=jumlah*5000;
            bayar=bayar+total;
            tampil +=pepsi.getText()+" Rp.5.000 "+" x "+jumlah+" = Rp,"+total+"\n";
        }
        int bangku=Integer.parseInt(txtbangku.getText());
        double tax = bayar*0.1;
        double grandtotal = bayar+tax;
        txatotal.setText(tampil+ "No. Bangku " + bangku + "\n" +"=============================="+"\n"+" bayar = Rp."+bayar+"\n "   +"\n"+"=============================="+"\n" + "TAX 10% = Rp."
        +tax +"\n" + "==============================" + "\n" + " Total Bayar = Rp. " + grandtotal );
        
    }//GEN-LAST:event_pesanActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtjumlah1.setText(" ");
         txtjumlah2.setText(" ");
          txtjumlah3.setText(" ");
           txtjumlah4.setText(" ");
            txtjumlah5.setText(" ");
             txtjumlah6.setText(" ");
              txtjumlah7.setText(" ");
               txtjumlah8.setText(" ");
                txtjumlah9.setText(" ");
                 txtjumlah10.setText(" ");
                  txatotal.setText(" ");
                   txtbangku.setText(" ");
    }//GEN-LAST:event_resetActionPerformed

    private void batmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batmanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batmanActionPerformed

    private void wonderwomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wonderwomanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wonderwomanActionPerformed

    private void cocacolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocacolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cocacolaActionPerformed

    private void spidermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spidermanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spidermanActionPerformed

    private void txtbangkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbangkuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbangkuActionPerformed

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
            java.util.logging.Logger.getLogger(bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bioskop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox batman;
    private javax.swing.JCheckBox cocacola;
    private javax.swing.JCheckBox fanta;
    private javax.swing.JCheckBox hobbit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jurassicpark;
    private javax.swing.JCheckBox pepsi;
    private javax.swing.JButton pesan;
    private javax.swing.JCheckBox popcorn;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox spiderman;
    private javax.swing.JCheckBox superman;
    private javax.swing.JTextArea txatotal;
    private javax.swing.JTextField txtbangku;
    private javax.swing.JTextField txtjumlah1;
    private javax.swing.JTextField txtjumlah10;
    private javax.swing.JTextField txtjumlah2;
    private javax.swing.JTextField txtjumlah3;
    private javax.swing.JTextField txtjumlah4;
    private javax.swing.JTextField txtjumlah5;
    private javax.swing.JTextField txtjumlah6;
    private javax.swing.JTextField txtjumlah7;
    private javax.swing.JTextField txtjumlah8;
    private javax.swing.JTextField txtjumlah9;
    private javax.swing.JCheckBox wonderwoman;
    // End of variables declaration//GEN-END:variables
}
