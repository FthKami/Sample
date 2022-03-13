package myProject.dto.response;

import lombok.Getter;
import lombok.Setter;
import myProject.dto.DarkhastDto;

import java.util.List;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
@Setter
@Getter
public class DarkhastResponse {

    private List<DarkhastDto> darkhastDtoList;
}