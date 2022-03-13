package myProject.persistence.dao;

import myProject.persistence.entity.DarkhastEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
public interface IDarkhastDao extends JpaRepository<DarkhastEntity, Long> {

    List<DarkhastEntity> findAllByShakhsId(Long shakhsId);
}