/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andre.usuariossql.control;

import com.andre.usuariossql.bd.ConexaoPostgres;

/**
 *
 * @author lucas
 */
public class ConexaoControl {
    
    public void testarConexao() {
        ConexaoPostgres conexao = new ConexaoPostgres();
        conexao.conectar();
    }
    
    
    
}
