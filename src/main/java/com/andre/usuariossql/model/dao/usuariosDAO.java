/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andre.usuariossql.model.dao;

import com.andre.usuariossql.bd.ConexaoPostgres;
import com.andre.usuariossql.model.domain.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class usuariosDAO extends ConexaoPostgres{
    
    public List<Usuarios> listarTodos() throws Exception {
        List<Usuarios> lUsuarios = new LinkedList<>();
        try{
            this.conectar();
            String sql = "SELECT * FROM DEPARTAMENTO ORDER BY CODIGO";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuarios usuarios = new Usuarios();
                usuarios.setCodigo(rs.getInt("CODIGO"));
                usuarios.setNome(rs.getString("NOME"));
                usuarios.setPerfil(rs.getString("PERFIL"));
                usuarios.setLogin(rs.getString("LOGIN"));
                usuarios.setSenha(rs.getString("SENHA"));
                
                lUsuarios.add(usuarios);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return lUsuarios;
    }
    
}
