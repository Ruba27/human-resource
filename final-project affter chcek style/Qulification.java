/*
 Ruba Esawi && Sanaa Ghanem
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
public class Qulification extends HumanResource {

    /**
     * Creates new form qulification
     */
    public Qulification() {
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

        delte = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        slecet = new javax.swing.JButton();
        university = new javax.swing.JLabel();
        experiences1 = new javax.swing.JLabel();
        cources = new javax.swing.JLabel();
        courses = new javax.swing.JTextField();
        experience = new javax.swing.JTextField();
        university1 = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        id1 = new javax.swing.JLabel();
        coloum1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        update1 = new javax.swing.JLabel();
        coloum = new javax.swing.JTextField();
        update2 = new javax.swing.JTextField();
        select1 = new javax.swing.JLabel();
        condition1 = new javax.swing.JLabel();
        select2 = new javax.swing.JTextField();
        condition = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(831, 770));

        delte.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        delte.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\d.PNG")); // NOI18N
        delte.setText("Delete");
        delte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delteActionPerformed(evt);
            }
        });

        insert.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        insert.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Capture.PNG")); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
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

        slecet.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        slecet.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\se.PNG")); // NOI18N
        slecet.setText("Select");
        slecet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slecetActionPerformed(evt);
            }
        });

        university.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        university.setText("university-degree");

        experiences1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        experiences1.setText("experience");

        cources.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cources.setText("Courcese");

        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
            }
        });

        experience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experienceActionPerformed(evt);
            }
        });

        university1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                university1ActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        id1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id1.setText("ID");

        coloum1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coloum1.setText("Colum need Update");

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        update1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update1.setText("new value update");

        select1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select1.setText("Select what?");

        condition1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        condition1.setText("condition");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delte)
                        .addGap(18, 18, 18)
                        .addComponent(update)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(cources, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(slecet))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(select2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(condition1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(condition))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(university, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(university1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(experiences1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coloum1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(coloum, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(university, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(university1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cources, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(experiences1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coloum1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coloum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delte, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slecet, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(select1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(select2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(condition1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(447, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delteActionPerformed
        Statement stmt;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";// to connect to sql
            //database schema name: human-resource

            Connection con = DriverManager.getConnection(url, "root", "16121990");
            // put user name and password
            //username : root
            //password : 16121990

            stmt = con.createStatement();// start connection

            String Qulification_ID;
            Qulification_ID = this.id.getText(); // get id from text field

            stmt.executeUpdate("Delete From qulification Where Qid =('" + Qulification_ID + "')");
            //delete from row wher id
            con.close(); // close connection
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }        // TODO add your handling code here:

    }//GEN-LAST:event_delteActionPerformed
// these buutonn to inert new value to table employee
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
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

            String universities, experiences, courcess;

            universities = this.university1.getText(); // get university degree from text field
            experiences = this.experience.getText();// get expeience year from text field
            courcess = this.courses.getText();// get courses from text field
            stmt.executeUpdate("INSERT INTO qulification (University,Expeience,Cources)" + " VALUES ('" + universities + "','" + experiences + "','" + courcess + "')");
// the obove stamteent to insert to table at my sql
            con.close();//close connection
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
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

            String newValue, oldVlaue, id;// define variable as string
            id = this.id.getText();// // put id from text field
            newValue = this.update2.getText();// put new value that upadted
            oldVlaue = this.coloum.getText();// old coloums which need update value

            stmt.executeUpdate("update qulification set " + oldVlaue + " = ('" + newValue + "')where Qid=('" + id + "')");  // the  stamteent to update to table at my sql
            con.close();// close connection
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }        // TODO add your handling code here:

// TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void slecetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slecetActionPerformed

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

            String selection, selectcondition;// define string selection and condition select
            selection = select2.getText();//what coloums need select (name or id ir anther things )
            selectcondition = condition.getText();//what condition need
            ResultSet queryselect;// define the result set of a database query
            queryselect = stmt.executeQuery("select " + selection + " from qulification where " + selectcondition + "");// condition to make slect
            ResultSetMetaData resultdata = queryselect.getMetaData();//get metadata from the ResultSet object(query_select).

            String selectionresult = "";
            // to check result at qulery
            while (queryselect.next()) {
                for (int j = 1; j < resultdata.getColumnCount() + 1; j++) {// check coloum coloum
                    selectionresult += queryselect.getObject(j).toString() + " - " + "\n";//+rs.getObject(2).toString()+"\n ";//+rs.getObject(3).toString()+"\n";

                }
                String resultselection = "";

                resultselection = selectionresult + "\n==========================\n";//} // the final reault

                area.append(resultselection);// the result appear in text arear
            }

            con.close();// close connection

        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_slecetActionPerformed

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesActionPerformed

    private void experienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experienceActionPerformed

    private void university1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_university1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_university1ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(qulification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qulification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qulification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qulification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Qulification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JTextField coloum;
    private javax.swing.JLabel coloum1;
    private javax.swing.JTextField condition;
    private javax.swing.JLabel condition1;
    private javax.swing.JLabel cources;
    private javax.swing.JTextField courses;
    private javax.swing.JButton delte;
    private javax.swing.JTextField experience;
    private javax.swing.JLabel experiences1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel id1;
    private javax.swing.JButton insert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel select1;
    private javax.swing.JTextField select2;
    private javax.swing.JButton slecet;
    private javax.swing.JLabel university;
    private javax.swing.JTextField university1;
    private javax.swing.JButton update;
    private javax.swing.JLabel update1;
    private javax.swing.JTextField update2;
    // End of variables declaration//GEN-END:variables
}
