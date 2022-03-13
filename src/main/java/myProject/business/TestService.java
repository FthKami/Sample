package myProject.business;

import myProject.dto.DarkhastDto;
import myProject.mapper.IDarkhastMapper;
import myProject.persistence.dao.IDarkhastDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
@Service
public class TestService implements ITestService {

    @Autowired
    private IDarkhastDao iDarkhastDao;

    @Autowired
    private IDarkhastMapper iDarkhastMapper;

    @Override
    public List<DarkhastDto> getDarkhast(Long shakhsId) {
        return iDarkhastMapper.mapEntityToDtoList(iDarkhastDao.findAllByShakhsId(shakhsId));
    }
}