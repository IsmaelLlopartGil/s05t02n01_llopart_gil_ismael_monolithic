package s05t02n01_llopart_gil_ismael.model.services;

import java.util.List;
import s05t02n01_llopart_gil_ismael.model.domain.Roll;
import s05t02n01_llopart_gil_ismael.model.dto.RollDto;

public interface RollMapper {
	
	public List<RollDto> convertToListDto (List<Roll> rollList);
	
	public List<Roll> convertToListEntity (List<RollDto> rollListDto);
}
