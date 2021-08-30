/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andre.usuariossql.control;

import com.andre.usuariossql.model.dao.usuariosDAO;
import com.andre.usuariossql.model.domain.Usuarios;
import java.util.List;

public class usuariosControl {
    
    usuariosDAO usuariosDAO = new usuariosDAO();
    
    public List<Usuarios> listarTodos() throws Exception {
        return usuariosDAO.listarTodos();
    }
}
