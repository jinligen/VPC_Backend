package org.lyg.vpc.controller.business.factory.workshop.task;
import org.apache.ibatis.annotations.Param;
import org.lyg.vpc.view.User;

import java.util.List;

public interface HotelDao 
{
	//List<Partner> selectPartnerByEmail(@Param("email")String email);
	//List<Porder> selectPorderByPartnerIdAndOrderReference(@Param("partnerId")int partnerId,@Param("orderReference")String orderReference);
	//void updatePorderStatusByOrderRefIdPartnerId(@Param("status")String status,@Param("orderReference")String orderReference, @Param("partnerId")int partnerId);
    List<User> selectUserListByAge(@Param("userAge")String userAge);
}