package com.hutech.QLSV.repository;
import com.hutech.QLSV.model.MonHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IMonHocRepository extends JpaRepository<MonHoc, Long> {
}
