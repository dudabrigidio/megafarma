package br.com.fiap.bo;

import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioBO {
    private RemedioDAO remedioDAO;

    public ArrayList<RemedioTO> findAll() { //essa array list não é a mesma das outras classes, poderia ser um nome diferente
        remedioDAO = new RemedioDAO();
        // aqui se implementa a regra de negócios (poderia colocar que nao pode inserir remedio vencido, por exemplo)
        return remedioDAO.findAll();

    }

    public RemedioTO findByCodigo(Long codigo) {
        remedioDAO = new RemedioDAO();
        // aqui se implementa a regra de negócios
        return remedioDAO.findByCodigo(codigo);
    }

    public RemedioTO save(RemedioTO remedio) {
        remedioDAO = new RemedioDAO();






//        if(remedio.getDataDeFabricacao().isAfter(LocalDate.now())) {
//            return null;
//        }
//        if (remedio.getDataDeValidade().isBefore(LocalDate.now())) {
//            return null;
//        }
        return remedioDAO.save(remedio);
    }
}

