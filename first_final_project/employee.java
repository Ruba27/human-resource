/*
Ruba Esawi && Sana Ghanem
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author User
 */
public class employee extends HumanResource {

    /**
     * Creates new form employee
     */
    public employee() {
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

        name1 = new javax.swing.JLabel();
        Address1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phonenumber = new javax.swing.JLabel();
        job1 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        departmen_ID = new javax.swing.JTextField();
        eamil1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        ID1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        select = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_select = new javax.swing.JTextArea();
        departmentid1 = new javax.swing.JLabel();
        job = new javax.swing.JTextField();
        Slect_what1 = new javax.swing.JLabel();
        Condition_select1 = new javax.swing.JLabel();
        condition = new javax.swing.JTextField();
        select_what = new javax.swing.JTextField();
        new_update = new javax.swing.JLabel();
        updatee = new javax.swing.JTextField();
        coloum_update = new javax.swing.JLabel();
        Colume_update = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        name1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name1.setText("Name");

        Address1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Address1.setText("Address");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        phonenumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phonenumber.setText("Phone number");

        job1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        job1.setText("Job");

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        departmen_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmen_IDActionPerformed(evt);
            }
        });

        eamil1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eamil1.setText("Email");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        ID1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ID1.setText("ID");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
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

        select.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        select.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\se.PNG")); // NOI18N
        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        area_select.setColumns(20);
        area_select.setRows(5);
        jScrollPane1.setViewportView(area_select);

        departmentid1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        departmentid1.setText("Deprtament ID");

        job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobActionPerformed(evt);
            }
        });

        Slect_what1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Slect_what1.setText("Select what?");

        Condition_select1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Condition_select1.setText("Condition Select");

        new_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        new_update.setText("New Value Update");

        updatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateeActionPerformed(evt);
            }
        });

        coloum_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coloum_update.setText("Colum need Update");

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
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Slect_what1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Condition_select1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(select_what, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete)
                                .addGap(18, 18, 18)
                                .addComponent(update)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(departmentid1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(departmen_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coloum_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Colume_update, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(eamil1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(job1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(82, 82, 82))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(new_update)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(updatee, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(select)))))
                        .addContainerGap(227, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Address1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eamil1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(job1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Address1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departmen_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departmentid1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coloum_update, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Colume_update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(new_update, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Slect_what1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(select_what, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Condition_select1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void departmen_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmen_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmen_IDActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed
// these buutonn to inert new value to table employee
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        Statement stmt; // define statment to make connect to sql

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";// to connect to my sql
            //database schema name: human-resource

            Connection con = DriverManager.getConnection( url,"root", "16121990" );// put user name and password
            //username : root
            //password : 16121990

            stmt = con.createStatement();// make connection 

            String name1,email1,id,Address1,phone1,job1,departmentid1;
           
            name1=this.name.getText();// add name at filed
           Address1=this.email.getText();// add address at field
           email1=this.address.getText();// add emails 
           phone1=this.phone.getText();// add phone number
           job1=this.job.getText(); // add jobs
           departmentid1=this.departmen_ID.getText();// add department id * foreign key
           

            stmt.executeUpdate("INSERT INTO employee(name,addres,email,phone,Job,Did)" +" VALUES ('"+name1+"','"+email1+"','"+Address1+"','"+phone1+"','"+job1+"','"+departmentid1+"')");
           // the obove stamteent to insert to table at my sql
            con.close();
        }

        catch(Exception ee){
            System.out.println(ee.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_insertActionPerformed
// these button to delete row from sql
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Statement stmt; // define statment to make connect to sql

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";
            //database schema name: human-resource

            Connection con = DriverManager.getConnection( url,"root", "16121990" );//connect to sql
            //username : root
            //password : 16121990

            stmt = con.createStatement();// make connection 

            String id1; // define id
            id1=this.id.getText();// get id grom id text filed

            stmt.executeUpdate("Delete From employee Where Eid =('"+id1+"')");// to delete row when id=
            con.close();
        }

        catch(Exception ee){
            System.out.println(ee.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed
// make update when press ro update button
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        Statement stmt; // define statment to make connect to sql

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";//connect to sql
           
            //database schema name: human-resource

            Connection con = DriverManager.getConnection( url,"root", "16121990" );
            //username : root
            //password : 16121990

            stmt = con.createStatement();// make connection 

            String newValue,oldVlaue,id; // define new vlaue old value to update it 
            id=this.id.getText();// put id from text field
            newValue=this.updatee.getText();// put new value that upadted
            oldVlaue=this.Colume_update.getText();// old coloums which need update value
            

            stmt.executeUpdate("update employee set "+oldVlaue+" = ('"+newValue+"')where Eid=('"+id+"')");// the  stamteent to update to table at my sql
            con.close();// close connection 
        }

        catch(Exception ee){
            System.out.println(ee.toString());
        }        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed
// button to make select 
    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed

       Statement stmt; // define statment to make connect to sql
       
    try{
           Class.forName("com.mysql.jdbc.Driver"); 
						  
            String url = "jdbc:mysql://localhost:3306/human-resource"; //connect to sql
           
            //database schema name: human-resource
            //database schema: human-resource
							  
            Connection con = DriverManager.getConnection( url,"root", "16121990" );// connect to sql
            
            //username : root
            //password : 16121990
            
							  
            stmt = con.createStatement();
            String selection,select_condition; // define string selection and condition select
            selection=select_what.getText(); //what coloums need select (name or id ir anther things )
            select_condition=condition.getText();//what condition need 
            
            ResultSet query_select; // define the result set of a database query
            query_select = stmt.executeQuery("select "+selection+" from employee where "+select_condition+"");// condition to make slect
            ResultSetMetaData result_data = query_select.getMetaData(); //get metadata from the ResultSet object(query_select).
           
                                                                                                      
            String Selection_result="";
            // to check result at qulery
	    while(query_select.next()){
                for(int coloum=1;coloum<result_data.getColumnCount()+1;coloum++){ // check coloum coloum
                 Selection_result+=query_select.getObject(coloum).toString()+" - "+"\n";                 
                 
                }
                
            
            String Result_Selection="";

            Result_Selection= Selection_result+"\n==========================\n";//} // the final reault 
         
            area_select.append(Result_Selection);// the result appear in text arear
            }
           
            con.close();// close connection
            
            }
    
        catch(Exception ee){
            System.out.println(ee.toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActionPerformed

    private void jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobActionPerformed

    private void updateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateeActionPerformed

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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address1;
    private javax.swing.JTextField Colume_update;
    private javax.swing.JLabel Condition_select1;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel Slect_what1;
    private javax.swing.JTextField address;
    private javax.swing.JTextArea area_select;
    private javax.swing.JLabel coloum_update;
    private javax.swing.JTextField condition;
    private javax.swing.JButton delete;
    private javax.swing.JTextField departmen_ID;
    private javax.swing.JLabel departmentid1;
    private javax.swing.JLabel eamil1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField job;
    private javax.swing.JLabel job1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel new_update;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JButton select;
    private javax.swing.JTextField select_what;
    private javax.swing.JButton update;
    private javax.swing.JTextField updatee;
    // End of variables declaration//GEN-END:variables
}
