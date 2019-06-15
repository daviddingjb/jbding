package com.trusdata.common.interceptor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.opensymphony.xwork2.ActionInvocation;
import org.apache.commons.lang.StringUtils;

@SuppressWarnings("serial")
public class TrimInterceptor extends MethodFilterInterceptor {

	private List<String> excluded = new ArrayList<String>();

	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> parameters = invocation.getInvocationContext().getParameters();

		for (String param : parameters.keySet()) {
			if (shouldTrim(param)) {
				doTrim(parameters, param);
			}
		}

		return invocation.invoke();
	}

	void doTrim(Map<String, Object> parameters, String param) {
		Object val = parameters.get(param);
		if (val == null) {
			return;
		}
		if (val instanceof String) {
			trimString(parameters, param, val);
		} else {
			trimStringArray(parameters, param, val);
		}
	}

	private void trimString(Map<String, Object> parameters, String param, Object val) {
		String value = (String) val;
		value = StringUtils.trimToNull(value);
		parameters.put(param, value);
	}

	private void trimStringArray(Map<String, Object> parameters, String param, Object val) {

		String[] vals = (String[]) val;
		boolean allNull = true;
		for (int i = 0; i < vals.length; i++) {
			vals[i] = StringUtils.trimToNull(vals[i]);
			allNull = allNull && (vals[i] == null);
		}
		if (allNull) {
			parameters.put(param, null);
		}
	}

	private boolean shouldTrim(String param) {
		for (String exclude : excluded) {
			if (param.equalsIgnoreCase(exclude)) {
				return false;
			}
		}

		return true;
	}

	public void setExcludedParams(String excludedParams) {
		for (String s : StringUtils.split(excludedParams, ",")) {
			excluded.add(s.trim());
		}
	}
}
