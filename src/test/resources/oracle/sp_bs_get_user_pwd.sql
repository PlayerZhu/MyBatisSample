create or replace procedure sp_bs_get_user_pwd(v_user_id    in varchar2,
                                               v_out_code   out number,
                                               v_out_msg    out varchar2,
                                               v_out_pwd    out varchar2,
                                               v_out_cursor out sys_refcursor) as

begin
  
  select t.pwd into v_out_pwd from im_bs_user_test t where t.id = v_user_id;

  open v_out_cursor for
    select t.id, t.name, t.pwd from im_bs_user_test t where t.id = v_user_id;

  v_out_code := 100;
  v_out_msg  := '????';

exception
  when others then
    rollback;
    v_out_code := 100;
    v_out_msg  := '????:' || sqlerrm;
end;
