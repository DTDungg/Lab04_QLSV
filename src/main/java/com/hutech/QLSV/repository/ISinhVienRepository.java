package com.hutech.QLSV.repository;
import com.hutech.QLSV.model.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ISinhVienRepository extends JpaRepository<SinhVien, Long> {
}
