package sample;

import java.security.Timestamp;
import java.sql.*;
import java.sql.PreparedStatement;


    public class Artiklar extends DBconnection {
        private Connection con = null;
        private Statement st = null;
        private ResultSet rs = null;
        private PreparedStatement ps = null;

        private int idartiklar;
        private String titel;
        private int streckkodNr;
        private String författare;
        private String regissör;
        private int isbn;
        private int hyllplatsNr;
        private String klassificering;
        private String genrer;
        private String productionsLand;
        private String åldergräns;
        private String skådespelare;
        private int maxLånTid;
        String dbname = "bibliotek";
        String dbuser = "root";
        String dbpassword = "0000";
        String url = "jdbc:mysql://localhost:3306/" +dbname;

        public Artiklar() {
        }



        public void connection() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }
            catch (Exception e) {
                System.out.println("Artiklar.java\n" + e.getMessage());
            }

            try {
                con = DriverManager.getConnection(url, dbuser, dbpassword);
                st = con.createStatement();
                rs = st.executeQuery("SELECT * FROM artiklar");
                while (rs.next()) {
                    idartiklar = rs.getInt(1);
                    titel = rs.getString(2);
                    streckkodNr = rs.getInt(3);
                    författare = rs.getString(4);
                    regissör = rs.getString(5);
                    isbn = rs.getInt(6);
                    hyllplatsNr = rs.getInt(7);
                    klassificering = rs.getString(8);
                    genrer = rs.getString(9);
                    productionsLand = rs.getString(10);
                    åldergräns = rs.getString(11);
                    skådespelare = rs.getString(12);
                    maxLånTid = rs.getInt(13);
                }
                rs.close();
                st.close();
                con.close();
            }

            catch (Exception e) {
                System.out.println("Artiklar.java\n" + e.getMessage());
            }
        }




        public void add_item ( int idartiklar, String titel, int streckkodNr, String författare, String regissör,
                               int isbn, int hyllplatsNr, String klassificering, String genrer, String productionsLand,
                               String åldergräns, String skådespelare, int maxLånTid) {


        }

        public void update(String Query) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }

            catch (Exception e) {
                System.out.println("Artiklar.java\n" + e.getMessage());
            }


            try {
                con = DriverManager.getConnection(url, dbuser, dbpassword);
                st = con.createStatement();
                st.executeUpdate(Query);
                st.close();
                con.close();
            }

            catch (Exception e) {
                System.out.println("Artiklar.java\n" + e.getMessage());
            }
        }



        public void setCon(Connection con) {
            this.con = con;
        }

        public void setSt(Statement st) {
            this.st = st;
        }

        public void setRs(ResultSet rs) {
            this.rs = rs;
        }

        public void setTitel(String titel) {
            this.titel = titel;
        }

        public void setStreckkodNr(int streckkodNr) {
            this.streckkodNr = streckkodNr;
        }

        public void setFörfattare(String författare) {
            this.författare = författare;
        }

        public void setRegissör(String regissör) {
            this.regissör = regissör;
        }

        public void setIsbn(int isbn) {
            this.isbn = isbn;
        }

        public void setHyllplatsNr(int hyllplatsNr) {
            this.hyllplatsNr = hyllplatsNr;
        }

        public void setKlassificering(String klassificering) {
            this.klassificering = klassificering;
        }

        public void setGenrer(String genrer) {
            this.genrer = genrer;
        }

        public void setProductionsLand(String productionsLand) {
            this.productionsLand = productionsLand;
        }

        public void setÅldergräns(String åldergräns) {
            this.åldergräns = åldergräns;
        }

        public void setSkådespelare(String skådespelare) {
            this.skådespelare = skådespelare;
        }

        public void setMaxLånTid(int maxLånTid) {
            this.maxLånTid = maxLånTid;
        }


        public Connection getCon() {
            return con;
        }

        public Statement getSt() {
            return st;
        }

        public ResultSet getRs() {
            return rs;
        }

        public String getTitel() {
            return titel;
        }

        public int getStreckkodNr() {
            return streckkodNr;
        }

        public String getFörfattare() {
            return författare;
        }

        public String getRegissör() {
            return regissör;
        }

        public int getIsbn() {
            return isbn;
        }

        public int getHyllplatsNr() {
            return hyllplatsNr;
        }

        public String getKlassificering() {
            return klassificering;
        }

        public String getGenrer() {
            return genrer;
        }

        public String getProductionsLand() {
            return productionsLand;
        }

        public String getÅldergräns() {
            return åldergräns;
        }

        public String getSkådespelare() {
            return skådespelare;
        }

        public int getMaxLånTid() {
            return maxLånTid;
        }

        public String getDbname() {
            return dbname;
        }

        public void setDbname(String dbname) {
            this.dbname = dbname;
        }

        public String getDbuser() {
            return dbuser;
        }

        public void setDbuser(String dbuser) {
            this.dbuser = dbuser;
        }

        public String getDbpassword() {
            return dbpassword;
        }

        public void setDbpassword(String dbpassword) {
            this.dbpassword = dbpassword;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getIdartiklar() {
            return idartiklar;
        }

        public void setIdartiklar(int idartiklar) {
            this.idartiklar = idartiklar;
        }
    }


