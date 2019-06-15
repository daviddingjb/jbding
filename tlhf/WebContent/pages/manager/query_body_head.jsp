<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
											<s:form action="" method="post" id="querylist_init_form" enctype="multipart/form-data">
												<div class="col-xs-6">
		                                            <p class="select-p-style">县市：</p>
		                                            <select class="select-style form-control" style="width:45%;" name="searchBean.county">
		                                                <option style="display:none"></option>
														<option value="曾都">曾都</option>
														<option value="随县">随县</option>
														<option value="广水">广水</option>
														<option value="高新区">高新区</option>
														<option value="大洪山风景区">大洪山风景区</option>
		                                            </select>
		                                            <p class="lable-p-style">村：</p>
		                                            <input type="text" name="searchBean.village" class="lable-style form-control"  style="width:45%;">
		                                            <p class="lable-p-style">贫困户属性：</p>
		                                            <input name="searchBean.poverty_level1" type="checkbox">&nbsp;一般贫困户&nbsp;
													<input name="searchBean.poverty_level2" type="checkbox">&nbsp;低保户&nbsp;
													<input name="searchBean.poverty_level3" type="checkbox">&nbsp;五保户&nbsp;
													<input name="searchBean.poverty_level4" type="checkbox">&nbsp;低保贫困户&nbsp;
												</div>
												<div class="col-xs-6">
		                                            <p class="select-p-style">乡镇：</p>
		                                            <input type="text" name="searchBean.township" class="lable-style form-control"  style="width:45%;">
		                                            <p class="lable-p-style">组：</p>
		                                            <input type="text" name="searchBean.group1" class="lable-style form-control"  style="width:45%;">
												</div>
												<div class="row">
													<div class="col-xs-12">
														<input type="button" class="button-finally" id="btnSelect" value="查询"  style="margin-top:0px;"/>
														<input type="button" class="button-finally" id="btnDownload" value="汇总数据下载"  style="margin-top:0px;"/>
													</div>
												</div>
											</s:form>
