/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java .awt.TextArea;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
/**
 *
 * @author User
 */
public class salary extends HumanResource {

    /**
     * Creates new form salary
     */
    public salary() {
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

        Calculate = new javax.swing.JButton();
        Employee_ID = new javax.swing.JLabel();
        ID_Employee = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_select = new javax.swing.JTextArea();
        Slect_what1 = new javax.swing.JLabel();
        select_what = new javax.swing.JTextField();
        Condition_select1 = new javax.swing.JLabel();
        condition = new javax.swing.JTextField();
        select = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(828, 770));

        Calculate.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        Calculate.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Capture.PNG")); // NOI18N
        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        Employee_ID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Employee_ID.setText("Employee ID");

        ID_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_EmployeeActionPerformed(evt);
            }
        });

        area_select.setColumns(20);
        area_select.setRows(5);
        jScrollPane1.setViewportView(area_select);

        Slect_what1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Slect_what1.setText("Select what?");

        select_what.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_whatActionPerformed(evt);
            }
        });

        Condition_select1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Condition_select1.setText("Condition Select");

        select.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        select.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\se.PNG")); // NOI18N
        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Slect_what1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Condition_select1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(select_what, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Employee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(ID_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Employee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Slect_what1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(select_what, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Condition_select1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // TODO add your handling code here:
        
        Statement stmt,stmt1,stmt2,stmt3;// define statment to make connect to sql

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";
            // to connect to my sql
            //database schema name: human-resource

            Connection con = DriverManager.getConnection( url,"root", "16121990" );
            // put user name and password
            //username : root
            //password : 16121990

            

            stmt = con.createStatement();// start connection 
            stmt1 = con.createStatement();// start connection 
             stmt2 = con.createStatement();// start connection 
             stmt3 = con.createStatement();// start connection 
             
            
            String Employee_ID;
            
            Employee_ID=ID_Employee.getText();// get employee id from text field
            
            ResultSet Working_ID;// define the result set of a database query
             Working_ID = stmt3.executeQuery("select Wid from paid where Eid= '"+Employee_ID+"'"); // get working id from paid table
             
             // to get working name 
             String working="";
             while(Working_ID.next()){
                working+=Working_ID.getObject(1).toString();
                
            }
             
             ResultSet Qulification_ID;// define the result set of a database query
             
            Qulification_ID = stmt3.executeQuery("select Qid from paid where Eid= '"+Employee_ID+"'");// get qulification id from paid table 
            
             String department="";
             //to get department name 
             while(Qulification_ID.next()){
               department+=Qulification_ID.getObject(1).toString();
                
            }
             ResultSet Qulification_result,Employee_result,Working_result;// define the result set of a database query
            Qulification_result = stmt.executeQuery("select University from qulification where Qid= '"+department+"'");// get university degree from qulification table 
            Employee_result = stmt1.executeQuery("select job from employee where Eid= '"+Employee_ID+"'");// get employee jobs 
             Working_result = stmt2.executeQuery("select startworking from workingdate where Wid= '"+working+"'");// get date from working date table 
         
        
            
            String final_result_qulification="",final_employee_result="",final_working_result="";
            //  to get fianl qulification result 
            while(Qulification_result.next()){
                final_result_qulification+=Qulification_result.getObject(1).toString();
            }
             //  to get fianl employee result 
           while(Employee_result.next()){
                final_employee_result+=Employee_result.getObject(1).toString();
                
            }
            //  to get fianl working result 
            while(Working_result.next()){
                final_working_result+=Working_result.getObject(1).toString();
               
            }
            Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(final_working_result); //to make the date of working as format like 1190-12-16
            Calendar cal = Calendar.getInstance();// define calender
            cal.setTime(date1);
            int date_working = cal.get(Calendar.YEAR); // take only year of the date 
          // these code to take the date of today 
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date today = new Date();
            Calendar cal1 = Calendar.getInstance();
            cal.setTime(today);
             int date_today = cal.get(Calendar.YEAR);// take only years 
           


            int insentive=((date_today-date_working)/2)*100;// salory according to start working date 
            // if wmployee is doctor(BASIC SALARY 3000) and if its is amanger (BOUNS IS 800) ELSES NO BOUNS 
            if (final_result_qulification.equalsIgnoreCase("dr") ){
                if(final_employee_result.equalsIgnoreCase("maneger")){
                  
                  stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+800+"','"+3000+"','"+(insentive+800+3000)+"')");}
                else
                 stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+0+"','"+3000+"','"+(insentive+3000)+"')");
            }
            // if employee is master(BASIC SALARY 2700) and if its is amanger (BOUNS IS 700) ELSES NO BOUNS 
            else if (final_result_qulification.equalsIgnoreCase("master") ){
                if(final_employee_result.equalsIgnoreCase("maneger")){
                  System.out.println(insentive);
                  stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+700+"','"+2700+"','"+(insentive+800+2700)+"')");}
                else
                 stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+0+"','"+2700+"','"+(insentive+2700)+"')");
            }
            // if employee is BA(BASIC SALARY 2500) and if its is amanger (BOUNS IS 500) ELSES NO BOUNS 
                else if (final_result_qulification.equalsIgnoreCase("BA") ){
                if(final_employee_result.equalsIgnoreCase("maneger")){
                  System.out.println(insentive);
                  stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+500+"','"+2500+"','"+(insentive+800+2500)+"')");}
                else
                 stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+0+"','"+2500+"','"+(insentive+2500)+"')");
            }
                // if employee is doctor(BASIC SALARY 2000) and if its is amanger (BOUNS IS 200) ELSES NO BOUNS 
                else if(final_result_qulification.equalsIgnoreCase("diploma")){
                if(final_employee_result.equalsIgnoreCase("maneger")){
                  System.out.println(insentive);
                  stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+200+"','"+2000+"','"+(insentive+200+2000)+"')");}
                else
                 stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+0+"','"+2000+"','"+(insentive+2000)+"')");
                }
                // else(BASIC SALARY 1700) and if its is amanger (BOUNS IS 200) ELSES NO BOUNS 
                else{
                    if(final_employee_result.equalsIgnoreCase("maneger")){
                  System.out.println(insentive);
                  stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+200+"','"+1700+"','"+(insentive+200+1700)+"')");}
                else
                 stmt1.executeUpdate("INSERT INTO salary (Insentive,Bouns,basicSalary,Total)" +" VALUES ('"+insentive+"','"+0+"','"+1700+"','"+(insentive+1700)+"')");
                    
                }
            //jTextArea1.append(Result);

            con.close();// close connection
        }

        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }//GEN-LAST:event_CalculateActionPerformed

    private void ID_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_EmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_EmployeeActionPerformed

    private void select_whatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_whatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_whatActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed

        Statement stmt;// define statment to make connect to sql

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/human-resource";
            /// to connect to my sql
            //database schema name: human-resource

            Connection con = DriverManager.getConnection( url,"root", "16121990" ); // put user name and password
            //username : root
            //password : 16121990

            

            stmt = con.createStatement();// start connection 

            //String adrs=jComboBox36.getSelectedItem().toString();

            String selection,select_condition;// define string selection and condition select
            selection=select_what.getText();//what coloums need select (name or id ir anther things )
            select_condition=condition.getText();//what condition need 
             ResultSet query_select;// define the result set of a database query
            query_select = stmt.executeQuery("select "+selection+" from salary where "+select_condition+"");// condition to make slect
            ResultSetMetaData result_data = query_select.getMetaData();//get metadata from the ResultSet object(query_select).

           

            String Selection_result="";
            // to check result at qulery
            while(query_select.next()){
                for(int j=1;j<result_data.getColumnCount()+1;j++){// check coloum coloum
                    Selection_result+=query_select.getObject(j).toString()+" - "+"\n";//+rs.getObject(2).toString()+"\n ";//+rs.getObject(3).toString()+"\n";

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
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JLabel Condition_select1;
    private javax.swing.JLabel Employee_ID;
    private javax.swing.JTextField ID_Employee;
    private javax.swing.JLabel Slect_what1;
    private javax.swing.JTextArea area_select;
    private javax.swing.JTextField condition;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton select;
    private javax.swing.JTextField select_what;
    // End of variables declaration//GEN-END:variables
}
