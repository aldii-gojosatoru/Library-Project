/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewLog;

/**
 *
 * @author ASUS TUF
 */
public class MenuDashboard extends javax.swing.JPanel {

    /**
     * Creates new form MenuDashboard
     */
    public MenuDashboard() {
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

        KartuAnggota = new javax.swing.JPanel();
        Anggota = new javax.swing.JLabel();
        Jumlah = new javax.swing.JLabel();
        IconAnggota = new javax.swing.JLabel();
        KartuAnggota2 = new javax.swing.JPanel();
        Buku = new javax.swing.JLabel();
        Jumlah2 = new javax.swing.JLabel();
        IconAnggota2 = new javax.swing.JLabel();
        KartuAnggota3 = new javax.swing.JPanel();
        Buku1 = new javax.swing.JLabel();
        Jumlah3 = new javax.swing.JLabel();
        IconAnggota3 = new javax.swing.JLabel();
        KartuAnggota4 = new javax.swing.JPanel();
        Buku2 = new javax.swing.JLabel();
        Jumlah4 = new javax.swing.JLabel();
        IconAnggota4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1045, 750));

        KartuAnggota.setBackground(new java.awt.Color(123, 160, 236));
        KartuAnggota.setForeground(new java.awt.Color(102, 153, 255));

        Anggota.setBackground(new java.awt.Color(153, 153, 153));
        Anggota.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Anggota.setText("Anggota");

        Jumlah.setBackground(new java.awt.Color(153, 153, 153));
        Jumlah.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        Jumlah.setText("00");

        IconAnggota.setBackground(new java.awt.Color(153, 153, 153));
        IconAnggota.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        IconAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/people.png"))); // NOI18N

        javax.swing.GroupLayout KartuAnggotaLayout = new javax.swing.GroupLayout(KartuAnggota);
        KartuAnggota.setLayout(KartuAnggotaLayout);
        KartuAnggotaLayout.setHorizontalGroup(
            KartuAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KartuAnggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(KartuAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Anggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(IconAnggota)
                .addGap(30, 30, 30))
        );
        KartuAnggotaLayout.setVerticalGroup(
            KartuAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KartuAnggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Anggota)
                .addGap(25, 25, 25)
                .addComponent(Jumlah)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KartuAnggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        KartuAnggota2.setBackground(new java.awt.Color(123, 160, 236));
        KartuAnggota2.setForeground(new java.awt.Color(102, 153, 255));

        Buku.setBackground(new java.awt.Color(153, 153, 153));
        Buku.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Buku.setText("Buku");

        Jumlah2.setBackground(new java.awt.Color(153, 153, 153));
        Jumlah2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        Jumlah2.setText("00");

        IconAnggota2.setBackground(new java.awt.Color(153, 153, 153));
        IconAnggota2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        IconAnggota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/open-book.png"))); // NOI18N

        javax.swing.GroupLayout KartuAnggota2Layout = new javax.swing.GroupLayout(KartuAnggota2);
        KartuAnggota2.setLayout(KartuAnggota2Layout);
        KartuAnggota2Layout.setHorizontalGroup(
            KartuAnggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KartuAnggota2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(KartuAnggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buku, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(IconAnggota2)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        KartuAnggota2Layout.setVerticalGroup(
            KartuAnggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KartuAnggota2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Buku)
                .addGap(25, 25, 25)
                .addComponent(Jumlah2)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KartuAnggota2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconAnggota2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        KartuAnggota3.setBackground(new java.awt.Color(123, 160, 236));
        KartuAnggota3.setForeground(new java.awt.Color(102, 153, 255));

        Buku1.setBackground(new java.awt.Color(153, 153, 153));
        Buku1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Buku1.setText("Peminjaman");

        Jumlah3.setBackground(new java.awt.Color(153, 153, 153));
        Jumlah3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        Jumlah3.setText("00");

        IconAnggota3.setBackground(new java.awt.Color(153, 153, 153));
        IconAnggota3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        IconAnggota3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/download.png"))); // NOI18N

        javax.swing.GroupLayout KartuAnggota3Layout = new javax.swing.GroupLayout(KartuAnggota3);
        KartuAnggota3.setLayout(KartuAnggota3Layout);
        KartuAnggota3Layout.setHorizontalGroup(
            KartuAnggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KartuAnggota3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(KartuAnggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buku1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(IconAnggota3)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        KartuAnggota3Layout.setVerticalGroup(
            KartuAnggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KartuAnggota3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Buku1)
                .addGap(25, 25, 25)
                .addComponent(Jumlah3)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KartuAnggota3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconAnggota3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        KartuAnggota4.setBackground(new java.awt.Color(123, 160, 236));
        KartuAnggota4.setForeground(new java.awt.Color(102, 153, 255));

        Buku2.setBackground(new java.awt.Color(153, 153, 153));
        Buku2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Buku2.setText("Pengembalian");

        Jumlah4.setBackground(new java.awt.Color(153, 153, 153));
        Jumlah4.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        Jumlah4.setText("00");

        IconAnggota4.setBackground(new java.awt.Color(153, 153, 153));
        IconAnggota4.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        IconAnggota4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/return.png"))); // NOI18N

        javax.swing.GroupLayout KartuAnggota4Layout = new javax.swing.GroupLayout(KartuAnggota4);
        KartuAnggota4.setLayout(KartuAnggota4Layout);
        KartuAnggota4Layout.setHorizontalGroup(
            KartuAnggota4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KartuAnggota4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(KartuAnggota4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buku2))
                .addGap(40, 40, 40)
                .addComponent(IconAnggota4)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        KartuAnggota4Layout.setVerticalGroup(
            KartuAnggota4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KartuAnggota4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Buku2)
                .addGap(25, 25, 25)
                .addComponent(Jumlah4)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KartuAnggota4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconAnggota4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setText("Riwayat Peminjaman Buku");

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Menu Dashboard");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/monitor.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(KartuAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addComponent(KartuAnggota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(KartuAnggota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(KartuAnggota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KartuAnggota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KartuAnggota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KartuAnggota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KartuAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anggota;
    private javax.swing.JLabel Anggota1;
    private javax.swing.JLabel Buku;
    private javax.swing.JLabel Buku1;
    private javax.swing.JLabel Buku2;
    private javax.swing.JLabel IconAnggota;
    private javax.swing.JLabel IconAnggota1;
    private javax.swing.JLabel IconAnggota2;
    private javax.swing.JLabel IconAnggota3;
    private javax.swing.JLabel IconAnggota4;
    private javax.swing.JLabel Jumlah;
    private javax.swing.JLabel Jumlah1;
    private javax.swing.JLabel Jumlah2;
    private javax.swing.JLabel Jumlah3;
    private javax.swing.JLabel Jumlah4;
    private javax.swing.JPanel KartuAnggota;
    private javax.swing.JPanel KartuAnggota1;
    private javax.swing.JPanel KartuAnggota2;
    private javax.swing.JPanel KartuAnggota3;
    private javax.swing.JPanel KartuAnggota4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
