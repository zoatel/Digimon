/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libr;
import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaming
 */
public class manageclub extends javax.swing.JFrame {

   Connection c = DBc.DBCon();
    PreparedStatement st = null;
    ResultSet rs;
   String name = null;
   static String nid =null;
   
    public manageclub() {
        initComponents();
        this.setLocationRelativeTo(null);
        UpdateD();
        jPanel11.setVisible(false);
        l7.setVisible(false);
        d.setVisible(false);
          l8.setVisible(false);

          Coptions1.setVisible(false);
          t2.setVisible(false);
          edit.setVisible(false);
          l13.setVisible(false);
          l12.setVisible(false);
          jPanel5.setVisible(false);
          jPanel3.setVisible(false);
          
    }
     public void UpdateD(){
        try {
            st = c.prepareStatement("SELECT * FROM FANCLUB");
            rs = st.executeQuery();
            while(rs.next()){
                if(Integer.parseInt(rs.getString("CLUB_ID")) != 1){
                int k = Integer.parseInt(rs.getString("M_DATE"));
                DisD(k);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void DisD(int i){
        if(i==1){
            d1.setEnabled(false);
            d.setSelected(true);
        }else if(i==2){
            d2.setEnabled(false);
            d.setSelected(true);
        }else if(i==3){
            d3.setEnabled(false);
            d.setSelected(true);
        }else if(i==4){
            d4.setEnabled(false);
            d.setSelected(true);
        }else if(i==5){
            d5.setEnabled(false);
            d.setSelected(true);
        }else if(i==6){
            d6.setEnabled(false);
            d.setSelected(true);
        }else if(i==7){
            d7.setEnabled(false);
            d.setSelected(true);
        }else if(i==8){
            d8.setEnabled(false);
            d.setSelected(true);
        }else if(i==9){
            d9.setEnabled(false);
            d.setSelected(true);
        }else if(i==10){
            d10.setEnabled(false);
            d.setSelected(true);
        }else if(i==11){
            d11.setEnabled(false);
            d.setSelected(true);
        }else if(i==12){
            d12.setEnabled(false);
            d.setSelected(true);
        }else if(i==13){
            d13.setEnabled(false);
            d.setSelected(true);
        }else if(i==14){
            d14.setEnabled(false);
            d.setSelected(true);
        }else if(i==15){
            d15.setEnabled(false);
            d.setSelected(true);
        }else if(i==16){
            d16.setEnabled(false);
            d.setSelected(true);
        }else if(i==17){
            d17.setEnabled(false);
            d.setSelected(true);
        }else if(i==18){
            d18.setEnabled(false);
            d.setSelected(true);
        }else if(i==19){
            d19.setEnabled(false);
            d.setSelected(true);
        }else if(i==20){
            d20.setEnabled(false);
            d.setSelected(true);
        }else if(i==21){
            d21.setEnabled(false);
            d.setSelected(true);
        }else if(i==22){
            d22.setEnabled(false);
            d.setSelected(true);
        }else if(i==23){
            d23.setEnabled(false);
            d.setSelected(true);
        }else if(i==24){
            d24.setEnabled(false);
            d.setSelected(true);
        }else if(i==25){
            d25.setEnabled(false);
            d.setSelected(true);
        }else if(i==26){
            d26.setEnabled(false);
            d.setSelected(true);
        }else if(i==27){
            d27.setEnabled(false);
            d.setSelected(true);
        }else if(i==28){
            d28.setEnabled(false);
            d.setSelected(true);
        }
    }
    public void EnaD(int i){
        if(i==1){
            d1.setEnabled(true);
            d.setSelected(true);
        }else if(i==2){
            d2.setEnabled(true);
            d.setSelected(true);
        }else if(i==3){
            d3.setEnabled(true);
            d.setSelected(true);
        }else if(i==4){
            d4.setEnabled(true);
            d.setSelected(true);
        }else if(i==5){
            d5.setEnabled(true);
            d.setSelected(true);
        }else if(i==6){
            d6.setEnabled(true);
            d.setSelected(true);
        }else if(i==7){
            d7.setEnabled(true);
            d.setSelected(true);
        }else if(i==8){
            d8.setEnabled(true);
            d.setSelected(true);
        }else if(i==9){
            d9.setEnabled(true);
            d.setSelected(true);
        }else if(i==10){
            d10.setEnabled(true);
            d.setSelected(true);
        }else if(i==11){
            d11.setEnabled(true);
            d.setSelected(true);
        }else if(i==12){
            d12.setEnabled(true);
            d.setSelected(true);
        }else if(i==13){
            d13.setEnabled(true);
            d.setSelected(true);
        }else if(i==14){
            d14.setEnabled(true);
            d.setSelected(true);
        }else if(i==15){
            d15.setEnabled(true);
            d.setSelected(true);
        }else if(i==16){
            d16.setEnabled(true);
            d.setSelected(true);
        }else if(i==17){
            d17.setEnabled(true);
            d.setSelected(true);
        }else if(i==18){
            d18.setEnabled(true);
            d.setSelected(true);
        }else if(i==19){
            d19.setEnabled(true);
            d.setSelected(true);
        }else if(i==20){
            d20.setEnabled(true);
            d.setSelected(true);
        }else if(i==21){
            d21.setEnabled(true);
            d.setSelected(true);
        }else if(i==22){
            d22.setEnabled(true);
            d.setSelected(true);
        }else if(i==23){
            d23.setEnabled(true);
            d.setSelected(true);
        }else if(i==24){
            d24.setEnabled(true);
            d.setSelected(true);
        }else if(i==25){
            d25.setEnabled(true);
            d.setSelected(true);
        }else if(i==26){
            d26.setEnabled(true);
            d.setSelected(true);
        }else if(i==27){
            d27.setEnabled(true);
            d.setSelected(true);
        }else if(i==28){
            d28.setEnabled(true);
            d.setSelected(true);
        }
    }
    public int getCDAY(){
        if(d1.isSelected())
            return 1;
        else if(d2.isSelected())
            return 2;
        else if(d3.isSelected())
            return 3;
        else if(d4.isSelected())
            return 4;
        else if(d5.isSelected())
            return 5;
        else if(d6.isSelected())
            return 6;
        else if(d7.isSelected())
            return 7;
        else if(d8.isSelected())
            return 8;
        else if(d9.isSelected())
            return 9;
        else if(d10.isSelected())
            return 10;
        else if(d11.isSelected())
            return 11;
        else if(d12.isSelected())
            return 12;
        else if(d13.isSelected())
            return 13;
        else if(d14.isSelected())
            return 14;
        else if(d15.isSelected())
            return 15;
        else if(d16.isSelected())
            return 16;
        else if(d17.isSelected())
            return 17;
        else if(d18.isSelected())
            return 18;
        else if(d19.isSelected())
            return 19;
        else if(d20.isSelected())
            return 20;
        else if(d21.isSelected())
            return 21;
        else if(d22.isSelected())
            return 22;
        else if(d23.isSelected())
            return 23;
        else if(d24.isSelected())
            return 24;
        else if(d25.isSelected())
            return 25;
        else if(d26.isSelected())
            return 26;
        else if(d27.isSelected())
            return 27;
        else if(d28.isSelected())
            return 28;

        return 0;
    }
  public boolean CheckN(String j){
        int co = 0;
        try {
            st = c.prepareStatement("SELECT * FROM FANCLUB");
            rs = st.executeQuery();
            while(rs.next()){
            if(rs.getString("CLUB_NAME").equals(j) ){
            co++; 
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(co >= 1){
            return true; 
        }
        return false;
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logb = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        l13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        d1 = new javax.swing.JToggleButton();
        d2 = new javax.swing.JToggleButton();
        d3 = new javax.swing.JToggleButton();
        d4 = new javax.swing.JToggleButton();
        d5 = new javax.swing.JToggleButton();
        d6 = new javax.swing.JToggleButton();
        d7 = new javax.swing.JToggleButton();
        d8 = new javax.swing.JToggleButton();
        d9 = new javax.swing.JToggleButton();
        d10 = new javax.swing.JToggleButton();
        d11 = new javax.swing.JToggleButton();
        d12 = new javax.swing.JToggleButton();
        d13 = new javax.swing.JToggleButton();
        d14 = new javax.swing.JToggleButton();
        d15 = new javax.swing.JToggleButton();
        d16 = new javax.swing.JToggleButton();
        d17 = new javax.swing.JToggleButton();
        d18 = new javax.swing.JToggleButton();
        d19 = new javax.swing.JToggleButton();
        d20 = new javax.swing.JToggleButton();
        d21 = new javax.swing.JToggleButton();
        d22 = new javax.swing.JToggleButton();
        d23 = new javax.swing.JToggleButton();
        d24 = new javax.swing.JToggleButton();
        d25 = new javax.swing.JToggleButton();
        d26 = new javax.swing.JToggleButton();
        d27 = new javax.swing.JToggleButton();
        d28 = new javax.swing.JToggleButton();
        l12 = new javax.swing.JLabel();
        d = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        Coptions1 = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        md = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 622));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 675));

        jPanel2.setBackground(new java.awt.Color(34, 54, 113));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libr/Digimon-logos_transparent.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Prototype", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage CLUB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        logb.setBackground(new java.awt.Color(34, 54, 113));
        logb.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        logb.setForeground(new java.awt.Color(255, 255, 255));
        logb.setText("login");
        logb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N
        t1.setToolTipText("Enter the ID here");
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        l3.setFont(new java.awt.Font("Prototype", 0, 29)); // NOI18N
        l3.setForeground(new java.awt.Color(34, 54, 113));
        l3.setText("Please enter your National ID :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(logb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(l3)
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(l3)
                .addGap(18, 18, 18)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(logb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        l13.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        l13.setForeground(new java.awt.Color(34, 54, 113));
        l13.setText("Edit the meeting day :");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(34, 54, 113));

        jLabel13.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Choose from Available Days");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(85, 85, 85))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(d1);
        d1.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d1.setText("1");

        buttonGroup1.add(d2);
        d2.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d2.setText("2");

        buttonGroup1.add(d3);
        d3.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d3.setText("3");

        buttonGroup1.add(d4);
        d4.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d4.setText("4");

        buttonGroup1.add(d5);
        d5.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d5.setText("5");

        buttonGroup1.add(d6);
        d6.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d6.setText("6");

        d7.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d7.setText("7");

        buttonGroup1.add(d8);
        d8.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d8.setText("8");

        buttonGroup1.add(d9);
        d9.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d9.setText("9");

        buttonGroup1.add(d10);
        d10.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d10.setText("10");

        buttonGroup1.add(d11);
        d11.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d11.setText("11");

        buttonGroup1.add(d12);
        d12.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d12.setText("12");

        buttonGroup1.add(d13);
        d13.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d13.setText("13");

        d14.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d14.setText("14");

        buttonGroup1.add(d15);
        d15.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d15.setText("15");

        buttonGroup1.add(d16);
        d16.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d16.setText("16");

        buttonGroup1.add(d17);
        d17.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d17.setText("17");

        buttonGroup1.add(d18);
        d18.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d18.setText("18");

        buttonGroup1.add(d19);
        d19.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d19.setText("19");

        buttonGroup1.add(d20);
        d20.setFont(new java.awt.Font("Prototype", 0, 13)); // NOI18N
        d20.setText("20");
        d20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d20ActionPerformed(evt);
            }
        });

        d21.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d21.setText("21");

        buttonGroup1.add(d22);
        d22.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d22.setText("22");

        buttonGroup1.add(d23);
        d23.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d23.setText("23");

        buttonGroup1.add(d24);
        d24.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d24.setText("24");

        buttonGroup1.add(d25);
        d25.setFont(new java.awt.Font("Prototype", 0, 13)); // NOI18N
        d25.setText("25");

        buttonGroup1.add(d26);
        d26.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d26.setText("26");

        buttonGroup1.add(d27);
        d27.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d27.setText("27");

        d28.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d28.setText("28");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(d22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(d1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(d23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(d16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d24, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d25, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d26, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d20, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(d27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(d16, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(d17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(d22, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(d23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        l12.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        l12.setText("Days From 29 to 31 aren't available form meetings");

        buttonGroup1.add(d);
        d.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(l12)
            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(l13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        l7.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        l7.setForeground(new java.awt.Color(34, 54, 113));
        l7.setText("CLUB's Admin :");

        l8.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        l8.setForeground(new java.awt.Color(34, 54, 113));
        l8.setText("The Beloved BOOK:");

        Coptions1.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        Coptions1.setForeground(new java.awt.Color(34, 54, 113));
        Coptions1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Change The Book", "Change CLUB's name", "Change Meeting's Day" }));
        Coptions1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Coptions1ActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N

        edit.setBackground(new java.awt.Color(34, 54, 113));
        edit.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        md.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        md.setForeground(new java.awt.Color(34, 54, 113));
        md.setText("The Meeting day is:");

        cn.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        cn.setForeground(new java.awt.Color(34, 54, 113));
        cn.setText("CLUB's Name :");

        jLabel3.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 54, 113));
        jLabel3.setText("The Meeting day is:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l8)
                    .addComponent(l7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cn)
                    .addComponent(md)
                    .addComponent(jLabel3))
                .addGap(196, 196, 196))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coptions1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l7)
                    .addComponent(cn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l8)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(md)
                .addGap(11, 11, 11)
                .addComponent(Coptions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(34, 54, 113));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FAN CLUB MENU");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed
    void UpdateRES(){
       try {
           st = c.prepareStatement("SELECT members.MEMBER_ID ,members.MEMBER_NAME,books.BOOK_NAME,fanclub.CLUB_NAME, fanclub.M_DATE ,fanclub.CLUB_ID FROM members,fanclub,books WHERE MEMBER_NID = ? AND (members.MEMBER_NID = fanclub.CLUB_ADMIN)AND(fanclub.BOOK=books.BOOK_ID)");
           st.setString(1, t1.getText());
           rs = st.executeQuery();
           while(rs.next()){
               l7.setText("CLUB's Admin : " + rs.getString("MEMBER_NAME"));
               l8.setText("The Beloved BOOK : " + rs.getString("BOOK_NAME"));
               cn.setText("CLUB's Name : "+ rs.getString("CLUB_NAME"));
               if(Integer.parseInt(rs.getString("M_DATE")) == 1){
                    md.setText(rs.getString("M_DATE")+"st Day of Every Month");
               }else if(Integer.parseInt(rs.getString("M_DATE")) == 2){
                    md.setText(rs.getString("M_DATE")+"nd Day of Every Month");  
               }else if(Integer.parseInt(rs.getString("M_DATE")) == 3){
                    md.setText(rs.getString("M_DATE")+"rd Day of Every Month"); 
               }else{
                    md.setText(rs.getString("M_DATE")+"th Day of Every Month");    
               }
            }
       } catch (SQLException ex) {
           Logger.getLogger(manageclub.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
    private void logbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbActionPerformed

   
nid=t1.getText();
           int CA=0;
           try {
            st = c.prepareStatement("SELECT * FROM members WHERE MEMBER_NID = ?");
            st.setString(1, t1.getText());
            rs = st.executeQuery();
            while(rs.next()){
                CA++;
            }
            l1:{
            if(CA>0){
                try {
            st = c.prepareStatement("SELECT members.MEMBER_ID ,members.MEMBER_NAME,books.BOOK_NAME,fanclub.CLUB_NAME, fanclub.M_DATE ,fanclub.CLUB_ID FROM members,fanclub,books WHERE MEMBER_NID = ? AND (members.MEMBER_NID = fanclub.CLUB_ADMIN)AND(fanclub.BOOK=books.BOOK_ID)");
            st.setString(1, t1.getText());
            rs = st.executeQuery();
             
        l7.setVisible(true);
          l8.setVisible(true);
          Coptions1.setVisible(true);
          t2.setVisible(true);
          edit.setVisible(true);
          jPanel4.setVisible(false);
          jPanel5.setVisible(true);
          jPanel3.setVisible(true);
                

            while(rs.next()){
               l7.setText("CLUB's Admin : " + rs.getString("MEMBER_NAME"));
               l8.setText("The Beloved BOOK : " + rs.getString("BOOK_NAME"));
               cn.setText("CLUB's Name :"+ rs.getString("CLUB_NAME"));
               if(Integer.parseInt(rs.getString("M_DATE")) == 1){
                    md.setText(rs.getString("M_DATE")+"st Day of Every Month");
               }else if(Integer.parseInt(rs.getString("M_DATE")) == 2){
                    md.setText(rs.getString("M_DATE")+"nd Day of Every Month");  
               }else if(Integer.parseInt(rs.getString("M_DATE")) == 3){
                    md.setText(rs.getString("M_DATE")+"rd Day of Every Month"); 
               }else{
                    md.setText(rs.getString("M_DATE")+"th Day of Every Month");    
               }
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if (CA==0){
                      JOptionPane.showMessageDialog(this, "INVALID NATIONAL ID", "ERROR", 2);
            break l1;        
            }}
        } catch (SQLException ex) {
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_logbActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        
        l1:
            if(Coptions1.getSelectedIndex()==0){
                t2.setToolTipText("Enter book ID here ");
                 try{
               Integer.parseInt(t2.getText());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Enter the ID in Integers!","Error",2);
            }
                  int co = 0;
        try{
            st = c.prepareCall("SELECT * FROM BOOKS WHERE BOOK_ID = ?");
            st.setString(1, t2.getText());
            rs = st.executeQuery();
            while(rs.next()){
                co++;
            }
            if(co == 0){
                JOptionPane.showMessageDialog(this, "INVALID BOOK ID", "ERROR", 2);
                break l1;
            }
        }catch(SQLException ex){
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
                       try {
            st = c.prepareStatement("UPDATE fanclub SET BOOK= ? WHERE CLUB_ADMIN = ? ");
            st.setString(1, t2.getText());
            st.setString(2,  t1.getText());
             st.executeUpdate();
            while(rs.next()){
        
            }
             JOptionPane.showMessageDialog(this, "EDITED SUCCESSFULLY !", "ERROR", 1);
             UpdateRES();
             
        }
            catch (SQLException ex) {
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if(Coptions1.getSelectedIndex()==1){
                 if(CheckN(t1.getText())){
                JOptionPane.showMessageDialog(this, "THIS CLUB's Name IS Already in USE", "ERROR", 2);
                break l1;
                }
                 if(t2.getText().isEmpty()){
                     JOptionPane.showMessageDialog(this, "THE CLUB's Name is EMPTY!", "ERROR", 2);
                     break l1;
                 }
            try {
            st = c.prepareStatement("UPDATE fanclub SET  CLUB_NAME= ? WHERE CLUB_ADMIN = ? ");
            st.setString(1, t2.getText());
            st.setString(2,  t1.getText());
             st.executeUpdate();
            while(rs.next()){
        
            }
             JOptionPane.showMessageDialog(this, "EDITED CLUB NAME SUCCESSFULLY !", "ERROR", 1);
             UpdateRES();
             
        }
            catch (SQLException ex) {
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
           
            else if(Coptions1.getSelectedIndex()==2){
                int tg = 0;
           try{
               st = c.prepareStatement("SELECT * FROM FANCLUB WHERE CLUB_ADMIN = ?");
               st.setString(1,  t1.getText());
               rs = st.executeQuery();
               while(rs.next()){
                   tg = Integer.parseInt(rs.getString("M_DATE"));
               }
           }catch (SQLException ex) {
            Logger.getLogger(manageclub.class.getName()).log(Level.SEVERE, null, ex);
        }
           int d = getCDAY();
            if(d == 0){
            JOptionPane.showMessageDialog(this, "SELECT a DAY!", "ERROR", 2);
            break l1;
            }
          try {
              UpdateD();
            st = c.prepareStatement("UPDATE fanclub SET M_DATE= ? WHERE CLUB_ADMIN = ? ");
            st.setString(1, d+"");
            st.setString(2,  t1.getText());
             st.executeUpdate();
             JOptionPane.showMessageDialog(this, "EDITED METTING DATE SUCCESSFULLY !", "ERROR", 1);
             UpdateRES();
             UpdateD();
             EnaD(tg);
        }
            catch (SQLException ex) {
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }

            

            }
        
        
    }//GEN-LAST:event_editActionPerformed

    private void d20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d20ActionPerformed

    private void Coptions1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Coptions1ActionPerformed
        if(Coptions1.getSelectedIndex()==2){
          jPanel11.setVisible(true);
          l13.setVisible(true);
          l12.setVisible(true);
          t2.setVisible(false);
        }
        else{
          jPanel11.setVisible(false);
          l13.setVisible(false);
          l12.setVisible(false);
          t2.setVisible(true);
        }
    }//GEN-LAST:event_Coptions1ActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        (fclub.mc).setVisible(false);
    }//GEN-LAST:event_jPanel6MouseClicked

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
            java.util.logging.Logger.getLogger(manageclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageclub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageclub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Coptions1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cn;
    private javax.swing.JToggleButton d;
    private javax.swing.JToggleButton d1;
    private javax.swing.JToggleButton d10;
    private javax.swing.JToggleButton d11;
    private javax.swing.JToggleButton d12;
    private javax.swing.JToggleButton d13;
    private javax.swing.JToggleButton d14;
    private javax.swing.JToggleButton d15;
    private javax.swing.JToggleButton d16;
    private javax.swing.JToggleButton d17;
    private javax.swing.JToggleButton d18;
    private javax.swing.JToggleButton d19;
    private javax.swing.JToggleButton d2;
    private javax.swing.JToggleButton d20;
    private javax.swing.JToggleButton d21;
    private javax.swing.JToggleButton d22;
    private javax.swing.JToggleButton d23;
    private javax.swing.JToggleButton d24;
    private javax.swing.JToggleButton d25;
    private javax.swing.JToggleButton d26;
    private javax.swing.JToggleButton d27;
    private javax.swing.JToggleButton d28;
    private javax.swing.JToggleButton d3;
    private javax.swing.JToggleButton d4;
    private javax.swing.JToggleButton d5;
    private javax.swing.JToggleButton d6;
    private javax.swing.JToggleButton d7;
    private javax.swing.JToggleButton d8;
    private javax.swing.JToggleButton d9;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JButton logb;
    private javax.swing.JLabel md;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
