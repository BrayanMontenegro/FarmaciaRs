
package Controlador;
import Modelo.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Oreki
 */
public class DAOCliente {
   
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();
}
