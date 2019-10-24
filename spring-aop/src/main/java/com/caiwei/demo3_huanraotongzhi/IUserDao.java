package com.caiwei.demo3_huanraotongzhi;

public interface IUserDao {

	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#save()
	 */
	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#save(java.lang.String)
	 */
	public abstract String save(String name);

	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#update()
	 */
	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#update()
	 */
	public abstract String update();

	/* (non-Javadoc)
	 * @see com.aspectaop.IUserDao#doThrow()
	 */
	public abstract void doThrow();

}