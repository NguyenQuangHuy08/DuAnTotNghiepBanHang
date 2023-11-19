package com.example.sd_41.service.GiayTheThao;

import com.example.sd_41.model.GiayTheThao;
import com.example.sd_41.repository.SanPham.GiayTheThao.GiayTheThaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiayTheThaoService {

    @Autowired
    private GiayTheThaoRepository giayTheThaoRepository;

    public List<GiayTheThao> findGiayTheThao(String tenGiayTheThao){

        if(tenGiayTheThao !=null){

            return giayTheThaoRepository.findByTenGiayTheThao(tenGiayTheThao);

        }else{

             return giayTheThaoRepository.findAll();

        }

    }


}