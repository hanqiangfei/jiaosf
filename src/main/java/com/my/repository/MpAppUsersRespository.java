package com.my.repository;

import com.my.entity.MpAppUsers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MpAppUsersRespository extends CrudRepository<MpAppUsers, String> {
	
	@Query("select a from MpAppUsers a where a.loginId  =?1 and a.passWord =?2  and a.userLx='内建'")
	public MpAppUsers findNjUser(String loginId, String pwd/*,String appId*/);

	@Query("select a from MpAppUsers a where a.userLx='内建'")
	public List<MpAppUsers> findNjUser();
	
	@Query("select a from MpAppUsers a where a.loginId  =?1 and a.userLx='内建'")
	public List<MpAppUsers> isExistNjUser(String loginId);
	
	@Query("select a from MpAppUsers a where a.loginId  =?1 ")
	public MpAppUsers findUser(String loginId);

	@Query("select a from MpAppUsers a where  a.userLx='统一授权'")
	public List<MpAppUsers> findTlmUser();

	@Query("select a from MpAppUsers a where  a.deptId=?1")
	public List<MpAppUsers> findUserByDeptid(String deptId);

	@Query("select a from MpAppUsers a where a.loginId  =?1 ")
	public List<MpAppUsers> findUserByLoginId(String loginId);

}
