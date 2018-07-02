package com.vzionsys.ssm.exception;

/**
 * 
 * <p>Title: CustomException</p>
 * <p>Description: 自定义异常,针对预期异常</p>
 * <p>Company: www.vzionsys.com</p> 
 * @author  刘政
 * @date    2015-12-17上午9:08:01
 * @version 1.0
 */
public class CustomException extends Exception{
	/** serialVersionUID*/
	private static final long serialVersionUID = -5212079010855161498L;
	
	//异常信息
	private String message;
	//错误码
	/*
	 * #数据库操作相关
	 * 10001	插入失败
	 * 10002	更新失败
	 * 10003	删除失败
	 * 10004	存在数据依赖
	 * #API参数相关
	 * 20001	参数格式不正确
	 * #用户授权相关
	 * 30001	用户认证失败
	 * 30002	用户账号已经存在
	 * 30003	账号或密码错误
	 * 30004	用户权限不足
	 * 30005	用户账号不存在
	 * #产品业务逻辑相关
	 * 40001	产品不能添加自身作为组件
	 * 40002	产品Id不存在
	 * 40003	组件Id不存在
	 * 40004	产品编号不存在
	 * 40005	OwnId不存在
	 * #Bom相关
	 * 60001	组件Id不存在
	 * #CharacterClassification相关
	 * 70001	特性分类Id不存在
	 * #Ecl相关
	 * 80001	该partId的Ecl的name已经存在
	 * 80002	EclId已经存在
	 * 80003	EclId不存在
	 * 80004           该Ecl已发布
	 * #EquipmentCommon 相关
	 * 90001	EquipmentCommon的number已经存在
	 * 90002 	EquipmentCommonId已经存在
	 * 90003	EquipmentCommonId不存在
	 * #FixtureCommon 相关
	 * 11001	FixtureCommon的number已经存在
	 * 11002	FixtureCommonId已经存在
	 * 11003	FixtureCommonId不存在
	 * #PartCharCommon 相关
	 * 12001	PartCharCommon的number已经存在
	 * 12002	PartCharCommonId已经存在
	 * 12003	PartCharCommonId不存在
	 * #ProcessCommon 相关
	 * 13001	ProcessCommon的Code已经存在
	 * 13002	ProcessCommonId已经存在
	 * 13003 	ProcessCommonId不存在
	 * #ProcessFlow 相关
	 * 14002	ProcessFlowId已经存在
	 * 14003	ProcessFlowId不存在
	 * #Process 相关
	 * 15002	ProcessId已经存在
	 * 15003	ProcessId不存在 
	 * #Specification 相关
	 * 16001	Specification的number已经存在
	 * 16002	SpecificationId已经存在
	 * 16003	SpecificationId不存在
	 * 16004	该文件不存在
	 * #ToolCommon 相关
	 * 17001	ToolCommon的number已经存在
	 * 17002	ToolCommonId已经存在
	 * 17003	ToolCommonId不存在
	 * #EclSpecification 相关
	 * 18002	EclSpecificationId已经存在
	 * 18003	EclSpecificationId不存在
	 * #ProcessCharCommon 相关
	 * 19001	ProcessCharCommon的number已经存在
	 * 19002	ProcessCharCommonId已经存在
	 * 19003	ProcessCharCommonId不存在   
	 * #Dfmea 相关
	 * 21001	DfmeaId不存在
	 * #Pfmea 相关
	 * 22001	PfmeaId不存在
	 * #Function 相关
	 * 23001	FunctionId不存在
	 * 23002	DfmeaId和PfmeaId不能同时存在或者为空
	 * #FmCommon 相关
	 * 24001	FmCommonId不存在
	 * #Fm	相关
	 * 25001	FmId不存在
	 * #CurrentDesignControl 相关
	 * 26001	CurrentDesignControlId不存在
	 * #FmReason 相关
	 * 27001	FmReasonId不存在
	 * #RecommendedAction 相关
	 * 28001 	RecommendedActionId不存在
	 * #报表相关
	 * 29001           无此类操作
	 * #系统相关
	 * 50001	未知错误
	*/
	private int errorCode;
	
	public CustomException(int errorCode,String message){
		super(message);
		this.message = message;
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
