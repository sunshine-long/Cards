package com.mrkang.since.cards.constant;

/**
 * Created by administer on 2016/8/15.
 */
public class ApiInterface {

    public static final String MAIN_HOME_INDEX = "home/index.jhtml";
    /**
     * 首页
     */
    //获取首页的数据
    public static final String MAIN_ACTIVITY_INDEX = "activity/index.jhtml";

    /**
     * 发现
     */
    public static final String DISCOVER_INDEX = "discover/index.jhtml";

    /**
     * 活动分类接口
     */
    //获取所有分类
    public static final String ACTIVITY_CATEGORY_ALL = "activityCategory/all.jhtml";
    //首页展示分类
    public static final String ACTIVITY_CATEGORY_TOP = "activityCategory/top.jhtml";
    //根据父类ID获取子类
    public static final String ACTIVITY_CATEGORY_CHILD = "activityCategory/child.jhtml";

    /**
     * 获取筛选条件
     */
    //分类页面获取筛选条件
    public static final String CONDITION_LIST = "condition/list.jhtml";

    /**
     * 地址分类
     */
    //获取支持的城市列表
    public static final String ADDRESSCATEGORY_ROOT = "addressCategory/root.jhtml";
    //获取指定分类的下级分类
    public static final String ADDRESSCATEGORY_CHILDEN = "addressCategory/children.jhtml";

    /**
     * 搜索
     */

    //搜索门店(根据分类ID获取门店信息)
    public static final String SEARCH_SHOP = "search/shops.jhtml";
    //据搜索关键字获取门店信息
    /**
     * 门店接口
     */
    //首页展示的门店
    public static final String SHOP_LIST = "shop/list.jhtml";
    //门店详情
    public static final String SHOP_DETAIL = "shop/detail.jhtml";

    /**
     * 公共接口
     */
    //检查用户是否登录
    public static final String CHEAK_LOGIN = "comm/checkLogin.jhtml";
    //检查是否支持该城市
    public static final String CHEAK_CITY = "comm/checkCity.jhtml";
    //检查用户名是否已经注册
    public static final String CHEAK_UESR_NAME = "comm/checkUserName.jhtml";
    //检查手机是否已经注册
    public static final String CHEAK_MOBILE = "comm/checkMobile.jhtml";
    //获取公钥
    public static final String PUBLIC_KEY = "comm/public_key.jhtml";
    //获取验证码
    public static final String VER_CODE = "comm/verCode.jhtml";
    //提交注册
    public static final String REGSITER_SUBMIT = "register/submit.jhtml";
    //用户名/手机号登录
    public static final String LOGIN_NORMAL = "login/normal.jhtml";
    //手机验证码快速登录
    public static final String LOGIN_QUICK = "login/quick.jhtml";
    //退出登录
    public static final String LOGOUT_INDEX = "logout/index.jhtml";

    /**
     * 个人中心
     */
    //获取用户基本资料
    public static final String PROFILE_INFO = "member/profile/info.jhtml";
    // 完善用户基本资料
    public static final String PROFILE_IMPROVE = "member/profile/improve.jhtml";
    //上传头像
    public static final String PROFILE_PROTRAIT = "member/profile/portrait.jhtml";
    //获取已经关注的银行
    public static final String PROFILE_BANKS = "member/bank/list.jhtml";
    //绑定关注的银行
    public static final String PROFILE_BOND = "member/bank/bond.jhtml";

    /**
     * 同步银行/银行卡
     */
    public static final String MEMBERSYNC_SUBMIT = "member/sync/submit.jhtml";

    /**
     * 银行卡
     */
    //查找所有支持的银行
    public static final String BANK_LIST = "bank/list.jhtml";
    // 获取已添加的银行卡信息
    public static final String MEMBER_BANK_LIST = "member/bankCard/list.jhtml";
    //添加银行卡
    public static final String MEMBER_BANK_ADDCARD = "member/bankCard/add.jhtml";
    //设置银行卡账单日
    public static final String BANKCARD_SETBILLDATE = "member/bankCard/setBillDate.jhtml";
    //同步银行卡
    public static final String BANKCARD_SYNC = "member/bankCard/sync.jhtml";

    /**
     * 用户反馈
     */
    //提交用户反馈
    public static final String ADVICE_SUBMIT = "advice/submit.jhtml";
}
