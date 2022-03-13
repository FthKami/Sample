package myProject.mapper;

import myProject.dto.DarkhastDto;
import myProject.persistence.entity.DarkhastEntity;

import java.util.List;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
public interface IDarkhastMapper {

    List<DarkhastDto> mapEntityToDtoList(List<DarkhastEntity> darkhastEntityList);
}