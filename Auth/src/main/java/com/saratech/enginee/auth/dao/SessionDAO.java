/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saratech.enginee.auth.dao;

import java.sql.SQLException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nagaraj
 */
@Repository
public interface SessionDAO {

    String getLogin(String userName, String password) throws SQLException;
}
