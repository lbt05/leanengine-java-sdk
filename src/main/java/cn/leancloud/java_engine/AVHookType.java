package cn.leancloud.java_engine;

public enum AVHookType {
  /**
   * 在将对象保存到云端数据表之前，可以对数据做一些清理或验证
   */
  BEFORE_SAVE,
  /**
   * 在数据保存后触发指定操作
   */
  AFTER_SAVE,
  /**
   * 在更新对象之前做一些检查工作
   */
  BEFORE_UPDATE,
  /**
   * 在更新对象后执行特定的动作
   */
  AFTER_UPDATE,
  /**
   * 在删除一个对象之前做一些检查工作
   */
  BEFORE_DELETE,
  /**
   * 在被删一个对象后执行操作
   */
  AFTER_DELETE,
  /**
   * 当用户通过邮箱或者短信验证时，对该用户执行特定操作
   */
  ON_VERIFIED,
  /**
   * 在用户登录之时执行指定操作
   */
  ON_LOGIN
}
