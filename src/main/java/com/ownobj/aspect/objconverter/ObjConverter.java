package com.ownobj.aspect.objconverter;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Component
public class ObjConverter extends FastJsonHttpMessageConverter{
	
	private final Logger conLogger = Logger.getLogger(ObjConverter.class);
	
	
	@Override
	protected Object readInternal(Class<?> clazz, 
			HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException{
		//fastJson版本影响是否可以获取
		conLogger.info("===============请求进入到消息转换器===============");
		return super.readInternal(clazz, inputMessage);
	}
	
	@Override
	protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException{
		conLogger.info("===============响应进入到消息转换器===============");
		super.writeInternal(obj, outputMessage);
	}
	
	
}
