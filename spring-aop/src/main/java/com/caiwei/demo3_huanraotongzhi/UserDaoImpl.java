package com.caiwei.demo3_huanraotongzhi;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements IUserDao   {

	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#save()
	 */
	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#save(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#save(java.lang.String)
	 */
	public String save(String name)
	{
		System.out.println("这是保存方法!");
		return "save";
	}
	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#update()
	 */
	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#update()
	 */
	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#update()
	 */
	public String update()
	{
		System.out.println("这是更新方法!");
		return "这是更新方法返回的值！";
	}

	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#doThrow()
	 */
	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#doThrow()
	 */
	public void doThrow()
	{
		throw new RuntimeException("返回了例外！");
	}
}
