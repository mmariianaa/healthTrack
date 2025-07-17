/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantallapricipal;

/**
 *
 * @author Mento
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class peticiones {
    
    //Esta es para get
    public static List<Object[]> obtenerUsuarios(){
        
        List<Object[]> usuarios=new ArrayList<>();
        
        Connection conn=DB.conectar();
        
        if(conn != null){
            String query="SELECT * FROM usuario";
            
            try(Statement stmt=conn.createStatement();
                ResultSet rs= stmt.executeQuery(query)){
                
               while(rs.next()){
                   Object[] fila = new Object[] {
                        rs.getString("nombre"),
                        rs.getInt("edad"),
                        rs.getDouble("peso"),
                        rs.getString("sexo"),
                        rs.getString("correo"),
                        rs.getDouble("altura")
                    };
                    usuarios.add(fila);
               }    
            }catch(SQLException e){
                System.out.println("Error al ejecutar consulta");
                e.printStackTrace();
            }
        }
        return usuarios;
    }
    
    //Otra peticion
    public static boolean insertarUsuario(String nombreCompleto, String rol, String curp, String correo, String password) {
    
    Connection conn = DB.conectar();

    if (conn != null) {
        
        String query = "INSERT INTO usuarios (nombre_completo, rol, curp, correo, password) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nombreCompleto);
            stmt.setString(2, rol);
            stmt.setString(3, curp);
            stmt.setString(4, correo);
            stmt.setString(5, password);

            int filasAfectadas = stmt.executeUpdate();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar usuario");
            e.printStackTrace();
        }
    }

    return false;
}
    public static boolean login(String correo, int password) {
    
    Connection conn = DB.conectar();

    if (conn != null) {
        
        String query = "SELECT * FROM usuario WHERE correo = ? AND edad = ?";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, correo);
            stmt.setInt(2, password);

            ResultSet rs = stmt.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            System.out.println("❌ Error al loguear");
            e.printStackTrace();
        }
    }

    return false;
}

}
