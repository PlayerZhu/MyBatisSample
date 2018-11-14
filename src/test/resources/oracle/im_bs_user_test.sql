-- Create table
create table IM_BS_USER_TEST
(
  id   VARCHAR2(32),
  name VARCHAR2(64),
  pwd  VARCHAR2(64)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table
comment on table IM_BS_USER_TEST
  is '用户表';
