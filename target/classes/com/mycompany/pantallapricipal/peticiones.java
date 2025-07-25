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
import java.util.Random;

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
    // esto es una peticion para otener un mensaje en la pantalla recomendaciones
    public static String obtenermensaje() {
    Random random = new Random();
    List<Object[]> mensaje = new ArrayList<>();

    Connection conn = DB.conectar();
    int id = random.nextInt(20) + 1;

    if (conn != null) {
        String query = "SELECT * FROM mensaje WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            /*while (rs.next()) {
                Object[] fila = new Object[] {
                    rs.getString("mensaje") // Asegúrate que el nombre de la columna sea "mensaje" y no "mensajes"
                };
                mensaje.add(fila);
            }*/
            if (rs.next()) {
                return rs.getString("mensaje");
            }
            System.out.println(mensaje);
        } catch (SQLException e) {
            System.out.println("Error al mostrar el mensaje");
        }
    }

    return "No hay mensaje";
}
    // esto es una peticion para otener un mensaje en la pantalla de la luna 
    public static String recomendaciondeluna() {
    Random randosm = new Random();
    List<Object[]> mensaje = new ArrayList<>();

    Connection conn = DB.conectar();
    int id = randosm.nextInt(10) + 1;

    if (conn != null) {
        String query = "SELECT * FROM sueno WHERE idsueno = ?";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            /*while (rs.next()) {
            
                Object[] fila = new Object[] {
                    rs.getString("mensaje") // Asegúrate que el nombre de la columna sea "mensaje" y no "mensajes"
                };
                mensaje.add(fila);
            }*/
            if (rs.next()) {
                return rs.getString("comentario");
            }
            System.out.println(mensaje);
        } catch (SQLException e) {
            System.out.println("Error al mostrar el mensaje");
            System.out.println(e);
        }
    }

    return "No hay mensaje";
}  
    
    

    //Otra peticion para insertar usurios a la base de datos.
    public static boolean insertarUsuario(String nombre, String correo, String contrasena, int edad, double peso,String sexo, double altura) {
    
    Connection conn = DB.conectar();

    if (conn != null) {
        
        String query = "INSERT INTO usuario (nombre, correo,contrasena, edad, peso, sexo, altura) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setString(2, correo);
            stmt.setString(3, contrasena);
            stmt.setInt(4, edad);
            stmt.setDouble(5, peso);
            stmt.setString(6, sexo);
            stmt.setDouble(7, altura);
            

            int filasAfectadas = stmt.executeUpdate();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar usuario");
            e.printStackTrace();
        }
    }

    return false;
}
    public static boolean login(String correo, String password) {
    
    Connection conn = DB.conectar();

    if (conn != null) {
        
        String query = "SELECT * FROM usuario WHERE correo = ? AND contrasena = ?";
 
        
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, correo);
            stmt.setString(2, password);

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
