package com.hutech.QLSV.repository;
import com.hutech.QLSV.model.Lop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILopRepository extends JpaRepository<Lop, Long>{
}
