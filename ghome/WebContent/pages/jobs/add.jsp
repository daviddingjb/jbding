<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Jobs Configuration</title>
</head>
<body>
	<s:form action="jobs_toadd" method="post">
		<table>
			<tr>
				<td>Name:</td>
                <td>
                  	<s:textfield name="trus_jobs.t_name" id="t_name" size="12" maxlengh="20" cssStyle="width:140px;"/>
                </td>
			</tr>
			<tr>
				<td>Description:</td>
                <td>
                  	<s:textfield name="trus_jobs.t_description" id="t_description" size="12" maxlengh="200" cssStyle="width:440px;"/>
                </td>
			</tr>
			<tr>
				<td>Mapping Name:</td>
                <td>
                	<s:select list="mapping_name" name="trus_jobs.t_mapping_name" id="t_mapping_name">
                	</s:select>
                </td>
			</tr>
            <tr>
				<td></td>
                <td colspan="2"><br/>
                  	<input type="submit" class="login-btn" value="commit"/>
                  	<input type="reset" class="input_submit" value="reset"/>
                </td>
			</tr>
		</table>
	</s:form>
</body>
</html>