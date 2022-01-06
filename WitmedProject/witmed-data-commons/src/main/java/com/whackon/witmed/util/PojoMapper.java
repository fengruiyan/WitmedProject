package com.whackon.witmed.util;

import com.whackon.witmed.system.admin.pojo.entity.Admin;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 *<b>视图实体工具转换类</b>
 * @author
 * @date
 * @since
 */
@Mapper(componentModel = "spring")
public interface PojoMapper {
	//实例化具体的接口对象
	PojoMapper INSTANCE = Mappers.getMapper(PojoMapper.class);

	/**
	 * <b>将实体对象转换为视图对象</b>
	 * @param entity
	 * @return
	 */
	AdminVO parseToVO(Admin entity);

}
