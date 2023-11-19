package com.example.sd_41.service.HoaDon;

import com.example.sd_41.model.HoaDon;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface HoaDonServiceImpl {

    Page<HoaDon> listHoaDonFindByKhachHangAndTrangThai(UUID idKhachHang,int trangThai,Integer pageNo,Integer size);

    HoaDon findId(UUID id);

    void update(UUID id, HoaDon updateHoaDon);

}
