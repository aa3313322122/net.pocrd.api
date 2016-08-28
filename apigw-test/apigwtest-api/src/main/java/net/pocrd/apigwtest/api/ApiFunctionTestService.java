package net.pocrd.apigwtest.api;

import net.pocrd.apigwtest.entity.ApigwTestReturnCode;
import net.pocrd.apigwtest.entity.BadResponse;
import net.pocrd.apigwtest.entity.SimpleTestEntity;
import net.pocrd.annotation.*;
import net.pocrd.define.ApiOpenState;
import net.pocrd.define.AutowireableParameter;
import net.pocrd.define.CommonParameter;
import net.pocrd.define.SecurityType;
import net.pocrd.entity.ServiceException;
import net.pocrd.responseEntity.JSONString;
import net.pocrd.util.RawString;

@ApiGroup(name = "apitest", minCode = 1, maxCode = 1000000, codeDefine = ApigwTestReturnCode.class, owner = "sunji180")
public interface ApiFunctionTestService {
    @HttpApi(name = "apitest.testWeiXin", desc = "微信接口测试", security = SecurityType.None, owner = "guankaiqiang",
             state = ApiOpenState.OPEN)
    RawString testWeiXin(
            @ApiParameter(required = false, name = "msg", desc = "test")
            String strValue) throws ServiceException;

    @HttpApi(name = "apitest.testRawString", desc = "测试RawString", security = SecurityType.None, owner = "guankaiqiang",
             state = ApiOpenState.OPEN)
    RawString testRawString(
            @ApiParameter(required = true, name = "str", desc = "str value")
            String strValue) throws ServiceException;

    @HttpApi(name = "apitest.testStructInput", desc = "结构化入参测试", security = SecurityType.None, owner = "guankaiqiang")
    @DesignedErrorCode(ApigwTestReturnCode._C_TEST_UNKNOW_ERROR)
    SimpleTestEntity testStructInput(
            @ApiParameter(required = true, name = "simpleTestEntity", desc = "SimpleTestEntity结构化入参")
            SimpleTestEntity simpleTestEntity) throws ServiceException;

    @HttpApi(name = "apitest.testAutowiredClientIP", desc = "服务端获取客户端IP测试", security = SecurityType.None, owner = "sunji180",
             state = ApiOpenState.OPEN)
    @DesignedErrorCode(ApigwTestReturnCode._C_TEST_UNKNOW_ERROR)
    String testAutowiredClientIP() throws ServiceException;

    @HttpApi(name = "apitest.testApiParameterIsRsaEncryptedOrAesEncrypted", desc = "Api文档RsaEncrypted或AesEncrypted字段展示测试",
             security = SecurityType.None, owner = "sunji180", state = ApiOpenState.OPEN)
    @DesignedErrorCode(ApigwTestReturnCode._C_TEST_UNKNOW_ERROR)
    String testApiParameterIsRsaOrAesEncrypted(
            @ApiParameter(required = true, name = "rsaEncrypted", desc = "参数需用rsa方式加密", rsaEncrypted = true)
            String rsaEncrypted,
            @ApiParameter(required = true, name = "aesEncrypted", desc = "参数需用aes方式加密", rsaEncrypted = false)
            String aesEncrypted,
            @ApiParameter(required = true, name = "rsaEncryptedAndAesEncrypted", desc = "参数需用rsa和aes方式加密(实际不会使用此种方式，仅为测试覆盖)", rsaEncrypted = true)
            String rsaEncryptedAndAesEncrypted,
            @ApiParameter(required = true, name = "noRsaEncryptedAndAesEncrypted", desc = "参数不用rsa且不用aes方式加密", rsaEncrypted = false)
            String noRsaEncryptedAndAesEncrypted) throws ServiceException;

    @HttpApi(name = "apitest.testCredits", desc = "测试积分下发", security = SecurityType.None, owner = "guankaiqiang")
    boolean testCredits() throws ServiceException;

    @HttpApi(name = "apitest.testMsg", desc = "测试消息下发", security = SecurityType.None, owner = "guankaiqiang")
    boolean testMsg() throws ServiceException;

    @HttpApi(name = "apitest.testDesignedErrorCode", desc = "测试errorcode", security = SecurityType.None, owner = "guankaiqiang")
    @DesignedErrorCode(ApigwTestReturnCode._C_TEST_UNKNOW_ERROR)
    boolean testDesignedErrorCode() throws ServiceException;

    @HttpApi(name = "apitest.testErrorCode", desc = "测试errorcode", security = SecurityType.None, owner = "guankaiqiang")
    boolean testErrorCode() throws ServiceException;

    @HttpApi(name = "apitest.testErrorCodeFromThirdParty", desc = "测试errorcode", security = SecurityType.None, owner = "guankaiqiang")
    boolean testErrorCodeFromThirdParty() throws ServiceException;

    @HttpApi(name = "apitest.testRsaEncrypt", desc = "测试rsa加解密", security = SecurityType.None, owner = "guankaiqiang")
    String testRsaEncrypt(
            @ApiParameter(required = true, rsaEncrypted = true, name = "param1", desc = "param1")
            String param1,
            @ApiParameter(required = false, rsaEncrypted = true, name = "param2", desc = "param2")
            String param2,
            @ApiParameter(required = true, rsaEncrypted = true, name = "param3", desc = "param3")
            SimpleTestEntity param3,
            @ApiParameter(required = false, rsaEncrypted = true, name = "param4", desc = "param4")
            SimpleTestEntity param4,
            @ApiParameter(required = true, name = "param5", desc = "param5")
            String param5,
            @ApiParameter(required = false, name = "param6", desc = "param6")
            String param6,
            @ApiParameter(required = true, rsaEncrypted = true, name = "param7", desc = "param7")
            int[] param7,
            @ApiParameter(required = false, rsaEncrypted = true, name = "param8", desc = "param8")
            int[] param8) throws ServiceException;

    @HttpApi(name = "apitest.testJSONString", desc = "测试jsonString", security = SecurityType.None, owner = "guankaiqiang")
    JSONString testJSONString(
            @ApiParameter(required = true, name = "param", desc = "param")
            String param) throws ServiceException;

    @HttpApi(name = "apitest.testAppendServiceLog", desc = "测试appendServiceLog", security = SecurityType.None, owner = "guankaiqiang")
    String testAppendServiceLog(
            @ApiParameter(required = true, name = "param", desc = "param")
            String param) throws ServiceException;

    @HttpApi(name = "apitest.testPostbody", desc = "测试test post body", security = SecurityType.Integrated, owner = "rendong")
    String testPostbody(
            @ApiAutowired(AutowireableParameter.postBody)
            String postBody) throws ServiceException;

    @HttpApi(name = "apitest.testDoc", desc = "测试test testDoc", state = ApiOpenState.DOCUMENT, security = SecurityType.Document, owner = "rendong")
    String testDoc(
            @ApiParameter(required = true, name = "param", desc = "param")
            String postBody) throws ServiceException;

    @HttpApi(name = "apitest.testThrowServiceException", desc = "测试test testThrowServiceException", state = ApiOpenState.OPEN,
             security = SecurityType.None, owner = "rendong")
    @DesignedErrorCode(ApigwTestReturnCode._C_TEST_FOR_TEST)
    String testThrowServiceException() throws ServiceException;

    @HttpApi(name = "apitest.testBadResponse", desc = "测试序列化异常", state = ApiOpenState.OPEN,
             security = SecurityType.None, owner = "rendongds")
    BadResponse testBadResponse() throws ServiceException;
}


