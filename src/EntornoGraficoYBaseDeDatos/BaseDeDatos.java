/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntornoGraficoYBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import excepciones.Excepcion;
/**
 *
 * @author cromerofajar
 */
public class BaseDeDatos {

     public static class Inserts{
     public static void insert(String NombreUser, String NombrePartida,String Resultado,int Farmeo,int Kills,int Muertes,int Asistencias,int Vision,String Rango,int Elo) {
        String sql = "INSERT INTO "+NombreUser+"(NombrePartida,NombreUser,Resultado,Farmeo,Kills,Muertes,Asistencias,Rango,Vision,Elo) VALUES(?,?,?,?,?,?,?,?,?,?)";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection("jdbc:sqlite:base.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try (Connection conn = conne;
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, NombrePartida);
            pstmt.setString(2, NombreUser);
            pstmt.setString(3, Resultado);
            pstmt.setInt(4, Farmeo);
            pstmt.setInt(5, Kills);
            pstmt.setInt(6, Muertes);
            pstmt.setInt(7, Asistencias);
            pstmt.setInt(8, Vision);
            pstmt.setString(9, Rango);
            pstmt.setInt(10, Elo);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }
     
     public static void insert2(String NombreUser,String NombreBuild,String NombreObjeto, String NombreObjeto2,String NombreObjeto3,String NombreObjeto4,String NombreObjeto5,String NombreObjeto6) {
        String sql = "INSERT INTO "+NombreUser+"Build (NombreBuild,NombreObjeto,NombreObjeto2,NombreObjeto3,NombreObjeto4,NombreObjeto5,NombreObjeto6) VALUES(?,?,?,?,?,?,?)";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection("jdbc:sqlite:base.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try (Connection conn = conne;
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, NombreBuild);
            pstmt.setString(2, NombreObjeto);
            pstmt.setString(3, NombreObjeto2);
            pstmt.setString(4, NombreObjeto3);
            pstmt.setString(5, NombreObjeto4);
            pstmt.setString(6, NombreObjeto5);
            pstmt.setString(7, NombreObjeto6);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"No se puede repetir la clave primaria!");
        }
        }

     public static void createNewTable(String user) {
        String url = "jdbc:sqlite:base.db";
        String sql = "CREATE TABLE IF NOT EXISTS "+user+" (\n"
                + "	NombrePartida text NOT NULL PRIMARY KEY,\n"
                + "	NombreUser text,\n"
                + "	Resultado text,\n"
                + "	Farmeo integer,\n"
                + "	Kills integer,\n"
                + "	Muertes integer,\n"
                + "	Asistencias integer,\n"
                + "	Vision integer,\n"
                + "	Rango text,\n"
                + "	Elo real\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void createNewTable2(String user) {
        // SQLite connection string
        String url = "jdbc:sqlite:base.db";
        
        // SQL statement for creating a new table
        String sql1 = "CREATE TABLE IF NOT EXISTS "+user+"build (\n"
                + "	NombreBuild text PRIMARY KEY,\n"
                + "	NombreObjeto text,\n"
                + "	NombreObjeto2 text,\n"
                + "	NombreObjeto3 text,\n"
                + "	NombreObjeto4 text,\n"
                + "	NombreObjeto5 text,\n"
                + "	NombreObjeto6 text\n"
                + ");";
        
        try (Connection connn = DriverManager.getConnection(url);
            Statement stmt = connn.createStatement()) {
            stmt.execute(sql1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     }
     public static class Select{
        public static DefaultTableModel blanco(){
        RevisarPartidas obx=new RevisarPartidas();
        DefaultTableModel blancos=(DefaultTableModel) obx.TablaDatosParti.getModel();
        blancos.setRowCount(0);
        return blancos;
    }
        public static DefaultTableModel blanco2(){
        RevisarBuilds obx=new RevisarBuilds();
        DefaultTableModel blancos=(DefaultTableModel) obx.TablaDatosBuild.getModel();
        blancos.setRowCount(0);
        return blancos;
    }
        public static ArrayList<Object[]> selectAll(String nombre){
        ArrayList <Object[]>parti=new ArrayList<>();

        String url = "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sql = "SELECT NombrePartida,Resultado,Farmeo,Kills,Muertes,Asistencias,Rango,Vision,Elo FROM \""+nombre+"\"";

        
        try (Connection conn=conne;
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                Object[] base=new Object[9];
                base[0]=rs.getString("NombrePartida");
                base[1]=rs.getString("Resultado");
                base[2]=rs.getString("Farmeo");
                base[3]=rs.getString("Kills");
                base[4]=rs.getString("Muertes");
                base[5]=rs.getString("Asistencias");
                base[6]=rs.getString("Rango");
                base[7]=rs.getString("Vision");
                base[8]=rs.getString("Elo");
                parti.add(base);
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                conne.close();
            } catch (SQLException ex) {
                Logger.getLogger(ex.getMessage());
            }
        }
        return parti;
    }
    public static ArrayList<Object[]> selectNombre(String nombre,String nPartida){
        ArrayList <Object[]>parti=new ArrayList<>();

        String url = "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sql = "SELECT NombrePartida,Resultado,Farmeo,Kills,Muertes,Asistencias,Rango,Vision,Elo FROM \""+nombre+"\" WHERE NombrePartida=\""+nPartida+"\"";

        
        try (Connection conn=conne;
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                Object[] base=new Object[9];
                base[0]=rs.getString("NombrePartida");
                base[1]=rs.getString("Resultado");
                base[2]=rs.getString("Farmeo");
                base[3]=rs.getString("Kills");
                base[4]=rs.getString("Muertes");
                base[5]=rs.getString("Asistencias");
                base[6]=rs.getString("Rango");
                base[7]=rs.getString("Vision");
                base[8]=rs.getString("Elo");
                parti.add(base);
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                conne.close();
            } catch (SQLException ex) {
                Logger.getLogger(ex.getMessage());
            }
        }
        return parti;
    }
        public static ArrayList<Object[]> selectResultado(String nombre,String resultado){
        ArrayList <Object[]>parti=new ArrayList<>();

        String url = "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sql = "SELECT NombrePartida,Resultado,Farmeo,Kills,Muertes,Asistencias,Rango,Vision,Elo FROM \""+nombre+"\" WHERE Resultado=\""+resultado+"\"";

        
        try (Connection conn=conne;
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                Object[] base=new Object[9];
                base[0]=rs.getString("NombrePartida");
                base[1]=rs.getString("Resultado");
                base[2]=rs.getString("Farmeo");
                base[3]=rs.getString("Kills");
                base[4]=rs.getString("Muertes");
                base[5]=rs.getString("Asistencias");
                base[6]=rs.getString("Rango");
                base[7]=rs.getString("Vision");
                base[8]=rs.getString("Elo");
                parti.add(base);
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                conne.close();
            } catch (SQLException ex) {
                Logger.getLogger(ex.getMessage());
            }
        }
        return parti;
    }
            public static ArrayList<Object[]> selectRango(String nombre,String rango){
        ArrayList <Object[]>parti=new ArrayList<>();

        String url = "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sql = "SELECT NombrePartida,Resultado,Farmeo,Kills,Muertes,Asistencias,Rango,Vision,Elo FROM \""+nombre+"\" WHERE Rango=\""+rango+"\"";

        
        try (Connection conn=conne;
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                Object[] base=new Object[9];
                base[0]=rs.getString("NombrePartida");
                base[1]=rs.getString("Resultado");
                base[2]=rs.getString("Farmeo");
                base[3]=rs.getString("Kills");
                base[4]=rs.getString("Muertes");
                base[5]=rs.getString("Asistencias");
                base[6]=rs.getString("Rango");
                base[7]=rs.getString("Vision");
                base[8]=rs.getString("Elo");
                parti.add(base);
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                conne.close();
            } catch (SQLException ex) {
                Logger.getLogger(ex.getMessage());
            }
        }
        return parti;
    }
    public static ArrayList<Object[]> selectAllB(String nombre){
        ArrayList <Object[]>parti=new ArrayList<>();

        String url = "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sql = "SELECT NombreBuild,NombreObjeto,NombreObjeto2,NombreObjeto3,NombreObjeto4,NombreObjeto5,NombreObjeto6 FROM \""+nombre+"Build\"";

        
        try (Connection conn=conne;
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                Object[] base=new Object[7];
                base[0]=rs.getString("NombreBuild");
                base[1]=rs.getString("NombreObjeto");
                base[2]=rs.getString("NombreObjeto2");
                base[3]=rs.getString("NombreObjeto3");
                base[4]=rs.getString("NombreObjeto4");
                base[5]=rs.getString("NombreObjeto5");
                base[6]=rs.getString("NombreObjeto6");
                parti.add(base);
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                conne.close();
            } catch (SQLException ex) {
                Logger.getLogger(ex.getMessage());
            }
        }
        return parti;
    }
        public static ArrayList<Object[]> selectNombreB(String nombre,String nBuild){
        ArrayList <Object[]>parti=new ArrayList<>();

        String url = "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sql = "SELECT NombreBuild,NombreObjeto,NombreObjeto2,NombreObjeto3,NombreObjeto4,NombreObjeto5,NombreObjeto6 FROM \""+nombre+"build\" WHERE NombreBuild=\""+nBuild+"\"";

        
        try (Connection conn=conne;
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                Object[] base=new Object[7];
                base[0]=rs.getString("NombreBuild");
                base[1]=rs.getString("NombreObjeto");
                base[2]=rs.getString("NombreObjeto2");
                base[3]=rs.getString("NombreObjeto3");
                base[4]=rs.getString("NombreObjeto4");
                base[5]=rs.getString("NombreObjeto5");
                base[6]=rs.getString("NombreObjeto6");
                parti.add(base);
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                conne.close();
            } catch (SQLException ex) {
                Logger.getLogger(ex.getMessage());
            }
        }
        return parti;
    }
    }
     public static class Borrar{
     public static void borrar(){
        Panel obx=new Panel();
        String user=obx.usuario;
        String nombre=JOptionPane.showInputDialog(null,"Introduce el nombre de la partida que deseas borrar");
        String url= "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        String sql="DELETE FROM "+user+" WHERE NombrePartida= ?";
        try (Connection conn = conne;
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos partida borrados");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        }finally{
            try {
                conne.close();

            } catch (SQLException ex) {
                Logger.getLogger(ex.getMessage());
            }
        }
    }
     public static void borrarB(){
        Panel obx=new Panel();
        String user=obx.usuario;
        String nombre=JOptionPane.showInputDialog(null,"Introduce el nombre de la build que deseas borrar");
        String url= "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        String sql="DELETE FROM "+user+"Build WHERE NombreBuild= ?";
        try (Connection conn = conne;
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos build borrados");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        }finally{
            try {
                conne.close();

            } catch (SQLException ex) {
                Logger.getLogger(ex.getMessage());
            }
        }
    }
     }
     public static class Modificar{
     public static void modificarDatosPartida(String nPartida,String resultado,int farmeo,int kills,int muertes,int asistencias,int vision,String rango,int elo){
        Panel obx=new Panel();

        String use=obx.usuario;
        String url = "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        /*
        * Variables used to realiced the update
        */
            String sql = "UPDATE \""+use+"\" SET NombrePartida= ? , "
            + "NombreUser = ? , "
            + "Resultado = ? , "
            + "Farmeo = ? , "
            + "Kills = ? , "
            + "Muertes = ? , "
            + "Asistencias = ? , "
            + "Vision = ? , "
            + "Rango = ? , "
            + "Elo = ? "
            + "WHERE NombrePartida = \""+nPartida+"\"";
        try (Connection conn = conne;
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nPartida);
            pstmt.setString(2, use);
            pstmt.setString(3, resultado);
            pstmt.setInt(4, farmeo);
            pstmt.setInt(5, kills);
            pstmt.setInt(6, muertes);
            pstmt.setInt(7, asistencias);
            pstmt.setInt(8, vision);
            pstmt.setString(9,rango);
            pstmt.setInt(10, elo);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }finally{
            try {
                conne.close();

            } catch (SQLException ex) {
                Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
     public static void modificarDatosBuild(String nBuild,String obj1,String obj2,String obj3, String obj4, String obj5, String obj6){
        Panel obx=new Panel();

        String use=obx.usuario;
        String url = "jdbc:sqlite:base.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        /*
        * Variables used to realiced the update
        */
            String sql = "UPDATE \""+use+"build\" SET NombreBuild= ? , "
            + "NombreObjeto = ? , "
            + "NombreObjeto2 = ? , "
            + "NombreObjeto3 = ? , "
            + "NombreObjeto4 = ? , "
            + "NombreObjeto5 = ? , "
            + "NombreObjeto6 = ?  "
            + "WHERE NombreBuild = \""+nBuild+"\"";
        try (Connection conn = conne;
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nBuild);
            pstmt.setString(2, obj1);
            pstmt.setString(3, obj2);
            pstmt.setString(4, obj3);
            pstmt.setString(5, obj4);
            pstmt.setString(6, obj5);
            pstmt.setString(7, obj6);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }finally{
            try {
                conne.close();

            } catch (SQLException ex) {
                Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
     }
     }
}
