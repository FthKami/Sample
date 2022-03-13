package myProject.mapper;

import myProject.dto.DarkhastDto;
import myProject.persistence.entity.DarkhastEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
@Component
public class DarkhastMapper implements IDarkhastMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<DarkhastDto> mapEntityToDtoList(List<DarkhastEntity> darkhastEntityList) {

        List<DarkhastDto> darkhastDtoList;

        /*one solution*/
        Type typeList = new TypeToken<List<DarkhastDto>>(){}.getType();
        darkhastDtoList = modelMapper.map(darkhastEntityList, typeList);

        /*two*/
        darkhastEntityList.stream().map(item -> {
            DarkhastDto dto = new DarkhastDto();
            dto.setDarkhstStatus(item.getDarkhstStatus());
            dto.setDarkhstType(item.getDarkhstType());
            dto.setId(item.getId());
            dto.setShakhsId(item.getShakhsId());
            return dto;
        });

        return darkhastDtoList;
    }
}