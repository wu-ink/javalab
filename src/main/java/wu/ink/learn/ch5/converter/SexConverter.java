package wu.ink.learn.ch5.converter;

import javax.persistence.AttributeConverter;

import wu.ink.learn.ch5.enumeration.SexEnum;

public class SexConverter implements AttributeConverter<SexEnum, Integer> {

	@Override
	public Integer convertToDatabaseColumn(SexEnum sex) {
		return sex.getId();
	}

	@Override
	public SexEnum convertToEntityAttribute(Integer id) {
		return SexEnum.getEnumById(id);
	}

}
