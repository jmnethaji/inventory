/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saratech.enginee.ums.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Nagaraj
 */
@Service
public interface ConfigService {
    String add(String userType) throws Exception;
    String addUser(String user,String name,String password,String locationId,String userTypeId,String phone,String email,String createdBy) throws Exception;
}
