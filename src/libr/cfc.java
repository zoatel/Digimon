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
import javax.swing.JOptionPane;
/**
 *
 * @author Yaseen
 */
public class cfc extends javax.swing.JFrame {
    Connection c = libr.DBc.DBCon();
    PreparedStatement st = null;
    ResultSet rs;
    String name = null;
    public cfc() {
        initComponents();
        this.setLocationRelativeTo(null);
        UpdateD();
        d.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
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
        b = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        d = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(34, 54, 113));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libr/Digimon-logos_transparent.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Prototype", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create a NEW Fan CLUB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
        );

        jLabel3.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 54, 113));
        jLabel3.setText("CLUB's Name :");

        cn.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 54, 113));
        jLabel4.setText("BOOK's ID :");

        bid.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 54, 113));
        jLabel5.setText("ADMIN's ID :");

        aid.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 54, 113));
        jLabel6.setText("DEFAULT Meeting Day :");

        jLabel7.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(34, 54, 113));
        jLabel7.setText("NOTE THAT All the Meetings are ");

        jLabel8.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(34, 54, 113));
        jLabel8.setText("Between 7 P.M. and 9 P.M.");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(34, 54, 113));

        jLabel9.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Choose from Available Days");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(85, 85, 85))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
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

        buttonGroup1.add(d7);
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

        buttonGroup1.add(d14);
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

        buttonGroup1.add(d21);
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

        buttonGroup1.add(d28);
        d28.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        d28.setText("28");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(d22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(d1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(d23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(d16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d24, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d25, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d26, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d20, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(d27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(d16, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(d17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(d22, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(d23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        b.setBackground(new java.awt.Color(34, 54, 113));
        b.setFont(new java.awt.Font("Prototype", 0, 36)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setText("Create CLUB");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(34, 54, 113));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FAN CLUB MENU");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        jLabel11.setText("Days From 29 to 31 aren't available form meetings");

        buttonGroup1.add(d);
        d.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(d)
                .addGap(204, 204, 204)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cn, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(aid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bid, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(cn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(34, 34, 34)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        (fclub.cf).setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        String cln = cn.getText();
        String boid = bid.getText();
        String adid = aid.getText();
        String anid = null;
        int cA = 0;
        try {
            st = c.prepareStatement("SELECT * FROM MEMBERS WHERE MEMBER_ID = ?");
            st.setString(1, adid);
            rs = st.executeQuery();
            while(rs.next()){
                cA = Integer.parseInt(rs.getString("ADMIN"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(cA != 1){
        L1:
        {
        if(CheckN(cln)){
            JOptionPane.showMessageDialog(this, "THIS CLUB's Name IS Already in USE", "ERROR", 2);
            break L1;
        }
        int d = getCDAY();
        if(d == 0){
          JOptionPane.showMessageDialog(this, "SELECT a DAY!", "ERROR", 2);
          break L1;
        }
            UpdateD();
        int co = 0;
        try{
            st = c.prepareCall("SELECT * FROM BOOKS WHERE BOOK_ID = ?");
            st.setString(1, boid);
            rs = st.executeQuery();
            while(rs.next()){
                co++;
            }
            if(co == 0){
                JOptionPane.showMessageDialog(this, "INVALID BOOK ID", "ERROR", 2);
                break L1;
            }
        }catch(SQLException ex){
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }try{
            st = c.prepareCall("SELECT * FROM MEMBERS WHERE MEMBER_ID = ?");
            st.setString(1, adid);
            rs = st.executeQuery();
            co = 0;
            while(rs.next()){
                anid = rs.getString("MEMBER_NID");
                co++;
            }
            if(co == 0){
                JOptionPane.showMessageDialog(this, "INVALID MEMBER ID", "ERROR", 2);
                break L1;
            }
        }catch(SQLException ex){
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            st = c.prepareStatement("INSERT INTO FANCLUB (CLUB_NAME,BOOK,CLUB_ADMIN,ADMIN_ID,M_DATE) VALUES (?,?,?,?,?)");
            st.setString(1, cln);
            st.setString(2, boid);
            st.setString(3, anid);
            st.setString(4, adid);
            st.setString(5, d+"");
            st.executeUpdate();
            st = c.prepareStatement("UPDATE MEMBERS SET ADMIN = 1 WHERE MEMBER_ID = ?");
            st.setString(1, adid);
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, cln+" CLUB CREATED SUCCESSFULLY!","CREATED SUCCESSFULLY!",1);
            UpdateD();
        }catch(SQLException ex){
            Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        {
            String id = null;
            
            try {
                st = c.prepareStatement("SELECT * FROM FANCLUB WHERE ADMIN_ID = ?");
                st.setString(1, adid);
                rs = st.executeQuery();
                while(rs.next()){
                    id = rs.getString("CLUB_ID");
                    name = rs.getString("CLUB_NAME");
                }
            st = c.prepareStatement("SELECT * FROM MEMBERS WHERE MEMBER_ID = ?");
            st.setString(1, adid);
            rs = st.executeQuery();
            while(rs.next()){
            if(Integer.parseInt(rs.getString("FAN_C")) == 0){
                st = c.prepareStatement("UPDATE MEMBERS SET FAN_1 = ? WHERE MEMBER_ID = ?");
                st.setString(1, id);
                st.setString(2, adid);
                st.executeUpdate();
                st = c.prepareStatement("UPDATE MEMBERS SET FAN_C = ? WHERE MEMBER_ID = ?");
                st.setString(1, "1");
                st.setString(2, adid);
                st.executeUpdate();
            }else if(Integer.parseInt(rs.getString("FAN_C")) == 1){
                st = c.prepareStatement("UPDATE MEMBERS SET FAN_2 = ? WHERE MEMBER_ID = ?");
                st.setString(1, id);
                st.setString(2, adid);
                st.executeUpdate();
                st = c.prepareStatement("UPDATE MEMBERS SET FAN_C = ? WHERE MEMBER_ID = ?");
                st.setString(1, "2");
                st.setString(2, adid);
                st.executeUpdate();
            }else if(Integer.parseInt(rs.getString("FAN_C")) == 2){
                st = c.prepareStatement("UPDATE MEMBERS SET FAN_3 = ? WHERE MEMBER_ID = ?");
                st.setString(1, id);
                st.setString(2, adid);
                st.executeUpdate();
                st = c.prepareStatement("UPDATE MEMBERS SET FAN_C = ? WHERE MEMBER_ID = ?");
                st.setString(1, "3");
                st.setString(2, adid);
                st.executeUpdate();
            }else if(Integer.parseInt(rs.getString("FAN_C")) > 2){
                JOptionPane.showMessageDialog(this, "YOU REACHED THE MAXIMUM JOINING TO THE CLUBS!","ERROR",2);
            }
           
            }
            } catch (SQLException ex) {
                Logger.getLogger(cfc.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        }else{
            JOptionPane.showMessageDialog(this, "YOU ARE ALREADY AN ADMIN OF ANOTHER CLUB!","ERROR",2);
        }
    }//GEN-LAST:event_bActionPerformed

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
            java.util.logging.Logger.getLogger(cfc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cfc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cfc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cfc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cfc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aid;
    private javax.swing.JButton b;
    private javax.swing.JTextField bid;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cn;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
