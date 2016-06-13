package cn.leancloud.java_engine;

public enum AVIMHookType {
  /**
   * 消息达到服务器，群组成员已解析完成之后，发送给收件人之前
   */
  MESSAGE_RECEIVED,
  /**
   * 消息发送完成，存在离线的收件人
   */
  RECEIVERS_OFFLINE,
  /**
   * 消息发送完成
   */
  MESSAGE_SENT,
  /**
   * 创建对话，在签名校验（如果开启）之后，实际创建之前
   */
  CONVERSATION_START,
  /**
   * 创建对话完成
   */
  CONVERSATION_STARTED,
  /**
   * 向对话添加成员，在签名校验（如果开启）之后，实际加入之前，包括主动加入和被其他用户加入两种情况
   */
  CONVERSATION_ADD,
  /**
   * 从对话中踢出成员，在签名校验（如果开启）之后，实际踢出之前，用户自己退出对话不会调用。
   */
  CONVERSATION_REMOVE,
  /**
   * 修改对话属性、设置或取消对话消息提醒，在实际修改之前调用
   */
  CONVERSATION_UPDATE
}
