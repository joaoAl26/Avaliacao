/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author s.lucas
 */
public class bdFamosos {

    public ArrayList<String> listaFamosos;
    public ArrayList<String> lista0;

    public bdFamosos() {
        listaFamosos = new ArrayList();
        lista0 = new ArrayList();
    }

    public void save(String Famoso) {
        listaFamosos.add(Famoso);
        lista0.add(Famoso);
        JOptionPane.showMessageDialog(null, "" + Famoso + " foi salvo com sucesso!");
    }

    public String toString() {
        String result = "lista de Famosos\n";
        if (!listaFamosos.isEmpty()) {
            for (int i = 0; i < listaFamosos.size(); i++) {
                result += listaFamosos.get(i) + "\n";
            }
        } else {
            result = "O banco de dados está vazio!";
        }
        return result;
    }

     public String toStringO() {
        String result = "lista de Famosos\n";
        Collections.sort(lista0);
        if (!lista0.isEmpty()) {
            for (int i = 0; i < lista0.size(); i++) {
                result += lista0.get(i) + "\n";
            }
        } else {
            result = "O banco de dados está vazio!";
        }
        return result;
    }
    public int getSize() {
        return listaFamosos.size();

    }

    public String getFamoso(int i) {
        String f = "";
        if(i>0){
            f = listaFamosos.get(i);
            }else{
            f = "Famoso não existe não!";
        }
    
        return f;
    
    }
    public void delete(int i){
        if(i!=-1){
            listaFamosos.remove(i);
            lista0.remove(i);
            JOptionPane.showMessageDialog(null, "O Famoso foi excluido");
        }else{
            JOptionPane.showMessageDialog(null, "O Famoso não existe!");
    }
    }
    public int search(String Famoso){
        boolean achou = false;
        int i = 0, f= -1;
        while(i<listaFamosos.size() && !achou){
            if(listaFamosos.get(i).equals(Famoso))
                f=i;
                achou = true;
        }
        i++; 
    return f;
                
    }
    public void eliminateList(){
        listaFamosos.clear();
        lista0.clear();
    }
    
   
}
