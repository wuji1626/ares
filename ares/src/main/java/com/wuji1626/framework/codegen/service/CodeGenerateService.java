package com.wuji1626.framework.codegen.service;

import com.wuji1626.framework.codegen.domain.GenerateConfig;
import com.wuji1626.framework.result.Result;

public interface CodeGenerateService {

	public Result<String> generateBean(GenerateConfig config);
	public Result<String> generateMyBatisMapper(GenerateConfig config);
	
}
