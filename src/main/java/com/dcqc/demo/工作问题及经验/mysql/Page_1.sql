1.场景：需要查询employee表中的uk_id,name,password字段，并复制查询结果插入存储至新表user_table中。
mysql语句如下：
insert into user_table(uk_id, name, password)
select uk_id, name, password
from employee;

2.场景：

