/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Inovax
 */
@XmlRootElement(name = "pessoasXML") // Notação XML
public class pessoas {
    
    
   private int pes_id;
   private String pes_nome;
   private String pes_rg;
   private String pes_cpf;
   private String pes_end ;       
   private String pes_tel;
   private Date pes_dtcadastro;
   private int pes_status;        

    public pessoas(int pes_id, String pes_nome, String pes_rg, String pes_cpf, String pes_end, String pes_tel, Date pes_dtcadastro, int pes_status) {
        this.pes_id = pes_id;
        this.pes_nome = pes_nome;
        this.pes_rg = pes_rg;
        this.pes_cpf = pes_cpf;
        this.pes_end = pes_end;
        this.pes_tel = pes_tel;
        this.pes_dtcadastro = pes_dtcadastro;
        this.pes_status = pes_status;
    }

     public pessoas(){}
            
    /**
     * @return the pes_id
     */
    public int getPes_id() {
        return pes_id;
    }

    /**
     * @param pes_id the pes_id to set
     */
    public void setPes_id(int pes_id) {
        this.pes_id = pes_id;
    }

    /**
     * @return the pes_nome
     */
    public String getPes_nome() {
        return pes_nome;
    }

    /**
     * @param pes_nome the pes_nome to set
     */
    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    /**
     * @return the pes_rg
     */
    public String getPes_rg() {
        return pes_rg;
    }

    /**
     * @param pes_rg the pes_rg to set
     */
    public void setPes_rg(String pes_rg) {
        this.pes_rg = pes_rg;
    }

    /**
     * @return the pes_cpf
     */
    public String getPes_cpf() {
        return pes_cpf;
    }

    /**
     * @param pes_cpf the pes_cpf to set
     */
    public void setPes_cpf(String pes_cpf) {
        this.pes_cpf = pes_cpf;
    }

    /**
     * @return the pes_end
     */
    public String getPes_end() {
        return pes_end;
    }

    /**
     * @param pes_end the pes_end to set
     */
    public void setPes_end(String pes_end) {
        this.pes_end = pes_end;
    }

    /**
     * @return the pes_tel
     */
    public String getPes_tel() {
        return pes_tel;
    }

    /**
     * @param pes_tel the pes_tel to set
     */
    public void setPes_tel(String pes_tel) {
        this.pes_tel = pes_tel;
    }

    /**
     * @return the pes_dtcadastro
     */
    public Date getPes_dtcadastro() {
        return pes_dtcadastro;
    }

    /**
     * @param pes_dtcadastro the pes_dtcadastro to set
     */
    public void setPes_dtcadastro(Date pes_dtcadastro) {
        this.pes_dtcadastro = pes_dtcadastro;
    }

    /**
     * @return the pes_status
     */
    public int getPes_status() {
        return pes_status;
    }

    /**
     * @param pes_status the pes_status to set
     */
    public void setPes_status(int pes_status) {
        this.pes_status = pes_status;
    }
            
            
    
    
}
