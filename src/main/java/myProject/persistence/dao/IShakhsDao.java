package myProject.persistence.dao;

import myProject.persistence.entity.ShakhsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
public interface IShakhsDao extends JpaRepository<ShakhsEntity, Long> {
}
