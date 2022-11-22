package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl extends Util implements UserDao {
    User user = new User();
    PreparedStatement preparedStatement = null;

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() throws SQLException {
    }

    public void dropUsersTable() throws SQLException {
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        return users;
    }

    public void cleanUsersTable() {
    }
}
