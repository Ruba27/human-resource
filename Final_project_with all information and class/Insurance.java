/*
 Ruba Esawi && Sana Ghanem
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Insurance extends HumanResource {

    /**
     * Creates new form insurance
     */
    public Insurance() {
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

        employeeid = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        idemployee = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        id1 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        update1 = new javax.swing.JLabel();
        update2 = new javax.swing.JTextField();
        update3 = new javax.swing.JLabel();
        update4 = new javax.swing.JTextField();
        select = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        selection = new javax.swing.JLabel();
        condition1 = new javax.swing.JLabel();
        select1 = new javax.swing.JTextField();
        condition = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(828, 770));

        employeeid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        employeeid.setText("Employee-Id");

        name1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name1.setText("Insurance-Name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        idemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idemployeeActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        id1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id1.setText("Id");

        insert.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        insert.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Capture.PNG")); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\d.PNG")); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\up.PNG")); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        update1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update1.setText("Colum need Update");

        update3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update3.setText("New Value Update");

        select.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        select.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\se.PNG")); // NOI18N
        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        selection.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selection.setText("Select what?");

        condition1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        condition1.setText("Condition Select");

        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(update3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(employeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(idemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(update4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(delete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(update)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(select)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(condition1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(condition1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void idemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idemployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idemployeeActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed
// these buutonn to inert new value to table employee
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        insertInsurance();  // TODO add your handling code here:
    }//GEN-LAST:event_insertActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        deleteInsurance();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        updateInsurance();
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed

        selectInsurance();
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActionPerformed

    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select1ActionPerformed

    public void insertInsurance() {
        Statement stmt;// define statment to make connect to sql

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";
            // to connect to my sql
            //database schema name: human-resource
            Connection con = DriverManager.getConnection(url, "root", "16121990");
            // put user name and password
            //username : root
            //password : 16121990

            stmt = con.createStatement();// start connection

            String insuranceName, employeesID;

            employeesID = this.idemployee.getText();
            insuranceName = this.name.getText();

            stmt.executeUpdate("INSERT INTO insurance (Iname,Eid)" + " VALUES ('" + insuranceName + "','" + employeesID + "')");
            // the obove stamteent to insert to table at my sql
            con.close();
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }

    public void deleteInsurance() {
        Statement stmt;// define statment to make connect to sql

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";
            // to connect to my sql
            //database schema name: human-resource

            Connection con = DriverManager.getConnection(url, "root", "16121990");
            // put user name and password
            //username : root
            //password : 16121990

            stmt = con.createStatement();// start connection

            String insuranceID;
            insuranceID = this.id.getText(); // get insurance id from text field

            stmt.executeUpdate("Delete From insurance Where IID =('" + insuranceID + "')");
            // deltet according id
            con.close();// close connection
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }        // TODO add your handling code here:

    }

    public void updateInsurance() {
        Statement stmt;// define statment to make connect to sql

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";
            // to connect to my sql
            //database schema name: human-resource
            Connection con = DriverManager.getConnection(url, "root", "16121990");
            // put user name and password
            //username : root
            //password : 16121990

            stmt = con.createStatement();// start connection

            String newValue, oldVlaue, insuranceID; // define varaible
            insuranceID = this.id.getText();// put id from text field
            newValue = this.update4.getText();// put new value that upadted
            oldVlaue = this.update2.getText();// old coloums which need update value

            stmt.executeUpdate("update insurance set " + oldVlaue + " = ('" + newValue + "')where Iid=('" + insuranceID + "')");// the  stamteent to update to table at my sql
            con.close();// close connection
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }        // TODO add your handling code here:

    }

    public void selectInsurance() {

        Statement stmt;// define statment to make connect to sql

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";
            // to connect to my sql
            //database schema name: human-resource

            Connection con = DriverManager.getConnection(url, "root", "16121990"); // put user name and password
            //username : root
            //password : 16121990

            stmt = con.createStatement();// start connection

            //String adrs=jComboBox36.getSelectedItem().toString();
            String selected, selectCondition;// define string selection and condition select
            selected = select1.getText();//what coloums need select (name or id ir anther things )
            selectCondition = condition.getText();//what condition need
            ResultSet querySelect;// define the result set of a database query
            querySelect = stmt.executeQuery("select " + selected + " from insurance where " + selectCondition + "");// condition to make slect
            ResultSetMetaData resultData = querySelect.getMetaData();//get metadata from the ResultSet object(query_select).

            String selectionResult = "";
            // to check result at qulery
            while (querySelect.next()) {
                for (int coloums = 1; coloums < resultData.getColumnCount() + 1; coloums++) {// check coloum coloum
                    selectionResult += querySelect.getObject(coloums).toString() + " - " + "\n";//+rs.getObject(2).toString()+"\n ";//+rs.getObject(3).toString()+"\n";

                }
                String finalSelect = "";

                finalSelect = selectionResult + "\n==========================\n";//} // the final reault

                area.append(finalSelect);// the result appear in text arear
            }

            con.close();// close connection

        } catch (Exception ee) {
            System.out.println(ee.toString());
        }

    }

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
            java.util.logging.Logger.getLogger(Insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insurance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JTextField condition;
    private javax.swing.JLabel condition1;
    private javax.swing.JButton delete;
    private javax.swing.JLabel employeeid;
    private javax.swing.JTextField id;
    private javax.swing.JLabel id1;
    private javax.swing.JTextField idemployee;
    private javax.swing.JButton insert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name1;
    private javax.swing.JButton select;
    private javax.swing.JTextField select1;
    private javax.swing.JLabel selection;
    private javax.swing.JButton update;
    private javax.swing.JLabel update1;
    private javax.swing.JTextField update2;
    private javax.swing.JLabel update3;
    private javax.swing.JTextField update4;
    // End of variables declaration//GEN-END:variables
}
