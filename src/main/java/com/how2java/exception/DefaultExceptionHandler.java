package com.how2java.exception;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class DefaultExceptionHandler {
	@ExceptionHandler({ UnauthorizedException.class })
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public ModelAndView processUnauthenticatedException(NativeWebRequest request, UnauthorizedException e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", e);
		mv.setViewName("unauthorized");
		return mv;
	}
	@ExceptionHandler({LoginException.class})
	public Map baseServiceException(LoginException e){
		Map<String,Object> resultMap = new HashMap<>();
		resultMap.put("code",e.getCode());
		resultMap.put("msg",e.getMessage());
		return resultMap;
	}
}
