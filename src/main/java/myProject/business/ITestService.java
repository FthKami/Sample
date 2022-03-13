package myProject.business;

import myProject.dto.DarkhastDto;

import java.util.List;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
public interface ITestService {

    List<DarkhastDto> getDarkhast(Long shakhsId);
}