/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saratech.enginee.auth.service;

import java.sql.SQLException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nagaraj
 */
@Service
public interface SessionService {

    String getLogin(String userName, String password) throws SQLException;
}
