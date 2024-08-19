package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class ServiceDAO<T> implements IGenericDAO<T> {

    private  Connection connection;

    public ServiceDAO() {
        
    }

    @Override
    public int create(T t) {
        connection = Database.Connexion.getConnection();
        String INSERT = getInsertSQL(); // Get the insert SQL statement
        try (PreparedStatement pstmt = connection.prepareStatement(INSERT)) {
            setPreparedStatementValues(pstmt, t);
            return pstmt.executeUpdate(); // Return the number of affected rows
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // Indicate failure
    }

    @Override
    public T read(int id) {
        String sql = getSelectSQL(); // Get the select SQL statement
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return mapResultSetToEntity(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Entity not found
    }

    @Override
    public int update(T t) {
        connection = Database.Connexion.getConnection();
        String UPDATE = getUpdateSQL(); // Get the update SQL statement
        try (PreparedStatement pstmt = connection.prepareStatement(UPDATE)) {
            setPreparedStatementValues(pstmt, t);
            pstmt.setInt(getParameterIndexForId(), getId(t)); // Set the ID parameter
            return pstmt.executeUpdate(); // Return the number of affected rows
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // Indicate failure
    }

    @Override
    public int delete(int id) {
        connection = Database.Connexion.getConnection();
        String DELETE = getDeleteSQL(); // Get the delete SQL statement
        try (PreparedStatement pstmt = connection.prepareStatement(DELETE)) {
            pstmt.setInt(1, id);
            return pstmt.executeUpdate(); // Return the number of affected rows
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // Indicate failure
    }

    @Override
    public List<T> getAll() {
        connection = Database.Connexion.getConnection();
        List<T> list = new ArrayList<>();
        String SELECT = getSelectAllSQL(); // Get the select all SQL statement
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT)) {
            while (rs.next()) {
                list.add(mapResultSetToEntity(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list; // Return the list of entities
    }

    protected abstract int getId(T t); // To get the ID of the entity

    protected abstract void setPreparedStatementValues(PreparedStatement pstmt, T t) throws SQLException; // Set values in the PreparedStatement

    protected abstract T mapResultSetToEntity(ResultSet rs) throws SQLException; // Map ResultSet to entity

    protected abstract String getInsertSQL(); // Get the SQL for inserting

    protected abstract String getSelectSQL(); // Get the SQL for selecting

    protected abstract String getUpdateSQL(); // Get the SQL for updating

    protected abstract String getDeleteSQL(); // Get the SQL for deleting

    protected abstract String getSelectAllSQL(); // Get the SQL for selecting all entities

    protected abstract int getParameterIndexForId(); // Get the parameter index for the ID in the update statement

    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
